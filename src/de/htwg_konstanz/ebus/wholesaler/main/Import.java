package de.htwg_konstanz.ebus.wholesaler.main;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.xml.XMLConstants;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.apache.commons.fileupload.FileItem;
import org.apache.commons.fileupload.FileUploadException;
import org.apache.commons.fileupload.disk.DiskFileItemFactory;
import org.apache.commons.fileupload.servlet.ServletFileUpload;
import org.w3c.dom.Document;
import org.xml.sax.SAXException;
import org.apache.commons.io.FilenameUtils;

import java.io.File;
import java.math.BigDecimal;

import javax.xml.transform.dom.DOMSource;
import javax.xml.validation.*;

import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import de.htwg_konstanz.ebus.framework.wholesaler.api.bo.BOCountry;
import de.htwg_konstanz.ebus.framework.wholesaler.api.bo.BOCurrency;
import de.htwg_konstanz.ebus.framework.wholesaler.api.bo.BOProduct;
import de.htwg_konstanz.ebus.framework.wholesaler.api.bo.BOPurchasePrice;
import de.htwg_konstanz.ebus.framework.wholesaler.api.bo.BOSalesPrice;
import de.htwg_konstanz.ebus.framework.wholesaler.api.boa.PriceBOA;
import de.htwg_konstanz.ebus.framework.wholesaler.api.boa.ProductBOA;
import de.htwg_konstanz.ebus.framework.wholesaler.api.boa.SupplierBOA;
import de.htwg_konstanz.ebus.framework.wholesaler.api.boa._BaseBOA;
import de.htwg_konstanz.ebus.framework.wholesaler.api.bo.BOSupplier;
import de.htwg_konstanz.ebus.framework.wholesaler.vo.Country;
import de.htwg_konstanz.ebus.framework.wholesaler.vo.Currency;

/**
 * 
 * @author Johannes Fesenmeyer
 *	import product catalogs (simple BMEcat XML-format)
 */
public class Import implements IValidator {
	
	/**
	 * import xml into db
	 * @param request  Http Request
	 * @param errorList User Notification
	 */
	
	public void importXML(HttpServletRequest request, ArrayList<String> errorList) {
		InputStream inputStream = getInputStreamFromUpload(request, errorList);
		if(inputStream == null){
			return;
		}
		Document document = getDOMFromInputStream(inputStream, errorList);
		if(document != null){
			if(validateDOM(document, errorList)){
				BOSupplier supplier = getSupplier(document, errorList);
				if(supplier != null){
					System.out.println("LOAD SUPPLIER != NULL");
					insertProductsIntoDB(document, errorList, supplier);
				} else {
					System.out.println("Supplier not found");
				}
			} else {
				System.out.println("Document not valid!");
			}
		}
	}
	
	/**
	 * inserts the Products from the uploaded catalog into the DB
	 * @param document the BMECAT document
	 * @param errorList for User notification
	 * @param supplier the supplier of the product
	 * @return
	 */
	public BOProduct insertProductsIntoDB(Document document, List<String> errorList, BOSupplier supplier){
		System.out.println("insert Products Into DB.......");
		//Get all Articles from the uploaded catalog
		NodeList articleList = document.getElementsByTagName("ARTICLE");
		BOProduct product = null;
		//Iterate over every "ARTICLE" in catalog 
		for(int i = 0; i < articleList.getLength(); i++){
			product=new BOProduct();   //create new product
			Element article = (Element)articleList.item(i);
			
			//get "SUPPLIER_AID" and set the value for product
			NodeList supplier_aid = article.getElementsByTagName("SUPPLIER_AID");
			product.setOrderNumberSupplier(supplier_aid.item(0).getChildNodes().item(0).getNodeValue());
			product.setOrderNumberCustomer(supplier_aid.item(0).getChildNodes().item(0).getNodeValue());
			System.out.println("supplier_aid " + product.getOrderNumberSupplier());		
			product.setSupplier(supplier);
			
			//get "DESCRIPTION_SHORT" and set the value for product
			NodeList description_short = article.getElementsByTagName("DESCRIPTION_SHORT"); 
			product.setShortDescription(description_short.item(0).getChildNodes().item(0).getNodeValue());
			System.out.println("description_short " + product.getShortDescription());
			
			//get "DESCRIPTION_LONG" and set the value for product
			NodeList description_long = article.getElementsByTagName("DESCRIPTION_LONG");
			if(tagExists(description_long)){
				product.setLongDescription(description_long.item(0).getChildNodes().item(0).getNodeValue());
				System.out.println("description_long" + product.getLongDescription());
			}

			//inventory??
			
			//find the same product in db
			List<BOProduct> sameProductsInDB = ProductBOA.getInstance().findByShortdescription(product.getShortDescription());
			
			if(!sameProductsInDB.isEmpty()){
				//Product already in DB
				deleteProduct(sameProductsInDB.get(0));
				ProductBOA.getInstance().saveOrUpdate(product);
				insertProductPricesIntoDB(document, errorList, product);
				errorList.add("INFO: Product " + product.getShortDescription() + " updated");

			} else {
				//Product not in DB
				ProductBOA.getInstance().saveOrUpdate(product);
				insertProductPricesIntoDB(document, errorList, product);
				errorList.add("INFO: Product " + product.getShortDescription() + " added");
			}
		}	 
		//always do a commit -> commits and closes transaction
		_BaseBOA.getInstance().commit();
		return product;	
	}
	
	private boolean tagExists(NodeList nodes){
		if(nodes.getLength()>0){
			Node node = nodes.item(0);
			Node child = node.getFirstChild();
			if(child == null){
				return false;
			} else{
				return true;
			}
		}
		return false;
	}

	private void insertProductPricesIntoDB(Document document, List<String> errorList, BOProduct product) {
		BOSalesPrice salesPrice = new BOSalesPrice();
		BOPurchasePrice purchasePrice = new BOPurchasePrice();
	
		//SalesPrice = 2,3 x purchasePrice
		BigDecimal profit = new BigDecimal(2.3);
		
		NodeList articlePriceList = document.getElementsByTagName("ARTICLE_PRICE");
		
		//Iterate over any "ARTICLE_DETAIL" in catalog
		for(int i = 0; i < articlePriceList.getLength(); i++){
			Element articlePrice =  (Element) articlePriceList.item(i);
			
			//Set Attribute "price_type"
			purchasePrice.setPricetype(articlePrice.getAttribute("price_type"));
			salesPrice.setPricetype(articlePrice.getAttribute("price_type"));
		
			//Set "PRICE_AMOUNT"
			NodeList article_price_amount = articlePrice.getElementsByTagName("PRICE_AMOUNT");
			purchasePrice.setAmount(BigDecimal.valueOf(Double.valueOf(article_price_amount.item(0).getChildNodes().item(0).getNodeValue())));
			salesPrice.setAmount(BigDecimal.valueOf(Double.valueOf(article_price_amount.item(0).getChildNodes().item(0).getNodeValue())).multiply(profit));
			
			//Set "TERRITORY" before currency
			NodeList territory = articlePrice.getElementsByTagName("TERRITORY");
			if(tagExists(territory)){
				purchasePrice.setCountry(new BOCountry(new Country(territory.item(0).getChildNodes().item(0).getNodeValue())));
				salesPrice.setCountry(new BOCountry(new Country(territory.item(0).getChildNodes().item(0).getNodeValue())));
			}
			
			//Set "PRICE_CURRENCY" 
			NodeList price_currency = articlePrice.getElementsByTagName("PRICE_CURRENCY");
			if(tagExists(price_currency)){
				purchasePrice.getCountry().setCurrency(new BOCurrency(new Currency(price_currency.item(0).getChildNodes().item(0).getNodeValue())));
				salesPrice.getCountry().setCurrency(new BOCurrency(new Currency(price_currency.item(0).getChildNodes().item(0).getNodeValue())));
			}
			
			//Set "TAX"
			NodeList tax = articlePrice.getElementsByTagName("TAX");
			if(tagExists(tax)){
				BigDecimal number = BigDecimal.valueOf(Double.valueOf(tax.item(0).getChildNodes().item(0).getNodeValue()));
				purchasePrice.setTaxrate(number);
				salesPrice.setTaxrate(number);
			}
			
			purchasePrice.setLowerboundScaledprice(1);
			salesPrice.setLowerboundScaledprice(1);
			purchasePrice.setProduct(product);
			salesPrice.setProduct(product);

			//Save Prices in DB
			PriceBOA.getInstance().saveOrUpdatePurchasePrice(purchasePrice);
			PriceBOA.getInstance().saveOrUpdateSalesPrice(salesPrice);
			//commit
			_BaseBOA.getInstance().commit();
		}	
	}

	/**
	 * Deletes a product from the DB 
	 * @param product the product to be deleted
	 */
	public void deleteProduct(BOProduct product){
		ProductBOA.getInstance().delete(product);
		_BaseBOA.getInstance().commit();
	}
	

	/**
	 * gets the Supplier from db or null if supplier not found
	 * @param document the DOM
	 * @param errorList user notification
	 * @return corresponding supplier from db, if not found -> null
	 */
	private BOSupplier getSupplier(Document document, ArrayList<String> errorList) {
		//get suppliers in document
		NodeList suppliers = document.getElementsByTagName("SUPPLIER_NAME");

		if(suppliers.getLength() == 0){
			System.out.println("No Supplier in uploaded Document");
		} else {
			//search for found supplier in db
			List<BOSupplier> supplierList = SupplierBOA.getInstance().findByCompanyName(suppliers.item(0).getChildNodes().item(0).getNodeValue());
			
			if(supplierList.isEmpty()){
				errorList.add("Supplier" + suppliers.item(0).getChildNodes().item(0).getNodeValue() +"not found in DB!");
			} else {
				return supplierList.get(0);
			}			
		}		
		return null;
	}


	public boolean validateDOM(Document document, ArrayList<String> errorList) {
		boolean isValid = false;
		SchemaFactory schemaFactory = SchemaFactory.newInstance(XMLConstants.W3C_XML_SCHEMA_NS_URI);
		Validator validator = null;
		Schema bmecat = null;
		try {
			bmecat = schemaFactory.newSchema(new File("E:\\Eigene Dateien\\Bildung\\Studium\\Wirtschaftsinformatik\\6\\EBUT\\workspace\\WholesalerWebDemo\\files\\bmecat_new_catalog_1_2_simple_without_NS.xsd"));
			validator = bmecat.newValidator();
			//Validate DOM
			validator.validate(new DOMSource(document)); //if the validation fails an exception is thrown
			isValid = true;
		} catch (SAXException e) {
			errorList.add("The Uploaded XML File is not valid!");
			e.printStackTrace();
		} catch (IOException e) {
			errorList.add("Error while reading DOM");
			e.printStackTrace();
		} 		
		return isValid;
	}

	/**
	 * Create DOM from InputStream
	 * @param inputStream the uploaded imputStream
	 * @param errorList user notification
	 * @return the BMECAT document. null on error.
	 */
	private Document getDOMFromInputStream(InputStream inputStream,
			ArrayList<String> errorList) {
		System.out.println("Create DOM from InputStream.....");
		Document document = null;
		DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
		dbf.setNamespaceAware(true);
		dbf.setIgnoringElementContentWhitespace(true);
		try {
			DocumentBuilder parser = dbf.newDocumentBuilder();
			document = parser.parse(inputStream);
		} catch (ParserConfigurationException e) {
			errorList.add("Error during parser configuration!");
			e.printStackTrace();
		} catch (SAXException e) {
			errorList.add("Error! Parsed xml isn't wellformed!");
			e.printStackTrace();
		} catch (IOException e) {
			errorList.add("Error during parsing!");
			e.printStackTrace();
		}
		System.out.println("Created DOM from InputStream");
		return document;
		
	}

	private InputStream getInputStreamFromUpload(HttpServletRequest request,
			ArrayList<String> errorList) {
		//Factory and Servlet for FileUpload
		System.out.println("Upload File");
		DiskFileItemFactory factory = new DiskFileItemFactory();
		ServletFileUpload upload = new ServletFileUpload(factory);
		InputStream inputStream = null;
		try {
			List<FileItem> items = upload.parseRequest(request);
			inputStream = items.get(0).getInputStream();
			for(FileItem item : items){
				if(!item.isFormField()){
					String filename = FilenameUtils.getName(item.getName());
					String fileExtension = FilenameUtils.getExtension(item.getName());
					System.out.println("File: " + filename + "."+ fileExtension);
					if(!filename.endsWith(".xml")){
						errorList.add("Uploaded File is from Type '." + fileExtension + "'. Only XML Files are accepted");
						inputStream=null;
					}
				}
			}
		} catch (FileUploadException e) {
			errorList.add("Error while uploading file!");
			e.printStackTrace();
		} catch (IOException e) {
			errorList.add("Could not read input!");
			e.printStackTrace();
		}
		return inputStream;
	}

}

package de.htwg_konstanz.ebus.wholesaler.main;

import java.io.File;
import java.io.IOException;
import java.io.StringWriter;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletContext;
import javax.xml.XMLConstants;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.*;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import javax.xml.transform.stream.StreamSource;
import javax.xml.validation.Schema;
import javax.xml.validation.SchemaFactory;
import javax.xml.validation.Validator;

import org.hibernate.transform.ResultTransformer;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.xml.sax.SAXException;

import de.htwg_konstanz.ebus.framework.wholesaler.api.bo.BOProduct;
import de.htwg_konstanz.ebus.framework.wholesaler.api.bo.BOSalesPrice;
import de.htwg_konstanz.ebus.framework.wholesaler.api.boa.ProductBOA;

import com.jcabi.w3c.*;

/**
 * Exports whole catalog or articles whose short description matches a given String entered by the user
 * export as XHTML(view) or BMECAT(view or download)
 * @author Johannes Fesenmeyer, Lei Xu
 *
 */
public class Export {
	
	/**
	 * exports the whole Catalog
	 * @return Product catalog
	 */
	public static  Document exportAll(ArrayList<String> errorList){
		Document document= null;
		try {
			 document = createCatalog();
			 if(!validateDOM(document, errorList)){
					return null;
			 }
		} catch (ParserConfigurationException e) {
			errorList.add("Error while creating DOM");
			e.printStackTrace();
		}
		return document;
	}
	
	/**
	 * exports the Catalog with articles that match a search string
	 * @param errorList the ErrorList to inform user
	 * @param search the Search string
	 * @return BMECAT conform document
	 */
	public static Document exportSelective(ArrayList<String> errorList, String search){
		Document document= null;
		try {
			 document = createSelectedCatalog(errorList, search);
			 if(!validateDOM(document, errorList)){
					return null;
			 }
		} catch (ParserConfigurationException e) {
			errorList.add("Error while creating DOM");
			e.printStackTrace();
		}
		return document;
	}
	
	/**
	 * Creates the BMECat catalog
	 * @return document The whole Catalog with <b>all</b> entries
	 * @throws ParserConfigurationException 
	 */
	public static  Document createCatalog() throws ParserConfigurationException{
		List<BOProduct> productList = ProductBOA.getInstance().findAll();
		Document document = createDocument();
		document = createDOMWithoutArticles(document);
		for(BOProduct bop : productList){
			appendArticle(document, bop);
		}
		return document;
	}

	/**
	 * 
	 * @param errorList The errorList could be used to inform the User
	 * @param search The search Query to find selected Products
	 * @return catalog The whole Catalog with <b>Products that match the search String</b> entries
	 * @throws ParserConfigurationException
	 */
	public static  Document createSelectedCatalog(ArrayList<String> errorList, String search) throws ParserConfigurationException{
		List<BOProduct> productList = ProductBOA.getInstance().findAll();
		Boolean articleFound=false;
		Document document = createDocument();
		document = createDOMWithoutArticles(document);
		for(BOProduct bop : productList){
			if(bop.getShortDescription().toLowerCase().contains(search.toLowerCase())){
				articleFound=true;
				appendArticle(document, bop);
			}
		}
		if(!articleFound){
			errorList.add("No article with description containing: " +search+ " found");
		}
		return document;
	}
	
	/**
	 * Converts XML to W3C valid XHTML 
	 * @param pathXML
	 * @param context
	 * @param userId
	 * @param errorList
	 * @return the Path to the File
	 */
	public static  String convertToXHTML(String pathXML, ServletContext context, Integer userId, ArrayList<String> errorList){
		String path ="catalog_export"+userId+".XHTML";
		File file = new File(context.getRealPath(path));
		try {
			TransformerFactory factory = TransformerFactory.newInstance();
			Transformer transformer;
			transformer = factory.newTransformer(new StreamSource("E:\\Eigene Dateien\\Bildung\\Studium\\Wirtschaftsinformatik\\6\\EBUT\\workspace\\WholesalerWebDemo\\files\\transform.xslt"));
			transformer.transform(new StreamSource(context.getRealPath(pathXML)), new StreamResult(file));
		} catch (TransformerConfigurationException e) {
			errorList.add("Error while transforming File");
			e.printStackTrace();
		} catch (TransformerException e) {
			errorList.add("Error while transforming File");
			e.printStackTrace();
		}
		return path;
	}
	
	
	
	/**
	 * Writes Document into File
	 * @param document The Document that should be transformed 
	 * @param context The ServletContext to get the relative path
	 * @param userId The userId is needed for the filename
	 * @param errorList The errorList to inform User in case of error
	 * @return the Path to the File
	 */
	public static  String writeDOMIntoFile(Document document, ServletContext context, Integer userId, ArrayList<String> errorList){
		String path="catalog_export"+userId+".XML";
		File file=null;
		try {
			//load Transformation
			TransformerFactory transformerFactory = TransformerFactory.newInstance();
			Transformer transformer = transformerFactory.newTransformer();
			DOMSource source = new DOMSource(document);
			//create file
			file = new File(context.getRealPath(path));
			StreamResult result = new StreamResult(file);
			transformer.transform(source, result);
		} catch (TransformerConfigurationException e) {
			errorList.add("Configuration Error while transforming");
			e.printStackTrace();
		} catch (TransformerException e) {
			errorList.add("Error while transforming");
			e.printStackTrace();
		}
		
		return path;
	}
	
	/**
	 * Creates an empty document
	 * @return empty document The empty document
	 * @throws ParserConfigurationException If Document couldn't be created
	 */
	public static  Document createDocument() throws ParserConfigurationException{
		DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
		DocumentBuilder db = dbf.newDocumentBuilder();
		Document document = db.newDocument();
		return document;
	}
	
	/**
	 * Creates the Basis of our DOM 
	 * @param document empty document in which gets filled with the BasisDOM
	 * @return document The BasisDOM Document 
	 * @throws ParserConfigurationException If Document couldn't be created
	 */
	public static  Document createDOMWithoutArticles(Document document) throws ParserConfigurationException{
		
		//Create ROOT-Element with attributes
		Element root = document.createElement("BMECAT");
		root.setAttribute("version", "1.2");
		root.setAttribute("xmlns:xsi", "http://www.w3.org/2001/XMLSchema-instance");
		//Append ROOT-Element to our document
		document.appendChild(root);
		
		//Create HEADER-Element
		Element header = document.createElement("HEADER");
		//Append HEADER-Element to "BMECAT"
		root.appendChild(header);
		
		//Create CATALOG-Element
		Element catalog = document.createElement("CATALOG");
		//Append CATALOG-Element to "HEADER"
		header.appendChild(catalog);
		
		//Create LANGUAGE-Element
		Element language = document.createElement("LANGUAGE");
		//Append LANGUAGE-Element to "CATALOG"
		catalog.appendChild(language);
		
		//Fill LANGUAGE-Element with Text
		language.insertBefore(document.createTextNode("deu"), language.getLastChild());
		
		//Create CATALOG_ID-Element
		Element catalog_id = document.createElement("CATALOG_ID");
		//Append CATALOG_ID-Element to "CATALOG"
		catalog.appendChild(catalog_id);
		
		//Fill CATALOG_ID-Element with Text
		catalog_id.insertBefore(document.createTextNode("HTWG-EBUS-12"), catalog_id.getLastChild());
		
		//Create CATALOG_VERSION-Element
		Element catalog_version = document.createElement("CATALOG_VERSION");
		//Append CATALOG_VERSION-Element to "CATALOG"
		catalog.appendChild(catalog_version);
		
		//Fill CATALOG_VERSION-Element with Text
		catalog_version.insertBefore(document.createTextNode("1.0"), catalog_version.getLastChild());
		
		//Create CATALOG_NAME-Element
		Element catalog_name = document.createElement("CATALOG_NAME");
		//Append CATALOG_NAME-Element to "CATALOG"
		catalog.appendChild(catalog_name);
		
		//Fill CATALOG_NAME-Element with Text
		catalog_name.insertBefore(document.createTextNode("exportierter Produktkatalog - EBUT"), catalog_name.getLastChild());
		
		//Create SUPPLIER-Element
		Element supplier = document.createElement("SUPPLIER");
		//Append SUPPLIER to "HEADER"
		header.appendChild(supplier);
		
		//Create SUPPLIER_NAME-Element
		Element supplier_name = document.createElement("SUPPLIER_NAME");
		//Append SUPPLIER-Element to "SUPPLIER"
		supplier.appendChild(supplier_name);
		
		//Fill SUPPLIER_NAME-Element with Text
		supplier_name.insertBefore(document.createTextNode("Lei & Johannes GmbH"), supplier_name.getLastChild());
		
		//Create T_NEW_CATALOG-Element
		Element t_new_catalog = document.createElement("T_NEW_CATALOG");
		//Append T_NEW_CATALOG to "HEADER"
		root.appendChild(t_new_catalog);
	
		return document;
	}
	
	/**
	 * Adds an article to the Document -> BMECAT conform
	 * @param document The BMECAT Document where the Product should be added
	 * @param product The Product
	 * 
	 */
	public static void appendArticle(Document document, BOProduct product){
		
		Node t_new_catalog = document.getElementsByTagName("T_NEW_CATALOG").item(0);
		
		//Create ARTICLE-Element
		Element article = document.createElement("ARTICLE");
		t_new_catalog.appendChild(article);
		
		//Create SUPPLIER_AID-Element
		Element supplier_aid = document.createElement("SUPPLIER_AID");
		//Insert content for SUPPLIER_AID
		supplier_aid.insertBefore(document.createTextNode(product.getOrderNumberCustomer()), supplier_aid.getLastChild()); //export for customer
		//Append SUPPLIER_AID to "ARTICLE"
		article.appendChild(supplier_aid);
		
		//Create ARTICLE_DETAILS-Element
		Element article_details = document.createElement("ARTICLE_DETAILS");
		//Append ARTICLE_DETAILS to "ARTICLE"
		article.appendChild(article_details);
		
		//Create DESCRIPTION_SHORT-Element
		Element description_short = document.createElement("DESCRIPTION_SHORT");
		//Insert content for DESCRIPTION_SHORT
		description_short.insertBefore(document.createTextNode(product.getShortDescription()), description_short.getLastChild());
		//Append DESCRIPTION_SHORT to "ARTICLE_DETAILS"
		article_details.appendChild(description_short);
		
		//Create DESCRIPTION_LONG-Element
		Element description_long = document.createElement("DESCRIPTION_LONG");
		if(product.getLongDescription() != null){
			//Insert content for DESCRIPTION_LONG
			description_long.insertBefore(document.createTextNode(product.getLongDescription()), description_long.getLastChild());
			//Append DESCRIPTION_LONG to "ARTICLE_DETAILS"
			article_details.appendChild(description_long);
		}
		
		//Create EAN-Element
		Element ean = document.createElement("EAN");
		//Insert content for EAN
		ean.insertBefore(document.createTextNode("unknown"), ean.getLastChild());
		//Append EAN to "ARTICLE_DETAILS"
		article_details.appendChild(ean);
		
		//Create ARTICLE_ORDER_DETAILS-Element
		Element article_order_details = document.createElement("ARTICLE_ORDER_DETAILS");
		//Append ARTICLE_ORDER_DETAILS to "ARTICLE"
		article.appendChild(article_order_details);
		
		//Create ORDER_UNIT-Element
		Element order_unit = document.createElement("ORDER_UNIT");
		//Insert content for ORDER_UNIT --> Text Content has to be a valid value of  given enumeration
		order_unit.insertBefore(document.createTextNode("05"), order_unit.getLastChild());
		//Append ORDER_UNIT to "ARTICLE_ORDER_DETAILS"
		article_order_details.appendChild(order_unit);
		
		//Create CONTENT_UNIT-Element
		Element content_unit = document.createElement("CONTENT_UNIT");
		//Insert content for CONTENT_UNIT --> Text Content has to be a valid value of  given enumeration
		content_unit.insertBefore(document.createTextNode("05"), content_unit.getLastChild());
		//Append CONTENT_UNIT to "ARTICLE_ORDER_DETAILS"
		article_order_details.appendChild(content_unit);
		
		//Create NO_CU_PER_OU-Element
		Element no_cu_per_ou = document.createElement("NO_CU_PER_OU");
		//Insert content for NO_CU_PER_OU --> Text Content has to be a valid value of given enumeration
		no_cu_per_ou.insertBefore(document.createTextNode("05"), no_cu_per_ou.getLastChild());
		//Append NO_CU_PER_OU to "ARTICLE_ORDER_DETAILS"
		article_order_details.appendChild(no_cu_per_ou);
		
		//Create ARTICLE_DETAILS-Element
		Element article_price_details = document.createElement("ARTICLE_PRICE_DETAILS");
		//Append ARTICLE_DETAILS to "ARTICLE"
		article.appendChild(article_price_details);
			
		appendArticlePriceDetails(document, article_price_details, product);
	}
	

	
	/**
	 * Appends the "ARTICLE_PRICE_DETAILS" for an article
	 * @param document DOM 
	 * @param element "ARTICLE_PRICE_DETAILS" Element
	 * @param product BOProduct, needed to get the "salePrices" from db
	 */
	public static void appendArticlePriceDetails(Document document, Element element, BOProduct product){
		Element article_price_details = element;
		List<BOSalesPrice> salePrices = product.getSalesPrices();
		
		for(BOSalesPrice salePrice : salePrices){
			//Create ARICLE_PRICE-Element
			Element article_price = document.createElement("ARTICLE_PRICE");
			//Set Attribute for ARTICLE_PRICE
			article_price.setAttribute("price_type", salePrice.getPricetype());
			//Append ARTICLE_PRICE to "ARTICLE_PRICE_DETAILS"
			article_price_details.appendChild(article_price);
			
			//Create PRICE_AMOUNT-Element
			Element price_amount = document.createElement("PRICE_AMOUNT");
			//Append PRICE_AMOUNT to "ARTICLE_PRICE"
			article_price.appendChild(price_amount);
			price_amount.insertBefore(document.createTextNode(salePrice.getAmount().toString()), price_amount.getLastChild());		
			
			//Create PRICE_CURRENCY-Element
			Element price_currency = document.createElement("PRICE_CURRENCY");
			//Append PRICE_CURRENCY to "ARTICLE_PRICE"
			article_price.appendChild(price_currency);
			price_currency.insertBefore(document.createTextNode(salePrice.getCountry().getCurrency().getCode()), price_currency.getLastChild());
			
			//Create TAX-Element
			Element tax = document.createElement("TAX");
			//Append TAX to "ARTICLE_PRICE"
			article_price.appendChild(tax);
			tax.insertBefore(document.createTextNode(salePrice.getTaxrate().toString()), tax.getLastChild());
			
			//Create TERRITORY
			Element territory = document.createElement("TERRITORY");
			//Append TERRITORY to "ARTICLE_PRICE"
			article_price.appendChild(territory);
			territory.insertBefore(document.createTextNode(salePrice.getCountry().getIsocode()), territory.getLastChild());
		}

	}

	/**
	 * validates DOM against bmecat xsd
	 * @param document
	 * @param errorList
	 * @return
	 */
	public static boolean validateDOM(Document document, ArrayList<String> errorList) {
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
			errorList.add("The XML File you tried to export is not valid!");
			e.printStackTrace();
		} catch (IOException e) {
			errorList.add("Error while reading DOM");
			e.printStackTrace();
		} 		
		return isValid;
	}
}

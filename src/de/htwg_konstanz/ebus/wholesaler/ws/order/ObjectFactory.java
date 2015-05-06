
package de.htwg_konstanz.ebus.wholesaler.ws.order;

import java.math.BigDecimal;
import java.math.BigInteger;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the de.htwg_konstanz.ebus.wholesaler.ws.order package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _BANKNAME_QNAME = new QName("http://www.opentrans.org/XMLSchema/1.0", "BANK_NAME");
    private final static QName _MIMEPURPOSE_QNAME = new QName("http://www.opentrans.org/XMLSchema/1.0", "MIME_PURPOSE");
    private final static QName _DESCRIPTIONSHORT_QNAME = new QName("http://www.opentrans.org/XMLSchema/1.0", "DESCRIPTION_SHORT");
    private final static QName _PARTIALSHIPMENT_QNAME = new QName("http://www.opentrans.org/XMLSchema/1.0", "PARTIAL_SHIPMENT");
    private final static QName _OrderServiceFault_QNAME = new QName("http://www.htwg-konstanz.de/ebsf/ws/order", "OrderServiceFault");
    private final static QName _ORDERRESPONSEDATE_QNAME = new QName("http://www.opentrans.org/XMLSchema/1.0", "ORDERRESPONSE_DATE");
    private final static QName _MANUFACTURERAID_QNAME = new QName("http://www.opentrans.org/XMLSchema/1.0", "MANUFACTURER_AID");
    private final static QName _ORDERCHANGESEQUENCEID_QNAME = new QName("http://www.opentrans.org/XMLSchema/1.0", "ORDERCHANGE_SEQUENCE_ID");
    private final static QName _PRICEQUANTITY_QNAME = new QName("http://www.opentrans.org/XMLSchema/1.0", "PRICE_QUANTITY");
    private final static QName _STREET_QNAME = new QName("http://www.opentrans.org/XMLSchema/1.0", "STREET");
    private final static QName _COSTACCOUNT_QNAME = new QName("http://www.opentrans.org/XMLSchema/1.0", "COST_ACCOUNT");
    private final static QName _RECEIPTACKNOWLEDGEMENTID_QNAME = new QName("http://www.opentrans.org/XMLSchema/1.0", "RECEIPTACKNOWLEDGEMENT_ID");
    private final static QName _CONTACTNAME_QNAME = new QName("http://www.opentrans.org/XMLSchema/1.0", "CONTACT_NAME");
    private final static QName _BANKACCOUNT_QNAME = new QName("http://www.opentrans.org/XMLSchema/1.0", "BANK_ACCOUNT");
    private final static QName _PACKAGETYPE_QNAME = new QName("http://www.opentrans.org/XMLSchema/1.0", "PACKAGE_TYPE");
    private final static QName _STATE_QNAME = new QName("http://www.opentrans.org/XMLSchema/1.0", "STATE");
    private final static QName _PARTIALSHIPMENTALLOWED_QNAME = new QName("http://www.opentrans.org/XMLSchema/1.0", "PARTIAL_SHIPMENT_ALLOWED");
    private final static QName _MANUFACTURERNAME_QNAME = new QName("http://www.opentrans.org/XMLSchema/1.0", "MANUFACTURER_NAME");
    private final static QName _ORDERDATE_QNAME = new QName("http://www.opentrans.org/XMLSchema/1.0", "ORDER_DATE");
    private final static QName _MANUFACTURERTYPEDESCR_QNAME = new QName("http://www.opentrans.org/XMLSchema/1.0", "MANUFACTURER_TYPE_DESCR");
    private final static QName _BANKCOUNTRY_QNAME = new QName("http://www.opentrans.org/XMLSchema/1.0", "BANK_COUNTRY");
    private final static QName _CARDHOLDERNAME_QNAME = new QName("http://www.opentrans.org/XMLSchema/1.0", "CARD_HOLDER_NAME");
    private final static QName _SUPPLIERORDERID_QNAME = new QName("http://www.opentrans.org/XMLSchema/1.0", "SUPPLIER_ORDER_ID");
    private final static QName _RECEIPTACKNOWLEDGEMENTDATE_QNAME = new QName("http://www.opentrans.org/XMLSchema/1.0", "RECEIPTACKNOWLEDGEMENT_DATE");
    private final static QName _DISPATCHNOTIFICATIONDATE_QNAME = new QName("http://www.opentrans.org/XMLSchema/1.0", "DISPATCHNOTIFICATION_DATE");
    private final static QName _MEANSOFTRANSPORTID_QNAME = new QName("http://www.opentrans.org/XMLSchema/1.0", "MEANS_OF_TRANSPORT_ID");
    private final static QName _SUPPLIERORDERITEMID_QNAME = new QName("http://www.opentrans.org/XMLSchema/1.0", "SUPPLIER_ORDER_ITEM_ID");
    private final static QName _SUPPLIERAID_QNAME = new QName("http://www.opentrans.org/XMLSchema/1.0", "SUPPLIER_AID");
    private final static QName _CARDREFNUM_QNAME = new QName("http://www.opentrans.org/XMLSchema/1.0", "CARD_REF_NUM");
    private final static QName _DELIVERYENDDATE_QNAME = new QName("http://www.opentrans.org/XMLSchema/1.0", "DELIVERY_END_DATE");
    private final static QName _CITY_QNAME = new QName("http://www.opentrans.org/XMLSchema/1.0", "CITY");
    private final static QName _CATALOGVERSION_QNAME = new QName("http://www.opentrans.org/XMLSchema/1.0", "CATALOG_VERSION");
    private final static QName _TERMSANDCONDITIONS_QNAME = new QName("http://www.opentrans.org/XMLSchema/1.0", "TERMS_AND_CONDITIONS");
    private final static QName _PRICELINEAMOUNT_QNAME = new QName("http://www.opentrans.org/XMLSchema/1.0", "PRICE_LINE_AMOUNT");
    private final static QName _TOTALAMOUNT_QNAME = new QName("http://www.opentrans.org/XMLSchema/1.0", "TOTAL_AMOUNT");
    private final static QName _AGREEMENTENDDATE_QNAME = new QName("http://www.opentrans.org/XMLSchema/1.0", "AGREEMENT_END_DATE");
    private final static QName _CARDEXPIRATIONDATE_QNAME = new QName("http://www.opentrans.org/XMLSchema/1.0", "CARD_EXPIRATION_DATE");
    private final static QName _DISPATCHNOTIFICATIONID_QNAME = new QName("http://www.opentrans.org/XMLSchema/1.0", "DISPATCHNOTIFICATION_ID");
    private final static QName _MEANSOFTRANSPORTNAME_QNAME = new QName("http://www.opentrans.org/XMLSchema/1.0", "MEANS_OF_TRANSPORT_NAME");
    private final static QName _AGREEMENTLINEID_QNAME = new QName("http://www.opentrans.org/XMLSchema/1.0", "AGREEMENT_LINE_ID");
    private final static QName _DELIVERYSTARTDATE_QNAME = new QName("http://www.opentrans.org/XMLSchema/1.0", "DELIVERY_START_DATE");
    private final static QName _TAXAMOUNT_QNAME = new QName("http://www.opentrans.org/XMLSchema/1.0", "TAX_AMOUNT");
    private final static QName _RFQID_QNAME = new QName("http://www.opentrans.org/XMLSchema/1.0", "RFQ_ID");
    private final static QName _CATALOGID_QNAME = new QName("http://www.opentrans.org/XMLSchema/1.0", "CATALOG_ID");
    private final static QName _DELIVERYCOMPLETED_QNAME = new QName("http://www.opentrans.org/XMLSchema/1.0", "DELIVERY_COMPLETED");
    private final static QName _HOLDER_QNAME = new QName("http://www.opentrans.org/XMLSchema/1.0", "HOLDER");
    private final static QName _LINEITEMID_QNAME = new QName("http://www.opentrans.org/XMLSchema/1.0", "LINE_ITEM_ID");
    private final static QName _DESCRIPTIONLONG_QNAME = new QName("http://www.opentrans.org/XMLSchema/1.0", "DESCRIPTION_LONG");
    private final static QName _VATID_QNAME = new QName("http://www.opentrans.org/XMLSchema/1.0", "VAT_ID");
    private final static QName _INVOICEDATE_QNAME = new QName("http://www.opentrans.org/XMLSchema/1.0", "INVOICE_DATE");
    private final static QName _AGREEMENTID_QNAME = new QName("http://www.opentrans.org/XMLSchema/1.0", "AGREEMENT_ID");
    private final static QName _DELIVERYNOTEDATE_QNAME = new QName("http://www.opentrans.org/XMLSchema/1.0", "DELIVERYNOTE_DATE");
    private final static QName _COUNTRY_QNAME = new QName("http://www.opentrans.org/XMLSchema/1.0", "COUNTRY");
    private final static QName _GENERATIONDATE_QNAME = new QName("http://www.opentrans.org/XMLSchema/1.0", "GENERATION_DATE");
    private final static QName _CARDTYPE_QNAME = new QName("http://www.opentrans.org/XMLSchema/1.0", "CARD_TYPE");
    private final static QName _ALTCUSTOMERORDERID_QNAME = new QName("http://www.opentrans.org/XMLSchema/1.0", "ALT_CUSTOMER_ORDER_ID");
    private final static QName _VALIDENDDATE_QNAME = new QName("http://www.opentrans.org/XMLSchema/1.0", "VALID_END_DATE");
    private final static QName _NAME3_QNAME = new QName("http://www.opentrans.org/XMLSchema/1.0", "NAME3");
    private final static QName _CATALOGNAME_QNAME = new QName("http://www.opentrans.org/XMLSchema/1.0", "CATALOG_NAME");
    private final static QName _BANKCODE_QNAME = new QName("http://www.opentrans.org/XMLSchema/1.0", "BANK_CODE");
    private final static QName _INCOTERM_QNAME = new QName("http://www.opentrans.org/XMLSchema/1.0", "INCOTERM");
    private final static QName _ORDERUNIT_QNAME = new QName("http://www.opentrans.org/XMLSchema/1.0", "ORDER_UNIT");
    private final static QName _TOTALITEMNUM_QNAME = new QName("http://www.opentrans.org/XMLSchema/1.0", "TOTAL_ITEM_NUM");
    private final static QName _ZIPBOX_QNAME = new QName("http://www.opentrans.org/XMLSchema/1.0", "ZIPBOX");
    private final static QName _NAME2_QNAME = new QName("http://www.opentrans.org/XMLSchema/1.0", "NAME2");
    private final static QName _LOCATION_QNAME = new QName("http://www.opentrans.org/XMLSchema/1.0", "LOCATION");
    private final static QName _MIMEALT_QNAME = new QName("http://www.opentrans.org/XMLSchema/1.0", "MIME_ALT");
    private final static QName _AGREEMENTSTARTDATE_QNAME = new QName("http://www.opentrans.org/XMLSchema/1.0", "AGREEMENT_START_DATE");
    private final static QName _RFQDATE_QNAME = new QName("http://www.opentrans.org/XMLSchema/1.0", "RFQ_DATE");
    private final static QName _DEPARTMENT_QNAME = new QName("http://www.opentrans.org/XMLSchema/1.0", "DEPARTMENT");
    private final static QName _MIMEDESCR_QNAME = new QName("http://www.opentrans.org/XMLSchema/1.0", "MIME_DESCR");
    private final static QName _URL_QNAME = new QName("http://www.opentrans.org/XMLSchema/1.0", "URL");
    private final static QName _EMAIL_QNAME = new QName("http://www.opentrans.org/XMLSchema/1.0", "EMAIL");
    private final static QName _ORDERCHANGEDATE_QNAME = new QName("http://www.opentrans.org/XMLSchema/1.0", "ORDERCHANGE_DATE");
    private final static QName _CARDAUTHCODE_QNAME = new QName("http://www.opentrans.org/XMLSchema/1.0", "CARD_AUTH_CODE");
    private final static QName _MIMEORDER_QNAME = new QName("http://www.opentrans.org/XMLSchema/1.0", "MIME_ORDER");
    private final static QName _CARDTYPEOTHER_QNAME = new QName("http://www.opentrans.org/XMLSchema/1.0", "CARD_TYPE_OTHER");
    private final static QName _RECEIPTDATE_QNAME = new QName("http://www.opentrans.org/XMLSchema/1.0", "RECEIPT_DATE");
    private final static QName _QUOTATIONDATE_QNAME = new QName("http://www.opentrans.org/XMLSchema/1.0", "QUOTATION_DATE");
    private final static QName _PRICECURRENCY_QNAME = new QName("http://www.opentrans.org/XMLSchema/1.0", "PRICE_CURRENCY");
    private final static QName _NAME_QNAME = new QName("http://www.opentrans.org/XMLSchema/1.0", "NAME");
    private final static QName _TAX_QNAME = new QName("http://www.opentrans.org/XMLSchema/1.0", "TAX");
    private final static QName _INVOICEID_QNAME = new QName("http://www.opentrans.org/XMLSchema/1.0", "INVOICE_ID");
    private final static QName _PRICEAMOUNT_QNAME = new QName("http://www.opentrans.org/XMLSchema/1.0", "PRICE_AMOUNT");
    private final static QName _CARDNUM_QNAME = new QName("http://www.opentrans.org/XMLSchema/1.0", "CARD_NUM");
    private final static QName _STOPAUTOMATICPROCESSING_QNAME = new QName("http://www.opentrans.org/XMLSchema/1.0", "STOP_AUTOMATIC_PROCESSING");
    private final static QName _QUOTATIONID_QNAME = new QName("http://www.opentrans.org/XMLSchema/1.0", "QUOTATION_ID");
    private final static QName _VALIDSTARTDATE_QNAME = new QName("http://www.opentrans.org/XMLSchema/1.0", "VALID_START_DATE");
    private final static QName _MIMETYPE_QNAME = new QName("http://www.opentrans.org/XMLSchema/1.0", "MIME_TYPE");
    private final static QName _ORDERID_QNAME = new QName("http://www.opentrans.org/XMLSchema/1.0", "ORDER_ID");
    private final static QName _DELIVERYNOTEID_QNAME = new QName("http://www.opentrans.org/XMLSchema/1.0", "DELIVERYNOTE_ID");
    private final static QName _BOXNO_QNAME = new QName("http://www.opentrans.org/XMLSchema/1.0", "BOXNO");
    private final static QName _MIMEROOT_QNAME = new QName("http://www.opentrans.org/XMLSchema/1.0", "MIME_ROOT");
    private final static QName _COSTTYPE_QNAME = new QName("http://www.opentrans.org/XMLSchema/1.0", "COST_TYPE");
    private final static QName _TOTALTAXAMOUNT_QNAME = new QName("http://www.opentrans.org/XMLSchema/1.0", "TOTAL_TAX_AMOUNT");
    private final static QName _FAX_QNAME = new QName("http://www.opentrans.org/XMLSchema/1.0", "FAX");
    private final static QName _QUANTITY_QNAME = new QName("http://www.opentrans.org/XMLSchema/1.0", "QUANTITY");
    private final static QName _GENERATORINFO_QNAME = new QName("http://www.opentrans.org/XMLSchema/1.0", "GENERATOR_INFO");
    private final static QName _PACKAGEID_QNAME = new QName("http://www.opentrans.org/XMLSchema/1.0", "PACKAGE_ID");
    private final static QName _TRANSPORTREMARK_QNAME = new QName("http://www.opentrans.org/XMLSchema/1.0", "TRANSPORT_REMARK");
    private final static QName _MIMESOURCE_QNAME = new QName("http://www.opentrans.org/XMLSchema/1.0", "MIME_SOURCE");
    private final static QName _ZIP_QNAME = new QName("http://www.opentrans.org/XMLSchema/1.0", "ZIP");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: de.htwg_konstanz.ebus.wholesaler.ws.order
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link DEBIT }
     * 
     */
    public DEBIT createDEBIT() {
        return new DEBIT();
    }

    /**
     * Create an instance of {@link DISPATCHNOTIFICATION }
     * 
     */
    public DISPATCHNOTIFICATION createDISPATCHNOTIFICATION() {
        return new DISPATCHNOTIFICATION();
    }

    /**
     * Create an instance of {@link INTERNATIONALRESTRICTIONS }
     * 
     */
    public INTERNATIONALRESTRICTIONS createINTERNATIONALRESTRICTIONS() {
        return new INTERNATIONALRESTRICTIONS();
    }

    /**
     * Create an instance of {@link SPECIALTREATMENTCLASS }
     * 
     */
    public SPECIALTREATMENTCLASS createSPECIALTREATMENTCLASS() {
        return new SPECIALTREATMENTCLASS();
    }

    /**
     * Create an instance of {@link PAYMENTTERM }
     * 
     */
    public PAYMENTTERM createPAYMENTTERM() {
        return new PAYMENTTERM();
    }

    /**
     * Create an instance of {@link DISPATCHNOTIFICATIONHEADER }
     * 
     */
    public DISPATCHNOTIFICATIONHEADER createDISPATCHNOTIFICATIONHEADER() {
        return new DISPATCHNOTIFICATIONHEADER();
    }

    /**
     * Create an instance of {@link PRICEFLAG }
     * 
     */
    public PRICEFLAG createPRICEFLAG() {
        return new PRICEFLAG();
    }

    /**
     * Create an instance of {@link INVOICESUMMARY }
     * 
     */
    public INVOICESUMMARY createINVOICESUMMARY() {
        return new INVOICESUMMARY();
    }

    /**
     * Create an instance of {@link MIMEINFO }
     * 
     */
    public MIMEINFO createMIMEINFO() {
        return new MIMEINFO();
    }

    /**
     * Create an instance of {@link INVOICEINFO }
     * 
     */
    public INVOICEINFO createINVOICEINFO() {
        return new INVOICEINFO();
    }

    /**
     * Create an instance of {@link DELIVERYDATE }
     * 
     */
    public DELIVERYDATE createDELIVERYDATE() {
        return new DELIVERYDATE();
    }

    /**
     * Create an instance of {@link ORDERINFO }
     * 
     */
    public ORDERINFO createORDERINFO() {
        return new ORDERINFO();
    }

    /**
     * Create an instance of {@link DISPATCHNOTIFICATIONSUMMARY }
     * 
     */
    public DISPATCHNOTIFICATIONSUMMARY createDISPATCHNOTIFICATIONSUMMARY() {
        return new DISPATCHNOTIFICATIONSUMMARY();
    }

    /**
     * Create an instance of {@link DISPATCHNOTIFICATIONITEMLIST }
     * 
     */
    public DISPATCHNOTIFICATIONITEMLIST createDISPATCHNOTIFICATIONITEMLIST() {
        return new DISPATCHNOTIFICATIONITEMLIST();
    }

    /**
     * Create an instance of {@link ADDRESS }
     * 
     */
    public ADDRESS createADDRESS() {
        return new ADDRESS();
    }

    /**
     * Create an instance of {@link DELIVERYPARTY }
     * 
     */
    public DELIVERYPARTY createDELIVERYPARTY() {
        return new DELIVERYPARTY();
    }

    /**
     * Create an instance of {@link ARTICLEID }
     * 
     */
    public ARTICLEID createARTICLEID() {
        return new ARTICLEID();
    }

    /**
     * Create an instance of {@link MANUFACTURERINFO }
     * 
     */
    public MANUFACTURERINFO createMANUFACTURERINFO() {
        return new MANUFACTURERINFO();
    }

    /**
     * Create an instance of {@link ORDERPARTIES }
     * 
     */
    public ORDERPARTIES createORDERPARTIES() {
        return new ORDERPARTIES();
    }

    /**
     * Create an instance of {@link SUPPLIERPARTY }
     * 
     */
    public SUPPLIERPARTY createSUPPLIERPARTY() {
        return new SUPPLIERPARTY();
    }

    /**
     * Create an instance of {@link ORDERITEMLIST }
     * 
     */
    public ORDERITEMLIST createORDERITEMLIST() {
        return new ORDERITEMLIST();
    }

    /**
     * Create an instance of {@link INVOICEPARTY }
     * 
     */
    public INVOICEPARTY createINVOICEPARTY() {
        return new INVOICEPARTY();
    }

    /**
     * Create an instance of {@link MIME }
     * 
     */
    public MIME createMIME() {
        return new MIME();
    }

    /**
     * Create an instance of {@link CASH }
     * 
     */
    public CASH createCASH() {
        return new CASH();
    }

    /**
     * Create an instance of {@link INVOICEHEADER }
     * 
     */
    public INVOICEHEADER createINVOICEHEADER() {
        return new INVOICEHEADER();
    }

    /**
     * Create an instance of {@link INVOICEITEMLIST }
     * 
     */
    public INVOICEITEMLIST createINVOICEITEMLIST() {
        return new INVOICEITEMLIST();
    }

    /**
     * Create an instance of {@link ORDERHEADER }
     * 
     */
    public ORDERHEADER createORDERHEADER() {
        return new ORDERHEADER();
    }

    /**
     * Create an instance of {@link ORDERRESPONSEINFO }
     * 
     */
    public ORDERRESPONSEINFO createORDERRESPONSEINFO() {
        return new ORDERRESPONSEINFO();
    }

    /**
     * Create an instance of {@link CARD }
     * 
     */
    public CARD createCARD() {
        return new CARD();
    }

    /**
     * Create an instance of {@link CHECK }
     * 
     */
    public CHECK createCHECK() {
        return new CHECK();
    }

    /**
     * Create an instance of {@link MEANSOFTRANSPORT }
     * 
     */
    public MEANSOFTRANSPORT createMEANSOFTRANSPORT() {
        return new MEANSOFTRANSPORT();
    }

    /**
     * Create an instance of {@link CONTROLINFO }
     * 
     */
    public CONTROLINFO createCONTROLINFO() {
        return new CONTROLINFO();
    }

    /**
     * Create an instance of {@link CONTACT }
     * 
     */
    public CONTACT createCONTACT() {
        return new CONTACT();
    }

    /**
     * Create an instance of {@link SHIPMENTPARTIES }
     * 
     */
    public SHIPMENTPARTIES createSHIPMENTPARTIES() {
        return new SHIPMENTPARTIES();
    }

    /**
     * Create an instance of {@link CATALOGREFERENCE }
     * 
     */
    public CATALOGREFERENCE createCATALOGREFERENCE() {
        return new CATALOGREFERENCE();
    }

    /**
     * Create an instance of {@link SUPPLIERORDERREFERENCE }
     * 
     */
    public SUPPLIERORDERREFERENCE createSUPPLIERORDERREFERENCE() {
        return new SUPPLIERORDERREFERENCE();
    }

    /**
     * Create an instance of {@link INVOICEITEM }
     * 
     */
    public INVOICEITEM createINVOICEITEM() {
        return new INVOICEITEM();
    }

    /**
     * Create an instance of {@link DELIVERYREFERENCE }
     * 
     */
    public DELIVERYREFERENCE createDELIVERYREFERENCE() {
        return new DELIVERYREFERENCE();
    }

    /**
     * Create an instance of {@link OrderServiceResponse }
     * 
     */
    public OrderServiceResponse createOrderServiceResponse() {
        return new OrderServiceResponse();
    }

    /**
     * Create an instance of {@link INTERNATIONALAID }
     * 
     */
    public INTERNATIONALAID createINTERNATIONALAID() {
        return new INTERNATIONALAID();
    }

    /**
     * Create an instance of {@link COSTCATEGORYID }
     * 
     */
    public COSTCATEGORYID createCOSTCATEGORYID() {
        return new COSTCATEGORYID();
    }

    /**
     * Create an instance of {@link FINALDELIVERYPARTY }
     * 
     */
    public FINALDELIVERYPARTY createFINALDELIVERYPARTY() {
        return new FINALDELIVERYPARTY();
    }

    /**
     * Create an instance of {@link ORDER }
     * 
     */
    public ORDER createORDER() {
        return new ORDER();
    }

    /**
     * Create an instance of {@link ORDERRESPONSEITEMLIST }
     * 
     */
    public ORDERRESPONSEITEMLIST createORDERRESPONSEITEMLIST() {
        return new ORDERRESPONSEITEMLIST();
    }

    /**
     * Create an instance of {@link PARTY }
     * 
     */
    public PARTY createPARTY() {
        return new PARTY();
    }

    /**
     * Create an instance of {@link ORDERRESPONSE }
     * 
     */
    public ORDERRESPONSE createORDERRESPONSE() {
        return new ORDERRESPONSE();
    }

    /**
     * Create an instance of {@link PHONE }
     * 
     */
    public PHONE createPHONE() {
        return new PHONE();
    }

    /**
     * Create an instance of {@link BUYERAID }
     * 
     */
    public BUYERAID createBUYERAID() {
        return new BUYERAID();
    }

    /**
     * Create an instance of {@link OrderServiceRequest }
     * 
     */
    public OrderServiceRequest createOrderServiceRequest() {
        return new OrderServiceRequest();
    }

    /**
     * Create an instance of {@link ORDERHISTORY }
     * 
     */
    public ORDERHISTORY createORDERHISTORY() {
        return new ORDERHISTORY();
    }

    /**
     * Create an instance of {@link ORDERREFERENCE }
     * 
     */
    public ORDERREFERENCE createORDERREFERENCE() {
        return new ORDERREFERENCE();
    }

    /**
     * Create an instance of {@link SOURCINGINFO }
     * 
     */
    public SOURCINGINFO createSOURCINGINFO() {
        return new SOURCINGINFO();
    }

    /**
     * Create an instance of {@link PACKAGEINFO }
     * 
     */
    public PACKAGEINFO createPACKAGEINFO() {
        return new PACKAGEINFO();
    }

    /**
     * Create an instance of {@link ORDERITEM }
     * 
     */
    public ORDERITEM createORDERITEM() {
        return new ORDERITEM();
    }

    /**
     * Create an instance of {@link ACCOUNTINGINFO }
     * 
     */
    public ACCOUNTINGINFO createACCOUNTINGINFO() {
        return new ACCOUNTINGINFO();
    }

    /**
     * Create an instance of {@link TRANSPORTPARTY }
     * 
     */
    public TRANSPORTPARTY createTRANSPORTPARTY() {
        return new TRANSPORTPARTY();
    }

    /**
     * Create an instance of {@link PUBLICKEY }
     * 
     */
    public PUBLICKEY createPUBLICKEY() {
        return new PUBLICKEY();
    }

    /**
     * Create an instance of {@link ORDERRESPONSEITEM }
     * 
     */
    public ORDERRESPONSEITEM createORDERRESPONSEITEM() {
        return new ORDERRESPONSEITEM();
    }

    /**
     * Create an instance of {@link ORDERSUMMARY }
     * 
     */
    public ORDERSUMMARY createORDERSUMMARY() {
        return new ORDERSUMMARY();
    }

    /**
     * Create an instance of {@link INVOICE }
     * 
     */
    public INVOICE createINVOICE() {
        return new INVOICE();
    }

    /**
     * Create an instance of {@link ORDERRESPONSESUMMARY }
     * 
     */
    public ORDERRESPONSESUMMARY createORDERRESPONSESUMMARY() {
        return new ORDERRESPONSESUMMARY();
    }

    /**
     * Create an instance of {@link REMARK }
     * 
     */
    public REMARK createREMARK() {
        return new REMARK();
    }

    /**
     * Create an instance of {@link BUYERPARTY }
     * 
     */
    public BUYERPARTY createBUYERPARTY() {
        return new BUYERPARTY();
    }

    /**
     * Create an instance of {@link AGREEMENT }
     * 
     */
    public AGREEMENT createAGREEMENT() {
        return new AGREEMENT();
    }

    /**
     * Create an instance of {@link PAYMENT }
     * 
     */
    public PAYMENT createPAYMENT() {
        return new PAYMENT();
    }

    /**
     * Create an instance of {@link DISPATCHNOTIFICATIONITEM }
     * 
     */
    public DISPATCHNOTIFICATIONITEM createDISPATCHNOTIFICATIONITEM() {
        return new DISPATCHNOTIFICATIONITEM();
    }

    /**
     * Create an instance of {@link TRANSPORT }
     * 
     */
    public TRANSPORT createTRANSPORT() {
        return new TRANSPORT();
    }

    /**
     * Create an instance of {@link ARTICLEPRICE }
     * 
     */
    public ARTICLEPRICE createARTICLEPRICE() {
        return new ARTICLEPRICE();
    }

    /**
     * Create an instance of {@link ORDERRESPONSEHEADER }
     * 
     */
    public ORDERRESPONSEHEADER createORDERRESPONSEHEADER() {
        return new ORDERRESPONSEHEADER();
    }

    /**
     * Create an instance of {@link PARTYID }
     * 
     */
    public PARTYID createPARTYID() {
        return new PARTYID();
    }

    /**
     * Create an instance of {@link ACCOUNT }
     * 
     */
    public ACCOUNT createACCOUNT() {
        return new ACCOUNT();
    }

    /**
     * Create an instance of {@link DISPATCHNOTIFICATIONINFO }
     * 
     */
    public DISPATCHNOTIFICATIONINFO createDISPATCHNOTIFICATIONINFO() {
        return new DISPATCHNOTIFICATIONINFO();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.opentrans.org/XMLSchema/1.0", name = "BANK_NAME")
    public JAXBElement<String> createBANKNAME(String value) {
        return new JAXBElement<String>(_BANKNAME_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.opentrans.org/XMLSchema/1.0", name = "MIME_PURPOSE")
    public JAXBElement<String> createMIMEPURPOSE(String value) {
        return new JAXBElement<String>(_MIMEPURPOSE_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.opentrans.org/XMLSchema/1.0", name = "DESCRIPTION_SHORT")
    public JAXBElement<String> createDESCRIPTIONSHORT(String value) {
        return new JAXBElement<String>(_DESCRIPTIONSHORT_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.opentrans.org/XMLSchema/1.0", name = "PARTIAL_SHIPMENT")
    public JAXBElement<String> createPARTIALSHIPMENT(String value) {
        return new JAXBElement<String>(_PARTIALSHIPMENT_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.htwg-konstanz.de/ebsf/ws/order", name = "OrderServiceFault")
    public JAXBElement<String> createOrderServiceFault(String value) {
        return new JAXBElement<String>(_OrderServiceFault_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.opentrans.org/XMLSchema/1.0", name = "ORDERRESPONSE_DATE")
    public JAXBElement<String> createORDERRESPONSEDATE(String value) {
        return new JAXBElement<String>(_ORDERRESPONSEDATE_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.opentrans.org/XMLSchema/1.0", name = "MANUFACTURER_AID")
    public JAXBElement<String> createMANUFACTURERAID(String value) {
        return new JAXBElement<String>(_MANUFACTURERAID_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.opentrans.org/XMLSchema/1.0", name = "ORDERCHANGE_SEQUENCE_ID")
    public JAXBElement<BigInteger> createORDERCHANGESEQUENCEID(BigInteger value) {
        return new JAXBElement<BigInteger>(_ORDERCHANGESEQUENCEID_QNAME, BigInteger.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.opentrans.org/XMLSchema/1.0", name = "PRICE_QUANTITY")
    public JAXBElement<BigDecimal> createPRICEQUANTITY(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_PRICEQUANTITY_QNAME, BigDecimal.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.opentrans.org/XMLSchema/1.0", name = "STREET")
    public JAXBElement<String> createSTREET(String value) {
        return new JAXBElement<String>(_STREET_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.opentrans.org/XMLSchema/1.0", name = "COST_ACCOUNT")
    public JAXBElement<String> createCOSTACCOUNT(String value) {
        return new JAXBElement<String>(_COSTACCOUNT_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.opentrans.org/XMLSchema/1.0", name = "RECEIPTACKNOWLEDGEMENT_ID")
    public JAXBElement<String> createRECEIPTACKNOWLEDGEMENTID(String value) {
        return new JAXBElement<String>(_RECEIPTACKNOWLEDGEMENTID_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.opentrans.org/XMLSchema/1.0", name = "CONTACT_NAME")
    public JAXBElement<String> createCONTACTNAME(String value) {
        return new JAXBElement<String>(_CONTACTNAME_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.opentrans.org/XMLSchema/1.0", name = "BANK_ACCOUNT")
    public JAXBElement<String> createBANKACCOUNT(String value) {
        return new JAXBElement<String>(_BANKACCOUNT_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.opentrans.org/XMLSchema/1.0", name = "PACKAGE_TYPE")
    public JAXBElement<String> createPACKAGETYPE(String value) {
        return new JAXBElement<String>(_PACKAGETYPE_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.opentrans.org/XMLSchema/1.0", name = "STATE")
    public JAXBElement<String> createSTATE(String value) {
        return new JAXBElement<String>(_STATE_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.opentrans.org/XMLSchema/1.0", name = "PARTIAL_SHIPMENT_ALLOWED")
    public JAXBElement<String> createPARTIALSHIPMENTALLOWED(String value) {
        return new JAXBElement<String>(_PARTIALSHIPMENTALLOWED_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.opentrans.org/XMLSchema/1.0", name = "MANUFACTURER_NAME")
    public JAXBElement<String> createMANUFACTURERNAME(String value) {
        return new JAXBElement<String>(_MANUFACTURERNAME_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.opentrans.org/XMLSchema/1.0", name = "ORDER_DATE")
    public JAXBElement<String> createORDERDATE(String value) {
        return new JAXBElement<String>(_ORDERDATE_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.opentrans.org/XMLSchema/1.0", name = "MANUFACTURER_TYPE_DESCR")
    public JAXBElement<String> createMANUFACTURERTYPEDESCR(String value) {
        return new JAXBElement<String>(_MANUFACTURERTYPEDESCR_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.opentrans.org/XMLSchema/1.0", name = "BANK_COUNTRY")
    public JAXBElement<String> createBANKCOUNTRY(String value) {
        return new JAXBElement<String>(_BANKCOUNTRY_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.opentrans.org/XMLSchema/1.0", name = "CARD_HOLDER_NAME")
    public JAXBElement<String> createCARDHOLDERNAME(String value) {
        return new JAXBElement<String>(_CARDHOLDERNAME_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.opentrans.org/XMLSchema/1.0", name = "SUPPLIER_ORDER_ID")
    public JAXBElement<String> createSUPPLIERORDERID(String value) {
        return new JAXBElement<String>(_SUPPLIERORDERID_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.opentrans.org/XMLSchema/1.0", name = "RECEIPTACKNOWLEDGEMENT_DATE")
    public JAXBElement<String> createRECEIPTACKNOWLEDGEMENTDATE(String value) {
        return new JAXBElement<String>(_RECEIPTACKNOWLEDGEMENTDATE_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.opentrans.org/XMLSchema/1.0", name = "DISPATCHNOTIFICATION_DATE")
    public JAXBElement<String> createDISPATCHNOTIFICATIONDATE(String value) {
        return new JAXBElement<String>(_DISPATCHNOTIFICATIONDATE_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.opentrans.org/XMLSchema/1.0", name = "MEANS_OF_TRANSPORT_ID")
    public JAXBElement<String> createMEANSOFTRANSPORTID(String value) {
        return new JAXBElement<String>(_MEANSOFTRANSPORTID_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.opentrans.org/XMLSchema/1.0", name = "SUPPLIER_ORDER_ITEM_ID")
    public JAXBElement<String> createSUPPLIERORDERITEMID(String value) {
        return new JAXBElement<String>(_SUPPLIERORDERITEMID_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.opentrans.org/XMLSchema/1.0", name = "SUPPLIER_AID")
    public JAXBElement<String> createSUPPLIERAID(String value) {
        return new JAXBElement<String>(_SUPPLIERAID_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.opentrans.org/XMLSchema/1.0", name = "CARD_REF_NUM")
    public JAXBElement<String> createCARDREFNUM(String value) {
        return new JAXBElement<String>(_CARDREFNUM_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.opentrans.org/XMLSchema/1.0", name = "DELIVERY_END_DATE")
    public JAXBElement<String> createDELIVERYENDDATE(String value) {
        return new JAXBElement<String>(_DELIVERYENDDATE_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.opentrans.org/XMLSchema/1.0", name = "CITY")
    public JAXBElement<String> createCITY(String value) {
        return new JAXBElement<String>(_CITY_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.opentrans.org/XMLSchema/1.0", name = "CATALOG_VERSION")
    public JAXBElement<String> createCATALOGVERSION(String value) {
        return new JAXBElement<String>(_CATALOGVERSION_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.opentrans.org/XMLSchema/1.0", name = "TERMS_AND_CONDITIONS")
    public JAXBElement<String> createTERMSANDCONDITIONS(String value) {
        return new JAXBElement<String>(_TERMSANDCONDITIONS_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.opentrans.org/XMLSchema/1.0", name = "PRICE_LINE_AMOUNT")
    public JAXBElement<BigDecimal> createPRICELINEAMOUNT(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_PRICELINEAMOUNT_QNAME, BigDecimal.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.opentrans.org/XMLSchema/1.0", name = "TOTAL_AMOUNT")
    public JAXBElement<BigDecimal> createTOTALAMOUNT(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_TOTALAMOUNT_QNAME, BigDecimal.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.opentrans.org/XMLSchema/1.0", name = "AGREEMENT_END_DATE")
    public JAXBElement<String> createAGREEMENTENDDATE(String value) {
        return new JAXBElement<String>(_AGREEMENTENDDATE_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.opentrans.org/XMLSchema/1.0", name = "CARD_EXPIRATION_DATE")
    public JAXBElement<String> createCARDEXPIRATIONDATE(String value) {
        return new JAXBElement<String>(_CARDEXPIRATIONDATE_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.opentrans.org/XMLSchema/1.0", name = "DISPATCHNOTIFICATION_ID")
    public JAXBElement<String> createDISPATCHNOTIFICATIONID(String value) {
        return new JAXBElement<String>(_DISPATCHNOTIFICATIONID_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.opentrans.org/XMLSchema/1.0", name = "MEANS_OF_TRANSPORT_NAME")
    public JAXBElement<String> createMEANSOFTRANSPORTNAME(String value) {
        return new JAXBElement<String>(_MEANSOFTRANSPORTNAME_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.opentrans.org/XMLSchema/1.0", name = "AGREEMENT_LINE_ID")
    public JAXBElement<String> createAGREEMENTLINEID(String value) {
        return new JAXBElement<String>(_AGREEMENTLINEID_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.opentrans.org/XMLSchema/1.0", name = "DELIVERY_START_DATE")
    public JAXBElement<String> createDELIVERYSTARTDATE(String value) {
        return new JAXBElement<String>(_DELIVERYSTARTDATE_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.opentrans.org/XMLSchema/1.0", name = "TAX_AMOUNT")
    public JAXBElement<BigDecimal> createTAXAMOUNT(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_TAXAMOUNT_QNAME, BigDecimal.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.opentrans.org/XMLSchema/1.0", name = "RFQ_ID")
    public JAXBElement<String> createRFQID(String value) {
        return new JAXBElement<String>(_RFQID_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.opentrans.org/XMLSchema/1.0", name = "CATALOG_ID")
    public JAXBElement<String> createCATALOGID(String value) {
        return new JAXBElement<String>(_CATALOGID_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.opentrans.org/XMLSchema/1.0", name = "DELIVERY_COMPLETED")
    public JAXBElement<String> createDELIVERYCOMPLETED(String value) {
        return new JAXBElement<String>(_DELIVERYCOMPLETED_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.opentrans.org/XMLSchema/1.0", name = "HOLDER")
    public JAXBElement<String> createHOLDER(String value) {
        return new JAXBElement<String>(_HOLDER_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.opentrans.org/XMLSchema/1.0", name = "LINE_ITEM_ID")
    public JAXBElement<String> createLINEITEMID(String value) {
        return new JAXBElement<String>(_LINEITEMID_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.opentrans.org/XMLSchema/1.0", name = "DESCRIPTION_LONG")
    public JAXBElement<String> createDESCRIPTIONLONG(String value) {
        return new JAXBElement<String>(_DESCRIPTIONLONG_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.opentrans.org/XMLSchema/1.0", name = "VAT_ID")
    public JAXBElement<String> createVATID(String value) {
        return new JAXBElement<String>(_VATID_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.opentrans.org/XMLSchema/1.0", name = "INVOICE_DATE")
    public JAXBElement<String> createINVOICEDATE(String value) {
        return new JAXBElement<String>(_INVOICEDATE_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.opentrans.org/XMLSchema/1.0", name = "AGREEMENT_ID")
    public JAXBElement<String> createAGREEMENTID(String value) {
        return new JAXBElement<String>(_AGREEMENTID_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.opentrans.org/XMLSchema/1.0", name = "DELIVERYNOTE_DATE")
    public JAXBElement<String> createDELIVERYNOTEDATE(String value) {
        return new JAXBElement<String>(_DELIVERYNOTEDATE_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.opentrans.org/XMLSchema/1.0", name = "COUNTRY")
    public JAXBElement<String> createCOUNTRY(String value) {
        return new JAXBElement<String>(_COUNTRY_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.opentrans.org/XMLSchema/1.0", name = "GENERATION_DATE")
    public JAXBElement<String> createGENERATIONDATE(String value) {
        return new JAXBElement<String>(_GENERATIONDATE_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.opentrans.org/XMLSchema/1.0", name = "CARD_TYPE")
    public JAXBElement<String> createCARDTYPE(String value) {
        return new JAXBElement<String>(_CARDTYPE_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.opentrans.org/XMLSchema/1.0", name = "ALT_CUSTOMER_ORDER_ID")
    public JAXBElement<String> createALTCUSTOMERORDERID(String value) {
        return new JAXBElement<String>(_ALTCUSTOMERORDERID_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.opentrans.org/XMLSchema/1.0", name = "VALID_END_DATE")
    public JAXBElement<String> createVALIDENDDATE(String value) {
        return new JAXBElement<String>(_VALIDENDDATE_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.opentrans.org/XMLSchema/1.0", name = "NAME3")
    public JAXBElement<String> createNAME3(String value) {
        return new JAXBElement<String>(_NAME3_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.opentrans.org/XMLSchema/1.0", name = "CATALOG_NAME")
    public JAXBElement<String> createCATALOGNAME(String value) {
        return new JAXBElement<String>(_CATALOGNAME_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.opentrans.org/XMLSchema/1.0", name = "BANK_CODE")
    public JAXBElement<String> createBANKCODE(String value) {
        return new JAXBElement<String>(_BANKCODE_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.opentrans.org/XMLSchema/1.0", name = "INCOTERM")
    public JAXBElement<String> createINCOTERM(String value) {
        return new JAXBElement<String>(_INCOTERM_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.opentrans.org/XMLSchema/1.0", name = "ORDER_UNIT")
    public JAXBElement<String> createORDERUNIT(String value) {
        return new JAXBElement<String>(_ORDERUNIT_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.opentrans.org/XMLSchema/1.0", name = "TOTAL_ITEM_NUM")
    public JAXBElement<BigInteger> createTOTALITEMNUM(BigInteger value) {
        return new JAXBElement<BigInteger>(_TOTALITEMNUM_QNAME, BigInteger.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.opentrans.org/XMLSchema/1.0", name = "ZIPBOX")
    public JAXBElement<String> createZIPBOX(String value) {
        return new JAXBElement<String>(_ZIPBOX_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.opentrans.org/XMLSchema/1.0", name = "NAME2")
    public JAXBElement<String> createNAME2(String value) {
        return new JAXBElement<String>(_NAME2_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.opentrans.org/XMLSchema/1.0", name = "LOCATION")
    public JAXBElement<String> createLOCATION(String value) {
        return new JAXBElement<String>(_LOCATION_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.opentrans.org/XMLSchema/1.0", name = "MIME_ALT")
    public JAXBElement<String> createMIMEALT(String value) {
        return new JAXBElement<String>(_MIMEALT_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.opentrans.org/XMLSchema/1.0", name = "AGREEMENT_START_DATE")
    public JAXBElement<String> createAGREEMENTSTARTDATE(String value) {
        return new JAXBElement<String>(_AGREEMENTSTARTDATE_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.opentrans.org/XMLSchema/1.0", name = "RFQ_DATE")
    public JAXBElement<String> createRFQDATE(String value) {
        return new JAXBElement<String>(_RFQDATE_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.opentrans.org/XMLSchema/1.0", name = "DEPARTMENT")
    public JAXBElement<String> createDEPARTMENT(String value) {
        return new JAXBElement<String>(_DEPARTMENT_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.opentrans.org/XMLSchema/1.0", name = "MIME_DESCR")
    public JAXBElement<String> createMIMEDESCR(String value) {
        return new JAXBElement<String>(_MIMEDESCR_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.opentrans.org/XMLSchema/1.0", name = "URL")
    public JAXBElement<String> createURL(String value) {
        return new JAXBElement<String>(_URL_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.opentrans.org/XMLSchema/1.0", name = "EMAIL")
    public JAXBElement<String> createEMAIL(String value) {
        return new JAXBElement<String>(_EMAIL_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.opentrans.org/XMLSchema/1.0", name = "ORDERCHANGE_DATE")
    public JAXBElement<String> createORDERCHANGEDATE(String value) {
        return new JAXBElement<String>(_ORDERCHANGEDATE_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.opentrans.org/XMLSchema/1.0", name = "CARD_AUTH_CODE")
    public JAXBElement<String> createCARDAUTHCODE(String value) {
        return new JAXBElement<String>(_CARDAUTHCODE_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.opentrans.org/XMLSchema/1.0", name = "MIME_ORDER")
    public JAXBElement<BigInteger> createMIMEORDER(BigInteger value) {
        return new JAXBElement<BigInteger>(_MIMEORDER_QNAME, BigInteger.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.opentrans.org/XMLSchema/1.0", name = "CARD_TYPE_OTHER")
    public JAXBElement<String> createCARDTYPEOTHER(String value) {
        return new JAXBElement<String>(_CARDTYPEOTHER_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.opentrans.org/XMLSchema/1.0", name = "RECEIPT_DATE")
    public JAXBElement<String> createRECEIPTDATE(String value) {
        return new JAXBElement<String>(_RECEIPTDATE_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.opentrans.org/XMLSchema/1.0", name = "QUOTATION_DATE")
    public JAXBElement<String> createQUOTATIONDATE(String value) {
        return new JAXBElement<String>(_QUOTATIONDATE_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DtCURRENCIES }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.opentrans.org/XMLSchema/1.0", name = "PRICE_CURRENCY")
    public JAXBElement<DtCURRENCIES> createPRICECURRENCY(DtCURRENCIES value) {
        return new JAXBElement<DtCURRENCIES>(_PRICECURRENCY_QNAME, DtCURRENCIES.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.opentrans.org/XMLSchema/1.0", name = "NAME")
    public JAXBElement<String> createNAME(String value) {
        return new JAXBElement<String>(_NAME_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.opentrans.org/XMLSchema/1.0", name = "TAX")
    public JAXBElement<BigDecimal> createTAX(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_TAX_QNAME, BigDecimal.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.opentrans.org/XMLSchema/1.0", name = "INVOICE_ID")
    public JAXBElement<String> createINVOICEID(String value) {
        return new JAXBElement<String>(_INVOICEID_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.opentrans.org/XMLSchema/1.0", name = "PRICE_AMOUNT")
    public JAXBElement<BigDecimal> createPRICEAMOUNT(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_PRICEAMOUNT_QNAME, BigDecimal.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.opentrans.org/XMLSchema/1.0", name = "CARD_NUM")
    public JAXBElement<String> createCARDNUM(String value) {
        return new JAXBElement<String>(_CARDNUM_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.opentrans.org/XMLSchema/1.0", name = "STOP_AUTOMATIC_PROCESSING")
    public JAXBElement<String> createSTOPAUTOMATICPROCESSING(String value) {
        return new JAXBElement<String>(_STOPAUTOMATICPROCESSING_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.opentrans.org/XMLSchema/1.0", name = "QUOTATION_ID")
    public JAXBElement<String> createQUOTATIONID(String value) {
        return new JAXBElement<String>(_QUOTATIONID_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.opentrans.org/XMLSchema/1.0", name = "VALID_START_DATE")
    public JAXBElement<String> createVALIDSTARTDATE(String value) {
        return new JAXBElement<String>(_VALIDSTARTDATE_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.opentrans.org/XMLSchema/1.0", name = "MIME_TYPE")
    public JAXBElement<String> createMIMETYPE(String value) {
        return new JAXBElement<String>(_MIMETYPE_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.opentrans.org/XMLSchema/1.0", name = "ORDER_ID")
    public JAXBElement<String> createORDERID(String value) {
        return new JAXBElement<String>(_ORDERID_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.opentrans.org/XMLSchema/1.0", name = "DELIVERYNOTE_ID")
    public JAXBElement<String> createDELIVERYNOTEID(String value) {
        return new JAXBElement<String>(_DELIVERYNOTEID_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.opentrans.org/XMLSchema/1.0", name = "BOXNO")
    public JAXBElement<String> createBOXNO(String value) {
        return new JAXBElement<String>(_BOXNO_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.opentrans.org/XMLSchema/1.0", name = "MIME_ROOT")
    public JAXBElement<String> createMIMEROOT(String value) {
        return new JAXBElement<String>(_MIMEROOT_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.opentrans.org/XMLSchema/1.0", name = "COST_TYPE")
    public JAXBElement<String> createCOSTTYPE(String value) {
        return new JAXBElement<String>(_COSTTYPE_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.opentrans.org/XMLSchema/1.0", name = "TOTAL_TAX_AMOUNT")
    public JAXBElement<BigDecimal> createTOTALTAXAMOUNT(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_TOTALTAXAMOUNT_QNAME, BigDecimal.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.opentrans.org/XMLSchema/1.0", name = "FAX")
    public JAXBElement<String> createFAX(String value) {
        return new JAXBElement<String>(_FAX_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.opentrans.org/XMLSchema/1.0", name = "QUANTITY")
    public JAXBElement<BigDecimal> createQUANTITY(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_QUANTITY_QNAME, BigDecimal.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.opentrans.org/XMLSchema/1.0", name = "GENERATOR_INFO")
    public JAXBElement<String> createGENERATORINFO(String value) {
        return new JAXBElement<String>(_GENERATORINFO_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.opentrans.org/XMLSchema/1.0", name = "PACKAGE_ID")
    public JAXBElement<String> createPACKAGEID(String value) {
        return new JAXBElement<String>(_PACKAGEID_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.opentrans.org/XMLSchema/1.0", name = "TRANSPORT_REMARK")
    public JAXBElement<String> createTRANSPORTREMARK(String value) {
        return new JAXBElement<String>(_TRANSPORTREMARK_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.opentrans.org/XMLSchema/1.0", name = "MIME_SOURCE")
    public JAXBElement<String> createMIMESOURCE(String value) {
        return new JAXBElement<String>(_MIMESOURCE_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.opentrans.org/XMLSchema/1.0", name = "ZIP")
    public JAXBElement<String> createZIP(String value) {
        return new JAXBElement<String>(_ZIP_QNAME, String.class, null, value);
    }

}


package de.htwg_konstanz.ebus.wholesaler.ws.order;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * CHANGED
 * 
 * <p>Java class for INVOICE_INFO element declaration.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;element name="INVOICE_INFO">
 *   &lt;complexType>
 *     &lt;complexContent>
 *       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *         &lt;sequence>
 *           &lt;element ref="{http://www.opentrans.org/XMLSchema/1.0}INVOICE_ID"/>
 *           &lt;element ref="{http://www.opentrans.org/XMLSchema/1.0}INVOICE_DATE"/>
 *           &lt;element ref="{http://www.opentrans.org/XMLSchema/1.0}BUYER_PARTY"/>
 *           &lt;element ref="{http://www.opentrans.org/XMLSchema/1.0}SUPPLIER_PARTY"/>
 *           &lt;element ref="{http://www.opentrans.org/XMLSchema/1.0}PRICE_CURRENCY"/>
 *           &lt;element ref="{http://www.opentrans.org/XMLSchema/1.0}PAYMENT" minOccurs="0"/>
 *           &lt;element ref="{http://www.opentrans.org/XMLSchema/1.0}REMARK" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;/sequence>
 *       &lt;/restriction>
 *     &lt;/complexContent>
 *   &lt;/complexType>
 * &lt;/element>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "invoiceid",
    "invoicedate",
    "buyerparty",
    "supplierparty",
    "pricecurrency",
    "payment",
    "remark"
})
@XmlRootElement(name = "INVOICE_INFO")
public class INVOICEINFO {

    @XmlElement(name = "INVOICE_ID", namespace = "http://www.opentrans.org/XMLSchema/1.0", required = true)
    protected String invoiceid;
    @XmlElement(name = "INVOICE_DATE", namespace = "http://www.opentrans.org/XMLSchema/1.0", required = true)
    protected String invoicedate;
    @XmlElement(name = "BUYER_PARTY", namespace = "http://www.opentrans.org/XMLSchema/1.0", required = true)
    protected BUYERPARTY buyerparty;
    @XmlElement(name = "SUPPLIER_PARTY", namespace = "http://www.opentrans.org/XMLSchema/1.0", required = true)
    protected SUPPLIERPARTY supplierparty;
    @XmlElement(name = "PRICE_CURRENCY", namespace = "http://www.opentrans.org/XMLSchema/1.0", required = true)
    protected DtCURRENCIES pricecurrency;
    @XmlElement(name = "PAYMENT", namespace = "http://www.opentrans.org/XMLSchema/1.0")
    protected PAYMENT payment;
    @XmlElement(name = "REMARK", namespace = "http://www.opentrans.org/XMLSchema/1.0", required = true)
    protected List<REMARK> remark;

    /**
     * Gets the value of the invoiceid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getINVOICEID() {
        return invoiceid;
    }

    /**
     * Sets the value of the invoiceid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setINVOICEID(String value) {
        this.invoiceid = value;
    }

    /**
     * Gets the value of the invoicedate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getINVOICEDATE() {
        return invoicedate;
    }

    /**
     * Sets the value of the invoicedate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setINVOICEDATE(String value) {
        this.invoicedate = value;
    }

    /**
     * Gets the value of the buyerparty property.
     * 
     * @return
     *     possible object is
     *     {@link BUYERPARTY }
     *     
     */
    public BUYERPARTY getBUYERPARTY() {
        return buyerparty;
    }

    /**
     * Sets the value of the buyerparty property.
     * 
     * @param value
     *     allowed object is
     *     {@link BUYERPARTY }
     *     
     */
    public void setBUYERPARTY(BUYERPARTY value) {
        this.buyerparty = value;
    }

    /**
     * Gets the value of the supplierparty property.
     * 
     * @return
     *     possible object is
     *     {@link SUPPLIERPARTY }
     *     
     */
    public SUPPLIERPARTY getSUPPLIERPARTY() {
        return supplierparty;
    }

    /**
     * Sets the value of the supplierparty property.
     * 
     * @param value
     *     allowed object is
     *     {@link SUPPLIERPARTY }
     *     
     */
    public void setSUPPLIERPARTY(SUPPLIERPARTY value) {
        this.supplierparty = value;
    }

    /**
     * Gets the value of the pricecurrency property.
     * 
     * @return
     *     possible object is
     *     {@link DtCURRENCIES }
     *     
     */
    public DtCURRENCIES getPRICECURRENCY() {
        return pricecurrency;
    }

    /**
     * Sets the value of the pricecurrency property.
     * 
     * @param value
     *     allowed object is
     *     {@link DtCURRENCIES }
     *     
     */
    public void setPRICECURRENCY(DtCURRENCIES value) {
        this.pricecurrency = value;
    }

    /**
     * Gets the value of the payment property.
     * 
     * @return
     *     possible object is
     *     {@link PAYMENT }
     *     
     */
    public PAYMENT getPAYMENT() {
        return payment;
    }

    /**
     * Sets the value of the payment property.
     * 
     * @param value
     *     allowed object is
     *     {@link PAYMENT }
     *     
     */
    public void setPAYMENT(PAYMENT value) {
        this.payment = value;
    }

    /**
     * Gets the value of the remark property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the remark property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getREMARK().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link REMARK }
     * 
     * 
     */
    public List<REMARK> getREMARK() {
        if (remark == null) {
            remark = new ArrayList<REMARK>();
        }
        return this.remark;
    }

}

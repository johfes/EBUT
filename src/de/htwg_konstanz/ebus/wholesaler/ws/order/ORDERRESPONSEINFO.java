
package de.htwg_konstanz.ebus.wholesaler.ws.order;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ORDERRESPONSE_INFO element declaration.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;element name="ORDERRESPONSE_INFO">
 *   &lt;complexType>
 *     &lt;complexContent>
 *       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *         &lt;sequence>
 *           &lt;element ref="{http://www.opentrans.org/XMLSchema/1.0}ORDER_ID"/>
 *           &lt;element ref="{http://www.opentrans.org/XMLSchema/1.0}SUPPLIER_ORDER_ID" minOccurs="0"/>
 *           &lt;element ref="{http://www.opentrans.org/XMLSchema/1.0}ORDER_DATE" minOccurs="0"/>
 *           &lt;element ref="{http://www.opentrans.org/XMLSchema/1.0}ORDERRESPONSE_DATE"/>
 *           &lt;element ref="{http://www.opentrans.org/XMLSchema/1.0}ORDER_PARTIES"/>
 *           &lt;element ref="{http://www.opentrans.org/XMLSchema/1.0}PRICE_CURRENCY" minOccurs="0"/>
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
    "orderid",
    "supplierorderid",
    "orderdate",
    "orderresponsedate",
    "orderparties",
    "pricecurrency",
    "remark"
})
@XmlRootElement(name = "ORDERRESPONSE_INFO")
public class ORDERRESPONSEINFO {

    @XmlElement(name = "ORDER_ID", namespace = "http://www.opentrans.org/XMLSchema/1.0", required = true)
    protected String orderid;
    @XmlElement(name = "SUPPLIER_ORDER_ID", namespace = "http://www.opentrans.org/XMLSchema/1.0")
    protected String supplierorderid;
    @XmlElement(name = "ORDER_DATE", namespace = "http://www.opentrans.org/XMLSchema/1.0")
    protected String orderdate;
    @XmlElement(name = "ORDERRESPONSE_DATE", namespace = "http://www.opentrans.org/XMLSchema/1.0", required = true)
    protected String orderresponsedate;
    @XmlElement(name = "ORDER_PARTIES", namespace = "http://www.opentrans.org/XMLSchema/1.0", required = true)
    protected ORDERPARTIES orderparties;
    @XmlElement(name = "PRICE_CURRENCY", namespace = "http://www.opentrans.org/XMLSchema/1.0")
    protected DtCURRENCIES pricecurrency;
    @XmlElement(name = "REMARK", namespace = "http://www.opentrans.org/XMLSchema/1.0", required = true)
    protected List<REMARK> remark;

    /**
     * Gets the value of the orderid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getORDERID() {
        return orderid;
    }

    /**
     * Sets the value of the orderid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setORDERID(String value) {
        this.orderid = value;
    }

    /**
     * Gets the value of the supplierorderid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSUPPLIERORDERID() {
        return supplierorderid;
    }

    /**
     * Sets the value of the supplierorderid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSUPPLIERORDERID(String value) {
        this.supplierorderid = value;
    }

    /**
     * Gets the value of the orderdate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getORDERDATE() {
        return orderdate;
    }

    /**
     * Sets the value of the orderdate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setORDERDATE(String value) {
        this.orderdate = value;
    }

    /**
     * Gets the value of the orderresponsedate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getORDERRESPONSEDATE() {
        return orderresponsedate;
    }

    /**
     * Sets the value of the orderresponsedate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setORDERRESPONSEDATE(String value) {
        this.orderresponsedate = value;
    }

    /**
     * Gets the value of the orderparties property.
     * 
     * @return
     *     possible object is
     *     {@link ORDERPARTIES }
     *     
     */
    public ORDERPARTIES getORDERPARTIES() {
        return orderparties;
    }

    /**
     * Sets the value of the orderparties property.
     * 
     * @param value
     *     allowed object is
     *     {@link ORDERPARTIES }
     *     
     */
    public void setORDERPARTIES(ORDERPARTIES value) {
        this.orderparties = value;
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

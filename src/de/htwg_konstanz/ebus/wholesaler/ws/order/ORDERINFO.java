
package de.htwg_konstanz.ebus.wholesaler.ws.order;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ORDER_INFO element declaration.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;element name="ORDER_INFO">
 *   &lt;complexType>
 *     &lt;complexContent>
 *       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *         &lt;sequence>
 *           &lt;element ref="{http://www.opentrans.org/XMLSchema/1.0}ORDER_ID"/>
 *           &lt;element ref="{http://www.opentrans.org/XMLSchema/1.0}ORDER_DATE"/>
 *           &lt;element ref="{http://www.opentrans.org/XMLSchema/1.0}ORDER_PARTIES"/>
 *           &lt;element ref="{http://www.opentrans.org/XMLSchema/1.0}PRICE_CURRENCY"/>
 *           &lt;element ref="{http://www.opentrans.org/XMLSchema/1.0}PARTIAL_SHIPMENT_ALLOWED"/>
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
    "orderdate",
    "orderparties",
    "pricecurrency",
    "partialshipmentallowed",
    "remark"
})
@XmlRootElement(name = "ORDER_INFO")
public class ORDERINFO {

    @XmlElement(name = "ORDER_ID", namespace = "http://www.opentrans.org/XMLSchema/1.0", required = true)
    protected String orderid;
    @XmlElement(name = "ORDER_DATE", namespace = "http://www.opentrans.org/XMLSchema/1.0", required = true)
    protected String orderdate;
    @XmlElement(name = "ORDER_PARTIES", namespace = "http://www.opentrans.org/XMLSchema/1.0", required = true)
    protected ORDERPARTIES orderparties;
    @XmlElement(name = "PRICE_CURRENCY", namespace = "http://www.opentrans.org/XMLSchema/1.0", required = true)
    protected DtCURRENCIES pricecurrency;
    @XmlElement(name = "PARTIAL_SHIPMENT_ALLOWED", namespace = "http://www.opentrans.org/XMLSchema/1.0", required = true)
    protected String partialshipmentallowed;
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
     * Gets the value of the partialshipmentallowed property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPARTIALSHIPMENTALLOWED() {
        return partialshipmentallowed;
    }

    /**
     * Sets the value of the partialshipmentallowed property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPARTIALSHIPMENTALLOWED(String value) {
        this.partialshipmentallowed = value;
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

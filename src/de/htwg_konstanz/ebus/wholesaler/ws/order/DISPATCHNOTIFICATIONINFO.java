
package de.htwg_konstanz.ebus.wholesaler.ws.order;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * CHANGED: DATE MUST
 * 
 * <p>Java class for DISPATCHNOTIFICATION_INFO element declaration.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;element name="DISPATCHNOTIFICATION_INFO">
 *   &lt;complexType>
 *     &lt;complexContent>
 *       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *         &lt;sequence>
 *           &lt;element ref="{http://www.opentrans.org/XMLSchema/1.0}DISPATCHNOTIFICATION_ID"/>
 *           &lt;element ref="{http://www.opentrans.org/XMLSchema/1.0}DISPATCHNOTIFICATION_DATE"/>
 *           &lt;element ref="{http://www.opentrans.org/XMLSchema/1.0}BUYER_PARTY"/>
 *           &lt;element ref="{http://www.opentrans.org/XMLSchema/1.0}SUPPLIER_PARTY"/>
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
    "dispatchnotificationid",
    "dispatchnotificationdate",
    "buyerparty",
    "supplierparty",
    "remark"
})
@XmlRootElement(name = "DISPATCHNOTIFICATION_INFO")
public class DISPATCHNOTIFICATIONINFO {

    @XmlElement(name = "DISPATCHNOTIFICATION_ID", namespace = "http://www.opentrans.org/XMLSchema/1.0", required = true)
    protected String dispatchnotificationid;
    @XmlElement(name = "DISPATCHNOTIFICATION_DATE", namespace = "http://www.opentrans.org/XMLSchema/1.0", required = true)
    protected String dispatchnotificationdate;
    @XmlElement(name = "BUYER_PARTY", namespace = "http://www.opentrans.org/XMLSchema/1.0", required = true)
    protected BUYERPARTY buyerparty;
    @XmlElement(name = "SUPPLIER_PARTY", namespace = "http://www.opentrans.org/XMLSchema/1.0", required = true)
    protected SUPPLIERPARTY supplierparty;
    @XmlElement(name = "REMARK", namespace = "http://www.opentrans.org/XMLSchema/1.0", required = true)
    protected List<REMARK> remark;

    /**
     * Gets the value of the dispatchnotificationid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDISPATCHNOTIFICATIONID() {
        return dispatchnotificationid;
    }

    /**
     * Sets the value of the dispatchnotificationid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDISPATCHNOTIFICATIONID(String value) {
        this.dispatchnotificationid = value;
    }

    /**
     * Gets the value of the dispatchnotificationdate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDISPATCHNOTIFICATIONDATE() {
        return dispatchnotificationdate;
    }

    /**
     * Sets the value of the dispatchnotificationdate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDISPATCHNOTIFICATIONDATE(String value) {
        this.dispatchnotificationdate = value;
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

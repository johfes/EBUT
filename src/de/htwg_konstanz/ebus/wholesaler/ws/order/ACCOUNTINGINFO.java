
package de.htwg_konstanz.ebus.wholesaler.ws.order;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ACCOUNTING_INFO element declaration.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;element name="ACCOUNTING_INFO">
 *   &lt;complexType>
 *     &lt;complexContent>
 *       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *         &lt;sequence>
 *           &lt;element ref="{http://www.opentrans.org/XMLSchema/1.0}COST_CATEGORY_ID"/>
 *           &lt;element ref="{http://www.opentrans.org/XMLSchema/1.0}COST_TYPE" minOccurs="0"/>
 *           &lt;element ref="{http://www.opentrans.org/XMLSchema/1.0}COST_ACCOUNT" minOccurs="0"/>
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
    "costcategoryid",
    "costtype",
    "costaccount"
})
@XmlRootElement(name = "ACCOUNTING_INFO")
public class ACCOUNTINGINFO {

    @XmlElement(name = "COST_CATEGORY_ID", namespace = "http://www.opentrans.org/XMLSchema/1.0", required = true)
    protected COSTCATEGORYID costcategoryid;
    @XmlElement(name = "COST_TYPE", namespace = "http://www.opentrans.org/XMLSchema/1.0")
    protected String costtype;
    @XmlElement(name = "COST_ACCOUNT", namespace = "http://www.opentrans.org/XMLSchema/1.0")
    protected String costaccount;

    /**
     * Gets the value of the costcategoryid property.
     * 
     * @return
     *     possible object is
     *     {@link COSTCATEGORYID }
     *     
     */
    public COSTCATEGORYID getCOSTCATEGORYID() {
        return costcategoryid;
    }

    /**
     * Sets the value of the costcategoryid property.
     * 
     * @param value
     *     allowed object is
     *     {@link COSTCATEGORYID }
     *     
     */
    public void setCOSTCATEGORYID(COSTCATEGORYID value) {
        this.costcategoryid = value;
    }

    /**
     * Gets the value of the costtype property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCOSTTYPE() {
        return costtype;
    }

    /**
     * Sets the value of the costtype property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCOSTTYPE(String value) {
        this.costtype = value;
    }

    /**
     * Gets the value of the costaccount property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCOSTACCOUNT() {
        return costaccount;
    }

    /**
     * Sets the value of the costaccount property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCOSTACCOUNT(String value) {
        this.costaccount = value;
    }

}

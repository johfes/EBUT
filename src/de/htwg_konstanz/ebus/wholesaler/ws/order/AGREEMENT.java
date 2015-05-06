
package de.htwg_konstanz.ebus.wholesaler.ws.order;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AGREEMENT element declaration.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;element name="AGREEMENT">
 *   &lt;complexType>
 *     &lt;complexContent>
 *       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *         &lt;sequence>
 *           &lt;element ref="{http://www.opentrans.org/XMLSchema/1.0}AGREEMENT_ID"/>
 *           &lt;element ref="{http://www.opentrans.org/XMLSchema/1.0}AGREEMENT_LINE_ID" minOccurs="0"/>
 *           &lt;element ref="{http://www.opentrans.org/XMLSchema/1.0}AGREEMENT_START_DATE" minOccurs="0"/>
 *           &lt;element ref="{http://www.opentrans.org/XMLSchema/1.0}AGREEMENT_END_DATE" minOccurs="0"/>
 *         &lt;/sequence>
 *         &lt;attribute name="type" use="required">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.opentrans.org/XMLSchema/1.0}dtSTRING">
 *               &lt;minLength value="1"/>
 *               &lt;maxLength value="50"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/attribute>
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
    "agreementid",
    "agreementlineid",
    "agreementstartdate",
    "agreementenddate"
})
@XmlRootElement(name = "AGREEMENT")
public class AGREEMENT {

    @XmlElement(name = "AGREEMENT_ID", namespace = "http://www.opentrans.org/XMLSchema/1.0", required = true)
    protected String agreementid;
    @XmlElement(name = "AGREEMENT_LINE_ID", namespace = "http://www.opentrans.org/XMLSchema/1.0")
    protected String agreementlineid;
    @XmlElement(name = "AGREEMENT_START_DATE", namespace = "http://www.opentrans.org/XMLSchema/1.0")
    protected String agreementstartdate;
    @XmlElement(name = "AGREEMENT_END_DATE", namespace = "http://www.opentrans.org/XMLSchema/1.0")
    protected String agreementenddate;
    @XmlAttribute(required = true)
    protected String type;

    /**
     * Gets the value of the agreementid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAGREEMENTID() {
        return agreementid;
    }

    /**
     * Sets the value of the agreementid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAGREEMENTID(String value) {
        this.agreementid = value;
    }

    /**
     * Gets the value of the agreementlineid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAGREEMENTLINEID() {
        return agreementlineid;
    }

    /**
     * Sets the value of the agreementlineid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAGREEMENTLINEID(String value) {
        this.agreementlineid = value;
    }

    /**
     * Gets the value of the agreementstartdate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAGREEMENTSTARTDATE() {
        return agreementstartdate;
    }

    /**
     * Sets the value of the agreementstartdate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAGREEMENTSTARTDATE(String value) {
        this.agreementstartdate = value;
    }

    /**
     * Gets the value of the agreementenddate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAGREEMENTENDDATE() {
        return agreementenddate;
    }

    /**
     * Sets the value of the agreementenddate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAGREEMENTENDDATE(String value) {
        this.agreementenddate = value;
    }

    /**
     * Gets the value of the type property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getType() {
        return type;
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setType(String value) {
        this.type = value;
    }

}

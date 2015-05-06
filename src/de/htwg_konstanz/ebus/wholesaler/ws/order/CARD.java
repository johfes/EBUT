
package de.htwg_konstanz.ebus.wholesaler.ws.order;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CARD element declaration.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;element name="CARD">
 *   &lt;complexType>
 *     &lt;complexContent>
 *       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *         &lt;sequence>
 *           &lt;element ref="{http://www.opentrans.org/XMLSchema/1.0}CARD_NUM"/>
 *           &lt;element ref="{http://www.opentrans.org/XMLSchema/1.0}CARD_AUTH_CODE" minOccurs="0"/>
 *           &lt;element ref="{http://www.opentrans.org/XMLSchema/1.0}CARD_REF_NUM" minOccurs="0"/>
 *           &lt;element ref="{http://www.opentrans.org/XMLSchema/1.0}CARD_EXPIRATION_DATE"/>
 *           &lt;element ref="{http://www.opentrans.org/XMLSchema/1.0}CARD_TYPE"/>
 *           &lt;element ref="{http://www.opentrans.org/XMLSchema/1.0}CARD_TYPE_OTHER" minOccurs="0"/>
 *           &lt;element ref="{http://www.opentrans.org/XMLSchema/1.0}CARD_HOLDER_NAME"/>
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
    "cardnum",
    "cardauthcode",
    "cardrefnum",
    "cardexpirationdate",
    "cardtype",
    "cardtypeother",
    "cardholdername"
})
@XmlRootElement(name = "CARD")
public class CARD {

    @XmlElement(name = "CARD_NUM", namespace = "http://www.opentrans.org/XMLSchema/1.0", required = true)
    protected String cardnum;
    @XmlElement(name = "CARD_AUTH_CODE", namespace = "http://www.opentrans.org/XMLSchema/1.0")
    protected String cardauthcode;
    @XmlElement(name = "CARD_REF_NUM", namespace = "http://www.opentrans.org/XMLSchema/1.0")
    protected String cardrefnum;
    @XmlElement(name = "CARD_EXPIRATION_DATE", namespace = "http://www.opentrans.org/XMLSchema/1.0", required = true)
    protected String cardexpirationdate;
    @XmlElement(name = "CARD_TYPE", namespace = "http://www.opentrans.org/XMLSchema/1.0", required = true)
    protected String cardtype;
    @XmlElement(name = "CARD_TYPE_OTHER", namespace = "http://www.opentrans.org/XMLSchema/1.0")
    protected String cardtypeother;
    @XmlElement(name = "CARD_HOLDER_NAME", namespace = "http://www.opentrans.org/XMLSchema/1.0", required = true)
    protected String cardholdername;

    /**
     * Gets the value of the cardnum property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCARDNUM() {
        return cardnum;
    }

    /**
     * Sets the value of the cardnum property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCARDNUM(String value) {
        this.cardnum = value;
    }

    /**
     * Gets the value of the cardauthcode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCARDAUTHCODE() {
        return cardauthcode;
    }

    /**
     * Sets the value of the cardauthcode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCARDAUTHCODE(String value) {
        this.cardauthcode = value;
    }

    /**
     * Gets the value of the cardrefnum property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCARDREFNUM() {
        return cardrefnum;
    }

    /**
     * Sets the value of the cardrefnum property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCARDREFNUM(String value) {
        this.cardrefnum = value;
    }

    /**
     * Gets the value of the cardexpirationdate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCARDEXPIRATIONDATE() {
        return cardexpirationdate;
    }

    /**
     * Sets the value of the cardexpirationdate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCARDEXPIRATIONDATE(String value) {
        this.cardexpirationdate = value;
    }

    /**
     * Gets the value of the cardtype property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCARDTYPE() {
        return cardtype;
    }

    /**
     * Sets the value of the cardtype property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCARDTYPE(String value) {
        this.cardtype = value;
    }

    /**
     * Gets the value of the cardtypeother property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCARDTYPEOTHER() {
        return cardtypeother;
    }

    /**
     * Sets the value of the cardtypeother property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCARDTYPEOTHER(String value) {
        this.cardtypeother = value;
    }

    /**
     * Gets the value of the cardholdername property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCARDHOLDERNAME() {
        return cardholdername;
    }

    /**
     * Sets the value of the cardholdername property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCARDHOLDERNAME(String value) {
        this.cardholdername = value;
    }

}


package de.htwg_konstanz.ebus.wholesaler.ws.order;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ACCOUNT element declaration.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;element name="ACCOUNT">
 *   &lt;complexType>
 *     &lt;complexContent>
 *       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *         &lt;sequence>
 *           &lt;element ref="{http://www.opentrans.org/XMLSchema/1.0}HOLDER"/>
 *           &lt;element ref="{http://www.opentrans.org/XMLSchema/1.0}BANK_NAME"/>
 *           &lt;element ref="{http://www.opentrans.org/XMLSchema/1.0}BANK_COUNTRY"/>
 *           &lt;element ref="{http://www.opentrans.org/XMLSchema/1.0}BANK_CODE"/>
 *           &lt;element ref="{http://www.opentrans.org/XMLSchema/1.0}BANK_ACCOUNT"/>
 *           &lt;element ref="{http://www.opentrans.org/XMLSchema/1.0}PAYMENT_TERM" minOccurs="0"/>
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
    "holder",
    "bankname",
    "bankcountry",
    "bankcode",
    "bankaccount",
    "paymentterm"
})
@XmlRootElement(name = "ACCOUNT")
public class ACCOUNT {

    @XmlElement(name = "HOLDER", namespace = "http://www.opentrans.org/XMLSchema/1.0", required = true)
    protected String holder;
    @XmlElement(name = "BANK_NAME", namespace = "http://www.opentrans.org/XMLSchema/1.0", required = true)
    protected String bankname;
    @XmlElement(name = "BANK_COUNTRY", namespace = "http://www.opentrans.org/XMLSchema/1.0", required = true)
    protected String bankcountry;
    @XmlElement(name = "BANK_CODE", namespace = "http://www.opentrans.org/XMLSchema/1.0", required = true)
    protected String bankcode;
    @XmlElement(name = "BANK_ACCOUNT", namespace = "http://www.opentrans.org/XMLSchema/1.0", required = true)
    protected String bankaccount;
    @XmlElement(name = "PAYMENT_TERM", namespace = "http://www.opentrans.org/XMLSchema/1.0")
    protected PAYMENTTERM paymentterm;

    /**
     * Gets the value of the holder property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHOLDER() {
        return holder;
    }

    /**
     * Sets the value of the holder property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHOLDER(String value) {
        this.holder = value;
    }

    /**
     * Gets the value of the bankname property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBANKNAME() {
        return bankname;
    }

    /**
     * Sets the value of the bankname property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBANKNAME(String value) {
        this.bankname = value;
    }

    /**
     * Gets the value of the bankcountry property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBANKCOUNTRY() {
        return bankcountry;
    }

    /**
     * Sets the value of the bankcountry property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBANKCOUNTRY(String value) {
        this.bankcountry = value;
    }

    /**
     * Gets the value of the bankcode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBANKCODE() {
        return bankcode;
    }

    /**
     * Sets the value of the bankcode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBANKCODE(String value) {
        this.bankcode = value;
    }

    /**
     * Gets the value of the bankaccount property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBANKACCOUNT() {
        return bankaccount;
    }

    /**
     * Sets the value of the bankaccount property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBANKACCOUNT(String value) {
        this.bankaccount = value;
    }

    /**
     * Gets the value of the paymentterm property.
     * 
     * @return
     *     possible object is
     *     {@link PAYMENTTERM }
     *     
     */
    public PAYMENTTERM getPAYMENTTERM() {
        return paymentterm;
    }

    /**
     * Sets the value of the paymentterm property.
     * 
     * @param value
     *     allowed object is
     *     {@link PAYMENTTERM }
     *     
     */
    public void setPAYMENTTERM(PAYMENTTERM value) {
        this.paymentterm = value;
    }

}

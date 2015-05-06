
package de.htwg_konstanz.ebus.wholesaler.ws.order;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PAYMENT element declaration.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;element name="PAYMENT">
 *   &lt;complexType>
 *     &lt;complexContent>
 *       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *         &lt;choice>
 *           &lt;element ref="{http://www.opentrans.org/XMLSchema/1.0}CARD"/>
 *           &lt;element ref="{http://www.opentrans.org/XMLSchema/1.0}ACCOUNT"/>
 *           &lt;element ref="{http://www.opentrans.org/XMLSchema/1.0}DEBIT"/>
 *           &lt;element ref="{http://www.opentrans.org/XMLSchema/1.0}CHECK"/>
 *           &lt;element ref="{http://www.opentrans.org/XMLSchema/1.0}CASH"/>
 *         &lt;/choice>
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
    "card",
    "account",
    "debit",
    "check",
    "cash"
})
@XmlRootElement(name = "PAYMENT")
public class PAYMENT {

    @XmlElement(name = "CARD", namespace = "http://www.opentrans.org/XMLSchema/1.0")
    protected CARD card;
    @XmlElement(name = "ACCOUNT", namespace = "http://www.opentrans.org/XMLSchema/1.0")
    protected ACCOUNT account;
    @XmlElement(name = "DEBIT", namespace = "http://www.opentrans.org/XMLSchema/1.0")
    protected DEBIT debit;
    @XmlElement(name = "CHECK", namespace = "http://www.opentrans.org/XMLSchema/1.0")
    protected CHECK check;
    @XmlElement(name = "CASH", namespace = "http://www.opentrans.org/XMLSchema/1.0")
    protected CASH cash;

    /**
     * Gets the value of the card property.
     * 
     * @return
     *     possible object is
     *     {@link CARD }
     *     
     */
    public CARD getCARD() {
        return card;
    }

    /**
     * Sets the value of the card property.
     * 
     * @param value
     *     allowed object is
     *     {@link CARD }
     *     
     */
    public void setCARD(CARD value) {
        this.card = value;
    }

    /**
     * Gets the value of the account property.
     * 
     * @return
     *     possible object is
     *     {@link ACCOUNT }
     *     
     */
    public ACCOUNT getACCOUNT() {
        return account;
    }

    /**
     * Sets the value of the account property.
     * 
     * @param value
     *     allowed object is
     *     {@link ACCOUNT }
     *     
     */
    public void setACCOUNT(ACCOUNT value) {
        this.account = value;
    }

    /**
     * Gets the value of the debit property.
     * 
     * @return
     *     possible object is
     *     {@link DEBIT }
     *     
     */
    public DEBIT getDEBIT() {
        return debit;
    }

    /**
     * Sets the value of the debit property.
     * 
     * @param value
     *     allowed object is
     *     {@link DEBIT }
     *     
     */
    public void setDEBIT(DEBIT value) {
        this.debit = value;
    }

    /**
     * Gets the value of the check property.
     * 
     * @return
     *     possible object is
     *     {@link CHECK }
     *     
     */
    public CHECK getCHECK() {
        return check;
    }

    /**
     * Sets the value of the check property.
     * 
     * @param value
     *     allowed object is
     *     {@link CHECK }
     *     
     */
    public void setCHECK(CHECK value) {
        this.check = value;
    }

    /**
     * Gets the value of the cash property.
     * 
     * @return
     *     possible object is
     *     {@link CASH }
     *     
     */
    public CASH getCASH() {
        return cash;
    }

    /**
     * Sets the value of the cash property.
     * 
     * @param value
     *     allowed object is
     *     {@link CASH }
     *     
     */
    public void setCASH(CASH value) {
        this.cash = value;
    }

}

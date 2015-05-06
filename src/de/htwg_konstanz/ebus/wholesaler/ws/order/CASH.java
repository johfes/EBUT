
package de.htwg_konstanz.ebus.wholesaler.ws.order;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CASH element declaration.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;element name="CASH">
 *   &lt;complexType>
 *     &lt;complexContent>
 *       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *         &lt;sequence>
 *           &lt;element ref="{http://www.opentrans.org/XMLSchema/1.0}PAYMENT_TERM"/>
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
    "paymentterm"
})
@XmlRootElement(name = "CASH")
public class CASH {

    @XmlElement(name = "PAYMENT_TERM", namespace = "http://www.opentrans.org/XMLSchema/1.0", required = true)
    protected PAYMENTTERM paymentterm;

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

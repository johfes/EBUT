
package de.htwg_konstanz.ebus.wholesaler.ws.order;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DELIVERY_PARTY element declaration.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;element name="DELIVERY_PARTY">
 *   &lt;complexType>
 *     &lt;complexContent>
 *       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *         &lt;sequence>
 *           &lt;element ref="{http://www.opentrans.org/XMLSchema/1.0}PARTY"/>
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
    "party"
})
@XmlRootElement(name = "DELIVERY_PARTY")
public class DELIVERYPARTY {

    @XmlElement(name = "PARTY", namespace = "http://www.opentrans.org/XMLSchema/1.0", required = true)
    protected PARTY party;

    /**
     * Gets the value of the party property.
     * 
     * @return
     *     possible object is
     *     {@link PARTY }
     *     
     */
    public PARTY getPARTY() {
        return party;
    }

    /**
     * Sets the value of the party property.
     * 
     * @param value
     *     allowed object is
     *     {@link PARTY }
     *     
     */
    public void setPARTY(PARTY value) {
        this.party = value;
    }

}

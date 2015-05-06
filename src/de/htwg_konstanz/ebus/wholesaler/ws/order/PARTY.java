
package de.htwg_konstanz.ebus.wholesaler.ws.order;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PARTY element declaration.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;element name="PARTY">
 *   &lt;complexType>
 *     &lt;complexContent>
 *       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *         &lt;sequence>
 *           &lt;element ref="{http://www.opentrans.org/XMLSchema/1.0}PARTY_ID"/>
 *           &lt;element ref="{http://www.opentrans.org/XMLSchema/1.0}ADDRESS" minOccurs="0"/>
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
    "partyid",
    "address"
})
@XmlRootElement(name = "PARTY")
public class PARTY {

    @XmlElement(name = "PARTY_ID", namespace = "http://www.opentrans.org/XMLSchema/1.0", required = true)
    protected PARTYID partyid;
    @XmlElement(name = "ADDRESS", namespace = "http://www.opentrans.org/XMLSchema/1.0")
    protected ADDRESS address;

    /**
     * Gets the value of the partyid property.
     * 
     * @return
     *     possible object is
     *     {@link PARTYID }
     *     
     */
    public PARTYID getPARTYID() {
        return partyid;
    }

    /**
     * Sets the value of the partyid property.
     * 
     * @param value
     *     allowed object is
     *     {@link PARTYID }
     *     
     */
    public void setPARTYID(PARTYID value) {
        this.partyid = value;
    }

    /**
     * Gets the value of the address property.
     * 
     * @return
     *     possible object is
     *     {@link ADDRESS }
     *     
     */
    public ADDRESS getADDRESS() {
        return address;
    }

    /**
     * Sets the value of the address property.
     * 
     * @param value
     *     allowed object is
     *     {@link ADDRESS }
     *     
     */
    public void setADDRESS(ADDRESS value) {
        this.address = value;
    }

}

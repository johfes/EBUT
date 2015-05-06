
package de.htwg_konstanz.ebus.wholesaler.ws.order;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for MANUFACTURER_INFO element declaration.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;element name="MANUFACTURER_INFO">
 *   &lt;complexType>
 *     &lt;complexContent>
 *       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *         &lt;sequence>
 *           &lt;element ref="{http://www.opentrans.org/XMLSchema/1.0}MANUFACTURER_NAME"/>
 *           &lt;element ref="{http://www.opentrans.org/XMLSchema/1.0}MANUFACTURER_AID"/>
 *           &lt;element ref="{http://www.opentrans.org/XMLSchema/1.0}MANUFACTURER_TYPE_DESCR" minOccurs="0"/>
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
    "manufacturername",
    "manufactureraid",
    "manufacturertypedescr"
})
@XmlRootElement(name = "MANUFACTURER_INFO")
public class MANUFACTURERINFO {

    @XmlElement(name = "MANUFACTURER_NAME", namespace = "http://www.opentrans.org/XMLSchema/1.0", required = true)
    protected String manufacturername;
    @XmlElement(name = "MANUFACTURER_AID", namespace = "http://www.opentrans.org/XMLSchema/1.0", required = true)
    protected String manufactureraid;
    @XmlElement(name = "MANUFACTURER_TYPE_DESCR", namespace = "http://www.opentrans.org/XMLSchema/1.0")
    protected String manufacturertypedescr;

    /**
     * Gets the value of the manufacturername property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMANUFACTURERNAME() {
        return manufacturername;
    }

    /**
     * Sets the value of the manufacturername property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMANUFACTURERNAME(String value) {
        this.manufacturername = value;
    }

    /**
     * Gets the value of the manufactureraid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMANUFACTURERAID() {
        return manufactureraid;
    }

    /**
     * Sets the value of the manufactureraid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMANUFACTURERAID(String value) {
        this.manufactureraid = value;
    }

    /**
     * Gets the value of the manufacturertypedescr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMANUFACTURERTYPEDESCR() {
        return manufacturertypedescr;
    }

    /**
     * Sets the value of the manufacturertypedescr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMANUFACTURERTYPEDESCR(String value) {
        this.manufacturertypedescr = value;
    }

}

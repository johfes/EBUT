
package de.htwg_konstanz.ebus.wholesaler.ws.order;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TRANSPORT element declaration.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;element name="TRANSPORT">
 *   &lt;complexType>
 *     &lt;complexContent>
 *       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *         &lt;sequence>
 *           &lt;element ref="{http://www.opentrans.org/XMLSchema/1.0}INCOTERM"/>
 *           &lt;element ref="{http://www.opentrans.org/XMLSchema/1.0}LOCATION" minOccurs="0"/>
 *           &lt;element ref="{http://www.opentrans.org/XMLSchema/1.0}TRANSPORT_REMARK" minOccurs="0"/>
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
    "incoterm",
    "location",
    "transportremark"
})
@XmlRootElement(name = "TRANSPORT")
public class TRANSPORT {

    @XmlElement(name = "INCOTERM", namespace = "http://www.opentrans.org/XMLSchema/1.0", required = true)
    protected String incoterm;
    @XmlElement(name = "LOCATION", namespace = "http://www.opentrans.org/XMLSchema/1.0")
    protected String location;
    @XmlElement(name = "TRANSPORT_REMARK", namespace = "http://www.opentrans.org/XMLSchema/1.0")
    protected String transportremark;

    /**
     * Gets the value of the incoterm property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getINCOTERM() {
        return incoterm;
    }

    /**
     * Sets the value of the incoterm property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setINCOTERM(String value) {
        this.incoterm = value;
    }

    /**
     * Gets the value of the location property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLOCATION() {
        return location;
    }

    /**
     * Sets the value of the location property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLOCATION(String value) {
        this.location = value;
    }

    /**
     * Gets the value of the transportremark property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTRANSPORTREMARK() {
        return transportremark;
    }

    /**
     * Sets the value of the transportremark property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTRANSPORTREMARK(String value) {
        this.transportremark = value;
    }

}

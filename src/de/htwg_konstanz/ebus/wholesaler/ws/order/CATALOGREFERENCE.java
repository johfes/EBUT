
package de.htwg_konstanz.ebus.wholesaler.ws.order;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CATALOG_REFERENCE element declaration.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;element name="CATALOG_REFERENCE">
 *   &lt;complexType>
 *     &lt;complexContent>
 *       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *         &lt;sequence>
 *           &lt;element ref="{http://www.opentrans.org/XMLSchema/1.0}CATALOG_ID"/>
 *           &lt;element ref="{http://www.opentrans.org/XMLSchema/1.0}CATALOG_VERSION"/>
 *           &lt;element ref="{http://www.opentrans.org/XMLSchema/1.0}CATALOG_NAME" minOccurs="0"/>
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
    "catalogid",
    "catalogversion",
    "catalogname"
})
@XmlRootElement(name = "CATALOG_REFERENCE")
public class CATALOGREFERENCE {

    @XmlElement(name = "CATALOG_ID", namespace = "http://www.opentrans.org/XMLSchema/1.0", required = true)
    protected String catalogid;
    @XmlElement(name = "CATALOG_VERSION", namespace = "http://www.opentrans.org/XMLSchema/1.0", required = true)
    protected String catalogversion;
    @XmlElement(name = "CATALOG_NAME", namespace = "http://www.opentrans.org/XMLSchema/1.0")
    protected String catalogname;

    /**
     * Gets the value of the catalogid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCATALOGID() {
        return catalogid;
    }

    /**
     * Sets the value of the catalogid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCATALOGID(String value) {
        this.catalogid = value;
    }

    /**
     * Gets the value of the catalogversion property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCATALOGVERSION() {
        return catalogversion;
    }

    /**
     * Sets the value of the catalogversion property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCATALOGVERSION(String value) {
        this.catalogversion = value;
    }

    /**
     * Gets the value of the catalogname property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCATALOGNAME() {
        return catalogname;
    }

    /**
     * Sets the value of the catalogname property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCATALOGNAME(String value) {
        this.catalogname = value;
    }

}

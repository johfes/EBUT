
package de.htwg_konstanz.ebus.wholesaler.ws.order;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for MIME element declaration.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;element name="MIME">
 *   &lt;complexType>
 *     &lt;complexContent>
 *       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *         &lt;sequence>
 *           &lt;element ref="{http://www.opentrans.org/XMLSchema/1.0}MIME_TYPE" minOccurs="0"/>
 *           &lt;element ref="{http://www.opentrans.org/XMLSchema/1.0}MIME_SOURCE"/>
 *           &lt;element ref="{http://www.opentrans.org/XMLSchema/1.0}MIME_DESCR" minOccurs="0"/>
 *           &lt;element ref="{http://www.opentrans.org/XMLSchema/1.0}MIME_ALT" minOccurs="0"/>
 *           &lt;element ref="{http://www.opentrans.org/XMLSchema/1.0}MIME_PURPOSE" minOccurs="0"/>
 *           &lt;element ref="{http://www.opentrans.org/XMLSchema/1.0}MIME_ORDER" minOccurs="0"/>
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
    "mimetype",
    "mimesource",
    "mimedescr",
    "mimealt",
    "mimepurpose",
    "mimeorder"
})
@XmlRootElement(name = "MIME")
public class MIME {

    @XmlElement(name = "MIME_TYPE", namespace = "http://www.opentrans.org/XMLSchema/1.0")
    protected String mimetype;
    @XmlElement(name = "MIME_SOURCE", namespace = "http://www.opentrans.org/XMLSchema/1.0", required = true)
    protected String mimesource;
    @XmlElement(name = "MIME_DESCR", namespace = "http://www.opentrans.org/XMLSchema/1.0")
    protected String mimedescr;
    @XmlElement(name = "MIME_ALT", namespace = "http://www.opentrans.org/XMLSchema/1.0")
    protected String mimealt;
    @XmlElement(name = "MIME_PURPOSE", namespace = "http://www.opentrans.org/XMLSchema/1.0")
    protected String mimepurpose;
    @XmlElement(name = "MIME_ORDER", namespace = "http://www.opentrans.org/XMLSchema/1.0")
    protected BigInteger mimeorder;

    /**
     * Gets the value of the mimetype property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMIMETYPE() {
        return mimetype;
    }

    /**
     * Sets the value of the mimetype property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMIMETYPE(String value) {
        this.mimetype = value;
    }

    /**
     * Gets the value of the mimesource property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMIMESOURCE() {
        return mimesource;
    }

    /**
     * Sets the value of the mimesource property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMIMESOURCE(String value) {
        this.mimesource = value;
    }

    /**
     * Gets the value of the mimedescr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMIMEDESCR() {
        return mimedescr;
    }

    /**
     * Sets the value of the mimedescr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMIMEDESCR(String value) {
        this.mimedescr = value;
    }

    /**
     * Gets the value of the mimealt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMIMEALT() {
        return mimealt;
    }

    /**
     * Sets the value of the mimealt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMIMEALT(String value) {
        this.mimealt = value;
    }

    /**
     * Gets the value of the mimepurpose property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMIMEPURPOSE() {
        return mimepurpose;
    }

    /**
     * Sets the value of the mimepurpose property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMIMEPURPOSE(String value) {
        this.mimepurpose = value;
    }

    /**
     * Gets the value of the mimeorder property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getMIMEORDER() {
        return mimeorder;
    }

    /**
     * Sets the value of the mimeorder property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setMIMEORDER(BigInteger value) {
        this.mimeorder = value;
    }

}


package de.htwg_konstanz.ebus.wholesaler.ws.order;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ORDERRESPONSE element declaration.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;element name="ORDERRESPONSE">
 *   &lt;complexType>
 *     &lt;complexContent>
 *       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *         &lt;sequence>
 *           &lt;element ref="{http://www.opentrans.org/XMLSchema/1.0}ORDERRESPONSE_HEADER"/>
 *           &lt;element ref="{http://www.opentrans.org/XMLSchema/1.0}ORDERRESPONSE_ITEM_LIST"/>
 *           &lt;element ref="{http://www.opentrans.org/XMLSchema/1.0}ORDERRESPONSE_SUMMARY"/>
 *         &lt;/sequence>
 *         &lt;attribute name="version" type="{http://www.opentrans.org/XMLSchema/1.0}dtSTRING" fixed="1.0" />
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
    "orderresponseheader",
    "orderresponseitemlist",
    "orderresponsesummary"
})
@XmlRootElement(name = "ORDERRESPONSE")
public class ORDERRESPONSE {

    @XmlElement(name = "ORDERRESPONSE_HEADER", namespace = "http://www.opentrans.org/XMLSchema/1.0", required = true)
    protected ORDERRESPONSEHEADER orderresponseheader;
    @XmlElement(name = "ORDERRESPONSE_ITEM_LIST", namespace = "http://www.opentrans.org/XMLSchema/1.0", required = true)
    protected ORDERRESPONSEITEMLIST orderresponseitemlist;
    @XmlElement(name = "ORDERRESPONSE_SUMMARY", namespace = "http://www.opentrans.org/XMLSchema/1.0", required = true)
    protected ORDERRESPONSESUMMARY orderresponsesummary;
    @XmlAttribute
    protected String version;

    /**
     * Gets the value of the orderresponseheader property.
     * 
     * @return
     *     possible object is
     *     {@link ORDERRESPONSEHEADER }
     *     
     */
    public ORDERRESPONSEHEADER getORDERRESPONSEHEADER() {
        return orderresponseheader;
    }

    /**
     * Sets the value of the orderresponseheader property.
     * 
     * @param value
     *     allowed object is
     *     {@link ORDERRESPONSEHEADER }
     *     
     */
    public void setORDERRESPONSEHEADER(ORDERRESPONSEHEADER value) {
        this.orderresponseheader = value;
    }

    /**
     * Gets the value of the orderresponseitemlist property.
     * 
     * @return
     *     possible object is
     *     {@link ORDERRESPONSEITEMLIST }
     *     
     */
    public ORDERRESPONSEITEMLIST getORDERRESPONSEITEMLIST() {
        return orderresponseitemlist;
    }

    /**
     * Sets the value of the orderresponseitemlist property.
     * 
     * @param value
     *     allowed object is
     *     {@link ORDERRESPONSEITEMLIST }
     *     
     */
    public void setORDERRESPONSEITEMLIST(ORDERRESPONSEITEMLIST value) {
        this.orderresponseitemlist = value;
    }

    /**
     * Gets the value of the orderresponsesummary property.
     * 
     * @return
     *     possible object is
     *     {@link ORDERRESPONSESUMMARY }
     *     
     */
    public ORDERRESPONSESUMMARY getORDERRESPONSESUMMARY() {
        return orderresponsesummary;
    }

    /**
     * Sets the value of the orderresponsesummary property.
     * 
     * @param value
     *     allowed object is
     *     {@link ORDERRESPONSESUMMARY }
     *     
     */
    public void setORDERRESPONSESUMMARY(ORDERRESPONSESUMMARY value) {
        this.orderresponsesummary = value;
    }

    /**
     * Gets the value of the version property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVersion() {
        if (version == null) {
            return "1.0";
        } else {
            return version;
        }
    }

    /**
     * Sets the value of the version property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVersion(String value) {
        this.version = value;
    }

}

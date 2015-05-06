
package de.htwg_konstanz.ebus.wholesaler.ws.order;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DISPATCHNOTIFICATION element declaration.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;element name="DISPATCHNOTIFICATION">
 *   &lt;complexType>
 *     &lt;complexContent>
 *       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *         &lt;sequence>
 *           &lt;element ref="{http://www.opentrans.org/XMLSchema/1.0}DISPATCHNOTIFICATION_HEADER"/>
 *           &lt;element ref="{http://www.opentrans.org/XMLSchema/1.0}DISPATCHNOTIFICATION_ITEM_LIST"/>
 *           &lt;element ref="{http://www.opentrans.org/XMLSchema/1.0}DISPATCHNOTIFICATION_SUMMARY"/>
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
    "dispatchnotificationheader",
    "dispatchnotificationitemlist",
    "dispatchnotificationsummary"
})
@XmlRootElement(name = "DISPATCHNOTIFICATION")
public class DISPATCHNOTIFICATION {

    @XmlElement(name = "DISPATCHNOTIFICATION_HEADER", namespace = "http://www.opentrans.org/XMLSchema/1.0", required = true)
    protected DISPATCHNOTIFICATIONHEADER dispatchnotificationheader;
    @XmlElement(name = "DISPATCHNOTIFICATION_ITEM_LIST", namespace = "http://www.opentrans.org/XMLSchema/1.0", required = true)
    protected DISPATCHNOTIFICATIONITEMLIST dispatchnotificationitemlist;
    @XmlElement(name = "DISPATCHNOTIFICATION_SUMMARY", namespace = "http://www.opentrans.org/XMLSchema/1.0", required = true)
    protected DISPATCHNOTIFICATIONSUMMARY dispatchnotificationsummary;
    @XmlAttribute
    protected String version;

    /**
     * Gets the value of the dispatchnotificationheader property.
     * 
     * @return
     *     possible object is
     *     {@link DISPATCHNOTIFICATIONHEADER }
     *     
     */
    public DISPATCHNOTIFICATIONHEADER getDISPATCHNOTIFICATIONHEADER() {
        return dispatchnotificationheader;
    }

    /**
     * Sets the value of the dispatchnotificationheader property.
     * 
     * @param value
     *     allowed object is
     *     {@link DISPATCHNOTIFICATIONHEADER }
     *     
     */
    public void setDISPATCHNOTIFICATIONHEADER(DISPATCHNOTIFICATIONHEADER value) {
        this.dispatchnotificationheader = value;
    }

    /**
     * ADD CONSTRAINT: NUR EINE ORDER_ID
     * 
     * @return
     *     possible object is
     *     {@link DISPATCHNOTIFICATIONITEMLIST }
     *     
     */
    public DISPATCHNOTIFICATIONITEMLIST getDISPATCHNOTIFICATIONITEMLIST() {
        return dispatchnotificationitemlist;
    }

    /**
     * ADD CONSTRAINT: NUR EINE ORDER_ID
     * 
     * @param value
     *     allowed object is
     *     {@link DISPATCHNOTIFICATIONITEMLIST }
     *     
     */
    public void setDISPATCHNOTIFICATIONITEMLIST(DISPATCHNOTIFICATIONITEMLIST value) {
        this.dispatchnotificationitemlist = value;
    }

    /**
     * Gets the value of the dispatchnotificationsummary property.
     * 
     * @return
     *     possible object is
     *     {@link DISPATCHNOTIFICATIONSUMMARY }
     *     
     */
    public DISPATCHNOTIFICATIONSUMMARY getDISPATCHNOTIFICATIONSUMMARY() {
        return dispatchnotificationsummary;
    }

    /**
     * Sets the value of the dispatchnotificationsummary property.
     * 
     * @param value
     *     allowed object is
     *     {@link DISPATCHNOTIFICATIONSUMMARY }
     *     
     */
    public void setDISPATCHNOTIFICATIONSUMMARY(DISPATCHNOTIFICATIONSUMMARY value) {
        this.dispatchnotificationsummary = value;
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

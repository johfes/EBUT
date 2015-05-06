
package de.htwg_konstanz.ebus.wholesaler.ws.order;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DISPATCHNOTIFICATION_HEADER element declaration.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;element name="DISPATCHNOTIFICATION_HEADER">
 *   &lt;complexType>
 *     &lt;complexContent>
 *       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *         &lt;sequence>
 *           &lt;element ref="{http://www.opentrans.org/XMLSchema/1.0}CONTROL_INFO" minOccurs="0"/>
 *           &lt;element ref="{http://www.opentrans.org/XMLSchema/1.0}DISPATCHNOTIFICATION_INFO"/>
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
    "controlinfo",
    "dispatchnotificationinfo"
})
@XmlRootElement(name = "DISPATCHNOTIFICATION_HEADER")
public class DISPATCHNOTIFICATIONHEADER {

    @XmlElement(name = "CONTROL_INFO", namespace = "http://www.opentrans.org/XMLSchema/1.0")
    protected CONTROLINFO controlinfo;
    @XmlElement(name = "DISPATCHNOTIFICATION_INFO", namespace = "http://www.opentrans.org/XMLSchema/1.0", required = true)
    protected DISPATCHNOTIFICATIONINFO dispatchnotificationinfo;

    /**
     * Gets the value of the controlinfo property.
     * 
     * @return
     *     possible object is
     *     {@link CONTROLINFO }
     *     
     */
    public CONTROLINFO getCONTROLINFO() {
        return controlinfo;
    }

    /**
     * Sets the value of the controlinfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link CONTROLINFO }
     *     
     */
    public void setCONTROLINFO(CONTROLINFO value) {
        this.controlinfo = value;
    }

    /**
     * Gets the value of the dispatchnotificationinfo property.
     * 
     * @return
     *     possible object is
     *     {@link DISPATCHNOTIFICATIONINFO }
     *     
     */
    public DISPATCHNOTIFICATIONINFO getDISPATCHNOTIFICATIONINFO() {
        return dispatchnotificationinfo;
    }

    /**
     * Sets the value of the dispatchnotificationinfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link DISPATCHNOTIFICATIONINFO }
     *     
     */
    public void setDISPATCHNOTIFICATIONINFO(DISPATCHNOTIFICATIONINFO value) {
        this.dispatchnotificationinfo = value;
    }

}

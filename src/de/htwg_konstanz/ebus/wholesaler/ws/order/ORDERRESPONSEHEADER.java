
package de.htwg_konstanz.ebus.wholesaler.ws.order;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ORDERRESPONSE_HEADER element declaration.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;element name="ORDERRESPONSE_HEADER">
 *   &lt;complexType>
 *     &lt;complexContent>
 *       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *         &lt;sequence>
 *           &lt;element ref="{http://www.opentrans.org/XMLSchema/1.0}CONTROL_INFO" minOccurs="0"/>
 *           &lt;element ref="{http://www.opentrans.org/XMLSchema/1.0}ORDERRESPONSE_INFO"/>
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
    "orderresponseinfo"
})
@XmlRootElement(name = "ORDERRESPONSE_HEADER")
public class ORDERRESPONSEHEADER {

    @XmlElement(name = "CONTROL_INFO", namespace = "http://www.opentrans.org/XMLSchema/1.0")
    protected CONTROLINFO controlinfo;
    @XmlElement(name = "ORDERRESPONSE_INFO", namespace = "http://www.opentrans.org/XMLSchema/1.0", required = true)
    protected ORDERRESPONSEINFO orderresponseinfo;

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
     * Gets the value of the orderresponseinfo property.
     * 
     * @return
     *     possible object is
     *     {@link ORDERRESPONSEINFO }
     *     
     */
    public ORDERRESPONSEINFO getORDERRESPONSEINFO() {
        return orderresponseinfo;
    }

    /**
     * Sets the value of the orderresponseinfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link ORDERRESPONSEINFO }
     *     
     */
    public void setORDERRESPONSEINFO(ORDERRESPONSEINFO value) {
        this.orderresponseinfo = value;
    }

}

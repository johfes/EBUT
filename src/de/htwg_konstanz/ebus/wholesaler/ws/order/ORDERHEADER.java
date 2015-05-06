
package de.htwg_konstanz.ebus.wholesaler.ws.order;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ORDER_HEADER element declaration.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;element name="ORDER_HEADER">
 *   &lt;complexType>
 *     &lt;complexContent>
 *       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *         &lt;sequence>
 *           &lt;element ref="{http://www.opentrans.org/XMLSchema/1.0}CONTROL_INFO" minOccurs="0"/>
 *           &lt;element ref="{http://www.opentrans.org/XMLSchema/1.0}ORDER_INFO"/>
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
    "orderinfo"
})
@XmlRootElement(name = "ORDER_HEADER")
public class ORDERHEADER {

    @XmlElement(name = "CONTROL_INFO", namespace = "http://www.opentrans.org/XMLSchema/1.0")
    protected CONTROLINFO controlinfo;
    @XmlElement(name = "ORDER_INFO", namespace = "http://www.opentrans.org/XMLSchema/1.0", required = true)
    protected ORDERINFO orderinfo;

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
     * CHANGED: PARTIAL_SHIPMENT_ALLOWED.minOccurs="1" / PARTIAL_SHIPMENT_ALLOWED.WERT=FALSE; CHANGED: PRICE_CURRENCY.minOccurs="1"
     * 
     * @return
     *     possible object is
     *     {@link ORDERINFO }
     *     
     */
    public ORDERINFO getORDERINFO() {
        return orderinfo;
    }

    /**
     * CHANGED: PARTIAL_SHIPMENT_ALLOWED.minOccurs="1" / PARTIAL_SHIPMENT_ALLOWED.WERT=FALSE; CHANGED: PRICE_CURRENCY.minOccurs="1"
     * 
     * @param value
     *     allowed object is
     *     {@link ORDERINFO }
     *     
     */
    public void setORDERINFO(ORDERINFO value) {
        this.orderinfo = value;
    }

}

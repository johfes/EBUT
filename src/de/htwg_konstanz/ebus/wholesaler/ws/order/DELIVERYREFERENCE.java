
package de.htwg_konstanz.ebus.wholesaler.ws.order;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DELIVERY_REFERENCE element declaration.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;element name="DELIVERY_REFERENCE">
 *   &lt;complexType>
 *     &lt;complexContent>
 *       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *         &lt;sequence>
 *           &lt;element ref="{http://www.opentrans.org/XMLSchema/1.0}DELIVERYNOTE_ID"/>
 *           &lt;element ref="{http://www.opentrans.org/XMLSchema/1.0}LINE_ITEM_ID"/>
 *           &lt;element ref="{http://www.opentrans.org/XMLSchema/1.0}DELIVERY_DATE" minOccurs="0"/>
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
    "deliverynoteid",
    "lineitemid",
    "deliverydate"
})
@XmlRootElement(name = "DELIVERY_REFERENCE")
public class DELIVERYREFERENCE {

    @XmlElement(name = "DELIVERYNOTE_ID", namespace = "http://www.opentrans.org/XMLSchema/1.0", required = true)
    protected String deliverynoteid;
    @XmlElement(name = "LINE_ITEM_ID", namespace = "http://www.opentrans.org/XMLSchema/1.0", required = true)
    protected String lineitemid;
    @XmlElement(name = "DELIVERY_DATE", namespace = "http://www.opentrans.org/XMLSchema/1.0")
    protected DELIVERYDATE deliverydate;

    /**
     * Gets the value of the deliverynoteid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDELIVERYNOTEID() {
        return deliverynoteid;
    }

    /**
     * Sets the value of the deliverynoteid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDELIVERYNOTEID(String value) {
        this.deliverynoteid = value;
    }

    /**
     * Gets the value of the lineitemid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLINEITEMID() {
        return lineitemid;
    }

    /**
     * Sets the value of the lineitemid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLINEITEMID(String value) {
        this.lineitemid = value;
    }

    /**
     * Gets the value of the deliverydate property.
     * 
     * @return
     *     possible object is
     *     {@link DELIVERYDATE }
     *     
     */
    public DELIVERYDATE getDELIVERYDATE() {
        return deliverydate;
    }

    /**
     * Sets the value of the deliverydate property.
     * 
     * @param value
     *     allowed object is
     *     {@link DELIVERYDATE }
     *     
     */
    public void setDELIVERYDATE(DELIVERYDATE value) {
        this.deliverydate = value;
    }

}

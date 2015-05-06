
package de.htwg_konstanz.ebus.wholesaler.ws.order;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * LÖSCHEN
 * 
 * <p>Java class for DELIVERY_DATE element declaration.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;element name="DELIVERY_DATE">
 *   &lt;complexType>
 *     &lt;complexContent>
 *       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *         &lt;sequence>
 *           &lt;element ref="{http://www.opentrans.org/XMLSchema/1.0}DELIVERY_START_DATE"/>
 *           &lt;element ref="{http://www.opentrans.org/XMLSchema/1.0}DELIVERY_END_DATE"/>
 *         &lt;/sequence>
 *         &lt;attribute name="type" default="fixed">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN">
 *               &lt;enumeration value="optional"/>
 *               &lt;enumeration value="fixed"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/attribute>
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
    "deliverystartdate",
    "deliveryenddate"
})
@XmlRootElement(name = "DELIVERY_DATE")
public class DELIVERYDATE {

    @XmlElement(name = "DELIVERY_START_DATE", namespace = "http://www.opentrans.org/XMLSchema/1.0", required = true)
    protected String deliverystartdate;
    @XmlElement(name = "DELIVERY_END_DATE", namespace = "http://www.opentrans.org/XMLSchema/1.0", required = true)
    protected String deliveryenddate;
    @XmlAttribute
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String type;

    /**
     * Gets the value of the deliverystartdate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDELIVERYSTARTDATE() {
        return deliverystartdate;
    }

    /**
     * Sets the value of the deliverystartdate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDELIVERYSTARTDATE(String value) {
        this.deliverystartdate = value;
    }

    /**
     * Gets the value of the deliveryenddate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDELIVERYENDDATE() {
        return deliveryenddate;
    }

    /**
     * Sets the value of the deliveryenddate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDELIVERYENDDATE(String value) {
        this.deliveryenddate = value;
    }

    /**
     * Gets the value of the type property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getType() {
        if (type == null) {
            return "fixed";
        } else {
            return type;
        }
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setType(String value) {
        this.type = value;
    }

}


package de.htwg_konstanz.ebus.wholesaler.ws.order;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * vom ePS zu ignorieren
 * 
 * <p>Java class for SHIPMENT_PARTIES element declaration.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;element name="SHIPMENT_PARTIES">
 *   &lt;complexType>
 *     &lt;complexContent>
 *       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *         &lt;sequence>
 *           &lt;element ref="{http://www.opentrans.org/XMLSchema/1.0}DELIVERY_PARTY"/>
 *           &lt;element ref="{http://www.opentrans.org/XMLSchema/1.0}FINAL_DELIVERY_PARTY" minOccurs="0"/>
 *           &lt;element ref="{http://www.opentrans.org/XMLSchema/1.0}TRANSPORT_PARTY" maxOccurs="unbounded" minOccurs="0"/>
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
    "deliveryparty",
    "finaldeliveryparty",
    "transportparty"
})
@XmlRootElement(name = "SHIPMENT_PARTIES")
public class SHIPMENTPARTIES {

    @XmlElement(name = "DELIVERY_PARTY", namespace = "http://www.opentrans.org/XMLSchema/1.0", required = true)
    protected DELIVERYPARTY deliveryparty;
    @XmlElement(name = "FINAL_DELIVERY_PARTY", namespace = "http://www.opentrans.org/XMLSchema/1.0")
    protected FINALDELIVERYPARTY finaldeliveryparty;
    @XmlElement(name = "TRANSPORT_PARTY", namespace = "http://www.opentrans.org/XMLSchema/1.0", required = true)
    protected List<TRANSPORTPARTY> transportparty;

    /**
     * Gets the value of the deliveryparty property.
     * 
     * @return
     *     possible object is
     *     {@link DELIVERYPARTY }
     *     
     */
    public DELIVERYPARTY getDELIVERYPARTY() {
        return deliveryparty;
    }

    /**
     * Sets the value of the deliveryparty property.
     * 
     * @param value
     *     allowed object is
     *     {@link DELIVERYPARTY }
     *     
     */
    public void setDELIVERYPARTY(DELIVERYPARTY value) {
        this.deliveryparty = value;
    }

    /**
     * Gets the value of the finaldeliveryparty property.
     * 
     * @return
     *     possible object is
     *     {@link FINALDELIVERYPARTY }
     *     
     */
    public FINALDELIVERYPARTY getFINALDELIVERYPARTY() {
        return finaldeliveryparty;
    }

    /**
     * Sets the value of the finaldeliveryparty property.
     * 
     * @param value
     *     allowed object is
     *     {@link FINALDELIVERYPARTY }
     *     
     */
    public void setFINALDELIVERYPARTY(FINALDELIVERYPARTY value) {
        this.finaldeliveryparty = value;
    }

    /**
     * Gets the value of the transportparty property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the transportparty property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTRANSPORTPARTY().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TRANSPORTPARTY }
     * 
     * 
     */
    public List<TRANSPORTPARTY> getTRANSPORTPARTY() {
        if (transportparty == null) {
            transportparty = new ArrayList<TRANSPORTPARTY>();
        }
        return this.transportparty;
    }

}

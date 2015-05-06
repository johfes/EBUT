
package de.htwg_konstanz.ebus.wholesaler.ws.order;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for OrderServiceResponse element declaration.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;element name="OrderServiceResponse">
 *   &lt;complexType>
 *     &lt;complexContent>
 *       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *         &lt;sequence>
 *           &lt;element ref="{http://www.opentrans.org/XMLSchema/1.0}ORDERRESPONSE"/>
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
    "orderresponse"
})
@XmlRootElement(name = "OrderServiceResponse", namespace = "http://www.htwg-konstanz.de/ebsf/ws/order")
public class OrderServiceResponse {

    @XmlElement(name = "ORDERRESPONSE", namespace = "http://www.opentrans.org/XMLSchema/1.0", required = true)
    protected ORDERRESPONSE orderresponse;

    /**
     * Gets the value of the orderresponse property.
     * 
     * @return
     *     possible object is
     *     {@link ORDERRESPONSE }
     *     
     */
    public ORDERRESPONSE getORDERRESPONSE() {
        return orderresponse;
    }

    /**
     * Sets the value of the orderresponse property.
     * 
     * @param value
     *     allowed object is
     *     {@link ORDERRESPONSE }
     *     
     */
    public void setORDERRESPONSE(ORDERRESPONSE value) {
        this.orderresponse = value;
    }

}

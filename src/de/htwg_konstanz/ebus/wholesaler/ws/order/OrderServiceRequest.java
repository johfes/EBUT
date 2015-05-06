
package de.htwg_konstanz.ebus.wholesaler.ws.order;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for OrderServiceRequest element declaration.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;element name="OrderServiceRequest">
 *   &lt;complexType>
 *     &lt;complexContent>
 *       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *         &lt;sequence>
 *           &lt;element name="userName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *           &lt;element name="password" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *           &lt;element ref="{http://www.opentrans.org/XMLSchema/1.0}ORDER"/>
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
    "userName",
    "password",
    "order"
})
@XmlRootElement(name = "OrderServiceRequest", namespace = "http://www.htwg-konstanz.de/ebsf/ws/order")
public class OrderServiceRequest {

    @XmlElement(namespace = "http://www.htwg-konstanz.de/ebsf/ws/order", required = true)
    protected String userName;
    @XmlElement(namespace = "http://www.htwg-konstanz.de/ebsf/ws/order", required = true)
    protected String password;
    @XmlElement(name = "ORDER", namespace = "http://www.opentrans.org/XMLSchema/1.0", required = true)
    protected ORDER order;

    /**
     * Gets the value of the userName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUserName() {
        return userName;
    }

    /**
     * Sets the value of the userName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUserName(String value) {
        this.userName = value;
    }

    /**
     * Gets the value of the password property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPassword() {
        return password;
    }

    /**
     * Sets the value of the password property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPassword(String value) {
        this.password = value;
    }

    /**
     * Gets the value of the order property.
     * 
     * @return
     *     possible object is
     *     {@link ORDER }
     *     
     */
    public ORDER getORDER() {
        return order;
    }

    /**
     * Sets the value of the order property.
     * 
     * @param value
     *     allowed object is
     *     {@link ORDER }
     *     
     */
    public void setORDER(ORDER value) {
        this.order = value;
    }

}

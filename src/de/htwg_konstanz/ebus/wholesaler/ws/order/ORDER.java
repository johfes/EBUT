
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
 * <p>Java class for ORDER element declaration.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;element name="ORDER">
 *   &lt;complexType>
 *     &lt;complexContent>
 *       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *         &lt;sequence>
 *           &lt;element ref="{http://www.opentrans.org/XMLSchema/1.0}ORDER_HEADER"/>
 *           &lt;element ref="{http://www.opentrans.org/XMLSchema/1.0}ORDER_ITEM_LIST"/>
 *           &lt;element ref="{http://www.opentrans.org/XMLSchema/1.0}ORDER_SUMMARY"/>
 *         &lt;/sequence>
 *         &lt;attribute name="type" default="standard">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN">
 *               &lt;enumeration value="standard"/>
 *               &lt;enumeration value="express"/>
 *               &lt;enumeration value="release"/>
 *               &lt;enumeration value="consignment"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/attribute>
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
    "orderheader",
    "orderitemlist",
    "ordersummary"
})
@XmlRootElement(name = "ORDER")
public class ORDER {

    @XmlElement(name = "ORDER_HEADER", namespace = "http://www.opentrans.org/XMLSchema/1.0", required = true)
    protected ORDERHEADER orderheader;
    @XmlElement(name = "ORDER_ITEM_LIST", namespace = "http://www.opentrans.org/XMLSchema/1.0", required = true)
    protected ORDERITEMLIST orderitemlist;
    @XmlElement(name = "ORDER_SUMMARY", namespace = "http://www.opentrans.org/XMLSchema/1.0", required = true)
    protected ORDERSUMMARY ordersummary;
    @XmlAttribute
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String type;
    @XmlAttribute
    protected String version;

    /**
     * CHANGED
     * 
     * @return
     *     possible object is
     *     {@link ORDERHEADER }
     *     
     */
    public ORDERHEADER getORDERHEADER() {
        return orderheader;
    }

    /**
     * CHANGED
     * 
     * @param value
     *     allowed object is
     *     {@link ORDERHEADER }
     *     
     */
    public void setORDERHEADER(ORDERHEADER value) {
        this.orderheader = value;
    }

    /**
     * CHANGED
     * 
     * @return
     *     possible object is
     *     {@link ORDERITEMLIST }
     *     
     */
    public ORDERITEMLIST getORDERITEMLIST() {
        return orderitemlist;
    }

    /**
     * CHANGED
     * 
     * @param value
     *     allowed object is
     *     {@link ORDERITEMLIST }
     *     
     */
    public void setORDERITEMLIST(ORDERITEMLIST value) {
        this.orderitemlist = value;
    }

    /**
     * Gets the value of the ordersummary property.
     * 
     * @return
     *     possible object is
     *     {@link ORDERSUMMARY }
     *     
     */
    public ORDERSUMMARY getORDERSUMMARY() {
        return ordersummary;
    }

    /**
     * Sets the value of the ordersummary property.
     * 
     * @param value
     *     allowed object is
     *     {@link ORDERSUMMARY }
     *     
     */
    public void setORDERSUMMARY(ORDERSUMMARY value) {
        this.ordersummary = value;
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
            return "standard";
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

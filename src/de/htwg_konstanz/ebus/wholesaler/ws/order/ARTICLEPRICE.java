
package de.htwg_konstanz.ebus.wholesaler.ws.order;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * CHANGED
 * 
 * <p>Java class for ARTICLE_PRICE element declaration.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;element name="ARTICLE_PRICE">
 *   &lt;complexType>
 *     &lt;complexContent>
 *       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *         &lt;sequence>
 *           &lt;element ref="{http://www.opentrans.org/XMLSchema/1.0}PRICE_AMOUNT"/>
 *           &lt;element ref="{http://www.opentrans.org/XMLSchema/1.0}PRICE_LINE_AMOUNT"/>
 *           &lt;element ref="{http://www.opentrans.org/XMLSchema/1.0}TAX" minOccurs="0"/>
 *           &lt;element ref="{http://www.opentrans.org/XMLSchema/1.0}TAX_AMOUNT" minOccurs="0"/>
 *         &lt;/sequence>
 *         &lt;attribute name="type" use="required">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN">
 *               &lt;pattern value="net_list|gros_list|net_customer|nrp|net_customer_exp|udp_\w{1,16}"/>
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
    "priceamount",
    "pricelineamount",
    "tax",
    "taxamount"
})
@XmlRootElement(name = "ARTICLE_PRICE")
public class ARTICLEPRICE {

    @XmlElement(name = "PRICE_AMOUNT", namespace = "http://www.opentrans.org/XMLSchema/1.0", required = true)
    protected BigDecimal priceamount;
    @XmlElement(name = "PRICE_LINE_AMOUNT", namespace = "http://www.opentrans.org/XMLSchema/1.0", required = true)
    protected BigDecimal pricelineamount;
    @XmlElement(name = "TAX", namespace = "http://www.opentrans.org/XMLSchema/1.0")
    protected BigDecimal tax;
    @XmlElement(name = "TAX_AMOUNT", namespace = "http://www.opentrans.org/XMLSchema/1.0")
    protected BigDecimal taxamount;
    @XmlAttribute(required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String type;

    /**
     * in ePS: order_item.unit_price; entspricht in ePS dem Katalogpreis
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getPRICEAMOUNT() {
        return priceamount;
    }

    /**
     * in ePS: order_item.unit_price; entspricht in ePS dem Katalogpreis
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setPRICEAMOUNT(BigDecimal value) {
        this.priceamount = value;
    }

    /**
     * wird im ePS berechnet als order_item.order_size * order_item.unit_price; NETTO 
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getPRICELINEAMOUNT() {
        return pricelineamount;
    }

    /**
     * wird im ePS berechnet als order_item.order_size * order_item.unit_price; NETTO 
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setPRICELINEAMOUNT(BigDecimal value) {
        this.pricelineamount = value;
    }

    /**
     * in ePS: order_item.tax_rate; entspricht in ePS dem Steuersatz im Katalogpreis
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getTAX() {
        return tax;
    }

    /**
     * in ePS: order_item.tax_rate; entspricht in ePS dem Steuersatz im Katalogpreis
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setTAX(BigDecimal value) {
        this.tax = value;
    }

    /**
     * wird im ePS berechnet order_item.order_size * order_item.unit_price * order_item.tax_rate
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getTAXAMOUNT() {
        return taxamount;
    }

    /**
     * wird im ePS berechnet order_item.order_size * order_item.unit_price * order_item.tax_rate
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setTAXAMOUNT(BigDecimal value) {
        this.taxamount = value;
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
        return type;
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

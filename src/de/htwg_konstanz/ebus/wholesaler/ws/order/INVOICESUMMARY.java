
package de.htwg_konstanz.ebus.wholesaler.ws.order;

import java.math.BigDecimal;
import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for INVOICE_SUMMARY element declaration.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;element name="INVOICE_SUMMARY">
 *   &lt;complexType>
 *     &lt;complexContent>
 *       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *         &lt;sequence>
 *           &lt;element ref="{http://www.opentrans.org/XMLSchema/1.0}TOTAL_ITEM_NUM"/>
 *           &lt;element ref="{http://www.opentrans.org/XMLSchema/1.0}TOTAL_AMOUNT"/>
 *           &lt;element ref="{http://www.opentrans.org/XMLSchema/1.0}TOTAL_TAX_AMOUNT"/>
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
    "totalitemnum",
    "totalamount",
    "totaltaxamount"
})
@XmlRootElement(name = "INVOICE_SUMMARY")
public class INVOICESUMMARY {

    @XmlElement(name = "TOTAL_ITEM_NUM", namespace = "http://www.opentrans.org/XMLSchema/1.0", required = true)
    protected BigInteger totalitemnum;
    @XmlElement(name = "TOTAL_AMOUNT", namespace = "http://www.opentrans.org/XMLSchema/1.0", required = true)
    protected BigDecimal totalamount;
    @XmlElement(name = "TOTAL_TAX_AMOUNT", namespace = "http://www.opentrans.org/XMLSchema/1.0", required = true)
    protected BigDecimal totaltaxamount;

    /**
     * Gets the value of the totalitemnum property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getTOTALITEMNUM() {
        return totalitemnum;
    }

    /**
     * Sets the value of the totalitemnum property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setTOTALITEMNUM(BigInteger value) {
        this.totalitemnum = value;
    }

    /**
     * Gets the value of the totalamount property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getTOTALAMOUNT() {
        return totalamount;
    }

    /**
     * Sets the value of the totalamount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setTOTALAMOUNT(BigDecimal value) {
        this.totalamount = value;
    }

    /**
     * Gets the value of the totaltaxamount property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getTOTALTAXAMOUNT() {
        return totaltaxamount;
    }

    /**
     * Sets the value of the totaltaxamount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setTOTALTAXAMOUNT(BigDecimal value) {
        this.totaltaxamount = value;
    }

}

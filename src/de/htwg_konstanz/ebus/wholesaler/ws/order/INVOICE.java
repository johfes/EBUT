
package de.htwg_konstanz.ebus.wholesaler.ws.order;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for INVOICE element declaration.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;element name="INVOICE">
 *   &lt;complexType>
 *     &lt;complexContent>
 *       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *         &lt;sequence>
 *           &lt;element ref="{http://www.opentrans.org/XMLSchema/1.0}INVOICE_HEADER"/>
 *           &lt;element ref="{http://www.opentrans.org/XMLSchema/1.0}INVOICE_ITEM_LIST"/>
 *           &lt;element ref="{http://www.opentrans.org/XMLSchema/1.0}INVOICE_SUMMARY"/>
 *         &lt;/sequence>
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
    "invoiceheader",
    "invoiceitemlist",
    "invoicesummary"
})
@XmlRootElement(name = "INVOICE")
public class INVOICE {

    @XmlElement(name = "INVOICE_HEADER", namespace = "http://www.opentrans.org/XMLSchema/1.0", required = true)
    protected INVOICEHEADER invoiceheader;
    @XmlElement(name = "INVOICE_ITEM_LIST", namespace = "http://www.opentrans.org/XMLSchema/1.0", required = true)
    protected INVOICEITEMLIST invoiceitemlist;
    @XmlElement(name = "INVOICE_SUMMARY", namespace = "http://www.opentrans.org/XMLSchema/1.0", required = true)
    protected INVOICESUMMARY invoicesummary;
    @XmlAttribute
    protected String version;

    /**
     * Gets the value of the invoiceheader property.
     * 
     * @return
     *     possible object is
     *     {@link INVOICEHEADER }
     *     
     */
    public INVOICEHEADER getINVOICEHEADER() {
        return invoiceheader;
    }

    /**
     * Sets the value of the invoiceheader property.
     * 
     * @param value
     *     allowed object is
     *     {@link INVOICEHEADER }
     *     
     */
    public void setINVOICEHEADER(INVOICEHEADER value) {
        this.invoiceheader = value;
    }

    /**
     * Gets the value of the invoiceitemlist property.
     * 
     * @return
     *     possible object is
     *     {@link INVOICEITEMLIST }
     *     
     */
    public INVOICEITEMLIST getINVOICEITEMLIST() {
        return invoiceitemlist;
    }

    /**
     * Sets the value of the invoiceitemlist property.
     * 
     * @param value
     *     allowed object is
     *     {@link INVOICEITEMLIST }
     *     
     */
    public void setINVOICEITEMLIST(INVOICEITEMLIST value) {
        this.invoiceitemlist = value;
    }

    /**
     * Gets the value of the invoicesummary property.
     * 
     * @return
     *     possible object is
     *     {@link INVOICESUMMARY }
     *     
     */
    public INVOICESUMMARY getINVOICESUMMARY() {
        return invoicesummary;
    }

    /**
     * Sets the value of the invoicesummary property.
     * 
     * @param value
     *     allowed object is
     *     {@link INVOICESUMMARY }
     *     
     */
    public void setINVOICESUMMARY(INVOICESUMMARY value) {
        this.invoicesummary = value;
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

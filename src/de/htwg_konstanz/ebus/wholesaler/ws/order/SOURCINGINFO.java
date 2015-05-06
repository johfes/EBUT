
package de.htwg_konstanz.ebus.wholesaler.ws.order;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SOURCING_INFO element declaration.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;element name="SOURCING_INFO">
 *   &lt;complexType>
 *     &lt;complexContent>
 *       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *         &lt;sequence>
 *           &lt;element ref="{http://www.opentrans.org/XMLSchema/1.0}QUOTATION_ID" minOccurs="0"/>
 *           &lt;element ref="{http://www.opentrans.org/XMLSchema/1.0}AGREEMENT" maxOccurs="unbounded" minOccurs="0"/>
 *           &lt;element ref="{http://www.opentrans.org/XMLSchema/1.0}CATALOG_REFERENCE" minOccurs="0"/>
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
    "quotationid",
    "agreement",
    "catalogreference"
})
@XmlRootElement(name = "SOURCING_INFO")
public class SOURCINGINFO {

    @XmlElement(name = "QUOTATION_ID", namespace = "http://www.opentrans.org/XMLSchema/1.0")
    protected String quotationid;
    @XmlElement(name = "AGREEMENT", namespace = "http://www.opentrans.org/XMLSchema/1.0", required = true)
    protected List<AGREEMENT> agreement;
    @XmlElement(name = "CATALOG_REFERENCE", namespace = "http://www.opentrans.org/XMLSchema/1.0")
    protected CATALOGREFERENCE catalogreference;

    /**
     * Gets the value of the quotationid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getQUOTATIONID() {
        return quotationid;
    }

    /**
     * Sets the value of the quotationid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setQUOTATIONID(String value) {
        this.quotationid = value;
    }

    /**
     * Gets the value of the agreement property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the agreement property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAGREEMENT().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AGREEMENT }
     * 
     * 
     */
    public List<AGREEMENT> getAGREEMENT() {
        if (agreement == null) {
            agreement = new ArrayList<AGREEMENT>();
        }
        return this.agreement;
    }

    /**
     * Gets the value of the catalogreference property.
     * 
     * @return
     *     possible object is
     *     {@link CATALOGREFERENCE }
     *     
     */
    public CATALOGREFERENCE getCATALOGREFERENCE() {
        return catalogreference;
    }

    /**
     * Sets the value of the catalogreference property.
     * 
     * @param value
     *     allowed object is
     *     {@link CATALOGREFERENCE }
     *     
     */
    public void setCATALOGREFERENCE(CATALOGREFERENCE value) {
        this.catalogreference = value;
    }

}

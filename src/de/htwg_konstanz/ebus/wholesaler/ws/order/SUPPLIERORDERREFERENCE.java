
package de.htwg_konstanz.ebus.wholesaler.ws.order;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SUPPLIER_ORDER_REFERENCE element declaration.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;element name="SUPPLIER_ORDER_REFERENCE">
 *   &lt;complexType>
 *     &lt;complexContent>
 *       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *         &lt;sequence>
 *           &lt;element ref="{http://www.opentrans.org/XMLSchema/1.0}SUPPLIER_ORDER_ID"/>
 *           &lt;element ref="{http://www.opentrans.org/XMLSchema/1.0}SUPPLIER_ORDER_ITEM_ID"/>
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
    "supplierorderid",
    "supplierorderitemid"
})
@XmlRootElement(name = "SUPPLIER_ORDER_REFERENCE")
public class SUPPLIERORDERREFERENCE {

    @XmlElement(name = "SUPPLIER_ORDER_ID", namespace = "http://www.opentrans.org/XMLSchema/1.0", required = true)
    protected String supplierorderid;
    @XmlElement(name = "SUPPLIER_ORDER_ITEM_ID", namespace = "http://www.opentrans.org/XMLSchema/1.0", required = true)
    protected String supplierorderitemid;

    /**
     * Gets the value of the supplierorderid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSUPPLIERORDERID() {
        return supplierorderid;
    }

    /**
     * Sets the value of the supplierorderid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSUPPLIERORDERID(String value) {
        this.supplierorderid = value;
    }

    /**
     * Gets the value of the supplierorderitemid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSUPPLIERORDERITEMID() {
        return supplierorderitemid;
    }

    /**
     * Sets the value of the supplierorderitemid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSUPPLIERORDERITEMID(String value) {
        this.supplierorderitemid = value;
    }

}


package de.htwg_konstanz.ebus.wholesaler.ws.order;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PACKAGE_INFO element declaration.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;element name="PACKAGE_INFO">
 *   &lt;complexType>
 *     &lt;complexContent>
 *       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *         &lt;sequence>
 *           &lt;element ref="{http://www.opentrans.org/XMLSchema/1.0}PACKAGE_ID"/>
 *           &lt;element ref="{http://www.opentrans.org/XMLSchema/1.0}PACKAGE_TYPE" minOccurs="0"/>
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
    "packageid",
    "packagetype"
})
@XmlRootElement(name = "PACKAGE_INFO")
public class PACKAGEINFO {

    @XmlElement(name = "PACKAGE_ID", namespace = "http://www.opentrans.org/XMLSchema/1.0", required = true)
    protected String packageid;
    @XmlElement(name = "PACKAGE_TYPE", namespace = "http://www.opentrans.org/XMLSchema/1.0")
    protected String packagetype;

    /**
     * Gets the value of the packageid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPACKAGEID() {
        return packageid;
    }

    /**
     * Sets the value of the packageid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPACKAGEID(String value) {
        this.packageid = value;
    }

    /**
     * Gets the value of the packagetype property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPACKAGETYPE() {
        return packagetype;
    }

    /**
     * Sets the value of the packagetype property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPACKAGETYPE(String value) {
        this.packagetype = value;
    }

}

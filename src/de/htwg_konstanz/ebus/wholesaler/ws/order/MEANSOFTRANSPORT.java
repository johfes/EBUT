
package de.htwg_konstanz.ebus.wholesaler.ws.order;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for MEANS_OF_TRANSPORT element declaration.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;element name="MEANS_OF_TRANSPORT">
 *   &lt;complexType>
 *     &lt;complexContent>
 *       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *         &lt;sequence>
 *           &lt;element ref="{http://www.opentrans.org/XMLSchema/1.0}MEANS_OF_TRANSPORT_ID"/>
 *           &lt;element ref="{http://www.opentrans.org/XMLSchema/1.0}MEANS_OF_TRANSPORT_NAME" minOccurs="0"/>
 *         &lt;/sequence>
 *         &lt;attribute name="type">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.opentrans.org/XMLSchema/1.0}dtSTRING">
 *               &lt;minLength value="1"/>
 *               &lt;maxLength value="50"/>
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
    "meansoftransportid",
    "meansoftransportname"
})
@XmlRootElement(name = "MEANS_OF_TRANSPORT")
public class MEANSOFTRANSPORT {

    @XmlElement(name = "MEANS_OF_TRANSPORT_ID", namespace = "http://www.opentrans.org/XMLSchema/1.0", required = true)
    protected String meansoftransportid;
    @XmlElement(name = "MEANS_OF_TRANSPORT_NAME", namespace = "http://www.opentrans.org/XMLSchema/1.0")
    protected String meansoftransportname;
    @XmlAttribute
    protected String type;

    /**
     * Gets the value of the meansoftransportid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMEANSOFTRANSPORTID() {
        return meansoftransportid;
    }

    /**
     * Sets the value of the meansoftransportid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMEANSOFTRANSPORTID(String value) {
        this.meansoftransportid = value;
    }

    /**
     * Gets the value of the meansoftransportname property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMEANSOFTRANSPORTNAME() {
        return meansoftransportname;
    }

    /**
     * Sets the value of the meansoftransportname property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMEANSOFTRANSPORTNAME(String value) {
        this.meansoftransportname = value;
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

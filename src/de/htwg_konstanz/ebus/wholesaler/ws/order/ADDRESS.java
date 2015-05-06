
package de.htwg_konstanz.ebus.wholesaler.ws.order;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ADDRESS element declaration.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;element name="ADDRESS">
 *   &lt;complexType>
 *     &lt;complexContent>
 *       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *         &lt;sequence>
 *           &lt;element ref="{http://www.opentrans.org/XMLSchema/1.0}NAME"/>
 *           &lt;element ref="{http://www.opentrans.org/XMLSchema/1.0}NAME2" minOccurs="0"/>
 *           &lt;element ref="{http://www.opentrans.org/XMLSchema/1.0}NAME3" minOccurs="0"/>
 *           &lt;element ref="{http://www.opentrans.org/XMLSchema/1.0}DEPARTMENT" minOccurs="0"/>
 *           &lt;element ref="{http://www.opentrans.org/XMLSchema/1.0}CONTACT" maxOccurs="unbounded" minOccurs="0"/>
 *           &lt;element ref="{http://www.opentrans.org/XMLSchema/1.0}STREET" minOccurs="0"/>
 *           &lt;element ref="{http://www.opentrans.org/XMLSchema/1.0}ZIP" minOccurs="0"/>
 *           &lt;element ref="{http://www.opentrans.org/XMLSchema/1.0}BOXNO" minOccurs="0"/>
 *           &lt;element ref="{http://www.opentrans.org/XMLSchema/1.0}ZIPBOX" minOccurs="0"/>
 *           &lt;element ref="{http://www.opentrans.org/XMLSchema/1.0}CITY" minOccurs="0"/>
 *           &lt;element ref="{http://www.opentrans.org/XMLSchema/1.0}STATE" minOccurs="0"/>
 *           &lt;element ref="{http://www.opentrans.org/XMLSchema/1.0}COUNTRY" minOccurs="0"/>
 *           &lt;element ref="{http://www.opentrans.org/XMLSchema/1.0}VAT_ID" minOccurs="0"/>
 *           &lt;element ref="{http://www.opentrans.org/XMLSchema/1.0}PHONE" minOccurs="0"/>
 *           &lt;element ref="{http://www.opentrans.org/XMLSchema/1.0}FAX" minOccurs="0"/>
 *           &lt;element ref="{http://www.opentrans.org/XMLSchema/1.0}EMAIL" minOccurs="0"/>
 *           &lt;element ref="{http://www.opentrans.org/XMLSchema/1.0}PUBLIC_KEY" maxOccurs="unbounded" minOccurs="0"/>
 *           &lt;element ref="{http://www.opentrans.org/XMLSchema/1.0}URL" minOccurs="0"/>
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
    "name",
    "name2",
    "name3",
    "department",
    "contact",
    "street",
    "zip",
    "boxno",
    "zipbox",
    "city",
    "state",
    "country",
    "vatid",
    "phone",
    "fax",
    "email",
    "publickey",
    "url"
})
@XmlRootElement(name = "ADDRESS")
public class ADDRESS {

    @XmlElement(name = "NAME", namespace = "http://www.opentrans.org/XMLSchema/1.0", required = true)
    protected String name;
    @XmlElement(name = "NAME2", namespace = "http://www.opentrans.org/XMLSchema/1.0")
    protected String name2;
    @XmlElement(name = "NAME3", namespace = "http://www.opentrans.org/XMLSchema/1.0")
    protected String name3;
    @XmlElement(name = "DEPARTMENT", namespace = "http://www.opentrans.org/XMLSchema/1.0")
    protected String department;
    @XmlElement(name = "CONTACT", namespace = "http://www.opentrans.org/XMLSchema/1.0", required = true)
    protected List<CONTACT> contact;
    @XmlElement(name = "STREET", namespace = "http://www.opentrans.org/XMLSchema/1.0")
    protected String street;
    @XmlElement(name = "ZIP", namespace = "http://www.opentrans.org/XMLSchema/1.0")
    protected String zip;
    @XmlElement(name = "BOXNO", namespace = "http://www.opentrans.org/XMLSchema/1.0")
    protected String boxno;
    @XmlElement(name = "ZIPBOX", namespace = "http://www.opentrans.org/XMLSchema/1.0")
    protected String zipbox;
    @XmlElement(name = "CITY", namespace = "http://www.opentrans.org/XMLSchema/1.0")
    protected String city;
    @XmlElement(name = "STATE", namespace = "http://www.opentrans.org/XMLSchema/1.0")
    protected String state;
    @XmlElement(name = "COUNTRY", namespace = "http://www.opentrans.org/XMLSchema/1.0")
    protected String country;
    @XmlElement(name = "VAT_ID", namespace = "http://www.opentrans.org/XMLSchema/1.0")
    protected String vatid;
    @XmlElement(name = "PHONE", namespace = "http://www.opentrans.org/XMLSchema/1.0")
    protected PHONE phone;
    @XmlElement(name = "FAX", namespace = "http://www.opentrans.org/XMLSchema/1.0")
    protected String fax;
    @XmlElement(name = "EMAIL", namespace = "http://www.opentrans.org/XMLSchema/1.0")
    protected String email;
    @XmlElement(name = "PUBLIC_KEY", namespace = "http://www.opentrans.org/XMLSchema/1.0", required = true)
    protected List<PUBLICKEY> publickey;
    @XmlElement(name = "URL", namespace = "http://www.opentrans.org/XMLSchema/1.0")
    protected String url;

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNAME() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNAME(String value) {
        this.name = value;
    }

    /**
     * Gets the value of the name2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNAME2() {
        return name2;
    }

    /**
     * Sets the value of the name2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNAME2(String value) {
        this.name2 = value;
    }

    /**
     * Gets the value of the name3 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNAME3() {
        return name3;
    }

    /**
     * Sets the value of the name3 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNAME3(String value) {
        this.name3 = value;
    }

    /**
     * Gets the value of the department property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDEPARTMENT() {
        return department;
    }

    /**
     * Sets the value of the department property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDEPARTMENT(String value) {
        this.department = value;
    }

    /**
     * Gets the value of the contact property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the contact property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCONTACT().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CONTACT }
     * 
     * 
     */
    public List<CONTACT> getCONTACT() {
        if (contact == null) {
            contact = new ArrayList<CONTACT>();
        }
        return this.contact;
    }

    /**
     * Gets the value of the street property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSTREET() {
        return street;
    }

    /**
     * Sets the value of the street property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSTREET(String value) {
        this.street = value;
    }

    /**
     * Gets the value of the zip property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getZIP() {
        return zip;
    }

    /**
     * Sets the value of the zip property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setZIP(String value) {
        this.zip = value;
    }

    /**
     * Gets the value of the boxno property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBOXNO() {
        return boxno;
    }

    /**
     * Sets the value of the boxno property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBOXNO(String value) {
        this.boxno = value;
    }

    /**
     * Gets the value of the zipbox property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getZIPBOX() {
        return zipbox;
    }

    /**
     * Sets the value of the zipbox property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setZIPBOX(String value) {
        this.zipbox = value;
    }

    /**
     * Gets the value of the city property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCITY() {
        return city;
    }

    /**
     * Sets the value of the city property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCITY(String value) {
        this.city = value;
    }

    /**
     * Gets the value of the state property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSTATE() {
        return state;
    }

    /**
     * Sets the value of the state property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSTATE(String value) {
        this.state = value;
    }

    /**
     * Gets the value of the country property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCOUNTRY() {
        return country;
    }

    /**
     * Sets the value of the country property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCOUNTRY(String value) {
        this.country = value;
    }

    /**
     * Gets the value of the vatid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVATID() {
        return vatid;
    }

    /**
     * Sets the value of the vatid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVATID(String value) {
        this.vatid = value;
    }

    /**
     * Gets the value of the phone property.
     * 
     * @return
     *     possible object is
     *     {@link PHONE }
     *     
     */
    public PHONE getPHONE() {
        return phone;
    }

    /**
     * Sets the value of the phone property.
     * 
     * @param value
     *     allowed object is
     *     {@link PHONE }
     *     
     */
    public void setPHONE(PHONE value) {
        this.phone = value;
    }

    /**
     * Gets the value of the fax property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFAX() {
        return fax;
    }

    /**
     * Sets the value of the fax property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFAX(String value) {
        this.fax = value;
    }

    /**
     * Gets the value of the email property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEMAIL() {
        return email;
    }

    /**
     * Sets the value of the email property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEMAIL(String value) {
        this.email = value;
    }

    /**
     * Gets the value of the publickey property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the publickey property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPUBLICKEY().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PUBLICKEY }
     * 
     * 
     */
    public List<PUBLICKEY> getPUBLICKEY() {
        if (publickey == null) {
            publickey = new ArrayList<PUBLICKEY>();
        }
        return this.publickey;
    }

    /**
     * Gets the value of the url property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getURL() {
        return url;
    }

    /**
     * Sets the value of the url property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setURL(String value) {
        this.url = value;
    }

}


package de.htwg_konstanz.ebus.wholesaler.ws.order;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DISPATCHNOTIFICATION_ITEM_LIST element declaration.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;element name="DISPATCHNOTIFICATION_ITEM_LIST">
 *   &lt;complexType>
 *     &lt;complexContent>
 *       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *         &lt;sequence>
 *           &lt;element ref="{http://www.opentrans.org/XMLSchema/1.0}DISPATCHNOTIFICATION_ITEM" maxOccurs="unbounded"/>
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
    "dispatchnotificationitem"
})
@XmlRootElement(name = "DISPATCHNOTIFICATION_ITEM_LIST")
public class DISPATCHNOTIFICATIONITEMLIST {

    @XmlElement(name = "DISPATCHNOTIFICATION_ITEM", namespace = "http://www.opentrans.org/XMLSchema/1.0", required = true)
    protected List<DISPATCHNOTIFICATIONITEM> dispatchnotificationitem;

    /**
     * Gets the value of the dispatchnotificationitem property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the dispatchnotificationitem property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDISPATCHNOTIFICATIONITEM().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DISPATCHNOTIFICATIONITEM }
     * 
     * 
     */
    public List<DISPATCHNOTIFICATIONITEM> getDISPATCHNOTIFICATIONITEM() {
        if (dispatchnotificationitem == null) {
            dispatchnotificationitem = new ArrayList<DISPATCHNOTIFICATIONITEM>();
        }
        return this.dispatchnotificationitem;
    }

}

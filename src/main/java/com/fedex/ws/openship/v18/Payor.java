
package com.fedex.ws.openship.v18;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Payor complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Payor"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ResponsibleParty" type="{http://fedex.com/ws/openship/v18}Party" minOccurs="0"/&gt;
 *         &lt;element name="AssociatedAccounts" type="{http://fedex.com/ws/openship/v18}AssociatedAccount" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Payor", propOrder = {
    "responsibleParty",
    "associatedAccounts"
})
public class Payor {

    @XmlElement(name = "ResponsibleParty")
    protected Party responsibleParty;
    @XmlElement(name = "AssociatedAccounts")
    protected List<AssociatedAccount> associatedAccounts;

    /**
     * Gets the value of the responsibleParty property.
     * 
     * @return
     *     possible object is
     *     {@link Party }
     *     
     */
    public Party getResponsibleParty() {
        return responsibleParty;
    }

    /**
     * Sets the value of the responsibleParty property.
     * 
     * @param value
     *     allowed object is
     *     {@link Party }
     *     
     */
    public void setResponsibleParty(Party value) {
        this.responsibleParty = value;
    }

    /**
     * Gets the value of the associatedAccounts property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the associatedAccounts property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAssociatedAccounts().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AssociatedAccount }
     * 
     * 
     */
    public List<AssociatedAccount> getAssociatedAccounts() {
        if (associatedAccounts == null) {
            associatedAccounts = new ArrayList<AssociatedAccount>();
        }
        return this.associatedAccounts;
    }

}

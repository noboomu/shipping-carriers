
package com.fedex.ws.ship.v26;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SpecialServiceDescription complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SpecialServiceDescription"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Identifier" type="{http://fedex.com/ws/ship/v26}OfferingIdentifierDetail" minOccurs="0"/&gt;
 *         &lt;element name="Names" type="{http://fedex.com/ws/ship/v26}ProductName" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SpecialServiceDescription", propOrder = {
    "identifier",
    "names"
})
public class SpecialServiceDescription {

    @XmlElement(name = "Identifier")
    protected OfferingIdentifierDetail identifier;
    @XmlElement(name = "Names")
    protected List<ProductName> names;

    /**
     * Gets the value of the identifier property.
     * 
     * @return
     *     possible object is
     *     {@link OfferingIdentifierDetail }
     *     
     */
    public OfferingIdentifierDetail getIdentifier() {
        return identifier;
    }

    /**
     * Sets the value of the identifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link OfferingIdentifierDetail }
     *     
     */
    public void setIdentifier(OfferingIdentifierDetail value) {
        this.identifier = value;
    }

    /**
     * Gets the value of the names property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the names property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getNames().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ProductName }
     * 
     * 
     */
    public List<ProductName> getNames() {
        if (names == null) {
            names = new ArrayList<ProductName>();
        }
        return this.names;
    }

}

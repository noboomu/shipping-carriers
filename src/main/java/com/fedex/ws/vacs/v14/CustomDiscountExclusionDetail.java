
package com.fedex.ws.vacs.v14;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CustomDiscountExclusionDetail complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CustomDiscountExclusionDetail"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ExcludedTypes" type="{http://fedex.com/ws/vacs/v14}RateDiscountType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CustomDiscountExclusionDetail", propOrder = {
    "excludedTypes"
})
public class CustomDiscountExclusionDetail {

    @XmlElement(name = "ExcludedTypes")
    @XmlSchemaType(name = "string")
    protected List<RateDiscountType> excludedTypes;

    /**
     * Gets the value of the excludedTypes property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the excludedTypes property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getExcludedTypes().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RateDiscountType }
     * 
     * 
     */
    public List<RateDiscountType> getExcludedTypes() {
        if (excludedTypes == null) {
            excludedTypes = new ArrayList<RateDiscountType>();
        }
        return this.excludedTypes;
    }

}

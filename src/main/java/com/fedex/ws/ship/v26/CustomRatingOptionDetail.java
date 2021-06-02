
package com.fedex.ws.ship.v26;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CustomRatingOptionDetail complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CustomRatingOptionDetail"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Options" type="{http://fedex.com/ws/ship/v26}CustomRatingOptionType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="CustomDiscountExclusionDetail" type="{http://fedex.com/ws/ship/v26}CustomDiscountExclusionDetail" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CustomRatingOptionDetail", propOrder = {
    "options",
    "customDiscountExclusionDetail"
})
public class CustomRatingOptionDetail {

    @XmlElement(name = "Options")
    @XmlSchemaType(name = "string")
    protected List<CustomRatingOptionType> options;
    @XmlElement(name = "CustomDiscountExclusionDetail")
    protected CustomDiscountExclusionDetail customDiscountExclusionDetail;

    /**
     * Gets the value of the options property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the options property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOptions().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CustomRatingOptionType }
     * 
     * 
     */
    public List<CustomRatingOptionType> getOptions() {
        if (options == null) {
            options = new ArrayList<CustomRatingOptionType>();
        }
        return this.options;
    }

    /**
     * Gets the value of the customDiscountExclusionDetail property.
     * 
     * @return
     *     possible object is
     *     {@link CustomDiscountExclusionDetail }
     *     
     */
    public CustomDiscountExclusionDetail getCustomDiscountExclusionDetail() {
        return customDiscountExclusionDetail;
    }

    /**
     * Sets the value of the customDiscountExclusionDetail property.
     * 
     * @param value
     *     allowed object is
     *     {@link CustomDiscountExclusionDetail }
     *     
     */
    public void setCustomDiscountExclusionDetail(CustomDiscountExclusionDetail value) {
        this.customDiscountExclusionDetail = value;
    }

}

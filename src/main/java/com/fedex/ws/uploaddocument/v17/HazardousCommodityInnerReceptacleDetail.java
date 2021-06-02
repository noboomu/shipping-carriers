
package com.fedex.ws.uploaddocument.v17;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * This describes information about the inner receptacles for the hazardous commodity in a particular dangerous goods container.
 * 
 * <p>Java class for HazardousCommodityInnerReceptacleDetail complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="HazardousCommodityInnerReceptacleDetail"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Quantity" type="{http://fedex.com/ws/uploaddocument/v17}HazardousCommodityQuantityDetail" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HazardousCommodityInnerReceptacleDetail", propOrder = {
    "quantity"
})
public class HazardousCommodityInnerReceptacleDetail {

    @XmlElement(name = "Quantity")
    protected HazardousCommodityQuantityDetail quantity;

    /**
     * Gets the value of the quantity property.
     * 
     * @return
     *     possible object is
     *     {@link HazardousCommodityQuantityDetail }
     *     
     */
    public HazardousCommodityQuantityDetail getQuantity() {
        return quantity;
    }

    /**
     * Sets the value of the quantity property.
     * 
     * @param value
     *     allowed object is
     *     {@link HazardousCommodityQuantityDetail }
     *     
     */
    public void setQuantity(HazardousCommodityQuantityDetail value) {
        this.quantity = value;
    }

}

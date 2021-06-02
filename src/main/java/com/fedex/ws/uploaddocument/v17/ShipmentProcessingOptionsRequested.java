
package com.fedex.ws.uploaddocument.v17;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Specifies special or custom features to be applied during the processing of the enclosing RequestedShipment.
 * 
 * <p>Java class for ShipmentProcessingOptionsRequested complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ShipmentProcessingOptionsRequested"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Options" type="{http://fedex.com/ws/uploaddocument/v17}ShipmentProcessingOptionType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="CustomTransitTimeDetail" type="{http://fedex.com/ws/uploaddocument/v17}CustomTransitTimeDetail" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ShipmentProcessingOptionsRequested", propOrder = {
    "options",
    "customTransitTimeDetail"
})
public class ShipmentProcessingOptionsRequested {

    @XmlElement(name = "Options")
    @XmlSchemaType(name = "string")
    protected List<ShipmentProcessingOptionType> options;
    @XmlElement(name = "CustomTransitTimeDetail")
    protected CustomTransitTimeDetail customTransitTimeDetail;

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
     * {@link ShipmentProcessingOptionType }
     * 
     * 
     */
    public List<ShipmentProcessingOptionType> getOptions() {
        if (options == null) {
            options = new ArrayList<ShipmentProcessingOptionType>();
        }
        return this.options;
    }

    /**
     * Gets the value of the customTransitTimeDetail property.
     * 
     * @return
     *     possible object is
     *     {@link CustomTransitTimeDetail }
     *     
     */
    public CustomTransitTimeDetail getCustomTransitTimeDetail() {
        return customTransitTimeDetail;
    }

    /**
     * Sets the value of the customTransitTimeDetail property.
     * 
     * @param value
     *     allowed object is
     *     {@link CustomTransitTimeDetail }
     *     
     */
    public void setCustomTransitTimeDetail(CustomTransitTimeDetail value) {
        this.customTransitTimeDetail = value;
    }

}

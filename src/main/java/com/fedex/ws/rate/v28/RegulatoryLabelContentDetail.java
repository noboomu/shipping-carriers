
package com.fedex.ws.rate.v28;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Specifies details needed to generate any label artifacts required due to regulatory requirements.
 * 
 * <p>Java class for RegulatoryLabelContentDetail complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RegulatoryLabelContentDetail"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Type" type="{http://fedex.com/ws/rate/v28}RegulatoryLabelType" minOccurs="0"/&gt;
 *         &lt;element name="GenerationOptions" type="{http://fedex.com/ws/rate/v28}CustomerSpecifiedLabelGenerationOptionType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RegulatoryLabelContentDetail", propOrder = {
    "type",
    "generationOptions"
})
public class RegulatoryLabelContentDetail {

    @XmlElement(name = "Type")
    @XmlSchemaType(name = "string")
    protected RegulatoryLabelType type;
    @XmlElement(name = "GenerationOptions")
    @XmlSchemaType(name = "string")
    protected List<CustomerSpecifiedLabelGenerationOptionType> generationOptions;

    /**
     * Gets the value of the type property.
     * 
     * @return
     *     possible object is
     *     {@link RegulatoryLabelType }
     *     
     */
    public RegulatoryLabelType getType() {
        return type;
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link RegulatoryLabelType }
     *     
     */
    public void setType(RegulatoryLabelType value) {
        this.type = value;
    }

    /**
     * Gets the value of the generationOptions property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the generationOptions property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getGenerationOptions().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CustomerSpecifiedLabelGenerationOptionType }
     * 
     * 
     */
    public List<CustomerSpecifiedLabelGenerationOptionType> getGenerationOptions() {
        if (generationOptions == null) {
            generationOptions = new ArrayList<CustomerSpecifiedLabelGenerationOptionType>();
        }
        return this.generationOptions;
    }

}

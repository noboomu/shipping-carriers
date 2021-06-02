
package com.ups.xmlschema.xoltws.rate.v1;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for FreightDensityInfoType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FreightDensityInfoType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="AdjustedHeightIndicator" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="AdjustedHeight" type="{http://www.ups.com/XMLSchema/XOLTWS/Rate/v1.1}AdjustedHeightType" minOccurs="0"/&gt;
 *         &lt;element name="HandlingUnits" type="{http://www.ups.com/XMLSchema/XOLTWS/Rate/v1.1}HandlingUnitsType" maxOccurs="unbounded"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FreightDensityInfoType", propOrder = {
    "adjustedHeightIndicator",
    "adjustedHeight",
    "handlingUnits"
})
public class FreightDensityInfoType {

    @XmlElement(name = "AdjustedHeightIndicator")
    protected String adjustedHeightIndicator;
    @XmlElement(name = "AdjustedHeight")
    protected AdjustedHeightType adjustedHeight;
    @XmlElement(name = "HandlingUnits", required = true)
    protected List<HandlingUnitsType> handlingUnits;

    /**
     * Gets the value of the adjustedHeightIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAdjustedHeightIndicator() {
        return adjustedHeightIndicator;
    }

    /**
     * Sets the value of the adjustedHeightIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAdjustedHeightIndicator(String value) {
        this.adjustedHeightIndicator = value;
    }

    /**
     * Gets the value of the adjustedHeight property.
     * 
     * @return
     *     possible object is
     *     {@link AdjustedHeightType }
     *     
     */
    public AdjustedHeightType getAdjustedHeight() {
        return adjustedHeight;
    }

    /**
     * Sets the value of the adjustedHeight property.
     * 
     * @param value
     *     allowed object is
     *     {@link AdjustedHeightType }
     *     
     */
    public void setAdjustedHeight(AdjustedHeightType value) {
        this.adjustedHeight = value;
    }

    /**
     * Gets the value of the handlingUnits property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the handlingUnits property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getHandlingUnits().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link HandlingUnitsType }
     * 
     * 
     */
    public List<HandlingUnitsType> getHandlingUnits() {
        if (handlingUnits == null) {
            handlingUnits = new ArrayList<HandlingUnitsType>();
        }
        return this.handlingUnits;
    }

}

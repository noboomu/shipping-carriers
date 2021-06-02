
package com.ups.xmlschema.xoltws.rate.v1;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for FRSShipmentType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FRSShipmentType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="TransportationCharges" type="{http://www.ups.com/XMLSchema/XOLTWS/Rate/v1.1}TransportationChargesType"/&gt;
 *         &lt;element name="FreightDensityRate" type="{http://www.ups.com/XMLSchema/XOLTWS/Rate/v1.1}FreightDensityRateType" minOccurs="0"/&gt;
 *         &lt;element name="HandlingUnits" type="{http://www.ups.com/XMLSchema/XOLTWS/Rate/v1.1}HandlingUnitsResponseType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FRSShipmentType", propOrder = {
    "transportationCharges",
    "freightDensityRate",
    "handlingUnits"
})
public class FRSShipmentType {

    @XmlElement(name = "TransportationCharges", required = true)
    protected TransportationChargesType transportationCharges;
    @XmlElement(name = "FreightDensityRate")
    protected FreightDensityRateType freightDensityRate;
    @XmlElement(name = "HandlingUnits")
    protected List<HandlingUnitsResponseType> handlingUnits;

    /**
     * Gets the value of the transportationCharges property.
     * 
     * @return
     *     possible object is
     *     {@link TransportationChargesType }
     *     
     */
    public TransportationChargesType getTransportationCharges() {
        return transportationCharges;
    }

    /**
     * Sets the value of the transportationCharges property.
     * 
     * @param value
     *     allowed object is
     *     {@link TransportationChargesType }
     *     
     */
    public void setTransportationCharges(TransportationChargesType value) {
        this.transportationCharges = value;
    }

    /**
     * Gets the value of the freightDensityRate property.
     * 
     * @return
     *     possible object is
     *     {@link FreightDensityRateType }
     *     
     */
    public FreightDensityRateType getFreightDensityRate() {
        return freightDensityRate;
    }

    /**
     * Sets the value of the freightDensityRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link FreightDensityRateType }
     *     
     */
    public void setFreightDensityRate(FreightDensityRateType value) {
        this.freightDensityRate = value;
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
     * {@link HandlingUnitsResponseType }
     * 
     * 
     */
    public List<HandlingUnitsResponseType> getHandlingUnits() {
        if (handlingUnits == null) {
            handlingUnits = new ArrayList<HandlingUnitsResponseType>();
        }
        return this.handlingUnits;
    }

}

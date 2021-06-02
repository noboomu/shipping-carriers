
package com.fedex.ws.ship.v26;

import java.math.BigDecimal;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Documents the kind and quantity of an individual hazardous commodity in a package.
 * 
 * <p>Java class for ValidatedHazardousCommodityContent complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ValidatedHazardousCommodityContent"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Description" type="{http://fedex.com/ws/ship/v26}ValidatedHazardousCommodityDescription" minOccurs="0"/&gt;
 *         &lt;element name="Quantity" type="{http://fedex.com/ws/ship/v26}HazardousCommodityQuantityDetail" minOccurs="0"/&gt;
 *         &lt;element name="MassPoints" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="Options" type="{http://fedex.com/ws/ship/v26}HazardousCommodityOptionDetail" minOccurs="0"/&gt;
 *         &lt;element name="NetExplosiveDetail" type="{http://fedex.com/ws/ship/v26}NetExplosiveDetail" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ValidatedHazardousCommodityContent", propOrder = {
    "description",
    "quantity",
    "massPoints",
    "options",
    "netExplosiveDetail"
})
public class ValidatedHazardousCommodityContent {

    @XmlElement(name = "Description")
    protected ValidatedHazardousCommodityDescription description;
    @XmlElement(name = "Quantity")
    protected HazardousCommodityQuantityDetail quantity;
    @XmlElement(name = "MassPoints")
    protected BigDecimal massPoints;
    @XmlElement(name = "Options")
    protected HazardousCommodityOptionDetail options;
    @XmlElement(name = "NetExplosiveDetail")
    protected NetExplosiveDetail netExplosiveDetail;

    /**
     * Gets the value of the description property.
     * 
     * @return
     *     possible object is
     *     {@link ValidatedHazardousCommodityDescription }
     *     
     */
    public ValidatedHazardousCommodityDescription getDescription() {
        return description;
    }

    /**
     * Sets the value of the description property.
     * 
     * @param value
     *     allowed object is
     *     {@link ValidatedHazardousCommodityDescription }
     *     
     */
    public void setDescription(ValidatedHazardousCommodityDescription value) {
        this.description = value;
    }

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

    /**
     * Gets the value of the massPoints property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMassPoints() {
        return massPoints;
    }

    /**
     * Sets the value of the massPoints property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMassPoints(BigDecimal value) {
        this.massPoints = value;
    }

    /**
     * Gets the value of the options property.
     * 
     * @return
     *     possible object is
     *     {@link HazardousCommodityOptionDetail }
     *     
     */
    public HazardousCommodityOptionDetail getOptions() {
        return options;
    }

    /**
     * Sets the value of the options property.
     * 
     * @param value
     *     allowed object is
     *     {@link HazardousCommodityOptionDetail }
     *     
     */
    public void setOptions(HazardousCommodityOptionDetail value) {
        this.options = value;
    }

    /**
     * Gets the value of the netExplosiveDetail property.
     * 
     * @return
     *     possible object is
     *     {@link NetExplosiveDetail }
     *     
     */
    public NetExplosiveDetail getNetExplosiveDetail() {
        return netExplosiveDetail;
    }

    /**
     * Sets the value of the netExplosiveDetail property.
     * 
     * @param value
     *     allowed object is
     *     {@link NetExplosiveDetail }
     *     
     */
    public void setNetExplosiveDetail(NetExplosiveDetail value) {
        this.netExplosiveDetail = value;
    }

}

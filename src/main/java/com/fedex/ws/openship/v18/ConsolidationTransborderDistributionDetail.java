
package com.fedex.ws.openship.v18;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Specifies consolidation data for a tranborder distribution shipment. This is data that can be provided by the customer at the consolidation creation time.
 * 
 * <p>Java class for ConsolidationTransborderDistributionDetail complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ConsolidationTransborderDistributionDetail"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="SpecialServicesRequested" type="{http://fedex.com/ws/openship/v18}TransborderDistributionSpecialServicesRequested" minOccurs="0"/&gt;
 *         &lt;element name="Routing" type="{http://fedex.com/ws/openship/v18}TransborderDistributionRoutingType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ConsolidationTransborderDistributionDetail", propOrder = {
    "specialServicesRequested",
    "routing"
})
public class ConsolidationTransborderDistributionDetail {

    @XmlElement(name = "SpecialServicesRequested")
    protected TransborderDistributionSpecialServicesRequested specialServicesRequested;
    @XmlElement(name = "Routing")
    @XmlSchemaType(name = "string")
    protected TransborderDistributionRoutingType routing;

    /**
     * Gets the value of the specialServicesRequested property.
     * 
     * @return
     *     possible object is
     *     {@link TransborderDistributionSpecialServicesRequested }
     *     
     */
    public TransborderDistributionSpecialServicesRequested getSpecialServicesRequested() {
        return specialServicesRequested;
    }

    /**
     * Sets the value of the specialServicesRequested property.
     * 
     * @param value
     *     allowed object is
     *     {@link TransborderDistributionSpecialServicesRequested }
     *     
     */
    public void setSpecialServicesRequested(TransborderDistributionSpecialServicesRequested value) {
        this.specialServicesRequested = value;
    }

    /**
     * Gets the value of the routing property.
     * 
     * @return
     *     possible object is
     *     {@link TransborderDistributionRoutingType }
     *     
     */
    public TransborderDistributionRoutingType getRouting() {
        return routing;
    }

    /**
     * Sets the value of the routing property.
     * 
     * @param value
     *     allowed object is
     *     {@link TransborderDistributionRoutingType }
     *     
     */
    public void setRouting(TransborderDistributionRoutingType value) {
        this.routing = value;
    }

}

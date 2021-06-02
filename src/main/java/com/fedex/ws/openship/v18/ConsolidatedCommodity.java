
package com.fedex.ws.openship.v18;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ConsolidatedCommodity complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ConsolidatedCommodity"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="DestinationDetail" type="{http://fedex.com/ws/openship/v18}ConsolidatedCommodityDestinationDetail" minOccurs="0"/&gt;
 *         &lt;element name="Commodity" type="{http://fedex.com/ws/openship/v18}Commodity" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ConsolidatedCommodity", propOrder = {
    "destinationDetail",
    "commodity"
})
public class ConsolidatedCommodity {

    @XmlElement(name = "DestinationDetail")
    protected ConsolidatedCommodityDestinationDetail destinationDetail;
    @XmlElement(name = "Commodity")
    protected Commodity commodity;

    /**
     * Gets the value of the destinationDetail property.
     * 
     * @return
     *     possible object is
     *     {@link ConsolidatedCommodityDestinationDetail }
     *     
     */
    public ConsolidatedCommodityDestinationDetail getDestinationDetail() {
        return destinationDetail;
    }

    /**
     * Sets the value of the destinationDetail property.
     * 
     * @param value
     *     allowed object is
     *     {@link ConsolidatedCommodityDestinationDetail }
     *     
     */
    public void setDestinationDetail(ConsolidatedCommodityDestinationDetail value) {
        this.destinationDetail = value;
    }

    /**
     * Gets the value of the commodity property.
     * 
     * @return
     *     possible object is
     *     {@link Commodity }
     *     
     */
    public Commodity getCommodity() {
        return commodity;
    }

    /**
     * Sets the value of the commodity property.
     * 
     * @param value
     *     allowed object is
     *     {@link Commodity }
     *     
     */
    public void setCommodity(Commodity value) {
        this.commodity = value;
    }

}


package com.fedex.ws.openship.v18;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Provides data about the consolidated commodities.
 * 
 * <p>Java class for ConsolidatedCommoditiesSummaryDetail complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ConsolidatedCommoditiesSummaryDetail"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="TotalCustomsValue" type="{http://fedex.com/ws/openship/v18}Money" minOccurs="0"/&gt;
 *         &lt;element name="ConsolidatedCommodities" type="{http://fedex.com/ws/openship/v18}ConsolidatedCommodityDetail" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ConsolidatedCommoditiesSummaryDetail", propOrder = {
    "totalCustomsValue",
    "consolidatedCommodities"
})
public class ConsolidatedCommoditiesSummaryDetail {

    @XmlElement(name = "TotalCustomsValue")
    protected Money totalCustomsValue;
    @XmlElement(name = "ConsolidatedCommodities")
    protected List<ConsolidatedCommodityDetail> consolidatedCommodities;

    /**
     * Gets the value of the totalCustomsValue property.
     * 
     * @return
     *     possible object is
     *     {@link Money }
     *     
     */
    public Money getTotalCustomsValue() {
        return totalCustomsValue;
    }

    /**
     * Sets the value of the totalCustomsValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link Money }
     *     
     */
    public void setTotalCustomsValue(Money value) {
        this.totalCustomsValue = value;
    }

    /**
     * Gets the value of the consolidatedCommodities property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the consolidatedCommodities property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getConsolidatedCommodities().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ConsolidatedCommodityDetail }
     * 
     * 
     */
    public List<ConsolidatedCommodityDetail> getConsolidatedCommodities() {
        if (consolidatedCommodities == null) {
            consolidatedCommodities = new ArrayList<ConsolidatedCommodityDetail>();
        }
        return this.consolidatedCommodities;
    }

}

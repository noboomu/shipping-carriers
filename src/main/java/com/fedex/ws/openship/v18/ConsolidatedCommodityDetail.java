
package com.fedex.ws.openship.v18;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Represents all commodity data (summary and line items) within a consolidation.
 * 
 * <p>Java class for ConsolidatedCommodityDetail complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ConsolidatedCommodityDetail"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="GroupDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="SubtotalQuantity" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="SubtotalCustomsValue" type="{http://fedex.com/ws/openship/v18}Money" minOccurs="0"/&gt;
 *         &lt;element name="Commodities" type="{http://fedex.com/ws/openship/v18}ConsolidatedCommodity" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ConsolidatedCommodityDetail", propOrder = {
    "groupDescription",
    "subtotalQuantity",
    "subtotalCustomsValue",
    "commodities"
})
public class ConsolidatedCommodityDetail {

    @XmlElement(name = "GroupDescription")
    protected String groupDescription;
    @XmlElement(name = "SubtotalQuantity")
    protected BigDecimal subtotalQuantity;
    @XmlElement(name = "SubtotalCustomsValue")
    protected Money subtotalCustomsValue;
    @XmlElement(name = "Commodities")
    protected List<ConsolidatedCommodity> commodities;

    /**
     * Gets the value of the groupDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGroupDescription() {
        return groupDescription;
    }

    /**
     * Sets the value of the groupDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGroupDescription(String value) {
        this.groupDescription = value;
    }

    /**
     * Gets the value of the subtotalQuantity property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getSubtotalQuantity() {
        return subtotalQuantity;
    }

    /**
     * Sets the value of the subtotalQuantity property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setSubtotalQuantity(BigDecimal value) {
        this.subtotalQuantity = value;
    }

    /**
     * Gets the value of the subtotalCustomsValue property.
     * 
     * @return
     *     possible object is
     *     {@link Money }
     *     
     */
    public Money getSubtotalCustomsValue() {
        return subtotalCustomsValue;
    }

    /**
     * Sets the value of the subtotalCustomsValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link Money }
     *     
     */
    public void setSubtotalCustomsValue(Money value) {
        this.subtotalCustomsValue = value;
    }

    /**
     * Gets the value of the commodities property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the commodities property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCommodities().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ConsolidatedCommodity }
     * 
     * 
     */
    public List<ConsolidatedCommodity> getCommodities() {
        if (commodities == null) {
            commodities = new ArrayList<ConsolidatedCommodity>();
        }
        return this.commodities;
    }

}

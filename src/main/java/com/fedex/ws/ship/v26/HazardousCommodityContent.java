
package com.fedex.ws.ship.v26;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Documents the kind and quantity of an individual hazardous commodity in a package.
 * 
 * <p>Java class for HazardousCommodityContent complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="HazardousCommodityContent"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Description" type="{http://fedex.com/ws/ship/v26}HazardousCommodityDescription" minOccurs="0"/&gt;
 *         &lt;element name="Quantity" type="{http://fedex.com/ws/ship/v26}HazardousCommodityQuantityDetail" minOccurs="0"/&gt;
 *         &lt;element name="InnerReceptacles" type="{http://fedex.com/ws/ship/v26}HazardousCommodityInnerReceptacleDetail" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="Options" type="{http://fedex.com/ws/ship/v26}HazardousCommodityOptionDetail" minOccurs="0"/&gt;
 *         &lt;element name="RadionuclideDetail" type="{http://fedex.com/ws/ship/v26}RadionuclideDetail" minOccurs="0"/&gt;
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
@XmlType(name = "HazardousCommodityContent", propOrder = {
    "description",
    "quantity",
    "innerReceptacles",
    "options",
    "radionuclideDetail",
    "netExplosiveDetail"
})
public class HazardousCommodityContent {

    @XmlElement(name = "Description")
    protected HazardousCommodityDescription description;
    @XmlElement(name = "Quantity")
    protected HazardousCommodityQuantityDetail quantity;
    @XmlElement(name = "InnerReceptacles")
    protected List<HazardousCommodityInnerReceptacleDetail> innerReceptacles;
    @XmlElement(name = "Options")
    protected HazardousCommodityOptionDetail options;
    @XmlElement(name = "RadionuclideDetail")
    protected RadionuclideDetail radionuclideDetail;
    @XmlElement(name = "NetExplosiveDetail")
    protected NetExplosiveDetail netExplosiveDetail;

    /**
     * Gets the value of the description property.
     * 
     * @return
     *     possible object is
     *     {@link HazardousCommodityDescription }
     *     
     */
    public HazardousCommodityDescription getDescription() {
        return description;
    }

    /**
     * Sets the value of the description property.
     * 
     * @param value
     *     allowed object is
     *     {@link HazardousCommodityDescription }
     *     
     */
    public void setDescription(HazardousCommodityDescription value) {
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
     * Gets the value of the innerReceptacles property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the innerReceptacles property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getInnerReceptacles().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link HazardousCommodityInnerReceptacleDetail }
     * 
     * 
     */
    public List<HazardousCommodityInnerReceptacleDetail> getInnerReceptacles() {
        if (innerReceptacles == null) {
            innerReceptacles = new ArrayList<HazardousCommodityInnerReceptacleDetail>();
        }
        return this.innerReceptacles;
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
     * Gets the value of the radionuclideDetail property.
     * 
     * @return
     *     possible object is
     *     {@link RadionuclideDetail }
     *     
     */
    public RadionuclideDetail getRadionuclideDetail() {
        return radionuclideDetail;
    }

    /**
     * Sets the value of the radionuclideDetail property.
     * 
     * @param value
     *     allowed object is
     *     {@link RadionuclideDetail }
     *     
     */
    public void setRadionuclideDetail(RadionuclideDetail value) {
        this.radionuclideDetail = value;
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
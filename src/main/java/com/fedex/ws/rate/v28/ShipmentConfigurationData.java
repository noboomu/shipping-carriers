
package com.fedex.ws.rate.v28;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Specifies data structures that may be re-used multiple times with s single shipment.
 * 
 * <p>Java class for ShipmentConfigurationData complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ShipmentConfigurationData"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="DangerousGoodsPackageConfigurations" type="{http://fedex.com/ws/rate/v28}DangerousGoodsDetail" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ShipmentConfigurationData", propOrder = {
    "dangerousGoodsPackageConfigurations"
})
public class ShipmentConfigurationData {

    @XmlElement(name = "DangerousGoodsPackageConfigurations")
    protected List<DangerousGoodsDetail> dangerousGoodsPackageConfigurations;

    /**
     * Gets the value of the dangerousGoodsPackageConfigurations property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the dangerousGoodsPackageConfigurations property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDangerousGoodsPackageConfigurations().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DangerousGoodsDetail }
     * 
     * 
     */
    public List<DangerousGoodsDetail> getDangerousGoodsPackageConfigurations() {
        if (dangerousGoodsPackageConfigurations == null) {
            dangerousGoodsPackageConfigurations = new ArrayList<DangerousGoodsDetail>();
        }
        return this.dangerousGoodsPackageConfigurations;
    }

}

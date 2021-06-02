
package com.fedex.ws.openship.v18;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Computed shipment level hazardous commodity information.
 * 
 * <p>Java class for CompletedHazardousShipmentDetail complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CompletedHazardousShipmentDetail"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="HazardousSummaryDetail" type="{http://fedex.com/ws/openship/v18}CompletedHazardousSummaryDetail" minOccurs="0"/&gt;
 *         &lt;element name="DryIceDetail" type="{http://fedex.com/ws/openship/v18}ShipmentDryIceDetail" minOccurs="0"/&gt;
 *         &lt;element name="AdrLicense" type="{http://fedex.com/ws/openship/v18}AdrLicenseDetail" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CompletedHazardousShipmentDetail", propOrder = {
    "hazardousSummaryDetail",
    "dryIceDetail",
    "adrLicense"
})
public class CompletedHazardousShipmentDetail {

    @XmlElement(name = "HazardousSummaryDetail")
    protected CompletedHazardousSummaryDetail hazardousSummaryDetail;
    @XmlElement(name = "DryIceDetail")
    protected ShipmentDryIceDetail dryIceDetail;
    @XmlElement(name = "AdrLicense")
    protected AdrLicenseDetail adrLicense;

    /**
     * Gets the value of the hazardousSummaryDetail property.
     * 
     * @return
     *     possible object is
     *     {@link CompletedHazardousSummaryDetail }
     *     
     */
    public CompletedHazardousSummaryDetail getHazardousSummaryDetail() {
        return hazardousSummaryDetail;
    }

    /**
     * Sets the value of the hazardousSummaryDetail property.
     * 
     * @param value
     *     allowed object is
     *     {@link CompletedHazardousSummaryDetail }
     *     
     */
    public void setHazardousSummaryDetail(CompletedHazardousSummaryDetail value) {
        this.hazardousSummaryDetail = value;
    }

    /**
     * Gets the value of the dryIceDetail property.
     * 
     * @return
     *     possible object is
     *     {@link ShipmentDryIceDetail }
     *     
     */
    public ShipmentDryIceDetail getDryIceDetail() {
        return dryIceDetail;
    }

    /**
     * Sets the value of the dryIceDetail property.
     * 
     * @param value
     *     allowed object is
     *     {@link ShipmentDryIceDetail }
     *     
     */
    public void setDryIceDetail(ShipmentDryIceDetail value) {
        this.dryIceDetail = value;
    }

    /**
     * Gets the value of the adrLicense property.
     * 
     * @return
     *     possible object is
     *     {@link AdrLicenseDetail }
     *     
     */
    public AdrLicenseDetail getAdrLicense() {
        return adrLicense;
    }

    /**
     * Sets the value of the adrLicense property.
     * 
     * @param value
     *     allowed object is
     *     {@link AdrLicenseDetail }
     *     
     */
    public void setAdrLicense(AdrLicenseDetail value) {
        this.adrLicense = value;
    }

}

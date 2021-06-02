
package com.fedex.ws.openship.v18;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * These special services are available at the package level for some or all service types. If the shipper is requesting a special service which requires additional data, the package special service type must be present in the specialServiceTypes collection, and the supporting detail must be provided in the appropriate sub-object below.
 * 
 * <p>Java class for PackageSpecialServicesRequested complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PackageSpecialServicesRequested"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="SpecialServiceTypes" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="CodDetail" type="{http://fedex.com/ws/openship/v18}CodDetail" minOccurs="0"/&gt;
 *         &lt;element name="DangerousGoodsDetail" type="{http://fedex.com/ws/openship/v18}DangerousGoodsDetail" minOccurs="0"/&gt;
 *         &lt;element name="BatteryDetails" type="{http://fedex.com/ws/openship/v18}BatteryClassificationDetail" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="DryIceWeight" type="{http://fedex.com/ws/openship/v18}Weight" minOccurs="0"/&gt;
 *         &lt;element name="SignatureOptionDetail" type="{http://fedex.com/ws/openship/v18}SignatureOptionDetail" minOccurs="0"/&gt;
 *         &lt;element name="PieceCountVerificationBoxCount" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" minOccurs="0"/&gt;
 *         &lt;element name="PriorityAlertDetail" type="{http://fedex.com/ws/openship/v18}PriorityAlertDetail" minOccurs="0"/&gt;
 *         &lt;element name="AlcoholDetail" type="{http://fedex.com/ws/openship/v18}AlcoholDetail" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PackageSpecialServicesRequested", propOrder = {
    "specialServiceTypes",
    "codDetail",
    "dangerousGoodsDetail",
    "batteryDetails",
    "dryIceWeight",
    "signatureOptionDetail",
    "pieceCountVerificationBoxCount",
    "priorityAlertDetail",
    "alcoholDetail"
})
public class PackageSpecialServicesRequested {

    @XmlElement(name = "SpecialServiceTypes")
    protected List<String> specialServiceTypes;
    @XmlElement(name = "CodDetail")
    protected CodDetail codDetail;
    @XmlElement(name = "DangerousGoodsDetail")
    protected DangerousGoodsDetail dangerousGoodsDetail;
    @XmlElement(name = "BatteryDetails")
    protected List<BatteryClassificationDetail> batteryDetails;
    @XmlElement(name = "DryIceWeight")
    protected Weight dryIceWeight;
    @XmlElement(name = "SignatureOptionDetail")
    protected SignatureOptionDetail signatureOptionDetail;
    @XmlElement(name = "PieceCountVerificationBoxCount")
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger pieceCountVerificationBoxCount;
    @XmlElement(name = "PriorityAlertDetail")
    protected PriorityAlertDetail priorityAlertDetail;
    @XmlElement(name = "AlcoholDetail")
    protected AlcoholDetail alcoholDetail;

    /**
     * Gets the value of the specialServiceTypes property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the specialServiceTypes property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSpecialServiceTypes().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getSpecialServiceTypes() {
        if (specialServiceTypes == null) {
            specialServiceTypes = new ArrayList<String>();
        }
        return this.specialServiceTypes;
    }

    /**
     * Gets the value of the codDetail property.
     * 
     * @return
     *     possible object is
     *     {@link CodDetail }
     *     
     */
    public CodDetail getCodDetail() {
        return codDetail;
    }

    /**
     * Sets the value of the codDetail property.
     * 
     * @param value
     *     allowed object is
     *     {@link CodDetail }
     *     
     */
    public void setCodDetail(CodDetail value) {
        this.codDetail = value;
    }

    /**
     * Gets the value of the dangerousGoodsDetail property.
     * 
     * @return
     *     possible object is
     *     {@link DangerousGoodsDetail }
     *     
     */
    public DangerousGoodsDetail getDangerousGoodsDetail() {
        return dangerousGoodsDetail;
    }

    /**
     * Sets the value of the dangerousGoodsDetail property.
     * 
     * @param value
     *     allowed object is
     *     {@link DangerousGoodsDetail }
     *     
     */
    public void setDangerousGoodsDetail(DangerousGoodsDetail value) {
        this.dangerousGoodsDetail = value;
    }

    /**
     * Gets the value of the batteryDetails property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the batteryDetails property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBatteryDetails().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BatteryClassificationDetail }
     * 
     * 
     */
    public List<BatteryClassificationDetail> getBatteryDetails() {
        if (batteryDetails == null) {
            batteryDetails = new ArrayList<BatteryClassificationDetail>();
        }
        return this.batteryDetails;
    }

    /**
     * Gets the value of the dryIceWeight property.
     * 
     * @return
     *     possible object is
     *     {@link Weight }
     *     
     */
    public Weight getDryIceWeight() {
        return dryIceWeight;
    }

    /**
     * Sets the value of the dryIceWeight property.
     * 
     * @param value
     *     allowed object is
     *     {@link Weight }
     *     
     */
    public void setDryIceWeight(Weight value) {
        this.dryIceWeight = value;
    }

    /**
     * Gets the value of the signatureOptionDetail property.
     * 
     * @return
     *     possible object is
     *     {@link SignatureOptionDetail }
     *     
     */
    public SignatureOptionDetail getSignatureOptionDetail() {
        return signatureOptionDetail;
    }

    /**
     * Sets the value of the signatureOptionDetail property.
     * 
     * @param value
     *     allowed object is
     *     {@link SignatureOptionDetail }
     *     
     */
    public void setSignatureOptionDetail(SignatureOptionDetail value) {
        this.signatureOptionDetail = value;
    }

    /**
     * Gets the value of the pieceCountVerificationBoxCount property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getPieceCountVerificationBoxCount() {
        return pieceCountVerificationBoxCount;
    }

    /**
     * Sets the value of the pieceCountVerificationBoxCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setPieceCountVerificationBoxCount(BigInteger value) {
        this.pieceCountVerificationBoxCount = value;
    }

    /**
     * Gets the value of the priorityAlertDetail property.
     * 
     * @return
     *     possible object is
     *     {@link PriorityAlertDetail }
     *     
     */
    public PriorityAlertDetail getPriorityAlertDetail() {
        return priorityAlertDetail;
    }

    /**
     * Sets the value of the priorityAlertDetail property.
     * 
     * @param value
     *     allowed object is
     *     {@link PriorityAlertDetail }
     *     
     */
    public void setPriorityAlertDetail(PriorityAlertDetail value) {
        this.priorityAlertDetail = value;
    }

    /**
     * Gets the value of the alcoholDetail property.
     * 
     * @return
     *     possible object is
     *     {@link AlcoholDetail }
     *     
     */
    public AlcoholDetail getAlcoholDetail() {
        return alcoholDetail;
    }

    /**
     * Sets the value of the alcoholDetail property.
     * 
     * @param value
     *     allowed object is
     *     {@link AlcoholDetail }
     *     
     */
    public void setAlcoholDetail(AlcoholDetail value) {
        this.alcoholDetail = value;
    }

}

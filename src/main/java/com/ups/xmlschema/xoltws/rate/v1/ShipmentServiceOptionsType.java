
package com.ups.xmlschema.xoltws.rate.v1;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ShipmentServiceOptionsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ShipmentServiceOptionsType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="SaturdayPickupIndicator" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="SaturdayDeliveryIndicator" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="AccessPointCOD" type="{http://www.ups.com/XMLSchema/XOLTWS/Rate/v1.1}ShipmentServiceOptionsAccessPointCODType" minOccurs="0"/&gt;
 *         &lt;element name="DeliverToAddresseeOnlyIndicator" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="DirectDeliveryOnlyIndicator" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="COD" type="{http://www.ups.com/XMLSchema/XOLTWS/Rate/v1.1}CODType" minOccurs="0"/&gt;
 *         &lt;element name="DeliveryConfirmation" type="{http://www.ups.com/XMLSchema/XOLTWS/Rate/v1.1}DeliveryConfirmationType" minOccurs="0"/&gt;
 *         &lt;element name="ReturnOfDocumentIndicator" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="UPScarbonneutralIndicator" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CertificateOfOriginIndicator" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="PickupOptions" type="{http://www.ups.com/XMLSchema/XOLTWS/Rate/v1.1}PickupOptionsType" minOccurs="0"/&gt;
 *         &lt;element name="DeliveryOptions" type="{http://www.ups.com/XMLSchema/XOLTWS/Rate/v1.1}DeliveryOptionsType" minOccurs="0"/&gt;
 *         &lt;element name="RestrictedArticles" type="{http://www.ups.com/XMLSchema/XOLTWS/Rate/v1.1}RestrictedArticlesType" minOccurs="0"/&gt;
 *         &lt;element name="ShipperExportDeclarationIndicator" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CommercialInvoiceRemovalIndicator" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ImportControl" type="{http://www.ups.com/XMLSchema/XOLTWS/Rate/v1.1}ImportControlType" minOccurs="0"/&gt;
 *         &lt;element name="ReturnService" type="{http://www.ups.com/XMLSchema/XOLTWS/Rate/v1.1}ReturnServiceType" minOccurs="0"/&gt;
 *         &lt;element name="SDLShipmentIndicator" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="EPRAIndicator" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="InsideDelivery" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ItemDisposalIndicator" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ShipmentServiceOptionsType", propOrder = {
    "saturdayPickupIndicator",
    "saturdayDeliveryIndicator",
    "accessPointCOD",
    "deliverToAddresseeOnlyIndicator",
    "directDeliveryOnlyIndicator",
    "cod",
    "deliveryConfirmation",
    "returnOfDocumentIndicator",
    "upScarbonneutralIndicator",
    "certificateOfOriginIndicator",
    "pickupOptions",
    "deliveryOptions",
    "restrictedArticles",
    "shipperExportDeclarationIndicator",
    "commercialInvoiceRemovalIndicator",
    "importControl",
    "returnService",
    "sdlShipmentIndicator",
    "epraIndicator",
    "insideDelivery",
    "itemDisposalIndicator"
})
public class ShipmentServiceOptionsType {

    @XmlElement(name = "SaturdayPickupIndicator")
    protected String saturdayPickupIndicator;
    @XmlElement(name = "SaturdayDeliveryIndicator")
    protected String saturdayDeliveryIndicator;
    @XmlElement(name = "AccessPointCOD")
    protected ShipmentServiceOptionsAccessPointCODType accessPointCOD;
    @XmlElement(name = "DeliverToAddresseeOnlyIndicator")
    protected String deliverToAddresseeOnlyIndicator;
    @XmlElement(name = "DirectDeliveryOnlyIndicator")
    protected String directDeliveryOnlyIndicator;
    @XmlElement(name = "COD")
    protected CODType cod;
    @XmlElement(name = "DeliveryConfirmation")
    protected DeliveryConfirmationType deliveryConfirmation;
    @XmlElement(name = "ReturnOfDocumentIndicator")
    protected String returnOfDocumentIndicator;
    @XmlElement(name = "UPScarbonneutralIndicator")
    protected String upScarbonneutralIndicator;
    @XmlElement(name = "CertificateOfOriginIndicator")
    protected String certificateOfOriginIndicator;
    @XmlElement(name = "PickupOptions")
    protected PickupOptionsType pickupOptions;
    @XmlElement(name = "DeliveryOptions")
    protected DeliveryOptionsType deliveryOptions;
    @XmlElement(name = "RestrictedArticles")
    protected RestrictedArticlesType restrictedArticles;
    @XmlElement(name = "ShipperExportDeclarationIndicator")
    protected String shipperExportDeclarationIndicator;
    @XmlElement(name = "CommercialInvoiceRemovalIndicator")
    protected String commercialInvoiceRemovalIndicator;
    @XmlElement(name = "ImportControl")
    protected ImportControlType importControl;
    @XmlElement(name = "ReturnService")
    protected ReturnServiceType returnService;
    @XmlElement(name = "SDLShipmentIndicator")
    protected String sdlShipmentIndicator;
    @XmlElement(name = "EPRAIndicator")
    protected String epraIndicator;
    @XmlElement(name = "InsideDelivery")
    protected String insideDelivery;
    @XmlElement(name = "ItemDisposalIndicator")
    protected String itemDisposalIndicator;

    /**
     * Gets the value of the saturdayPickupIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSaturdayPickupIndicator() {
        return saturdayPickupIndicator;
    }

    /**
     * Sets the value of the saturdayPickupIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSaturdayPickupIndicator(String value) {
        this.saturdayPickupIndicator = value;
    }

    /**
     * Gets the value of the saturdayDeliveryIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSaturdayDeliveryIndicator() {
        return saturdayDeliveryIndicator;
    }

    /**
     * Sets the value of the saturdayDeliveryIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSaturdayDeliveryIndicator(String value) {
        this.saturdayDeliveryIndicator = value;
    }

    /**
     * Gets the value of the accessPointCOD property.
     * 
     * @return
     *     possible object is
     *     {@link ShipmentServiceOptionsAccessPointCODType }
     *     
     */
    public ShipmentServiceOptionsAccessPointCODType getAccessPointCOD() {
        return accessPointCOD;
    }

    /**
     * Sets the value of the accessPointCOD property.
     * 
     * @param value
     *     allowed object is
     *     {@link ShipmentServiceOptionsAccessPointCODType }
     *     
     */
    public void setAccessPointCOD(ShipmentServiceOptionsAccessPointCODType value) {
        this.accessPointCOD = value;
    }

    /**
     * Gets the value of the deliverToAddresseeOnlyIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDeliverToAddresseeOnlyIndicator() {
        return deliverToAddresseeOnlyIndicator;
    }

    /**
     * Sets the value of the deliverToAddresseeOnlyIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDeliverToAddresseeOnlyIndicator(String value) {
        this.deliverToAddresseeOnlyIndicator = value;
    }

    /**
     * Gets the value of the directDeliveryOnlyIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDirectDeliveryOnlyIndicator() {
        return directDeliveryOnlyIndicator;
    }

    /**
     * Sets the value of the directDeliveryOnlyIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDirectDeliveryOnlyIndicator(String value) {
        this.directDeliveryOnlyIndicator = value;
    }

    /**
     * Gets the value of the cod property.
     * 
     * @return
     *     possible object is
     *     {@link CODType }
     *     
     */
    public CODType getCOD() {
        return cod;
    }

    /**
     * Sets the value of the cod property.
     * 
     * @param value
     *     allowed object is
     *     {@link CODType }
     *     
     */
    public void setCOD(CODType value) {
        this.cod = value;
    }

    /**
     * Gets the value of the deliveryConfirmation property.
     * 
     * @return
     *     possible object is
     *     {@link DeliveryConfirmationType }
     *     
     */
    public DeliveryConfirmationType getDeliveryConfirmation() {
        return deliveryConfirmation;
    }

    /**
     * Sets the value of the deliveryConfirmation property.
     * 
     * @param value
     *     allowed object is
     *     {@link DeliveryConfirmationType }
     *     
     */
    public void setDeliveryConfirmation(DeliveryConfirmationType value) {
        this.deliveryConfirmation = value;
    }

    /**
     * Gets the value of the returnOfDocumentIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReturnOfDocumentIndicator() {
        return returnOfDocumentIndicator;
    }

    /**
     * Sets the value of the returnOfDocumentIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReturnOfDocumentIndicator(String value) {
        this.returnOfDocumentIndicator = value;
    }

    /**
     * Gets the value of the upScarbonneutralIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUPScarbonneutralIndicator() {
        return upScarbonneutralIndicator;
    }

    /**
     * Sets the value of the upScarbonneutralIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUPScarbonneutralIndicator(String value) {
        this.upScarbonneutralIndicator = value;
    }

    /**
     * Gets the value of the certificateOfOriginIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCertificateOfOriginIndicator() {
        return certificateOfOriginIndicator;
    }

    /**
     * Sets the value of the certificateOfOriginIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCertificateOfOriginIndicator(String value) {
        this.certificateOfOriginIndicator = value;
    }

    /**
     * Gets the value of the pickupOptions property.
     * 
     * @return
     *     possible object is
     *     {@link PickupOptionsType }
     *     
     */
    public PickupOptionsType getPickupOptions() {
        return pickupOptions;
    }

    /**
     * Sets the value of the pickupOptions property.
     * 
     * @param value
     *     allowed object is
     *     {@link PickupOptionsType }
     *     
     */
    public void setPickupOptions(PickupOptionsType value) {
        this.pickupOptions = value;
    }

    /**
     * Gets the value of the deliveryOptions property.
     * 
     * @return
     *     possible object is
     *     {@link DeliveryOptionsType }
     *     
     */
    public DeliveryOptionsType getDeliveryOptions() {
        return deliveryOptions;
    }

    /**
     * Sets the value of the deliveryOptions property.
     * 
     * @param value
     *     allowed object is
     *     {@link DeliveryOptionsType }
     *     
     */
    public void setDeliveryOptions(DeliveryOptionsType value) {
        this.deliveryOptions = value;
    }

    /**
     * Gets the value of the restrictedArticles property.
     * 
     * @return
     *     possible object is
     *     {@link RestrictedArticlesType }
     *     
     */
    public RestrictedArticlesType getRestrictedArticles() {
        return restrictedArticles;
    }

    /**
     * Sets the value of the restrictedArticles property.
     * 
     * @param value
     *     allowed object is
     *     {@link RestrictedArticlesType }
     *     
     */
    public void setRestrictedArticles(RestrictedArticlesType value) {
        this.restrictedArticles = value;
    }

    /**
     * Gets the value of the shipperExportDeclarationIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShipperExportDeclarationIndicator() {
        return shipperExportDeclarationIndicator;
    }

    /**
     * Sets the value of the shipperExportDeclarationIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShipperExportDeclarationIndicator(String value) {
        this.shipperExportDeclarationIndicator = value;
    }

    /**
     * Gets the value of the commercialInvoiceRemovalIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCommercialInvoiceRemovalIndicator() {
        return commercialInvoiceRemovalIndicator;
    }

    /**
     * Sets the value of the commercialInvoiceRemovalIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCommercialInvoiceRemovalIndicator(String value) {
        this.commercialInvoiceRemovalIndicator = value;
    }

    /**
     * Gets the value of the importControl property.
     * 
     * @return
     *     possible object is
     *     {@link ImportControlType }
     *     
     */
    public ImportControlType getImportControl() {
        return importControl;
    }

    /**
     * Sets the value of the importControl property.
     * 
     * @param value
     *     allowed object is
     *     {@link ImportControlType }
     *     
     */
    public void setImportControl(ImportControlType value) {
        this.importControl = value;
    }

    /**
     * Gets the value of the returnService property.
     * 
     * @return
     *     possible object is
     *     {@link ReturnServiceType }
     *     
     */
    public ReturnServiceType getReturnService() {
        return returnService;
    }

    /**
     * Sets the value of the returnService property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReturnServiceType }
     *     
     */
    public void setReturnService(ReturnServiceType value) {
        this.returnService = value;
    }

    /**
     * Gets the value of the sdlShipmentIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSDLShipmentIndicator() {
        return sdlShipmentIndicator;
    }

    /**
     * Sets the value of the sdlShipmentIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSDLShipmentIndicator(String value) {
        this.sdlShipmentIndicator = value;
    }

    /**
     * Gets the value of the epraIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEPRAIndicator() {
        return epraIndicator;
    }

    /**
     * Sets the value of the epraIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEPRAIndicator(String value) {
        this.epraIndicator = value;
    }

    /**
     * Gets the value of the insideDelivery property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInsideDelivery() {
        return insideDelivery;
    }

    /**
     * Sets the value of the insideDelivery property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInsideDelivery(String value) {
        this.insideDelivery = value;
    }

    /**
     * Gets the value of the itemDisposalIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getItemDisposalIndicator() {
        return itemDisposalIndicator;
    }

    /**
     * Sets the value of the itemDisposalIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setItemDisposalIndicator(String value) {
        this.itemDisposalIndicator = value;
    }

}

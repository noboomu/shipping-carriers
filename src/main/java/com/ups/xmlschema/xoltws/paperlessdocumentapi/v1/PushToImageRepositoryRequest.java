
package com.ups.xmlschema.xoltws.paperlessdocumentapi.v1;

import java.util.ArrayList;
import java.util.List;
import com.ups.xmlschema.xoltws.common.v1.RequestType;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://www.ups.com/XMLSchema/XOLTWS/Common/v1.0}Request"/&gt;
 *         &lt;element name="ShipperNumber" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="FormsHistoryDocumentID" type="{http://www.ups.com/XMLSchema/XOLTWS/PaperlessDocumentAPI/v1.0}FormsHistoryDocIDImageReq"/&gt;
 *         &lt;element name="FormsGroupID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ShipmentIdentifier" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="ShipmentDateAndTime" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ShipmentType" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="PRQConfirmationNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="TrackingNumber" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "request",
    "shipperNumber",
    "formsHistoryDocumentID",
    "formsGroupID",
    "shipmentIdentifier",
    "shipmentDateAndTime",
    "shipmentType",
    "prqConfirmationNumber",
    "trackingNumber"
})
@XmlRootElement(name = "PushToImageRepositoryRequest")
public class PushToImageRepositoryRequest {

    @XmlElement(name = "Request", namespace = "http://www.ups.com/XMLSchema/XOLTWS/Common/v1.0", required = true)
    protected RequestType request;
    @XmlElement(name = "ShipperNumber", required = true)
    protected String shipperNumber;
    @XmlElement(name = "FormsHistoryDocumentID", required = true)
    protected FormsHistoryDocIDImageReq formsHistoryDocumentID;
    @XmlElement(name = "FormsGroupID")
    protected String formsGroupID;
    @XmlElement(name = "ShipmentIdentifier", required = true)
    protected String shipmentIdentifier;
    @XmlElement(name = "ShipmentDateAndTime")
    protected String shipmentDateAndTime;
    @XmlElement(name = "ShipmentType", required = true)
    protected String shipmentType;
    @XmlElement(name = "PRQConfirmationNumber")
    protected String prqConfirmationNumber;
    @XmlElement(name = "TrackingNumber")
    protected List<String> trackingNumber;

    /**
     * Gets the value of the request property.
     * 
     * @return
     *     possible object is
     *     {@link RequestType }
     *     
     */
    public RequestType getRequest() {
        return request;
    }

    /**
     * Sets the value of the request property.
     * 
     * @param value
     *     allowed object is
     *     {@link RequestType }
     *     
     */
    public void setRequest(RequestType value) {
        this.request = value;
    }

    /**
     * Gets the value of the shipperNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShipperNumber() {
        return shipperNumber;
    }

    /**
     * Sets the value of the shipperNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShipperNumber(String value) {
        this.shipperNumber = value;
    }

    /**
     * Gets the value of the formsHistoryDocumentID property.
     * 
     * @return
     *     possible object is
     *     {@link FormsHistoryDocIDImageReq }
     *     
     */
    public FormsHistoryDocIDImageReq getFormsHistoryDocumentID() {
        return formsHistoryDocumentID;
    }

    /**
     * Sets the value of the formsHistoryDocumentID property.
     * 
     * @param value
     *     allowed object is
     *     {@link FormsHistoryDocIDImageReq }
     *     
     */
    public void setFormsHistoryDocumentID(FormsHistoryDocIDImageReq value) {
        this.formsHistoryDocumentID = value;
    }

    /**
     * Gets the value of the formsGroupID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFormsGroupID() {
        return formsGroupID;
    }

    /**
     * Sets the value of the formsGroupID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFormsGroupID(String value) {
        this.formsGroupID = value;
    }

    /**
     * Gets the value of the shipmentIdentifier property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShipmentIdentifier() {
        return shipmentIdentifier;
    }

    /**
     * Sets the value of the shipmentIdentifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShipmentIdentifier(String value) {
        this.shipmentIdentifier = value;
    }

    /**
     * Gets the value of the shipmentDateAndTime property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShipmentDateAndTime() {
        return shipmentDateAndTime;
    }

    /**
     * Sets the value of the shipmentDateAndTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShipmentDateAndTime(String value) {
        this.shipmentDateAndTime = value;
    }

    /**
     * Gets the value of the shipmentType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShipmentType() {
        return shipmentType;
    }

    /**
     * Sets the value of the shipmentType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShipmentType(String value) {
        this.shipmentType = value;
    }

    /**
     * Gets the value of the prqConfirmationNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPRQConfirmationNumber() {
        return prqConfirmationNumber;
    }

    /**
     * Sets the value of the prqConfirmationNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPRQConfirmationNumber(String value) {
        this.prqConfirmationNumber = value;
    }

    /**
     * Gets the value of the trackingNumber property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the trackingNumber property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTrackingNumber().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getTrackingNumber() {
        if (trackingNumber == null) {
            trackingNumber = new ArrayList<String>();
        }
        return this.trackingNumber;
    }

}

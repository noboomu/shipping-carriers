
package com.fedex.ws.vacs.v14;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GetAllSpecialServicesRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GetAllSpecialServicesRequest"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="WebAuthenticationDetail" type="{http://fedex.com/ws/vacs/v14}WebAuthenticationDetail"/&gt;
 *         &lt;element name="ClientDetail" type="{http://fedex.com/ws/vacs/v14}ClientDetail"/&gt;
 *         &lt;element name="TransactionDetail" type="{http://fedex.com/ws/vacs/v14}TransactionDetail" minOccurs="0"/&gt;
 *         &lt;element name="Version" type="{http://fedex.com/ws/vacs/v14}VersionId"/&gt;
 *         &lt;element name="OriginRoutingCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="DestinationRoutingCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="FormId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CarrierCodes" type="{http://fedex.com/ws/vacs/v14}CarrierCodeType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="RequestedShipment" type="{http://fedex.com/ws/vacs/v14}RequestedShipment" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetAllSpecialServicesRequest", propOrder = {
    "webAuthenticationDetail",
    "clientDetail",
    "transactionDetail",
    "version",
    "originRoutingCode",
    "destinationRoutingCode",
    "formId",
    "carrierCodes",
    "requestedShipment"
})
public class GetAllSpecialServicesRequest {

    @XmlElement(name = "WebAuthenticationDetail", required = true)
    protected WebAuthenticationDetail webAuthenticationDetail;
    @XmlElement(name = "ClientDetail", required = true)
    protected ClientDetail clientDetail;
    @XmlElement(name = "TransactionDetail")
    protected TransactionDetail transactionDetail;
    @XmlElement(name = "Version", required = true)
    protected VersionId version;
    @XmlElement(name = "OriginRoutingCode")
    protected String originRoutingCode;
    @XmlElement(name = "DestinationRoutingCode")
    protected String destinationRoutingCode;
    @XmlElement(name = "FormId")
    protected String formId;
    @XmlElement(name = "CarrierCodes")
    @XmlSchemaType(name = "string")
    protected List<CarrierCodeType> carrierCodes;
    @XmlElement(name = "RequestedShipment")
    protected RequestedShipment requestedShipment;

    /**
     * Gets the value of the webAuthenticationDetail property.
     * 
     * @return
     *     possible object is
     *     {@link WebAuthenticationDetail }
     *     
     */
    public WebAuthenticationDetail getWebAuthenticationDetail() {
        return webAuthenticationDetail;
    }

    /**
     * Sets the value of the webAuthenticationDetail property.
     * 
     * @param value
     *     allowed object is
     *     {@link WebAuthenticationDetail }
     *     
     */
    public void setWebAuthenticationDetail(WebAuthenticationDetail value) {
        this.webAuthenticationDetail = value;
    }

    /**
     * Gets the value of the clientDetail property.
     * 
     * @return
     *     possible object is
     *     {@link ClientDetail }
     *     
     */
    public ClientDetail getClientDetail() {
        return clientDetail;
    }

    /**
     * Sets the value of the clientDetail property.
     * 
     * @param value
     *     allowed object is
     *     {@link ClientDetail }
     *     
     */
    public void setClientDetail(ClientDetail value) {
        this.clientDetail = value;
    }

    /**
     * Gets the value of the transactionDetail property.
     * 
     * @return
     *     possible object is
     *     {@link TransactionDetail }
     *     
     */
    public TransactionDetail getTransactionDetail() {
        return transactionDetail;
    }

    /**
     * Sets the value of the transactionDetail property.
     * 
     * @param value
     *     allowed object is
     *     {@link TransactionDetail }
     *     
     */
    public void setTransactionDetail(TransactionDetail value) {
        this.transactionDetail = value;
    }

    /**
     * Gets the value of the version property.
     * 
     * @return
     *     possible object is
     *     {@link VersionId }
     *     
     */
    public VersionId getVersion() {
        return version;
    }

    /**
     * Sets the value of the version property.
     * 
     * @param value
     *     allowed object is
     *     {@link VersionId }
     *     
     */
    public void setVersion(VersionId value) {
        this.version = value;
    }

    /**
     * Gets the value of the originRoutingCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOriginRoutingCode() {
        return originRoutingCode;
    }

    /**
     * Sets the value of the originRoutingCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOriginRoutingCode(String value) {
        this.originRoutingCode = value;
    }

    /**
     * Gets the value of the destinationRoutingCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDestinationRoutingCode() {
        return destinationRoutingCode;
    }

    /**
     * Sets the value of the destinationRoutingCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDestinationRoutingCode(String value) {
        this.destinationRoutingCode = value;
    }

    /**
     * Gets the value of the formId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFormId() {
        return formId;
    }

    /**
     * Sets the value of the formId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFormId(String value) {
        this.formId = value;
    }

    /**
     * Gets the value of the carrierCodes property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the carrierCodes property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCarrierCodes().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CarrierCodeType }
     * 
     * 
     */
    public List<CarrierCodeType> getCarrierCodes() {
        if (carrierCodes == null) {
            carrierCodes = new ArrayList<CarrierCodeType>();
        }
        return this.carrierCodes;
    }

    /**
     * Gets the value of the requestedShipment property.
     * 
     * @return
     *     possible object is
     *     {@link RequestedShipment }
     *     
     */
    public RequestedShipment getRequestedShipment() {
        return requestedShipment;
    }

    /**
     * Sets the value of the requestedShipment property.
     * 
     * @param value
     *     allowed object is
     *     {@link RequestedShipment }
     *     
     */
    public void setRequestedShipment(RequestedShipment value) {
        this.requestedShipment = value;
    }

}

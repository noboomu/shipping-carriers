
package com.fedex.ws.rate.v28;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RateRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RateRequest"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="WebAuthenticationDetail" type="{http://fedex.com/ws/rate/v28}WebAuthenticationDetail"/&gt;
 *         &lt;element name="ClientDetail" type="{http://fedex.com/ws/rate/v28}ClientDetail"/&gt;
 *         &lt;element name="TransactionDetail" type="{http://fedex.com/ws/rate/v28}TransactionDetail" minOccurs="0"/&gt;
 *         &lt;element name="Version" type="{http://fedex.com/ws/rate/v28}VersionId"/&gt;
 *         &lt;element name="ReturnTransitAndCommit" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="CarrierCodes" type="{http://fedex.com/ws/rate/v28}CarrierCodeType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="VariableOptions" type="{http://fedex.com/ws/rate/v28}ServiceOptionType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="ConsolidationKey" type="{http://fedex.com/ws/rate/v28}ConsolidationKey" minOccurs="0"/&gt;
 *         &lt;element name="RequestedShipment" type="{http://fedex.com/ws/rate/v28}RequestedShipment" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RateRequest", propOrder = {
    "webAuthenticationDetail",
    "clientDetail",
    "transactionDetail",
    "version",
    "returnTransitAndCommit",
    "carrierCodes",
    "variableOptions",
    "consolidationKey",
    "requestedShipment"
})
public class RateRequest {

    @XmlElement(name = "WebAuthenticationDetail", required = true)
    protected WebAuthenticationDetail webAuthenticationDetail;
    @XmlElement(name = "ClientDetail", required = true)
    protected ClientDetail clientDetail;
    @XmlElement(name = "TransactionDetail")
    protected TransactionDetail transactionDetail;
    @XmlElement(name = "Version", required = true)
    protected VersionId version;
    @XmlElement(name = "ReturnTransitAndCommit")
    protected Boolean returnTransitAndCommit;
    @XmlElement(name = "CarrierCodes")
    @XmlSchemaType(name = "string")
    protected List<CarrierCodeType> carrierCodes;
    @XmlElement(name = "VariableOptions")
    @XmlSchemaType(name = "string")
    protected List<ServiceOptionType> variableOptions;
    @XmlElement(name = "ConsolidationKey")
    protected ConsolidationKey consolidationKey;
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
     * Gets the value of the returnTransitAndCommit property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isReturnTransitAndCommit() {
        return returnTransitAndCommit;
    }

    /**
     * Sets the value of the returnTransitAndCommit property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setReturnTransitAndCommit(Boolean value) {
        this.returnTransitAndCommit = value;
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
     * Gets the value of the variableOptions property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the variableOptions property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getVariableOptions().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ServiceOptionType }
     * 
     * 
     */
    public List<ServiceOptionType> getVariableOptions() {
        if (variableOptions == null) {
            variableOptions = new ArrayList<ServiceOptionType>();
        }
        return this.variableOptions;
    }

    /**
     * Gets the value of the consolidationKey property.
     * 
     * @return
     *     possible object is
     *     {@link ConsolidationKey }
     *     
     */
    public ConsolidationKey getConsolidationKey() {
        return consolidationKey;
    }

    /**
     * Sets the value of the consolidationKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link ConsolidationKey }
     *     
     */
    public void setConsolidationKey(ConsolidationKey value) {
        this.consolidationKey = value;
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

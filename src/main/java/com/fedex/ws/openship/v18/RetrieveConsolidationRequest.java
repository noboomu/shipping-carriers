
package com.fedex.ws.openship.v18;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RetrieveConsolidationRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RetrieveConsolidationRequest"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="WebAuthenticationDetail" type="{http://fedex.com/ws/openship/v18}WebAuthenticationDetail"/&gt;
 *         &lt;element name="ClientDetail" type="{http://fedex.com/ws/openship/v18}ClientDetail"/&gt;
 *         &lt;element name="TransactionDetail" type="{http://fedex.com/ws/openship/v18}TransactionDetail" minOccurs="0"/&gt;
 *         &lt;element name="Version" type="{http://fedex.com/ws/openship/v18}VersionId"/&gt;
 *         &lt;element name="ConsolidationKey" type="{http://fedex.com/ws/openship/v18}ConsolidationKey" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RetrieveConsolidationRequest", propOrder = {
    "webAuthenticationDetail",
    "clientDetail",
    "transactionDetail",
    "version",
    "consolidationKey"
})
public class RetrieveConsolidationRequest {

    @XmlElement(name = "WebAuthenticationDetail", required = true)
    protected WebAuthenticationDetail webAuthenticationDetail;
    @XmlElement(name = "ClientDetail", required = true)
    protected ClientDetail clientDetail;
    @XmlElement(name = "TransactionDetail")
    protected TransactionDetail transactionDetail;
    @XmlElement(name = "Version", required = true)
    protected VersionId version;
    @XmlElement(name = "ConsolidationKey")
    protected ConsolidationKey consolidationKey;

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

}

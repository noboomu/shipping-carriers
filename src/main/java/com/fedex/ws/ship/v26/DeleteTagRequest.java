
package com.fedex.ws.ship.v26;

import javax.xml.datatype.XMLGregorianCalendar;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DeleteTagRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DeleteTagRequest"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="WebAuthenticationDetail" type="{http://fedex.com/ws/ship/v26}WebAuthenticationDetail"/&gt;
 *         &lt;element name="ClientDetail" type="{http://fedex.com/ws/ship/v26}ClientDetail"/&gt;
 *         &lt;element name="UserDetail" type="{http://fedex.com/ws/ship/v26}UserDetail" minOccurs="0"/&gt;
 *         &lt;element name="TransactionDetail" type="{http://fedex.com/ws/ship/v26}TransactionDetail" minOccurs="0"/&gt;
 *         &lt;element name="Version" type="{http://fedex.com/ws/ship/v26}VersionId"/&gt;
 *         &lt;element name="DispatchLocationId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="DispatchDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
 *         &lt;element name="Payment" type="{http://fedex.com/ws/ship/v26}Payment"/&gt;
 *         &lt;element name="ConfirmationNumber" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DeleteTagRequest", propOrder = {
    "webAuthenticationDetail",
    "clientDetail",
    "userDetail",
    "transactionDetail",
    "version",
    "dispatchLocationId",
    "dispatchDate",
    "payment",
    "confirmationNumber"
})
public class DeleteTagRequest {

    @XmlElement(name = "WebAuthenticationDetail", required = true)
    protected WebAuthenticationDetail webAuthenticationDetail;
    @XmlElement(name = "ClientDetail", required = true)
    protected ClientDetail clientDetail;
    @XmlElement(name = "UserDetail")
    protected UserDetail userDetail;
    @XmlElement(name = "TransactionDetail")
    protected TransactionDetail transactionDetail;
    @XmlElement(name = "Version", required = true)
    protected VersionId version;
    @XmlElement(name = "DispatchLocationId")
    protected String dispatchLocationId;
    @XmlElement(name = "DispatchDate")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar dispatchDate;
    @XmlElement(name = "Payment", required = true)
    protected Payment payment;
    @XmlElement(name = "ConfirmationNumber", required = true)
    protected String confirmationNumber;

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
     * Gets the value of the userDetail property.
     * 
     * @return
     *     possible object is
     *     {@link UserDetail }
     *     
     */
    public UserDetail getUserDetail() {
        return userDetail;
    }

    /**
     * Sets the value of the userDetail property.
     * 
     * @param value
     *     allowed object is
     *     {@link UserDetail }
     *     
     */
    public void setUserDetail(UserDetail value) {
        this.userDetail = value;
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
     * Gets the value of the dispatchLocationId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDispatchLocationId() {
        return dispatchLocationId;
    }

    /**
     * Sets the value of the dispatchLocationId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDispatchLocationId(String value) {
        this.dispatchLocationId = value;
    }

    /**
     * Gets the value of the dispatchDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDispatchDate() {
        return dispatchDate;
    }

    /**
     * Sets the value of the dispatchDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDispatchDate(XMLGregorianCalendar value) {
        this.dispatchDate = value;
    }

    /**
     * Gets the value of the payment property.
     * 
     * @return
     *     possible object is
     *     {@link Payment }
     *     
     */
    public Payment getPayment() {
        return payment;
    }

    /**
     * Sets the value of the payment property.
     * 
     * @param value
     *     allowed object is
     *     {@link Payment }
     *     
     */
    public void setPayment(Payment value) {
        this.payment = value;
    }

    /**
     * Gets the value of the confirmationNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getConfirmationNumber() {
        return confirmationNumber;
    }

    /**
     * Sets the value of the confirmationNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setConfirmationNumber(String value) {
        this.confirmationNumber = value;
    }

}

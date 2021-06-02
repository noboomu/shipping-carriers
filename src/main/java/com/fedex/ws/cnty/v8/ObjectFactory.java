
package com.fedex.ws.cnty.v8;

import javax.xml.namespace.QName;
import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.annotation.XmlElementDecl;
import jakarta.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.fedex.ws.cnty.v8 package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _ValidatePostalReply_QNAME = new QName("http://fedex.com/ws/cnty/v8", "ValidatePostalReply");
    private final static QName _ValidatePostalRequest_QNAME = new QName("http://fedex.com/ws/cnty/v8", "ValidatePostalRequest");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.fedex.ws.cnty.v8
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ValidatePostalReply }
     * 
     */
    public ValidatePostalReply createValidatePostalReply() {
        return new ValidatePostalReply();
    }

    /**
     * Create an instance of {@link ValidatePostalRequest }
     * 
     */
    public ValidatePostalRequest createValidatePostalRequest() {
        return new ValidatePostalRequest();
    }

    /**
     * Create an instance of {@link Address }
     * 
     */
    public Address createAddress() {
        return new Address();
    }

    /**
     * Create an instance of {@link ClientDetail }
     * 
     */
    public ClientDetail createClientDetail() {
        return new ClientDetail();
    }

    /**
     * Create an instance of {@link Localization }
     * 
     */
    public Localization createLocalization() {
        return new Localization();
    }

    /**
     * Create an instance of {@link LocationDescription }
     * 
     */
    public LocationDescription createLocationDescription() {
        return new LocationDescription();
    }

    /**
     * Create an instance of {@link Notification }
     * 
     */
    public Notification createNotification() {
        return new Notification();
    }

    /**
     * Create an instance of {@link NotificationParameter }
     * 
     */
    public NotificationParameter createNotificationParameter() {
        return new NotificationParameter();
    }

    /**
     * Create an instance of {@link PostalDetail }
     * 
     */
    public PostalDetail createPostalDetail() {
        return new PostalDetail();
    }

    /**
     * Create an instance of {@link TransactionDetail }
     * 
     */
    public TransactionDetail createTransactionDetail() {
        return new TransactionDetail();
    }

    /**
     * Create an instance of {@link WebAuthenticationDetail }
     * 
     */
    public WebAuthenticationDetail createWebAuthenticationDetail() {
        return new WebAuthenticationDetail();
    }

    /**
     * Create an instance of {@link WebAuthenticationCredential }
     * 
     */
    public WebAuthenticationCredential createWebAuthenticationCredential() {
        return new WebAuthenticationCredential();
    }

    /**
     * Create an instance of {@link VersionId }
     * 
     */
    public VersionId createVersionId() {
        return new VersionId();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ValidatePostalReply }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ValidatePostalReply }{@code >}
     */
    @XmlElementDecl(namespace = "http://fedex.com/ws/cnty/v8", name = "ValidatePostalReply")
    public JAXBElement<ValidatePostalReply> createValidatePostalReply(ValidatePostalReply value) {
        return new JAXBElement<ValidatePostalReply>(_ValidatePostalReply_QNAME, ValidatePostalReply.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ValidatePostalRequest }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ValidatePostalRequest }{@code >}
     */
    @XmlElementDecl(namespace = "http://fedex.com/ws/cnty/v8", name = "ValidatePostalRequest")
    public JAXBElement<ValidatePostalRequest> createValidatePostalRequest(ValidatePostalRequest value) {
        return new JAXBElement<ValidatePostalRequest>(_ValidatePostalRequest_QNAME, ValidatePostalRequest.class, null, value);
    }

}

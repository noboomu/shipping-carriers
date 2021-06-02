
package com.fedex.ws.addressvalidation.v4;

import javax.xml.namespace.QName;
import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.annotation.XmlElementDecl;
import jakarta.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.fedex.ws.addressvalidation.v4 package. 
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

    private final static QName _AddressValidationReply_QNAME = new QName("http://fedex.com/ws/addressvalidation/v4", "AddressValidationReply");
    private final static QName _AddressValidationRequest_QNAME = new QName("http://fedex.com/ws/addressvalidation/v4", "AddressValidationRequest");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.fedex.ws.addressvalidation.v4
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link AddressValidationReply }
     * 
     */
    public AddressValidationReply createAddressValidationReply() {
        return new AddressValidationReply();
    }

    /**
     * Create an instance of {@link AddressValidationRequest }
     * 
     */
    public AddressValidationRequest createAddressValidationRequest() {
        return new AddressValidationRequest();
    }

    /**
     * Create an instance of {@link Address }
     * 
     */
    public Address createAddress() {
        return new Address();
    }

    /**
     * Create an instance of {@link AddressAttribute }
     * 
     */
    public AddressAttribute createAddressAttribute() {
        return new AddressAttribute();
    }

    /**
     * Create an instance of {@link AddressToValidate }
     * 
     */
    public AddressToValidate createAddressToValidate() {
        return new AddressToValidate();
    }

    /**
     * Create an instance of {@link AddressValidationResult }
     * 
     */
    public AddressValidationResult createAddressValidationResult() {
        return new AddressValidationResult();
    }

    /**
     * Create an instance of {@link ClientDetail }
     * 
     */
    public ClientDetail createClientDetail() {
        return new ClientDetail();
    }

    /**
     * Create an instance of {@link Contact }
     * 
     */
    public Contact createContact() {
        return new Contact();
    }

    /**
     * Create an instance of {@link Localization }
     * 
     */
    public Localization createLocalization() {
        return new Localization();
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
     * Create an instance of {@link ParsedAddressPartsDetail }
     * 
     */
    public ParsedAddressPartsDetail createParsedAddressPartsDetail() {
        return new ParsedAddressPartsDetail();
    }

    /**
     * Create an instance of {@link ParsedPostalCodeDetail }
     * 
     */
    public ParsedPostalCodeDetail createParsedPostalCodeDetail() {
        return new ParsedPostalCodeDetail();
    }

    /**
     * Create an instance of {@link ParsedStreetLineDetail }
     * 
     */
    public ParsedStreetLineDetail createParsedStreetLineDetail() {
        return new ParsedStreetLineDetail();
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
     * Create an instance of {@link JAXBElement }{@code <}{@link AddressValidationReply }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link AddressValidationReply }{@code >}
     */
    @XmlElementDecl(namespace = "http://fedex.com/ws/addressvalidation/v4", name = "AddressValidationReply")
    public JAXBElement<AddressValidationReply> createAddressValidationReply(AddressValidationReply value) {
        return new JAXBElement<AddressValidationReply>(_AddressValidationReply_QNAME, AddressValidationReply.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddressValidationRequest }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link AddressValidationRequest }{@code >}
     */
    @XmlElementDecl(namespace = "http://fedex.com/ws/addressvalidation/v4", name = "AddressValidationRequest")
    public JAXBElement<AddressValidationRequest> createAddressValidationRequest(AddressValidationRequest value) {
        return new JAXBElement<AddressValidationRequest>(_AddressValidationRequest_QNAME, AddressValidationRequest.class, null, value);
    }

}

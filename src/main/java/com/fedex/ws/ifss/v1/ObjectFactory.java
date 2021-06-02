
package com.fedex.ws.ifss.v1;

import javax.xml.namespace.QName;
import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.annotation.XmlElementDecl;
import jakarta.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.fedex.ws.ifss.v1 package. 
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

    private final static QName _ProcessDeliveryReply_QNAME = new QName("http://fedex.com/ws/ifss/v1", "ProcessDeliveryReply");
    private final static QName _ProcessDeliveryRequest_QNAME = new QName("http://fedex.com/ws/ifss/v1", "ProcessDeliveryRequest");
    private final static QName _ValidateDeliveryReply_QNAME = new QName("http://fedex.com/ws/ifss/v1", "ValidateDeliveryReply");
    private final static QName _ValidateDeliveryRequest_QNAME = new QName("http://fedex.com/ws/ifss/v1", "ValidateDeliveryRequest");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.fedex.ws.ifss.v1
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ProcessDeliveryReply }
     * 
     */
    public ProcessDeliveryReply createProcessDeliveryReply() {
        return new ProcessDeliveryReply();
    }

    /**
     * Create an instance of {@link ProcessDeliveryRequest }
     * 
     */
    public ProcessDeliveryRequest createProcessDeliveryRequest() {
        return new ProcessDeliveryRequest();
    }

    /**
     * Create an instance of {@link ValidateDeliveryReply }
     * 
     */
    public ValidateDeliveryReply createValidateDeliveryReply() {
        return new ValidateDeliveryReply();
    }

    /**
     * Create an instance of {@link ValidateDeliveryRequest }
     * 
     */
    public ValidateDeliveryRequest createValidateDeliveryRequest() {
        return new ValidateDeliveryRequest();
    }

    /**
     * Create an instance of {@link Address }
     * 
     */
    public Address createAddress() {
        return new Address();
    }

    /**
     * Create an instance of {@link AppointmentDetail }
     * 
     */
    public AppointmentDetail createAppointmentDetail() {
        return new AppointmentDetail();
    }

    /**
     * Create an instance of {@link AppointmentTimeDetail }
     * 
     */
    public AppointmentTimeDetail createAppointmentTimeDetail() {
        return new AppointmentTimeDetail();
    }

    /**
     * Create an instance of {@link AssociatedAccount }
     * 
     */
    public AssociatedAccount createAssociatedAccount() {
        return new AssociatedAccount();
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
     * Create an instance of {@link ContactAndAddress }
     * 
     */
    public ContactAndAddress createContactAndAddress() {
        return new ContactAndAddress();
    }

    /**
     * Create an instance of {@link CreditCard }
     * 
     */
    public CreditCard createCreditCard() {
        return new CreditCard();
    }

    /**
     * Create an instance of {@link CreditCardTransactionAttributesDetail }
     * 
     */
    public CreditCardTransactionAttributesDetail createCreditCardTransactionAttributesDetail() {
        return new CreditCardTransactionAttributesDetail();
    }

    /**
     * Create an instance of {@link CreditCardTransactionDetail }
     * 
     */
    public CreditCardTransactionDetail createCreditCardTransactionDetail() {
        return new CreditCardTransactionDetail();
    }

    /**
     * Create an instance of {@link CreditFraudDetectionDetail }
     * 
     */
    public CreditFraudDetectionDetail createCreditFraudDetectionDetail() {
        return new CreditFraudDetectionDetail();
    }

    /**
     * Create an instance of {@link DeliveryRequestDetail }
     * 
     */
    public DeliveryRequestDetail createDeliveryRequestDetail() {
        return new DeliveryRequestDetail();
    }

    /**
     * Create an instance of {@link DocumentFormatOptionsRequested }
     * 
     */
    public DocumentFormatOptionsRequested createDocumentFormatOptionsRequested() {
        return new DocumentFormatOptionsRequested();
    }

    /**
     * Create an instance of {@link InitiativeManifest }
     * 
     */
    public InitiativeManifest createInitiativeManifest() {
        return new InitiativeManifest();
    }

    /**
     * Create an instance of {@link LinearMeasure }
     * 
     */
    public LinearMeasure createLinearMeasure() {
        return new LinearMeasure();
    }

    /**
     * Create an instance of {@link LocalTimeRange }
     * 
     */
    public LocalTimeRange createLocalTimeRange() {
        return new LocalTimeRange();
    }

    /**
     * Create an instance of {@link Localization }
     * 
     */
    public Localization createLocalization() {
        return new Localization();
    }

    /**
     * Create an instance of {@link Money }
     * 
     */
    public Money createMoney() {
        return new Money();
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
     * Create an instance of {@link OperationalDocumentPart }
     * 
     */
    public OperationalDocumentPart createOperationalDocumentPart() {
        return new OperationalDocumentPart();
    }

    /**
     * Create an instance of {@link OperationalDocumentSpecification }
     * 
     */
    public OperationalDocumentSpecification createOperationalDocumentSpecification() {
        return new OperationalDocumentSpecification();
    }

    /**
     * Create an instance of {@link ParsedContact }
     * 
     */
    public ParsedContact createParsedContact() {
        return new ParsedContact();
    }

    /**
     * Create an instance of {@link ParsedContactAndAddress }
     * 
     */
    public ParsedContactAndAddress createParsedContactAndAddress() {
        return new ParsedContactAndAddress();
    }

    /**
     * Create an instance of {@link ParsedPersonName }
     * 
     */
    public ParsedPersonName createParsedPersonName() {
        return new ParsedPersonName();
    }

    /**
     * Create an instance of {@link Party }
     * 
     */
    public Party createParty() {
        return new Party();
    }

    /**
     * Create an instance of {@link Payor }
     * 
     */
    public Payor createPayor() {
        return new Payor();
    }

    /**
     * Create an instance of {@link RatedDeliveryDetail }
     * 
     */
    public RatedDeliveryDetail createRatedDeliveryDetail() {
        return new RatedDeliveryDetail();
    }

    /**
     * Create an instance of {@link RedirectToHoldAtLocationRequestDetail }
     * 
     */
    public RedirectToHoldAtLocationRequestDetail createRedirectToHoldAtLocationRequestDetail() {
        return new RedirectToHoldAtLocationRequestDetail();
    }

    /**
     * Create an instance of {@link RerouteDeliveryDetail }
     * 
     */
    public RerouteDeliveryDetail createRerouteDeliveryDetail() {
        return new RerouteDeliveryDetail();
    }

    /**
     * Create an instance of {@link ShippingDocumentDispositionDetail }
     * 
     */
    public ShippingDocumentDispositionDetail createShippingDocumentDispositionDetail() {
        return new ShippingDocumentDispositionDetail();
    }

    /**
     * Create an instance of {@link ShippingDocumentEMailDetail }
     * 
     */
    public ShippingDocumentEMailDetail createShippingDocumentEMailDetail() {
        return new ShippingDocumentEMailDetail();
    }

    /**
     * Create an instance of {@link ShippingDocumentEMailRecipient }
     * 
     */
    public ShippingDocumentEMailRecipient createShippingDocumentEMailRecipient() {
        return new ShippingDocumentEMailRecipient();
    }

    /**
     * Create an instance of {@link ShippingDocumentFormat }
     * 
     */
    public ShippingDocumentFormat createShippingDocumentFormat() {
        return new ShippingDocumentFormat();
    }

    /**
     * Create an instance of {@link ShippingDocumentPrintDetail }
     * 
     */
    public ShippingDocumentPrintDetail createShippingDocumentPrintDetail() {
        return new ShippingDocumentPrintDetail();
    }

    /**
     * Create an instance of {@link ShippingDocumentStorageDetail }
     * 
     */
    public ShippingDocumentStorageDetail createShippingDocumentStorageDetail() {
        return new ShippingDocumentStorageDetail();
    }

    /**
     * Create an instance of {@link SignatureReleaseDocumentDetail }
     * 
     */
    public SignatureReleaseDocumentDetail createSignatureReleaseDocumentDetail() {
        return new SignatureReleaseDocumentDetail();
    }

    /**
     * Create an instance of {@link Surcharge }
     * 
     */
    public Surcharge createSurcharge() {
        return new Surcharge();
    }

    /**
     * Create an instance of {@link TaxpayerIdentification }
     * 
     */
    public TaxpayerIdentification createTaxpayerIdentification() {
        return new TaxpayerIdentification();
    }

    /**
     * Create an instance of {@link TrackingId }
     * 
     */
    public TrackingId createTrackingId() {
        return new TrackingId();
    }

    /**
     * Create an instance of {@link TransactionDetail }
     * 
     */
    public TransactionDetail createTransactionDetail() {
        return new TransactionDetail();
    }

    /**
     * Create an instance of {@link UniqueTrackingNumber }
     * 
     */
    public UniqueTrackingNumber createUniqueTrackingNumber() {
        return new UniqueTrackingNumber();
    }

    /**
     * Create an instance of {@link UserDetail }
     * 
     */
    public UserDetail createUserDetail() {
        return new UserDetail();
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
     * Create an instance of {@link JAXBElement }{@code <}{@link ProcessDeliveryReply }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ProcessDeliveryReply }{@code >}
     */
    @XmlElementDecl(namespace = "http://fedex.com/ws/ifss/v1", name = "ProcessDeliveryReply")
    public JAXBElement<ProcessDeliveryReply> createProcessDeliveryReply(ProcessDeliveryReply value) {
        return new JAXBElement<ProcessDeliveryReply>(_ProcessDeliveryReply_QNAME, ProcessDeliveryReply.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ProcessDeliveryRequest }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ProcessDeliveryRequest }{@code >}
     */
    @XmlElementDecl(namespace = "http://fedex.com/ws/ifss/v1", name = "ProcessDeliveryRequest")
    public JAXBElement<ProcessDeliveryRequest> createProcessDeliveryRequest(ProcessDeliveryRequest value) {
        return new JAXBElement<ProcessDeliveryRequest>(_ProcessDeliveryRequest_QNAME, ProcessDeliveryRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ValidateDeliveryReply }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ValidateDeliveryReply }{@code >}
     */
    @XmlElementDecl(namespace = "http://fedex.com/ws/ifss/v1", name = "ValidateDeliveryReply")
    public JAXBElement<ValidateDeliveryReply> createValidateDeliveryReply(ValidateDeliveryReply value) {
        return new JAXBElement<ValidateDeliveryReply>(_ValidateDeliveryReply_QNAME, ValidateDeliveryReply.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ValidateDeliveryRequest }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ValidateDeliveryRequest }{@code >}
     */
    @XmlElementDecl(namespace = "http://fedex.com/ws/ifss/v1", name = "ValidateDeliveryRequest")
    public JAXBElement<ValidateDeliveryRequest> createValidateDeliveryRequest(ValidateDeliveryRequest value) {
        return new JAXBElement<ValidateDeliveryRequest>(_ValidateDeliveryRequest_QNAME, ValidateDeliveryRequest.class, null, value);
    }

}

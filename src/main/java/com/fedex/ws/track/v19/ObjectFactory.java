
package com.fedex.ws.track.v19;

import javax.xml.namespace.QName;
import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.annotation.XmlElementDecl;
import jakarta.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.fedex.ws.track.v19 package. 
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

    private final static QName _GetTrackingDocumentsReply_QNAME = new QName("http://fedex.com/ws/track/v19", "GetTrackingDocumentsReply");
    private final static QName _GetTrackingDocumentsRequest_QNAME = new QName("http://fedex.com/ws/track/v19", "GetTrackingDocumentsRequest");
    private final static QName _SendNotificationsReply_QNAME = new QName("http://fedex.com/ws/track/v19", "SendNotificationsReply");
    private final static QName _SendNotificationsRequest_QNAME = new QName("http://fedex.com/ws/track/v19", "SendNotificationsRequest");
    private final static QName _TrackReply_QNAME = new QName("http://fedex.com/ws/track/v19", "TrackReply");
    private final static QName _TrackRequest_QNAME = new QName("http://fedex.com/ws/track/v19", "TrackRequest");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.fedex.ws.track.v19
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GetTrackingDocumentsReply }
     * 
     */
    public GetTrackingDocumentsReply createGetTrackingDocumentsReply() {
        return new GetTrackingDocumentsReply();
    }

    /**
     * Create an instance of {@link GetTrackingDocumentsRequest }
     * 
     */
    public GetTrackingDocumentsRequest createGetTrackingDocumentsRequest() {
        return new GetTrackingDocumentsRequest();
    }

    /**
     * Create an instance of {@link SendNotificationsReply }
     * 
     */
    public SendNotificationsReply createSendNotificationsReply() {
        return new SendNotificationsReply();
    }

    /**
     * Create an instance of {@link SendNotificationsRequest }
     * 
     */
    public SendNotificationsRequest createSendNotificationsRequest() {
        return new SendNotificationsRequest();
    }

    /**
     * Create an instance of {@link TrackReply }
     * 
     */
    public TrackReply createTrackReply() {
        return new TrackReply();
    }

    /**
     * Create an instance of {@link TrackRequest }
     * 
     */
    public TrackRequest createTrackRequest() {
        return new TrackRequest();
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
     * Create an instance of {@link AvailableImagesDetail }
     * 
     */
    public AvailableImagesDetail createAvailableImagesDetail() {
        return new AvailableImagesDetail();
    }

    /**
     * Create an instance of {@link ClientDetail }
     * 
     */
    public ClientDetail createClientDetail() {
        return new ClientDetail();
    }

    /**
     * Create an instance of {@link Commodity }
     * 
     */
    public Commodity createCommodity() {
        return new Commodity();
    }

    /**
     * Create an instance of {@link CompletedTrackDetail }
     * 
     */
    public CompletedTrackDetail createCompletedTrackDetail() {
        return new CompletedTrackDetail();
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
     * Create an instance of {@link ContentRecord }
     * 
     */
    public ContentRecord createContentRecord() {
        return new ContentRecord();
    }

    /**
     * Create an instance of {@link CustomerExceptionRequestDetail }
     * 
     */
    public CustomerExceptionRequestDetail createCustomerExceptionRequestDetail() {
        return new CustomerExceptionRequestDetail();
    }

    /**
     * Create an instance of {@link CustomsOptionDetail }
     * 
     */
    public CustomsOptionDetail createCustomsOptionDetail() {
        return new CustomsOptionDetail();
    }

    /**
     * Create an instance of {@link DateRange }
     * 
     */
    public DateRange createDateRange() {
        return new DateRange();
    }

    /**
     * Create an instance of {@link DeliveryOptionEligibilityDetail }
     * 
     */
    public DeliveryOptionEligibilityDetail createDeliveryOptionEligibilityDetail() {
        return new DeliveryOptionEligibilityDetail();
    }

    /**
     * Create an instance of {@link Dimensions }
     * 
     */
    public Dimensions createDimensions() {
        return new Dimensions();
    }

    /**
     * Create an instance of {@link Distance }
     * 
     */
    public Distance createDistance() {
        return new Distance();
    }

    /**
     * Create an instance of {@link DocumentPart }
     * 
     */
    public DocumentPart createDocumentPart() {
        return new DocumentPart();
    }

    /**
     * Create an instance of {@link EMailDetail }
     * 
     */
    public EMailDetail createEMailDetail() {
        return new EMailDetail();
    }

    /**
     * Create an instance of {@link EdtExciseCondition }
     * 
     */
    public EdtExciseCondition createEdtExciseCondition() {
        return new EdtExciseCondition();
    }

    /**
     * Create an instance of {@link FaxDetail }
     * 
     */
    public FaxDetail createFaxDetail() {
        return new FaxDetail();
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
     * Create an instance of {@link Measure }
     * 
     */
    public Measure createMeasure() {
        return new Measure();
    }

    /**
     * Create an instance of {@link Money }
     * 
     */
    public Money createMoney() {
        return new Money();
    }

    /**
     * Create an instance of {@link NaftaCommodityDetail }
     * 
     */
    public NaftaCommodityDetail createNaftaCommodityDetail() {
        return new NaftaCommodityDetail();
    }

    /**
     * Create an instance of {@link Notification }
     * 
     */
    public Notification createNotification() {
        return new Notification();
    }

    /**
     * Create an instance of {@link NotificationDetail }
     * 
     */
    public NotificationDetail createNotificationDetail() {
        return new NotificationDetail();
    }

    /**
     * Create an instance of {@link NotificationParameter }
     * 
     */
    public NotificationParameter createNotificationParameter() {
        return new NotificationParameter();
    }

    /**
     * Create an instance of {@link PagingDetail }
     * 
     */
    public PagingDetail createPagingDetail() {
        return new PagingDetail();
    }

    /**
     * Create an instance of {@link PieceCountVerificationDetail }
     * 
     */
    public PieceCountVerificationDetail createPieceCountVerificationDetail() {
        return new PieceCountVerificationDetail();
    }

    /**
     * Create an instance of {@link ShipmentEventNotificationDetail }
     * 
     */
    public ShipmentEventNotificationDetail createShipmentEventNotificationDetail() {
        return new ShipmentEventNotificationDetail();
    }

    /**
     * Create an instance of {@link ShipmentEventNotificationSpecification }
     * 
     */
    public ShipmentEventNotificationSpecification createShipmentEventNotificationSpecification() {
        return new ShipmentEventNotificationSpecification();
    }

    /**
     * Create an instance of {@link ShipmentNotificationFormatSpecification }
     * 
     */
    public ShipmentNotificationFormatSpecification createShipmentNotificationFormatSpecification() {
        return new ShipmentNotificationFormatSpecification();
    }

    /**
     * Create an instance of {@link SignatureImageDetail }
     * 
     */
    public SignatureImageDetail createSignatureImageDetail() {
        return new SignatureImageDetail();
    }

    /**
     * Create an instance of {@link SpecialInstructionStatusDetail }
     * 
     */
    public SpecialInstructionStatusDetail createSpecialInstructionStatusDetail() {
        return new SpecialInstructionStatusDetail();
    }

    /**
     * Create an instance of {@link StringBarcode }
     * 
     */
    public StringBarcode createStringBarcode() {
        return new StringBarcode();
    }

    /**
     * Create an instance of {@link TrackAdvanceNotificationDetail }
     * 
     */
    public TrackAdvanceNotificationDetail createTrackAdvanceNotificationDetail() {
        return new TrackAdvanceNotificationDetail();
    }

    /**
     * Create an instance of {@link TrackChargeDetail }
     * 
     */
    public TrackChargeDetail createTrackChargeDetail() {
        return new TrackChargeDetail();
    }

    /**
     * Create an instance of {@link TrackDetail }
     * 
     */
    public TrackDetail createTrackDetail() {
        return new TrackDetail();
    }

    /**
     * Create an instance of {@link TrackEvent }
     * 
     */
    public TrackEvent createTrackEvent() {
        return new TrackEvent();
    }

    /**
     * Create an instance of {@link TrackInformationNoteDetail }
     * 
     */
    public TrackInformationNoteDetail createTrackInformationNoteDetail() {
        return new TrackInformationNoteDetail();
    }

    /**
     * Create an instance of {@link TrackNotificationPackage }
     * 
     */
    public TrackNotificationPackage createTrackNotificationPackage() {
        return new TrackNotificationPackage();
    }

    /**
     * Create an instance of {@link TrackNotificationRecipientDetail }
     * 
     */
    public TrackNotificationRecipientDetail createTrackNotificationRecipientDetail() {
        return new TrackNotificationRecipientDetail();
    }

    /**
     * Create an instance of {@link TrackOtherIdentifierDetail }
     * 
     */
    public TrackOtherIdentifierDetail createTrackOtherIdentifierDetail() {
        return new TrackOtherIdentifierDetail();
    }

    /**
     * Create an instance of {@link TrackPackageIdentifier }
     * 
     */
    public TrackPackageIdentifier createTrackPackageIdentifier() {
        return new TrackPackageIdentifier();
    }

    /**
     * Create an instance of {@link TrackPackagingDescriptionDetail }
     * 
     */
    public TrackPackagingDescriptionDetail createTrackPackagingDescriptionDetail() {
        return new TrackPackagingDescriptionDetail();
    }

    /**
     * Create an instance of {@link TrackPayment }
     * 
     */
    public TrackPayment createTrackPayment() {
        return new TrackPayment();
    }

    /**
     * Create an instance of {@link TrackReconciliation }
     * 
     */
    public TrackReconciliation createTrackReconciliation() {
        return new TrackReconciliation();
    }

    /**
     * Create an instance of {@link TrackReturnDetail }
     * 
     */
    public TrackReturnDetail createTrackReturnDetail() {
        return new TrackReturnDetail();
    }

    /**
     * Create an instance of {@link TrackSelectionDetail }
     * 
     */
    public TrackSelectionDetail createTrackSelectionDetail() {
        return new TrackSelectionDetail();
    }

    /**
     * Create an instance of {@link TrackServiceDescriptionDetail }
     * 
     */
    public TrackServiceDescriptionDetail createTrackServiceDescriptionDetail() {
        return new TrackServiceDescriptionDetail();
    }

    /**
     * Create an instance of {@link TrackSpecialHandling }
     * 
     */
    public TrackSpecialHandling createTrackSpecialHandling() {
        return new TrackSpecialHandling();
    }

    /**
     * Create an instance of {@link TrackSpecialInstruction }
     * 
     */
    public TrackSpecialInstruction createTrackSpecialInstruction() {
        return new TrackSpecialInstruction();
    }

    /**
     * Create an instance of {@link TrackSplitShipmentPart }
     * 
     */
    public TrackSplitShipmentPart createTrackSplitShipmentPart() {
        return new TrackSplitShipmentPart();
    }

    /**
     * Create an instance of {@link TrackStatusAncillaryDetail }
     * 
     */
    public TrackStatusAncillaryDetail createTrackStatusAncillaryDetail() {
        return new TrackStatusAncillaryDetail();
    }

    /**
     * Create an instance of {@link TrackStatusDetail }
     * 
     */
    public TrackStatusDetail createTrackStatusDetail() {
        return new TrackStatusDetail();
    }

    /**
     * Create an instance of {@link TrackingBillOfLadingDocumentDetail }
     * 
     */
    public TrackingBillOfLadingDocumentDetail createTrackingBillOfLadingDocumentDetail() {
        return new TrackingBillOfLadingDocumentDetail();
    }

    /**
     * Create an instance of {@link TrackingDateOrTimestamp }
     * 
     */
    public TrackingDateOrTimestamp createTrackingDateOrTimestamp() {
        return new TrackingDateOrTimestamp();
    }

    /**
     * Create an instance of {@link TrackingDocument }
     * 
     */
    public TrackingDocument createTrackingDocument() {
        return new TrackingDocument();
    }

    /**
     * Create an instance of {@link TrackingDocumentDispositionDetail }
     * 
     */
    public TrackingDocumentDispositionDetail createTrackingDocumentDispositionDetail() {
        return new TrackingDocumentDispositionDetail();
    }

    /**
     * Create an instance of {@link TrackingDocumentEmailDetail }
     * 
     */
    public TrackingDocumentEmailDetail createTrackingDocumentEmailDetail() {
        return new TrackingDocumentEmailDetail();
    }

    /**
     * Create an instance of {@link TrackingDocumentFormat }
     * 
     */
    public TrackingDocumentFormat createTrackingDocumentFormat() {
        return new TrackingDocumentFormat();
    }

    /**
     * Create an instance of {@link TrackingDocumentSpecification }
     * 
     */
    public TrackingDocumentSpecification createTrackingDocumentSpecification() {
        return new TrackingDocumentSpecification();
    }

    /**
     * Create an instance of {@link TrackingFreightBillingDocumentDetail }
     * 
     */
    public TrackingFreightBillingDocumentDetail createTrackingFreightBillingDocumentDetail() {
        return new TrackingFreightBillingDocumentDetail();
    }

    /**
     * Create an instance of {@link TrackingSignatureProofOfDeliveryDetail }
     * 
     */
    public TrackingSignatureProofOfDeliveryDetail createTrackingSignatureProofOfDeliveryDetail() {
        return new TrackingSignatureProofOfDeliveryDetail();
    }

    /**
     * Create an instance of {@link TransactionDetail }
     * 
     */
    public TransactionDetail createTransactionDetail() {
        return new TransactionDetail();
    }

    /**
     * Create an instance of {@link Weight }
     * 
     */
    public Weight createWeight() {
        return new Weight();
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
     * Create an instance of {@link JAXBElement }{@code <}{@link GetTrackingDocumentsReply }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetTrackingDocumentsReply }{@code >}
     */
    @XmlElementDecl(namespace = "http://fedex.com/ws/track/v19", name = "GetTrackingDocumentsReply")
    public JAXBElement<GetTrackingDocumentsReply> createGetTrackingDocumentsReply(GetTrackingDocumentsReply value) {
        return new JAXBElement<GetTrackingDocumentsReply>(_GetTrackingDocumentsReply_QNAME, GetTrackingDocumentsReply.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetTrackingDocumentsRequest }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetTrackingDocumentsRequest }{@code >}
     */
    @XmlElementDecl(namespace = "http://fedex.com/ws/track/v19", name = "GetTrackingDocumentsRequest")
    public JAXBElement<GetTrackingDocumentsRequest> createGetTrackingDocumentsRequest(GetTrackingDocumentsRequest value) {
        return new JAXBElement<GetTrackingDocumentsRequest>(_GetTrackingDocumentsRequest_QNAME, GetTrackingDocumentsRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SendNotificationsReply }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link SendNotificationsReply }{@code >}
     */
    @XmlElementDecl(namespace = "http://fedex.com/ws/track/v19", name = "SendNotificationsReply")
    public JAXBElement<SendNotificationsReply> createSendNotificationsReply(SendNotificationsReply value) {
        return new JAXBElement<SendNotificationsReply>(_SendNotificationsReply_QNAME, SendNotificationsReply.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SendNotificationsRequest }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link SendNotificationsRequest }{@code >}
     */
    @XmlElementDecl(namespace = "http://fedex.com/ws/track/v19", name = "SendNotificationsRequest")
    public JAXBElement<SendNotificationsRequest> createSendNotificationsRequest(SendNotificationsRequest value) {
        return new JAXBElement<SendNotificationsRequest>(_SendNotificationsRequest_QNAME, SendNotificationsRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TrackReply }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link TrackReply }{@code >}
     */
    @XmlElementDecl(namespace = "http://fedex.com/ws/track/v19", name = "TrackReply")
    public JAXBElement<TrackReply> createTrackReply(TrackReply value) {
        return new JAXBElement<TrackReply>(_TrackReply_QNAME, TrackReply.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TrackRequest }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link TrackRequest }{@code >}
     */
    @XmlElementDecl(namespace = "http://fedex.com/ws/track/v19", name = "TrackRequest")
    public JAXBElement<TrackRequest> createTrackRequest(TrackRequest value) {
        return new JAXBElement<TrackRequest>(_TrackRequest_QNAME, TrackRequest.class, null, value);
    }

}

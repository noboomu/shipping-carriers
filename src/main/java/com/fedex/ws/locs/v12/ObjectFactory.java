
package com.fedex.ws.locs.v12;

import javax.xml.namespace.QName;
import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.annotation.XmlElementDecl;
import jakarta.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.fedex.ws.locs.v12 package. 
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

    private final static QName _SearchLocationsReply_QNAME = new QName("http://fedex.com/ws/locs/v12", "SearchLocationsReply");
    private final static QName _SearchLocationsRequest_QNAME = new QName("http://fedex.com/ws/locs/v12", "SearchLocationsRequest");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.fedex.ws.locs.v12
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link SearchLocationsReply }
     * 
     */
    public SearchLocationsReply createSearchLocationsReply() {
        return new SearchLocationsReply();
    }

    /**
     * Create an instance of {@link SearchLocationsRequest }
     * 
     */
    public SearchLocationsRequest createSearchLocationsRequest() {
        return new SearchLocationsRequest();
    }

    /**
     * Create an instance of {@link Address }
     * 
     */
    public Address createAddress() {
        return new Address();
    }

    /**
     * Create an instance of {@link AddressAncillaryDetail }
     * 
     */
    public AddressAncillaryDetail createAddressAncillaryDetail() {
        return new AddressAncillaryDetail();
    }

    /**
     * Create an instance of {@link AddressToLocationRelationshipDetail }
     * 
     */
    public AddressToLocationRelationshipDetail createAddressToLocationRelationshipDetail() {
        return new AddressToLocationRelationshipDetail();
    }

    /**
     * Create an instance of {@link CarrierDetail }
     * 
     */
    public CarrierDetail createCarrierDetail() {
        return new CarrierDetail();
    }

    /**
     * Create an instance of {@link ClearanceCountryDetail }
     * 
     */
    public ClearanceCountryDetail createClearanceCountryDetail() {
        return new ClearanceCountryDetail();
    }

    /**
     * Create an instance of {@link ClearanceLocationDetail }
     * 
     */
    public ClearanceLocationDetail createClearanceLocationDetail() {
        return new ClearanceLocationDetail();
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
     * Create an instance of {@link DistanceAndLocationDetail }
     * 
     */
    public DistanceAndLocationDetail createDistanceAndLocationDetail() {
        return new DistanceAndLocationDetail();
    }

    /**
     * Create an instance of {@link Holiday }
     * 
     */
    public Holiday createHoliday() {
        return new Holiday();
    }

    /**
     * Create an instance of {@link LatestDropOffDetail }
     * 
     */
    public LatestDropOffDetail createLatestDropOffDetail() {
        return new LatestDropOffDetail();
    }

    /**
     * Create an instance of {@link LatestDropoffOverlayDetail }
     * 
     */
    public LatestDropoffOverlayDetail createLatestDropoffOverlayDetail() {
        return new LatestDropoffOverlayDetail();
    }

    /**
     * Create an instance of {@link Localization }
     * 
     */
    public Localization createLocalization() {
        return new Localization();
    }

    /**
     * Create an instance of {@link LocationCapabilityDetail }
     * 
     */
    public LocationCapabilityDetail createLocationCapabilityDetail() {
        return new LocationCapabilityDetail();
    }

    /**
     * Create an instance of {@link LocationContactAndAddress }
     * 
     */
    public LocationContactAndAddress createLocationContactAndAddress() {
        return new LocationContactAndAddress();
    }

    /**
     * Create an instance of {@link LocationDetail }
     * 
     */
    public LocationDetail createLocationDetail() {
        return new LocationDetail();
    }

    /**
     * Create an instance of {@link LocationFieldsForInternalFedexUseDetail }
     * 
     */
    public LocationFieldsForInternalFedexUseDetail createLocationFieldsForInternalFedexUseDetail() {
        return new LocationFieldsForInternalFedexUseDetail();
    }

    /**
     * Create an instance of {@link LocationHours }
     * 
     */
    public LocationHours createLocationHours() {
        return new LocationHours();
    }

    /**
     * Create an instance of {@link LocationIdentificationDetail }
     * 
     */
    public LocationIdentificationDetail createLocationIdentificationDetail() {
        return new LocationIdentificationDetail();
    }

    /**
     * Create an instance of {@link LocationPackageLimitsDetail }
     * 
     */
    public LocationPackageLimitsDetail createLocationPackageLimitsDetail() {
        return new LocationPackageLimitsDetail();
    }

    /**
     * Create an instance of {@link LocationSortDetail }
     * 
     */
    public LocationSortDetail createLocationSortDetail() {
        return new LocationSortDetail();
    }

    /**
     * Create an instance of {@link LocationSupportedPackageDetail }
     * 
     */
    public LocationSupportedPackageDetail createLocationSupportedPackageDetail() {
        return new LocationSupportedPackageDetail();
    }

    /**
     * Create an instance of {@link LocationSupportedShipmentDetail }
     * 
     */
    public LocationSupportedShipmentDetail createLocationSupportedShipmentDetail() {
        return new LocationSupportedShipmentDetail();
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
     * Create an instance of {@link ReservationAvailabilityDetail }
     * 
     */
    public ReservationAvailabilityDetail createReservationAvailabilityDetail() {
        return new ReservationAvailabilityDetail();
    }

    /**
     * Create an instance of {@link SearchLocationConstraints }
     * 
     */
    public SearchLocationConstraints createSearchLocationConstraints() {
        return new SearchLocationConstraints();
    }

    /**
     * Create an instance of {@link ShippingHoliday }
     * 
     */
    public ShippingHoliday createShippingHoliday() {
        return new ShippingHoliday();
    }

    /**
     * Create an instance of {@link TimeRange }
     * 
     */
    public TimeRange createTimeRange() {
        return new TimeRange();
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
     * Create an instance of {@link JAXBElement }{@code <}{@link SearchLocationsReply }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link SearchLocationsReply }{@code >}
     */
    @XmlElementDecl(namespace = "http://fedex.com/ws/locs/v12", name = "SearchLocationsReply")
    public JAXBElement<SearchLocationsReply> createSearchLocationsReply(SearchLocationsReply value) {
        return new JAXBElement<SearchLocationsReply>(_SearchLocationsReply_QNAME, SearchLocationsReply.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SearchLocationsRequest }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link SearchLocationsRequest }{@code >}
     */
    @XmlElementDecl(namespace = "http://fedex.com/ws/locs/v12", name = "SearchLocationsRequest")
    public JAXBElement<SearchLocationsRequest> createSearchLocationsRequest(SearchLocationsRequest value) {
        return new JAXBElement<SearchLocationsRequest>(_SearchLocationsRequest_QNAME, SearchLocationsRequest.class, null, value);
    }

}

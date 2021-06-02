
package com.fedex.ws.locs.v12;

import javax.xml.datatype.XMLGregorianCalendar;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SearchLocationsRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SearchLocationsRequest"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="WebAuthenticationDetail" type="{http://fedex.com/ws/locs/v12}WebAuthenticationDetail"/&gt;
 *         &lt;element name="ClientDetail" type="{http://fedex.com/ws/locs/v12}ClientDetail"/&gt;
 *         &lt;element name="TransactionDetail" type="{http://fedex.com/ws/locs/v12}TransactionDetail" minOccurs="0"/&gt;
 *         &lt;element name="Version" type="{http://fedex.com/ws/locs/v12}VersionId"/&gt;
 *         &lt;element name="EffectiveDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
 *         &lt;element name="LocationsSearchCriterion" type="{http://fedex.com/ws/locs/v12}LocationsSearchCriteriaType" minOccurs="0"/&gt;
 *         &lt;element name="ShipperAccountNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="UniqueTrackingNumber" type="{http://fedex.com/ws/locs/v12}UniqueTrackingNumber" minOccurs="0"/&gt;
 *         &lt;element name="Address" type="{http://fedex.com/ws/locs/v12}Address" minOccurs="0"/&gt;
 *         &lt;element name="PhoneNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="GeographicCoordinates" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="MultipleMatchesAction" type="{http://fedex.com/ws/locs/v12}MultipleMatchesActionType" minOccurs="0"/&gt;
 *         &lt;element name="SortDetail" type="{http://fedex.com/ws/locs/v12}LocationSortDetail" minOccurs="0"/&gt;
 *         &lt;element name="Constraints" type="{http://fedex.com/ws/locs/v12}SearchLocationConstraints" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SearchLocationsRequest", propOrder = {
    "webAuthenticationDetail",
    "clientDetail",
    "transactionDetail",
    "version",
    "effectiveDate",
    "locationsSearchCriterion",
    "shipperAccountNumber",
    "uniqueTrackingNumber",
    "address",
    "phoneNumber",
    "geographicCoordinates",
    "multipleMatchesAction",
    "sortDetail",
    "constraints"
})
public class SearchLocationsRequest {

    @XmlElement(name = "WebAuthenticationDetail", required = true)
    protected WebAuthenticationDetail webAuthenticationDetail;
    @XmlElement(name = "ClientDetail", required = true)
    protected ClientDetail clientDetail;
    @XmlElement(name = "TransactionDetail")
    protected TransactionDetail transactionDetail;
    @XmlElement(name = "Version", required = true)
    protected VersionId version;
    @XmlElement(name = "EffectiveDate")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar effectiveDate;
    @XmlElement(name = "LocationsSearchCriterion")
    @XmlSchemaType(name = "string")
    protected LocationsSearchCriteriaType locationsSearchCriterion;
    @XmlElement(name = "ShipperAccountNumber")
    protected String shipperAccountNumber;
    @XmlElement(name = "UniqueTrackingNumber")
    protected UniqueTrackingNumber uniqueTrackingNumber;
    @XmlElement(name = "Address")
    protected Address address;
    @XmlElement(name = "PhoneNumber")
    protected String phoneNumber;
    @XmlElement(name = "GeographicCoordinates")
    protected String geographicCoordinates;
    @XmlElement(name = "MultipleMatchesAction")
    @XmlSchemaType(name = "string")
    protected MultipleMatchesActionType multipleMatchesAction;
    @XmlElement(name = "SortDetail")
    protected LocationSortDetail sortDetail;
    @XmlElement(name = "Constraints")
    protected SearchLocationConstraints constraints;

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
     * Gets the value of the effectiveDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getEffectiveDate() {
        return effectiveDate;
    }

    /**
     * Sets the value of the effectiveDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setEffectiveDate(XMLGregorianCalendar value) {
        this.effectiveDate = value;
    }

    /**
     * Gets the value of the locationsSearchCriterion property.
     * 
     * @return
     *     possible object is
     *     {@link LocationsSearchCriteriaType }
     *     
     */
    public LocationsSearchCriteriaType getLocationsSearchCriterion() {
        return locationsSearchCriterion;
    }

    /**
     * Sets the value of the locationsSearchCriterion property.
     * 
     * @param value
     *     allowed object is
     *     {@link LocationsSearchCriteriaType }
     *     
     */
    public void setLocationsSearchCriterion(LocationsSearchCriteriaType value) {
        this.locationsSearchCriterion = value;
    }

    /**
     * Gets the value of the shipperAccountNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShipperAccountNumber() {
        return shipperAccountNumber;
    }

    /**
     * Sets the value of the shipperAccountNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShipperAccountNumber(String value) {
        this.shipperAccountNumber = value;
    }

    /**
     * Gets the value of the uniqueTrackingNumber property.
     * 
     * @return
     *     possible object is
     *     {@link UniqueTrackingNumber }
     *     
     */
    public UniqueTrackingNumber getUniqueTrackingNumber() {
        return uniqueTrackingNumber;
    }

    /**
     * Sets the value of the uniqueTrackingNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link UniqueTrackingNumber }
     *     
     */
    public void setUniqueTrackingNumber(UniqueTrackingNumber value) {
        this.uniqueTrackingNumber = value;
    }

    /**
     * Gets the value of the address property.
     * 
     * @return
     *     possible object is
     *     {@link Address }
     *     
     */
    public Address getAddress() {
        return address;
    }

    /**
     * Sets the value of the address property.
     * 
     * @param value
     *     allowed object is
     *     {@link Address }
     *     
     */
    public void setAddress(Address value) {
        this.address = value;
    }

    /**
     * Gets the value of the phoneNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPhoneNumber() {
        return phoneNumber;
    }

    /**
     * Sets the value of the phoneNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPhoneNumber(String value) {
        this.phoneNumber = value;
    }

    /**
     * Gets the value of the geographicCoordinates property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGeographicCoordinates() {
        return geographicCoordinates;
    }

    /**
     * Sets the value of the geographicCoordinates property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGeographicCoordinates(String value) {
        this.geographicCoordinates = value;
    }

    /**
     * Gets the value of the multipleMatchesAction property.
     * 
     * @return
     *     possible object is
     *     {@link MultipleMatchesActionType }
     *     
     */
    public MultipleMatchesActionType getMultipleMatchesAction() {
        return multipleMatchesAction;
    }

    /**
     * Sets the value of the multipleMatchesAction property.
     * 
     * @param value
     *     allowed object is
     *     {@link MultipleMatchesActionType }
     *     
     */
    public void setMultipleMatchesAction(MultipleMatchesActionType value) {
        this.multipleMatchesAction = value;
    }

    /**
     * Gets the value of the sortDetail property.
     * 
     * @return
     *     possible object is
     *     {@link LocationSortDetail }
     *     
     */
    public LocationSortDetail getSortDetail() {
        return sortDetail;
    }

    /**
     * Sets the value of the sortDetail property.
     * 
     * @param value
     *     allowed object is
     *     {@link LocationSortDetail }
     *     
     */
    public void setSortDetail(LocationSortDetail value) {
        this.sortDetail = value;
    }

    /**
     * Gets the value of the constraints property.
     * 
     * @return
     *     possible object is
     *     {@link SearchLocationConstraints }
     *     
     */
    public SearchLocationConstraints getConstraints() {
        return constraints;
    }

    /**
     * Sets the value of the constraints property.
     * 
     * @param value
     *     allowed object is
     *     {@link SearchLocationConstraints }
     *     
     */
    public void setConstraints(SearchLocationConstraints value) {
        this.constraints = value;
    }

}

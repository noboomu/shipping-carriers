
package com.ups.schema.xpci._1_0.dps;

import jakarta.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.ups.schema.xpci._1_0.dps package. 
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


    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.ups.schema.xpci._1_0.dps
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GovernmentListType }
     * 
     */
    public GovernmentListType createGovernmentListType() {
        return new GovernmentListType();
    }

    /**
     * Create an instance of {@link GovernmentListType.DeniedParty }
     * 
     */
    public GovernmentListType.DeniedParty createGovernmentListTypeDeniedParty() {
        return new GovernmentListType.DeniedParty();
    }

    /**
     * Create an instance of {@link TransactionInfoType }
     * 
     */
    public TransactionInfoType createTransactionInfoType() {
        return new TransactionInfoType();
    }

    /**
     * Create an instance of {@link DeniedPartyScreenerRequest }
     * 
     */
    public DeniedPartyScreenerRequest createDeniedPartyScreenerRequest() {
        return new DeniedPartyScreenerRequest();
    }

    /**
     * Create an instance of {@link RequestTransportType }
     * 
     */
    public RequestTransportType createRequestTransportType() {
        return new RequestTransportType();
    }

    /**
     * Create an instance of {@link PartyType }
     * 
     */
    public PartyType createPartyType() {
        return new PartyType();
    }

    /**
     * Create an instance of {@link DeniedPartyScreenerResponse }
     * 
     */
    public DeniedPartyScreenerResponse createDeniedPartyScreenerResponse() {
        return new DeniedPartyScreenerResponse();
    }

    /**
     * Create an instance of {@link ResponseTransportType }
     * 
     */
    public ResponseTransportType createResponseTransportType() {
        return new ResponseTransportType();
    }

    /**
     * Create an instance of {@link AddressType }
     * 
     */
    public AddressType createAddressType() {
        return new AddressType();
    }

    /**
     * Create an instance of {@link GovernmentListType.ListDescription }
     * 
     */
    public GovernmentListType.ListDescription createGovernmentListTypeListDescription() {
        return new GovernmentListType.ListDescription();
    }

    /**
     * Create an instance of {@link GovernmentListType.DeniedParty.Names }
     * 
     */
    public GovernmentListType.DeniedParty.Names createGovernmentListTypeDeniedPartyNames() {
        return new GovernmentListType.DeniedParty.Names();
    }

    /**
     * Create an instance of {@link GovernmentListType.DeniedParty.Addresses }
     * 
     */
    public GovernmentListType.DeniedParty.Addresses createGovernmentListTypeDeniedPartyAddresses() {
        return new GovernmentListType.DeniedParty.Addresses();
    }

    /**
     * Create an instance of {@link TransactionInfoType.TransactionCharge }
     * 
     */
    public TransactionInfoType.TransactionCharge createTransactionInfoTypeTransactionCharge() {
        return new TransactionInfoType.TransactionCharge();
    }

}

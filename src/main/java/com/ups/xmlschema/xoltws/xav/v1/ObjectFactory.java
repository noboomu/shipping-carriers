
package com.ups.xmlschema.xoltws.xav.v1;

import jakarta.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.ups.xmlschema.xoltws.xav.v1 package. 
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
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.ups.xmlschema.xoltws.xav.v1
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link XAVRequest }
     * 
     */
    public XAVRequest createXAVRequest() {
        return new XAVRequest();
    }

    /**
     * Create an instance of {@link AddressKeyFormatType }
     * 
     */
    public AddressKeyFormatType createAddressKeyFormatType() {
        return new AddressKeyFormatType();
    }

    /**
     * Create an instance of {@link XAVResponse }
     * 
     */
    public XAVResponse createXAVResponse() {
        return new XAVResponse();
    }

    /**
     * Create an instance of {@link AddressClassificationType }
     * 
     */
    public AddressClassificationType createAddressClassificationType() {
        return new AddressClassificationType();
    }

    /**
     * Create an instance of {@link CandidateType }
     * 
     */
    public CandidateType createCandidateType() {
        return new CandidateType();
    }

}

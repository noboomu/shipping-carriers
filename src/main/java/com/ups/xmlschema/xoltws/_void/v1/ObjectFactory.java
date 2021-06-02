
package com.ups.xmlschema.xoltws._void.v1;

import jakarta.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.ups.xmlschema.xoltws._void.v1 package. 
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
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.ups.xmlschema.xoltws._void.v1
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link VoidShipmentRequest }
     * 
     */
    public VoidShipmentRequest createVoidShipmentRequest() {
        return new VoidShipmentRequest();
    }

    /**
     * Create an instance of {@link VoidShipmentResponse }
     * 
     */
    public VoidShipmentResponse createVoidShipmentResponse() {
        return new VoidShipmentResponse();
    }

    /**
     * Create an instance of {@link VoidShipmentRequest.VoidShipment }
     * 
     */
    public VoidShipmentRequest.VoidShipment createVoidShipmentRequestVoidShipment() {
        return new VoidShipmentRequest.VoidShipment();
    }

    /**
     * Create an instance of {@link VoidShipmentResponse.SummaryResult }
     * 
     */
    public VoidShipmentResponse.SummaryResult createVoidShipmentResponseSummaryResult() {
        return new VoidShipmentResponse.SummaryResult();
    }

    /**
     * Create an instance of {@link PackageLevelResult }
     * 
     */
    public PackageLevelResult createPackageLevelResult() {
        return new PackageLevelResult();
    }

    /**
     * Create an instance of {@link CodeDescriptionType }
     * 
     */
    public CodeDescriptionType createCodeDescriptionType() {
        return new CodeDescriptionType();
    }

}

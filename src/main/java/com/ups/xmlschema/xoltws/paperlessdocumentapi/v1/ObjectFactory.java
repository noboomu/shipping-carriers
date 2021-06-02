
package com.ups.xmlschema.xoltws.paperlessdocumentapi.v1;

import jakarta.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.ups.xmlschema.xoltws.paperlessdocumentapi.v1 package. 
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
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.ups.xmlschema.xoltws.paperlessdocumentapi.v1
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link UploadRequest }
     * 
     */
    public UploadRequest createUploadRequest() {
        return new UploadRequest();
    }

    /**
     * Create an instance of {@link UserCreatedForm }
     * 
     */
    public UserCreatedForm createUserCreatedForm() {
        return new UserCreatedForm();
    }

    /**
     * Create an instance of {@link UploadResponse }
     * 
     */
    public UploadResponse createUploadResponse() {
        return new UploadResponse();
    }

    /**
     * Create an instance of {@link FormsHistoryDocumentIDType }
     * 
     */
    public FormsHistoryDocumentIDType createFormsHistoryDocumentIDType() {
        return new FormsHistoryDocumentIDType();
    }

    /**
     * Create an instance of {@link DeleteRequest }
     * 
     */
    public DeleteRequest createDeleteRequest() {
        return new DeleteRequest();
    }

    /**
     * Create an instance of {@link DeleteResponse }
     * 
     */
    public DeleteResponse createDeleteResponse() {
        return new DeleteResponse();
    }

    /**
     * Create an instance of {@link PushToImageRepositoryRequest }
     * 
     */
    public PushToImageRepositoryRequest createPushToImageRepositoryRequest() {
        return new PushToImageRepositoryRequest();
    }

    /**
     * Create an instance of {@link FormsHistoryDocIDImageReq }
     * 
     */
    public FormsHistoryDocIDImageReq createFormsHistoryDocIDImageReq() {
        return new FormsHistoryDocIDImageReq();
    }

    /**
     * Create an instance of {@link PushToImageRepositoryResponse }
     * 
     */
    public PushToImageRepositoryResponse createPushToImageRepositoryResponse() {
        return new PushToImageRepositoryResponse();
    }

}

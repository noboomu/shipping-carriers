
package com.ups.wsdl.xoltws.paperlessdocumentapi.v1;

import com.ups.xmlschema.xoltws.paperlessdocumentapi.v1.DeleteRequest;
import com.ups.xmlschema.xoltws.paperlessdocumentapi.v1.DeleteResponse;
import com.ups.xmlschema.xoltws.paperlessdocumentapi.v1.PushToImageRepositoryRequest;
import com.ups.xmlschema.xoltws.paperlessdocumentapi.v1.PushToImageRepositoryResponse;
import com.ups.xmlschema.xoltws.paperlessdocumentapi.v1.UploadRequest;
import com.ups.xmlschema.xoltws.paperlessdocumentapi.v1.UploadResponse;
import com.ups.xmlschema.xoltws.upss.v1.UPSSecurity;
import jakarta.jws.WebService;
import jakarta.xml.ws.BindingType;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 3.0.1
 * Generated source version: 3.0
 * 
 */
@WebService(portName = "PaperlessDocumentAPIPort", serviceName = "PaperlessDocumentAPIService", targetNamespace = "http://www.ups.com/WSDL/XOLTWS/PaperlessDocumentAPI/v1.0", wsdlLocation = "ws/ups/wsdl/PaperlessDocumentAPI.wsdl", endpointInterface = "com.ups.wsdl.xoltws.paperlessdocumentapi.v1.PaperlessDocumentAPIPortType")
@BindingType("http://schemas.xmlsoap.org/wsdl/soap/http")
public class PaperlessDocumentAPIService_PaperlessDocumentAPIPortImpl
    implements PaperlessDocumentAPIPortType
{


    public PaperlessDocumentAPIService_PaperlessDocumentAPIPortImpl() {
    }

    /**
     * 
     * @param upsSecurity
     * @param body
     * @return
     *     returns com.ups.xmlschema.xoltws.paperlessdocumentapi.v1.UploadResponse
     * @throws UploadErrorMessage
     */
    public UploadResponse processUploading(UploadRequest body, UPSSecurity upsSecurity)
        throws UploadErrorMessage
    {
        //replace with your impl here
        return null;
    }

    /**
     * 
     * @param upsSecurity
     * @param body
     * @return
     *     returns com.ups.xmlschema.xoltws.paperlessdocumentapi.v1.DeleteResponse
     * @throws DeleteErrorMessage
     */
    public DeleteResponse processDeleting(DeleteRequest body, UPSSecurity upsSecurity)
        throws DeleteErrorMessage
    {
        //replace with your impl here
        return null;
    }

    /**
     * 
     * @param upsSecurity
     * @param body
     * @return
     *     returns com.ups.xmlschema.xoltws.paperlessdocumentapi.v1.PushToImageRepositoryResponse
     * @throws PushToImageRepositoryErrorMessage
     */
    public PushToImageRepositoryResponse processPushToImageRepository(PushToImageRepositoryRequest body, UPSSecurity upsSecurity)
        throws PushToImageRepositoryErrorMessage
    {
        //replace with your impl here
        return null;
    }

}
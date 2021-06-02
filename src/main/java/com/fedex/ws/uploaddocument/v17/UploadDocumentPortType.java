
package com.fedex.ws.uploaddocument.v17;

import jakarta.jws.WebMethod;
import jakarta.jws.WebParam;
import jakarta.jws.WebResult;
import jakarta.jws.WebService;
import jakarta.jws.soap.SOAPBinding;
import jakarta.xml.bind.annotation.XmlSeeAlso;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 3.0.1
 * Generated source version: 3.0
 * 
 */
@WebService(name = "UploadDocumentPortType", targetNamespace = "http://fedex.com/ws/uploaddocument/v17")
@SOAPBinding(parameterStyle = SOAPBinding.ParameterStyle.BARE)
@XmlSeeAlso({
    ObjectFactory.class
})
public interface UploadDocumentPortType {


    /**
     * 
     * @param uploadDocumentsRequest
     * @return
     *     returns com.fedex.ws.uploaddocument.v17.UploadDocumentsReply
     */
    @WebMethod(action = "http://fedex.com/ws/uploaddocument/v17/uploadDocuments")
    @WebResult(name = "UploadDocumentsReply", targetNamespace = "http://fedex.com/ws/uploaddocument/v17", partName = "UploadDocumentsReply")
    public UploadDocumentsReply uploadDocuments(
        @WebParam(name = "UploadDocumentsRequest", targetNamespace = "http://fedex.com/ws/uploaddocument/v17", partName = "UploadDocumentsRequest")
        UploadDocumentsRequest uploadDocumentsRequest);

    /**
     * 
     * @param uploadImagesRequest
     * @return
     *     returns com.fedex.ws.uploaddocument.v17.UploadImagesReply
     */
    @WebMethod(action = "http://fedex.com/ws/uploaddocument/v17/uploadImages")
    @WebResult(name = "UploadImagesReply", targetNamespace = "http://fedex.com/ws/uploaddocument/v17", partName = "UploadImagesReply")
    public UploadImagesReply uploadImages(
        @WebParam(name = "UploadImagesRequest", targetNamespace = "http://fedex.com/ws/uploaddocument/v17", partName = "UploadImagesRequest")
        UploadImagesRequest uploadImagesRequest);

    /**
     * 
     * @param uploadDocumentsWithShipmentDataRequest
     * @return
     *     returns com.fedex.ws.uploaddocument.v17.UploadDocumentsWithShipmentDataReply
     */
    @WebMethod(action = "http://fedex.com/ws/uploaddocument/v17/uploadDocumentsWithShipmentData")
    @WebResult(name = "UploadDocumentsWithShipmentDataReply", targetNamespace = "http://fedex.com/ws/uploaddocument/v17", partName = "UploadDocumentsWithShipmentDataReply")
    public UploadDocumentsWithShipmentDataReply uploadDocumentsWithShipmentData(
        @WebParam(name = "UploadDocumentsWithShipmentDataRequest", targetNamespace = "http://fedex.com/ws/uploaddocument/v17", partName = "UploadDocumentsWithShipmentDataRequest")
        UploadDocumentsWithShipmentDataRequest uploadDocumentsWithShipmentDataRequest);

}
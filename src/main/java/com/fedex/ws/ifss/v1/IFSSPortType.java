
package com.fedex.ws.ifss.v1;

import java.util.concurrent.Future;
import jakarta.jws.WebMethod;
import jakarta.jws.WebParam;
import jakarta.jws.WebResult;
import jakarta.jws.WebService;
import jakarta.jws.soap.SOAPBinding;
import jakarta.xml.bind.annotation.XmlSeeAlso;
import jakarta.xml.ws.AsyncHandler;
import jakarta.xml.ws.Response;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 3.0.1
 * Generated source version: 3.0
 * 
 */
@WebService(name = "IFSSPortType", targetNamespace = "http://fedex.com/ws/ifss/v1")
@SOAPBinding(parameterStyle = SOAPBinding.ParameterStyle.BARE)
@XmlSeeAlso({
    ObjectFactory.class
})
public interface IFSSPortType {


    /**
     * 
     * @param validateDeliveryRequest
     * @return
     *     returns jakarta.xml.ws.Response<com.fedex.ws.ifss.v1.ValidateDeliveryReply>
     */
    @WebMethod(operationName = "validateDelivery", action = "http://fedex.com/ws/ifss/v1/validateDelivery")
    public Response<ValidateDeliveryReply> validateDeliveryAsync(
        @WebParam(name = "ValidateDeliveryRequest", targetNamespace = "http://fedex.com/ws/ifss/v1", partName = "ValidateDeliveryRequest")
        ValidateDeliveryRequest validateDeliveryRequest);

    /**
     * 
     * @param asyncHandler
     * @param validateDeliveryRequest
     * @return
     *     returns java.util.concurrent.Future<? extends java.lang.Object>
     */
    @WebMethod(operationName = "validateDelivery", action = "http://fedex.com/ws/ifss/v1/validateDelivery")
    public Future<?> validateDeliveryAsync(
        @WebParam(name = "ValidateDeliveryRequest", targetNamespace = "http://fedex.com/ws/ifss/v1", partName = "ValidateDeliveryRequest")
        ValidateDeliveryRequest validateDeliveryRequest,
        @WebParam(name = "validateDeliveryResponse", targetNamespace = "", partName = "asyncHandler")
        AsyncHandler<ValidateDeliveryReply> asyncHandler);

    /**
     * 
     * @param validateDeliveryRequest
     * @return
     *     returns com.fedex.ws.ifss.v1.ValidateDeliveryReply
     */
    @WebMethod(action = "http://fedex.com/ws/ifss/v1/validateDelivery")
    @WebResult(name = "ValidateDeliveryReply", targetNamespace = "http://fedex.com/ws/ifss/v1", partName = "ValidateDeliveryReply")
    public ValidateDeliveryReply validateDelivery(
        @WebParam(name = "ValidateDeliveryRequest", targetNamespace = "http://fedex.com/ws/ifss/v1", partName = "ValidateDeliveryRequest")
        ValidateDeliveryRequest validateDeliveryRequest);

    /**
     * 
     * @param processDeliveryRequest
     * @return
     *     returns jakarta.xml.ws.Response<com.fedex.ws.ifss.v1.ProcessDeliveryReply>
     */
    @WebMethod(operationName = "processDelivery", action = "http://fedex.com/ws/ifss/v1/processDelivery")
    public Response<ProcessDeliveryReply> processDeliveryAsync(
        @WebParam(name = "ProcessDeliveryRequest", targetNamespace = "http://fedex.com/ws/ifss/v1", partName = "ProcessDeliveryRequest")
        ProcessDeliveryRequest processDeliveryRequest);

    /**
     * 
     * @param asyncHandler
     * @param processDeliveryRequest
     * @return
     *     returns java.util.concurrent.Future<? extends java.lang.Object>
     */
    @WebMethod(operationName = "processDelivery", action = "http://fedex.com/ws/ifss/v1/processDelivery")
    public Future<?> processDeliveryAsync(
        @WebParam(name = "ProcessDeliveryRequest", targetNamespace = "http://fedex.com/ws/ifss/v1", partName = "ProcessDeliveryRequest")
        ProcessDeliveryRequest processDeliveryRequest,
        @WebParam(name = "processDeliveryResponse", targetNamespace = "", partName = "asyncHandler")
        AsyncHandler<ProcessDeliveryReply> asyncHandler);

    /**
     * 
     * @param processDeliveryRequest
     * @return
     *     returns com.fedex.ws.ifss.v1.ProcessDeliveryReply
     */
    @WebMethod(action = "http://fedex.com/ws/ifss/v1/processDelivery")
    @WebResult(name = "ProcessDeliveryReply", targetNamespace = "http://fedex.com/ws/ifss/v1", partName = "ProcessDeliveryReply")
    public ProcessDeliveryReply processDelivery(
        @WebParam(name = "ProcessDeliveryRequest", targetNamespace = "http://fedex.com/ws/ifss/v1", partName = "ProcessDeliveryRequest")
        ProcessDeliveryRequest processDeliveryRequest);

}


package com.fedex.ws.locs.v12;

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
@WebService(name = "LocationsPortType", targetNamespace = "http://fedex.com/ws/locs/v12")
@SOAPBinding(parameterStyle = SOAPBinding.ParameterStyle.BARE)
@XmlSeeAlso({
    ObjectFactory.class
})
public interface LocationsPortType {


    /**
     * 
     * @param searchLocationsRequest
     * @return
     *     returns jakarta.xml.ws.Response<com.fedex.ws.locs.v12.SearchLocationsReply>
     */
    @WebMethod(operationName = "searchLocations", action = "http://fedex.com/ws/locs/v12/searchLocations")
    public Response<SearchLocationsReply> searchLocationsAsync(
        @WebParam(name = "SearchLocationsRequest", targetNamespace = "http://fedex.com/ws/locs/v12", partName = "SearchLocationsRequest")
        SearchLocationsRequest searchLocationsRequest);

    /**
     * 
     * @param searchLocationsRequest
     * @param asyncHandler
     * @return
     *     returns java.util.concurrent.Future<? extends java.lang.Object>
     */
    @WebMethod(operationName = "searchLocations", action = "http://fedex.com/ws/locs/v12/searchLocations")
    public Future<?> searchLocationsAsync(
        @WebParam(name = "SearchLocationsRequest", targetNamespace = "http://fedex.com/ws/locs/v12", partName = "SearchLocationsRequest")
        SearchLocationsRequest searchLocationsRequest,
        @WebParam(name = "searchLocationsResponse", targetNamespace = "", partName = "asyncHandler")
        AsyncHandler<SearchLocationsReply> asyncHandler);

    /**
     * 
     * @param searchLocationsRequest
     * @return
     *     returns com.fedex.ws.locs.v12.SearchLocationsReply
     */
    @WebMethod(action = "http://fedex.com/ws/locs/v12/searchLocations")
    @WebResult(name = "SearchLocationsReply", targetNamespace = "http://fedex.com/ws/locs/v12", partName = "SearchLocationsReply")
    public SearchLocationsReply searchLocations(
        @WebParam(name = "SearchLocationsRequest", targetNamespace = "http://fedex.com/ws/locs/v12", partName = "SearchLocationsRequest")
        SearchLocationsRequest searchLocationsRequest);

}

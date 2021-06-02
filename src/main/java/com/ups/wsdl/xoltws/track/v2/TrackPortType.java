
package com.ups.wsdl.xoltws.track.v2;

import java.util.concurrent.Future;
import com.ups.xmlschema.xoltws.track.v2.TrackRequest;
import com.ups.xmlschema.xoltws.track.v2.TrackResponse;
import com.ups.xmlschema.xoltws.upss.v1.UPSSecurity;
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
@WebService(name = "TrackPortType", targetNamespace = "http://www.ups.com/WSDL/XOLTWS/Track/v2.0")
@SOAPBinding(parameterStyle = SOAPBinding.ParameterStyle.BARE)
@XmlSeeAlso({
    com.ups.xmlschema.xoltws.upss.v1.ObjectFactory.class,
    com.ups.xmlschema.xoltws.common.v1.ObjectFactory.class,
    com.ups.xmlschema.xoltws.error.v1.ObjectFactory.class,
    com.ups.xmlschema.xoltws.track.v2.ObjectFactory.class
})
public interface TrackPortType {


    /**
     * 
     * @param upsSecurity
     * @param body
     * @return
     *     returns jakarta.xml.ws.Response<com.ups.xmlschema.xoltws.track.v2.TrackResponse>
     */
    @WebMethod(operationName = "ProcessTrack", action = "http://onlinetools.ups.com/webservices/TrackBinding/v2.0")
    public Response<TrackResponse> processTrackAsync(
        @WebParam(name = "TrackRequest", targetNamespace = "http://www.ups.com/XMLSchema/XOLTWS/Track/v2.0", partName = "Body")
        TrackRequest body,
        @WebParam(name = "UPSSecurity", targetNamespace = "http://www.ups.com/XMLSchema/XOLTWS/UPSS/v1.0", header = true, partName = "UPSSecurity")
        UPSSecurity upsSecurity);

    /**
     * 
     * @param upsSecurity
     * @param body
     * @param asyncHandler
     * @return
     *     returns java.util.concurrent.Future<? extends java.lang.Object>
     */
    @WebMethod(operationName = "ProcessTrack", action = "http://onlinetools.ups.com/webservices/TrackBinding/v2.0")
    public Future<?> processTrackAsync(
        @WebParam(name = "TrackRequest", targetNamespace = "http://www.ups.com/XMLSchema/XOLTWS/Track/v2.0", partName = "Body")
        TrackRequest body,
        @WebParam(name = "UPSSecurity", targetNamespace = "http://www.ups.com/XMLSchema/XOLTWS/UPSS/v1.0", header = true, partName = "UPSSecurity")
        UPSSecurity upsSecurity,
        @WebParam(name = "ProcessTrackResponse", targetNamespace = "", partName = "asyncHandler")
        AsyncHandler<TrackResponse> asyncHandler);

    /**
     * 
     * @param upsSecurity
     * @param body
     * @return
     *     returns com.ups.xmlschema.xoltws.track.v2.TrackResponse
     * @throws TrackErrorMessage
     */
    @WebMethod(operationName = "ProcessTrack", action = "http://onlinetools.ups.com/webservices/TrackBinding/v2.0")
    @WebResult(name = "TrackResponse", targetNamespace = "http://www.ups.com/XMLSchema/XOLTWS/Track/v2.0", partName = "Body")
    public TrackResponse processTrack(
        @WebParam(name = "TrackRequest", targetNamespace = "http://www.ups.com/XMLSchema/XOLTWS/Track/v2.0", partName = "Body")
        TrackRequest body,
        @WebParam(name = "UPSSecurity", targetNamespace = "http://www.ups.com/XMLSchema/XOLTWS/UPSS/v1.0", header = true, partName = "UPSSecurity")
        UPSSecurity upsSecurity)
        throws TrackErrorMessage
    ;

}

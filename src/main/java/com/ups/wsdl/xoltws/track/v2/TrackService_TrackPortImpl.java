
package com.ups.wsdl.xoltws.track.v2;

import com.ups.xmlschema.xoltws.track.v2.TrackRequest;
import com.ups.xmlschema.xoltws.track.v2.TrackResponse;
import com.ups.xmlschema.xoltws.upss.v1.UPSSecurity;
import jakarta.jws.WebService;
import jakarta.xml.ws.BindingType;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 3.0.1
 * Generated source version: 3.0
 * 
 */
@WebService(portName = "TrackPort", serviceName = "TrackService", targetNamespace = "http://www.ups.com/WSDL/XOLTWS/Track/v2.0", wsdlLocation = "ws/ups/wsdl/Track.wsdl", endpointInterface = "com.ups.wsdl.xoltws.track.v2.TrackPortType")
@BindingType("http://schemas.xmlsoap.org/wsdl/soap/http")
public class TrackService_TrackPortImpl
    implements TrackPortType
{


    public TrackService_TrackPortImpl() {
    }

    /**
     * 
     * @param upsSecurity
     * @param body
     * @return
     *     returns com.ups.xmlschema.xoltws.track.v2.TrackResponse
     * @throws TrackErrorMessage
     */
    public TrackResponse processTrack(TrackRequest body, UPSSecurity upsSecurity)
        throws TrackErrorMessage
    {
        //replace with your impl here
        return null;
    }

}
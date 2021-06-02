
package com.ups.wsdl.xoltws.track.v2;

import java.net.URL;
import javax.xml.namespace.QName;
import jakarta.xml.ws.Service;
import jakarta.xml.ws.WebEndpoint;
import jakarta.xml.ws.WebServiceClient;
import jakarta.xml.ws.WebServiceException;
import jakarta.xml.ws.WebServiceFeature;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 3.0.1
 * Generated source version: 3.0
 * 
 */
@WebServiceClient(name = "TrackService", targetNamespace = "http://www.ups.com/WSDL/XOLTWS/Track/v2.0", wsdlLocation = "ws/ups/wsdl/Track.wsdl")
public class TrackService
    extends Service
{

    private final static URL TRACKSERVICE_WSDL_LOCATION;
    private final static WebServiceException TRACKSERVICE_EXCEPTION;
    private final static QName TRACKSERVICE_QNAME = new QName("http://www.ups.com/WSDL/XOLTWS/Track/v2.0", "TrackService");

    static {
        TRACKSERVICE_WSDL_LOCATION = com.ups.wsdl.xoltws.track.v2.TrackService.class.getResource("ws/ups/wsdl/Track.wsdl");
        WebServiceException e = null;
        if (TRACKSERVICE_WSDL_LOCATION == null) {
            e = new WebServiceException("Cannot find 'ws/ups/wsdl/Track.wsdl' wsdl. Place the resource correctly in the classpath.");
        }
        TRACKSERVICE_EXCEPTION = e;
    }

    public TrackService() {
        super(__getWsdlLocation(), TRACKSERVICE_QNAME);
    }

    public TrackService(WebServiceFeature... features) {
        super(__getWsdlLocation(), TRACKSERVICE_QNAME, features);
    }

    public TrackService(URL wsdlLocation) {
        super(wsdlLocation, TRACKSERVICE_QNAME);
    }

    public TrackService(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, TRACKSERVICE_QNAME, features);
    }

    public TrackService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public TrackService(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns TrackPortType
     */
    @WebEndpoint(name = "TrackPort")
    public TrackPortType getTrackPort() {
        return super.getPort(new QName("http://www.ups.com/WSDL/XOLTWS/Track/v2.0", "TrackPort"), TrackPortType.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link jakarta.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns TrackPortType
     */
    @WebEndpoint(name = "TrackPort")
    public TrackPortType getTrackPort(WebServiceFeature... features) {
        return super.getPort(new QName("http://www.ups.com/WSDL/XOLTWS/Track/v2.0", "TrackPort"), TrackPortType.class, features);
    }

    private static URL __getWsdlLocation() {
        if (TRACKSERVICE_EXCEPTION!= null) {
            throw TRACKSERVICE_EXCEPTION;
        }
        return TRACKSERVICE_WSDL_LOCATION;
    }

}
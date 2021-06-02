
package com.ups.wsdl.xoltws.xav.v1;

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
@WebServiceClient(name = "XAVService", targetNamespace = "http://www.ups.com/WSDL/XOLTWS/XAV/v1.0", wsdlLocation = "ws/ups/wsdl/XAV.wsdl")
public class XAVService
    extends Service
{

    private final static URL XAVSERVICE_WSDL_LOCATION;
    private final static WebServiceException XAVSERVICE_EXCEPTION;
    private final static QName XAVSERVICE_QNAME = new QName("http://www.ups.com/WSDL/XOLTWS/XAV/v1.0", "XAVService");

    static {
        XAVSERVICE_WSDL_LOCATION = com.ups.wsdl.xoltws.xav.v1.XAVService.class.getResource("ws/ups/wsdl/XAV.wsdl");
        WebServiceException e = null;
        if (XAVSERVICE_WSDL_LOCATION == null) {
            e = new WebServiceException("Cannot find 'ws/ups/wsdl/XAV.wsdl' wsdl. Place the resource correctly in the classpath.");
        }
        XAVSERVICE_EXCEPTION = e;
    }

    public XAVService() {
        super(__getWsdlLocation(), XAVSERVICE_QNAME);
    }

    public XAVService(WebServiceFeature... features) {
        super(__getWsdlLocation(), XAVSERVICE_QNAME, features);
    }

    public XAVService(URL wsdlLocation) {
        super(wsdlLocation, XAVSERVICE_QNAME);
    }

    public XAVService(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, XAVSERVICE_QNAME, features);
    }

    public XAVService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public XAVService(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns XAVPortType
     */
    @WebEndpoint(name = "XAVPort")
    public XAVPortType getXAVPort() {
        return super.getPort(new QName("http://www.ups.com/WSDL/XOLTWS/XAV/v1.0", "XAVPort"), XAVPortType.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link jakarta.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns XAVPortType
     */
    @WebEndpoint(name = "XAVPort")
    public XAVPortType getXAVPort(WebServiceFeature... features) {
        return super.getPort(new QName("http://www.ups.com/WSDL/XOLTWS/XAV/v1.0", "XAVPort"), XAVPortType.class, features);
    }

    private static URL __getWsdlLocation() {
        if (XAVSERVICE_EXCEPTION!= null) {
            throw XAVSERVICE_EXCEPTION;
        }
        return XAVSERVICE_WSDL_LOCATION;
    }

}
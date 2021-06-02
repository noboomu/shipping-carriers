
package com.ups.wsdl.xoltws.rate.v1;

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
@WebServiceClient(name = "RateService", targetNamespace = "http://www.ups.com/WSDL/XOLTWS/Rate/v1.1", wsdlLocation = "ws/ups/wsdl/RateWS.wsdl")
public class RateService
    extends Service
{

    private final static URL RATESERVICE_WSDL_LOCATION;
    private final static WebServiceException RATESERVICE_EXCEPTION;
    private final static QName RATESERVICE_QNAME = new QName("http://www.ups.com/WSDL/XOLTWS/Rate/v1.1", "RateService");

    static {
        RATESERVICE_WSDL_LOCATION = com.ups.wsdl.xoltws.rate.v1.RateService.class.getResource("ws/ups/wsdl/RateWS.wsdl");
        WebServiceException e = null;
        if (RATESERVICE_WSDL_LOCATION == null) {
            e = new WebServiceException("Cannot find 'ws/ups/wsdl/RateWS.wsdl' wsdl. Place the resource correctly in the classpath.");
        }
        RATESERVICE_EXCEPTION = e;
    }

    public RateService() {
        super(__getWsdlLocation(), RATESERVICE_QNAME);
    }

    public RateService(WebServiceFeature... features) {
        super(__getWsdlLocation(), RATESERVICE_QNAME, features);
    }

    public RateService(URL wsdlLocation) {
        super(wsdlLocation, RATESERVICE_QNAME);
    }

    public RateService(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, RATESERVICE_QNAME, features);
    }

    public RateService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public RateService(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns RatePortType
     */
    @WebEndpoint(name = "RatePort")
    public RatePortType getRatePort() {
        return super.getPort(new QName("http://www.ups.com/WSDL/XOLTWS/Rate/v1.1", "RatePort"), RatePortType.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link jakarta.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns RatePortType
     */
    @WebEndpoint(name = "RatePort")
    public RatePortType getRatePort(WebServiceFeature... features) {
        return super.getPort(new QName("http://www.ups.com/WSDL/XOLTWS/Rate/v1.1", "RatePort"), RatePortType.class, features);
    }

    private static URL __getWsdlLocation() {
        if (RATESERVICE_EXCEPTION!= null) {
            throw RATESERVICE_EXCEPTION;
        }
        return RATESERVICE_WSDL_LOCATION;
    }

}


package com.ups.wsdl.xoltws.freightrate.v1;

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
@WebServiceClient(name = "FreightRateService", targetNamespace = "http://www.ups.com/WSDL/XOLTWS/FreightRate/v1.0", wsdlLocation = "ws/ups/wsdl/FreightRate.wsdl")
public class FreightRateService
    extends Service
{

    private final static URL FREIGHTRATESERVICE_WSDL_LOCATION;
    private final static WebServiceException FREIGHTRATESERVICE_EXCEPTION;
    private final static QName FREIGHTRATESERVICE_QNAME = new QName("http://www.ups.com/WSDL/XOLTWS/FreightRate/v1.0", "FreightRateService");

    static {
        FREIGHTRATESERVICE_WSDL_LOCATION = com.ups.wsdl.xoltws.freightrate.v1.FreightRateService.class.getResource("ws/ups/wsdl/FreightRate.wsdl");
        WebServiceException e = null;
        if (FREIGHTRATESERVICE_WSDL_LOCATION == null) {
            e = new WebServiceException("Cannot find 'ws/ups/wsdl/FreightRate.wsdl' wsdl. Place the resource correctly in the classpath.");
        }
        FREIGHTRATESERVICE_EXCEPTION = e;
    }

    public FreightRateService() {
        super(__getWsdlLocation(), FREIGHTRATESERVICE_QNAME);
    }

    public FreightRateService(WebServiceFeature... features) {
        super(__getWsdlLocation(), FREIGHTRATESERVICE_QNAME, features);
    }

    public FreightRateService(URL wsdlLocation) {
        super(wsdlLocation, FREIGHTRATESERVICE_QNAME);
    }

    public FreightRateService(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, FREIGHTRATESERVICE_QNAME, features);
    }

    public FreightRateService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public FreightRateService(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns FreightRatePortType
     */
    @WebEndpoint(name = "FreightRatePort")
    public FreightRatePortType getFreightRatePort() {
        return super.getPort(new QName("http://www.ups.com/WSDL/XOLTWS/FreightRate/v1.0", "FreightRatePort"), FreightRatePortType.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link jakarta.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns FreightRatePortType
     */
    @WebEndpoint(name = "FreightRatePort")
    public FreightRatePortType getFreightRatePort(WebServiceFeature... features) {
        return super.getPort(new QName("http://www.ups.com/WSDL/XOLTWS/FreightRate/v1.0", "FreightRatePort"), FreightRatePortType.class, features);
    }

    private static URL __getWsdlLocation() {
        if (FREIGHTRATESERVICE_EXCEPTION!= null) {
            throw FREIGHTRATESERVICE_EXCEPTION;
        }
        return FREIGHTRATESERVICE_WSDL_LOCATION;
    }

}

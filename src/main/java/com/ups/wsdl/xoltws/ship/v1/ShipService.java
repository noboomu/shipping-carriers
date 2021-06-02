
package com.ups.wsdl.xoltws.ship.v1;

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
@WebServiceClient(name = "ShipService", targetNamespace = "http://www.ups.com/WSDL/XOLTWS/Ship/v1.0", wsdlLocation = "ws/ups/wsdl/Ship.wsdl")
public class ShipService
    extends Service
{

    private final static URL SHIPSERVICE_WSDL_LOCATION;
    private final static WebServiceException SHIPSERVICE_EXCEPTION;
    private final static QName SHIPSERVICE_QNAME = new QName("http://www.ups.com/WSDL/XOLTWS/Ship/v1.0", "ShipService");

    static {
        SHIPSERVICE_WSDL_LOCATION = com.ups.wsdl.xoltws.ship.v1.ShipService.class.getResource("ws/ups/wsdl/Ship.wsdl");
        WebServiceException e = null;
        if (SHIPSERVICE_WSDL_LOCATION == null) {
            e = new WebServiceException("Cannot find 'ws/ups/wsdl/Ship.wsdl' wsdl. Place the resource correctly in the classpath.");
        }
        SHIPSERVICE_EXCEPTION = e;
    }

    public ShipService() {
        super(__getWsdlLocation(), SHIPSERVICE_QNAME);
    }

    public ShipService(WebServiceFeature... features) {
        super(__getWsdlLocation(), SHIPSERVICE_QNAME, features);
    }

    public ShipService(URL wsdlLocation) {
        super(wsdlLocation, SHIPSERVICE_QNAME);
    }

    public ShipService(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, SHIPSERVICE_QNAME, features);
    }

    public ShipService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public ShipService(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns ShipPortType
     */
    @WebEndpoint(name = "ShipPort")
    public ShipPortType getShipPort() {
        return super.getPort(new QName("http://www.ups.com/WSDL/XOLTWS/Ship/v1.0", "ShipPort"), ShipPortType.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link jakarta.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns ShipPortType
     */
    @WebEndpoint(name = "ShipPort")
    public ShipPortType getShipPort(WebServiceFeature... features) {
        return super.getPort(new QName("http://www.ups.com/WSDL/XOLTWS/Ship/v1.0", "ShipPort"), ShipPortType.class, features);
    }

    private static URL __getWsdlLocation() {
        if (SHIPSERVICE_EXCEPTION!= null) {
            throw SHIPSERVICE_EXCEPTION;
        }
        return SHIPSERVICE_WSDL_LOCATION;
    }

}
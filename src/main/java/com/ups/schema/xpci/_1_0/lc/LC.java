
package com.ups.schema.xpci._1_0.lc;

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
@WebServiceClient(name = "LC", targetNamespace = "http://www.ups.com/schema/xpci/1.0/lc", wsdlLocation = "ws/ups/wsdl/LandedCost.wsdl")
public class LC
    extends Service
{

    private final static URL LC_WSDL_LOCATION;
    private final static WebServiceException LC_EXCEPTION;
    private final static QName LC_QNAME = new QName("http://www.ups.com/schema/xpci/1.0/lc", "LC");

    static {
        LC_WSDL_LOCATION = com.ups.schema.xpci._1_0.lc.LC.class.getResource("ws/ups/wsdl/LandedCost.wsdl");
        WebServiceException e = null;
        if (LC_WSDL_LOCATION == null) {
            e = new WebServiceException("Cannot find 'ws/ups/wsdl/LandedCost.wsdl' wsdl. Place the resource correctly in the classpath.");
        }
        LC_EXCEPTION = e;
    }

    public LC() {
        super(__getWsdlLocation(), LC_QNAME);
    }

    public LC(WebServiceFeature... features) {
        super(__getWsdlLocation(), LC_QNAME, features);
    }

    public LC(URL wsdlLocation) {
        super(wsdlLocation, LC_QNAME);
    }

    public LC(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, LC_QNAME, features);
    }

    public LC(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public LC(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns LCRequestPortType
     */
    @WebEndpoint(name = "LCRequestPortTypePort")
    public LCRequestPortType getLCRequestPortTypePort() {
        return super.getPort(new QName("http://www.ups.com/schema/xpci/1.0/lc", "LCRequestPortTypePort"), LCRequestPortType.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link jakarta.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns LCRequestPortType
     */
    @WebEndpoint(name = "LCRequestPortTypePort")
    public LCRequestPortType getLCRequestPortTypePort(WebServiceFeature... features) {
        return super.getPort(new QName("http://www.ups.com/schema/xpci/1.0/lc", "LCRequestPortTypePort"), LCRequestPortType.class, features);
    }

    private static URL __getWsdlLocation() {
        if (LC_EXCEPTION!= null) {
            throw LC_EXCEPTION;
        }
        return LC_WSDL_LOCATION;
    }

}

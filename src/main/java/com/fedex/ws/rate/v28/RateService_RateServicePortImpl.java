
package com.fedex.ws.rate.v28;

import jakarta.jws.WebService;
import jakarta.xml.ws.BindingType;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 3.0.1
 * Generated source version: 3.0
 * 
 */
@WebService(portName = "RateServicePort", serviceName = "RateService", targetNamespace = "http://fedex.com/ws/rate/v28", wsdlLocation = "ws/fedex/wsdl/RateService_v28.wsdl", endpointInterface = "com.fedex.ws.rate.v28.RatePortType")
@BindingType("http://schemas.xmlsoap.org/wsdl/soap/http")
public class RateService_RateServicePortImpl
    implements RatePortType
{


    public RateService_RateServicePortImpl() {
    }

    /**
     * 
     * @param rateRequest
     * @return
     *     returns com.fedex.ws.rate.v28.RateReply
     */
    public RateReply getRates(RateRequest rateRequest) {
        //replace with your impl here
        return null;
    }

}
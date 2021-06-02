
package com.ups.schema.xpci._1_0.dps;

import com.ups.schema.xpci._1_0.auth.AccessRequest;
import jakarta.jws.WebService;
import jakarta.xml.ws.BindingType;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 3.0.1
 * Generated source version: 3.0
 * 
 */
@WebService(portName = "DPSRequestPortTypePort", serviceName = "DPS", targetNamespace = "http://www.ups.com/schema/xpci/1.0/dps", wsdlLocation = "ws/ups/wsdl/DeniedParty.wsdl", endpointInterface = "com.ups.schema.xpci._1_0.dps.DPSRequestPortType")
@BindingType("http://schemas.xmlsoap.org/wsdl/soap/http")
public class DPS_DPSRequestPortTypePortImpl
    implements DPSRequestPortType
{


    public DPS_DPSRequestPortTypePortImpl() {
    }

    /**
     * 
     * @param accessRequest
     * @param body
     * @return
     *     returns com.ups.schema.xpci._1_0.dps.DeniedPartyScreenerResponse
     * @throws Error
     */
    public DeniedPartyScreenerResponse processDPSRequest(DeniedPartyScreenerRequest body, AccessRequest accessRequest)
        throws Error
    {
        //replace with your impl here
        return null;
    }

}
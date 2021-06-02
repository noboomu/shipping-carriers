
package com.ups.schema.xpci._1_0.dps;

import com.ups.schema.xpci._1_0.auth.AccessRequest;
import jakarta.jws.WebMethod;
import jakarta.jws.WebParam;
import jakarta.jws.WebResult;
import jakarta.jws.WebService;
import jakarta.jws.soap.SOAPBinding;
import jakarta.xml.bind.annotation.XmlSeeAlso;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 3.0.1
 * Generated source version: 3.0
 * 
 */
@WebService(name = "DPSRequestPortType", targetNamespace = "http://www.ups.com/schema/xpci/1.0/dps")
@SOAPBinding(parameterStyle = SOAPBinding.ParameterStyle.BARE)
@XmlSeeAlso({
    com.ups.schema.xpci._1_0.dps.ObjectFactory.class,
    com.ups.schema.xpci._1_0.auth.ObjectFactory.class,
    com.ups.schema.xpci._1_0.error.ObjectFactory.class
})
public interface DPSRequestPortType {


    /**
     * 
     * @param accessRequest
     * @param body
     * @return
     *     returns com.ups.schema.xpci._1_0.dps.DeniedPartyScreenerResponse
     * @throws Error
     */
    @WebMethod(operationName = "ProcessDPSRequest", action = "http://www.ups.com/webservices/DPSRequestBinding")
    @WebResult(name = "DeniedPartyScreenerResponse", targetNamespace = "http://www.ups.com/schema/xpci/1.0/dps", partName = "Body")
    public DeniedPartyScreenerResponse processDPSRequest(
        @WebParam(name = "DeniedPartyScreenerRequest", targetNamespace = "http://www.ups.com/schema/xpci/1.0/dps", partName = "Body")
        DeniedPartyScreenerRequest body,
        @WebParam(name = "AccessRequest", targetNamespace = "http://www.ups.com/schema/xpci/1.0/auth", header = true, partName = "AccessRequest")
        AccessRequest accessRequest)
        throws Error
    ;

}
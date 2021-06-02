
package com.fedex.ws.addressvalidation.v4;

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
@WebService(name = "AddressValidationPortType", targetNamespace = "http://fedex.com/ws/addressvalidation/v4")
@SOAPBinding(parameterStyle = SOAPBinding.ParameterStyle.BARE)
@XmlSeeAlso({
    ObjectFactory.class
})
public interface AddressValidationPortType {


    /**
     * 
     * @param addressValidationRequest
     * @return
     *     returns com.fedex.ws.addressvalidation.v4.AddressValidationReply
     */
    @WebMethod(action = "http://fedex.com/ws/addressvalidation/v4/addressValidation")
    @WebResult(name = "AddressValidationReply", targetNamespace = "http://fedex.com/ws/addressvalidation/v4", partName = "AddressValidationReply")
    public AddressValidationReply addressValidation(
        @WebParam(name = "AddressValidationRequest", targetNamespace = "http://fedex.com/ws/addressvalidation/v4", partName = "AddressValidationRequest")
        AddressValidationRequest addressValidationRequest);

}
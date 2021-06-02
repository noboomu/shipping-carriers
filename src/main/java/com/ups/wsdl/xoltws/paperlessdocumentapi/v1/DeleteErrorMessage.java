
package com.ups.wsdl.xoltws.paperlessdocumentapi.v1;

import com.ups.xmlschema.xoltws.error.v1.Errors;
import jakarta.xml.ws.WebFault;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 3.0.1
 * Generated source version: 3.0
 * 
 */
@WebFault(name = "Errors", targetNamespace = "http://www.ups.com/XMLSchema/XOLTWS/Error/v1.1")
public class DeleteErrorMessage
    extends Exception
{

    /**
     * Java type that goes as soapenv:Fault detail element.
     * 
     */
    private Errors faultInfo;

    /**
     * 
     * @param faultInfo
     * @param message
     */
    public DeleteErrorMessage(String message, Errors faultInfo) {
        super(message);
        this.faultInfo = faultInfo;
    }

    /**
     * 
     * @param faultInfo
     * @param cause
     * @param message
     */
    public DeleteErrorMessage(String message, Errors faultInfo, Throwable cause) {
        super(message, cause);
        this.faultInfo = faultInfo;
    }

    /**
     * 
     * @return
     *     returns fault bean: com.ups.xmlschema.xoltws.error.v1.Errors
     */
    public Errors getFaultInfo() {
        return faultInfo;
    }

}

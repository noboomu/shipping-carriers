
package com.ups.wsdl.xoltws.lbrecovery.v1;

import com.ups.xmlschema.xoltws.lbrecovery.v1.LabelRecoveryRequest;
import com.ups.xmlschema.xoltws.lbrecovery.v1.LabelRecoveryResponse;
import com.ups.xmlschema.xoltws.upss.v1.UPSSecurity;
import jakarta.jws.WebService;
import jakarta.xml.ws.BindingType;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 3.0.1
 * Generated source version: 3.0
 * 
 */
@WebService(portName = "Port", serviceName = "LBRecovery", targetNamespace = "http://www.ups.com/WSDL/XOLTWS/LBRecovery/v1.0", wsdlLocation = "ws/ups/wsdl/LabelRecoveryWS.wsdl", endpointInterface = "com.ups.wsdl.xoltws.lbrecovery.v1.PortType")
@BindingType("http://schemas.xmlsoap.org/wsdl/soap/http")
public class LBRecovery_PortImpl
    implements PortType
{


    public LBRecovery_PortImpl() {
    }

    /**
     * 
     * @param upsSecurity
     * @param body
     * @return
     *     returns com.ups.xmlschema.xoltws.lbrecovery.v1.LabelRecoveryResponse
     * @throws LabelRecoveryErrorMessage
     */
    public LabelRecoveryResponse processLabelRecovery(LabelRecoveryRequest body, UPSSecurity upsSecurity)
        throws LabelRecoveryErrorMessage
    {
        //replace with your impl here
        return null;
    }

}
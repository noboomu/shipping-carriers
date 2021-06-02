
package com.ups.wsdl.xoltws.ship.v1;

import com.ups.xmlschema.xoltws.ship.v1.ShipAcceptRequest;
import com.ups.xmlschema.xoltws.ship.v1.ShipAcceptResponse;
import com.ups.xmlschema.xoltws.ship.v1.ShipConfirmRequest;
import com.ups.xmlschema.xoltws.ship.v1.ShipConfirmResponse;
import com.ups.xmlschema.xoltws.ship.v1.ShipmentRequest;
import com.ups.xmlschema.xoltws.ship.v1.ShipmentResponse;
import com.ups.xmlschema.xoltws.upss.v1.UPSSecurity;
import jakarta.jws.WebService;
import jakarta.xml.ws.BindingType;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 3.0.1
 * Generated source version: 3.0
 * 
 */
@WebService(portName = "ShipPort", serviceName = "ShipService", targetNamespace = "http://www.ups.com/WSDL/XOLTWS/Ship/v1.0", wsdlLocation = "ws/ups/wsdl/Ship.wsdl", endpointInterface = "com.ups.wsdl.xoltws.ship.v1.ShipPortType")
@BindingType("http://schemas.xmlsoap.org/wsdl/soap/http")
public class ShipService_ShipPortImpl
    implements ShipPortType
{


    public ShipService_ShipPortImpl() {
    }

    /**
     * 
     * @param upsSecurity
     * @param body
     * @return
     *     returns com.ups.xmlschema.xoltws.ship.v1.ShipmentResponse
     * @throws ShipmentErrorMessage
     */
    public ShipmentResponse processShipment(ShipmentRequest body, UPSSecurity upsSecurity)
        throws ShipmentErrorMessage
    {
        //replace with your impl here
        return null;
    }

    /**
     * 
     * @param upsSecurity
     * @param body
     * @return
     *     returns com.ups.xmlschema.xoltws.ship.v1.ShipConfirmResponse
     * @throws ShipConfirmErrorMessage
     */
    public ShipConfirmResponse processShipConfirm(ShipConfirmRequest body, UPSSecurity upsSecurity)
        throws ShipConfirmErrorMessage
    {
        //replace with your impl here
        return null;
    }

    /**
     * 
     * @param upsSecurity
     * @param body
     * @return
     *     returns com.ups.xmlschema.xoltws.ship.v1.ShipAcceptResponse
     * @throws ShipAcceptErrorMessage
     */
    public ShipAcceptResponse processShipAccept(ShipAcceptRequest body, UPSSecurity upsSecurity)
        throws ShipAcceptErrorMessage
    {
        //replace with your impl here
        return null;
    }

}

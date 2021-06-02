
package com.ups.wsdl.xoltws.ship.v1;

import com.ups.xmlschema.xoltws.ship.v1.ShipAcceptRequest;
import com.ups.xmlschema.xoltws.ship.v1.ShipAcceptResponse;
import com.ups.xmlschema.xoltws.ship.v1.ShipConfirmRequest;
import com.ups.xmlschema.xoltws.ship.v1.ShipConfirmResponse;
import com.ups.xmlschema.xoltws.ship.v1.ShipmentRequest;
import com.ups.xmlschema.xoltws.ship.v1.ShipmentResponse;
import com.ups.xmlschema.xoltws.upss.v1.UPSSecurity;
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
@WebService(name = "ShipPortType", targetNamespace = "http://www.ups.com/WSDL/XOLTWS/Ship/v1.0")
@SOAPBinding(parameterStyle = SOAPBinding.ParameterStyle.BARE)
@XmlSeeAlso({
    com.ups.xmlschema.xoltws.upss.v1.ObjectFactory.class,
    com.ups.xmlschema.xoltws.common.v1.ObjectFactory.class,
    com.ups.xmlschema.xoltws.ship.v1.ObjectFactory.class,
    com.ups.xmlschema.xoltws._if.v1.ObjectFactory.class,
    com.ups.xmlschema.xoltws.error.v1.ObjectFactory.class
})
public interface ShipPortType {


    /**
     * 
     * @param upsSecurity
     * @param body
     * @return
     *     returns com.ups.xmlschema.xoltws.ship.v1.ShipmentResponse
     * @throws ShipmentErrorMessage
     */
    @WebMethod(operationName = "ProcessShipment", action = "http://onlinetools.ups.com/webservices/ShipBinding/v1.0")
    @WebResult(name = "ShipmentResponse", targetNamespace = "http://www.ups.com/XMLSchema/XOLTWS/Ship/v1.0", partName = "Body")
    public ShipmentResponse processShipment(
        @WebParam(name = "ShipmentRequest", targetNamespace = "http://www.ups.com/XMLSchema/XOLTWS/Ship/v1.0", partName = "Body")
        ShipmentRequest body,
        @WebParam(name = "UPSSecurity", targetNamespace = "http://www.ups.com/XMLSchema/XOLTWS/UPSS/v1.0", header = true, partName = "UPSSecurity")
        UPSSecurity upsSecurity)
        throws ShipmentErrorMessage
    ;

    /**
     * 
     * @param upsSecurity
     * @param body
     * @return
     *     returns com.ups.xmlschema.xoltws.ship.v1.ShipConfirmResponse
     * @throws ShipConfirmErrorMessage
     */
    @WebMethod(operationName = "ProcessShipConfirm", action = "http://onlinetools.ups.com/webservices/ShipBinding/v1.0")
    @WebResult(name = "ShipConfirmResponse", targetNamespace = "http://www.ups.com/XMLSchema/XOLTWS/Ship/v1.0", partName = "Body")
    public ShipConfirmResponse processShipConfirm(
        @WebParam(name = "ShipConfirmRequest", targetNamespace = "http://www.ups.com/XMLSchema/XOLTWS/Ship/v1.0", partName = "Body")
        ShipConfirmRequest body,
        @WebParam(name = "UPSSecurity", targetNamespace = "http://www.ups.com/XMLSchema/XOLTWS/UPSS/v1.0", header = true, partName = "UPSSecurity")
        UPSSecurity upsSecurity)
        throws ShipConfirmErrorMessage
    ;

    /**
     * 
     * @param upsSecurity
     * @param body
     * @return
     *     returns com.ups.xmlschema.xoltws.ship.v1.ShipAcceptResponse
     * @throws ShipAcceptErrorMessage
     */
    @WebMethod(operationName = "ProcessShipAccept", action = "http://onlinetools.ups.com/webservices/ShipBinding/v1.0")
    @WebResult(name = "ShipAcceptResponse", targetNamespace = "http://www.ups.com/XMLSchema/XOLTWS/Ship/v1.0", partName = "Body")
    public ShipAcceptResponse processShipAccept(
        @WebParam(name = "ShipAcceptRequest", targetNamespace = "http://www.ups.com/XMLSchema/XOLTWS/Ship/v1.0", partName = "Body")
        ShipAcceptRequest body,
        @WebParam(name = "UPSSecurity", targetNamespace = "http://www.ups.com/XMLSchema/XOLTWS/UPSS/v1.0", header = true, partName = "UPSSecurity")
        UPSSecurity upsSecurity)
        throws ShipAcceptErrorMessage
    ;

}

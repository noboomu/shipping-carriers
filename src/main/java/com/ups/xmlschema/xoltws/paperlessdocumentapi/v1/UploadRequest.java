
package com.ups.xmlschema.xoltws.paperlessdocumentapi.v1;

import java.util.ArrayList;
import java.util.List;
import com.ups.xmlschema.xoltws.common.v1.RequestType;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://www.ups.com/XMLSchema/XOLTWS/Common/v1.0}Request"/&gt;
 *         &lt;element name="ShipperNumber" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="UserCreatedForm" type="{http://www.ups.com/XMLSchema/XOLTWS/PaperlessDocumentAPI/v1.0}UserCreatedForm" maxOccurs="13"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "request",
    "shipperNumber",
    "userCreatedForm"
})
@XmlRootElement(name = "UploadRequest")
public class UploadRequest {

    @XmlElement(name = "Request", namespace = "http://www.ups.com/XMLSchema/XOLTWS/Common/v1.0", required = true)
    protected RequestType request;
    @XmlElement(name = "ShipperNumber", required = true)
    protected String shipperNumber;
    @XmlElement(name = "UserCreatedForm", required = true)
    protected List<UserCreatedForm> userCreatedForm;

    /**
     * Gets the value of the request property.
     * 
     * @return
     *     possible object is
     *     {@link RequestType }
     *     
     */
    public RequestType getRequest() {
        return request;
    }

    /**
     * Sets the value of the request property.
     * 
     * @param value
     *     allowed object is
     *     {@link RequestType }
     *     
     */
    public void setRequest(RequestType value) {
        this.request = value;
    }

    /**
     * Gets the value of the shipperNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShipperNumber() {
        return shipperNumber;
    }

    /**
     * Sets the value of the shipperNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShipperNumber(String value) {
        this.shipperNumber = value;
    }

    /**
     * Gets the value of the userCreatedForm property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the userCreatedForm property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getUserCreatedForm().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link UserCreatedForm }
     * 
     * 
     */
    public List<UserCreatedForm> getUserCreatedForm() {
        if (userCreatedForm == null) {
            userCreatedForm = new ArrayList<UserCreatedForm>();
        }
        return this.userCreatedForm;
    }

}

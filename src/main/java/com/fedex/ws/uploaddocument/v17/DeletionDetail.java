
package com.fedex.ws.uploaddocument.v17;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DeletionDetail complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DeletionDetail"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="DeleteStatus" type="{http://fedex.com/ws/uploaddocument/v17}DeleteRecordedShipmentRequestServiceLevel" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DeletionDetail", propOrder = {
    "deleteStatus"
})
public class DeletionDetail {

    @XmlElement(name = "DeleteStatus")
    @XmlSchemaType(name = "string")
    protected DeleteRecordedShipmentRequestServiceLevel deleteStatus;

    /**
     * Gets the value of the deleteStatus property.
     * 
     * @return
     *     possible object is
     *     {@link DeleteRecordedShipmentRequestServiceLevel }
     *     
     */
    public DeleteRecordedShipmentRequestServiceLevel getDeleteStatus() {
        return deleteStatus;
    }

    /**
     * Sets the value of the deleteStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link DeleteRecordedShipmentRequestServiceLevel }
     *     
     */
    public void setDeleteStatus(DeleteRecordedShipmentRequestServiceLevel value) {
        this.deleteStatus = value;
    }

}

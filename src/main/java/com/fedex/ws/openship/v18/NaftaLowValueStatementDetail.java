
package com.fedex.ws.openship.v18;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Specifies the information necessary for printing the NAFTA Low Value statement on customs documentation.
 * 
 * <p>Java class for NaftaLowValueStatementDetail complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="NaftaLowValueStatementDetail"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Role" type="{http://fedex.com/ws/openship/v18}CustomsRoleType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "NaftaLowValueStatementDetail", propOrder = {
    "role"
})
public class NaftaLowValueStatementDetail {

    @XmlElement(name = "Role")
    @XmlSchemaType(name = "string")
    protected CustomsRoleType role;

    /**
     * Gets the value of the role property.
     * 
     * @return
     *     possible object is
     *     {@link CustomsRoleType }
     *     
     */
    public CustomsRoleType getRole() {
        return role;
    }

    /**
     * Sets the value of the role property.
     * 
     * @param value
     *     allowed object is
     *     {@link CustomsRoleType }
     *     
     */
    public void setRole(CustomsRoleType value) {
        this.role = value;
    }

}

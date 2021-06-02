
package com.fedex.ws.ship.v26;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * This provides the information necessary to identify the different statements, declarations, acts, and/or certifications that apply to this shipment.
 * 
 * <p>Java class for CustomsDeclarationStatementDetail complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CustomsDeclarationStatementDetail"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Types" type="{http://fedex.com/ws/ship/v26}CustomsDeclarationStatementType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="NaftaLowValueStatementDetail" type="{http://fedex.com/ws/ship/v26}NaftaLowValueStatementDetail" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CustomsDeclarationStatementDetail", propOrder = {
    "types",
    "naftaLowValueStatementDetail"
})
public class CustomsDeclarationStatementDetail {

    @XmlElement(name = "Types")
    @XmlSchemaType(name = "string")
    protected List<CustomsDeclarationStatementType> types;
    @XmlElement(name = "NaftaLowValueStatementDetail")
    protected NaftaLowValueStatementDetail naftaLowValueStatementDetail;

    /**
     * Gets the value of the types property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the types property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTypes().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CustomsDeclarationStatementType }
     * 
     * 
     */
    public List<CustomsDeclarationStatementType> getTypes() {
        if (types == null) {
            types = new ArrayList<CustomsDeclarationStatementType>();
        }
        return this.types;
    }

    /**
     * Gets the value of the naftaLowValueStatementDetail property.
     * 
     * @return
     *     possible object is
     *     {@link NaftaLowValueStatementDetail }
     *     
     */
    public NaftaLowValueStatementDetail getNaftaLowValueStatementDetail() {
        return naftaLowValueStatementDetail;
    }

    /**
     * Sets the value of the naftaLowValueStatementDetail property.
     * 
     * @param value
     *     allowed object is
     *     {@link NaftaLowValueStatementDetail }
     *     
     */
    public void setNaftaLowValueStatementDetail(NaftaLowValueStatementDetail value) {
        this.naftaLowValueStatementDetail = value;
    }

}

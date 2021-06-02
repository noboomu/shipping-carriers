
package com.fedex.ws.uploaddocument.v17;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ExportDetail complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ExportDetail"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="B13AFilingOption" type="{http://fedex.com/ws/uploaddocument/v17}B13AFilingOptionType" minOccurs="0"/&gt;
 *         &lt;element name="ExportComplianceStatement" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="PermitNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="DestinationControlDetail" type="{http://fedex.com/ws/uploaddocument/v17}DestinationControlDetail" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ExportDetail", propOrder = {
    "b13AFilingOption",
    "exportComplianceStatement",
    "permitNumber",
    "destinationControlDetail"
})
public class ExportDetail {

    @XmlElement(name = "B13AFilingOption")
    @XmlSchemaType(name = "string")
    protected B13AFilingOptionType b13AFilingOption;
    @XmlElement(name = "ExportComplianceStatement")
    protected String exportComplianceStatement;
    @XmlElement(name = "PermitNumber")
    protected String permitNumber;
    @XmlElement(name = "DestinationControlDetail")
    protected DestinationControlDetail destinationControlDetail;

    /**
     * Gets the value of the b13AFilingOption property.
     * 
     * @return
     *     possible object is
     *     {@link B13AFilingOptionType }
     *     
     */
    public B13AFilingOptionType getB13AFilingOption() {
        return b13AFilingOption;
    }

    /**
     * Sets the value of the b13AFilingOption property.
     * 
     * @param value
     *     allowed object is
     *     {@link B13AFilingOptionType }
     *     
     */
    public void setB13AFilingOption(B13AFilingOptionType value) {
        this.b13AFilingOption = value;
    }

    /**
     * Gets the value of the exportComplianceStatement property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExportComplianceStatement() {
        return exportComplianceStatement;
    }

    /**
     * Sets the value of the exportComplianceStatement property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExportComplianceStatement(String value) {
        this.exportComplianceStatement = value;
    }

    /**
     * Gets the value of the permitNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPermitNumber() {
        return permitNumber;
    }

    /**
     * Sets the value of the permitNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPermitNumber(String value) {
        this.permitNumber = value;
    }

    /**
     * Gets the value of the destinationControlDetail property.
     * 
     * @return
     *     possible object is
     *     {@link DestinationControlDetail }
     *     
     */
    public DestinationControlDetail getDestinationControlDetail() {
        return destinationControlDetail;
    }

    /**
     * Sets the value of the destinationControlDetail property.
     * 
     * @param value
     *     allowed object is
     *     {@link DestinationControlDetail }
     *     
     */
    public void setDestinationControlDetail(DestinationControlDetail value) {
        this.destinationControlDetail = value;
    }

}

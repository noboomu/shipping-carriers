
package com.fedex.ws.uploaddocument.v17;

import java.math.BigInteger;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DocTabZoneSpecification complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DocTabZoneSpecification"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ZoneNumber" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" minOccurs="0"/&gt;
 *         &lt;element name="Header" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="DataField" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="LiteralValue" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Justification" type="{http://fedex.com/ws/uploaddocument/v17}DocTabZoneJustificationType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DocTabZoneSpecification", propOrder = {
    "zoneNumber",
    "header",
    "dataField",
    "literalValue",
    "justification"
})
public class DocTabZoneSpecification {

    @XmlElement(name = "ZoneNumber")
    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger zoneNumber;
    @XmlElement(name = "Header")
    protected String header;
    @XmlElement(name = "DataField")
    protected String dataField;
    @XmlElement(name = "LiteralValue")
    protected String literalValue;
    @XmlElement(name = "Justification")
    @XmlSchemaType(name = "string")
    protected DocTabZoneJustificationType justification;

    /**
     * Gets the value of the zoneNumber property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getZoneNumber() {
        return zoneNumber;
    }

    /**
     * Sets the value of the zoneNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setZoneNumber(BigInteger value) {
        this.zoneNumber = value;
    }

    /**
     * Gets the value of the header property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHeader() {
        return header;
    }

    /**
     * Sets the value of the header property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHeader(String value) {
        this.header = value;
    }

    /**
     * Gets the value of the dataField property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDataField() {
        return dataField;
    }

    /**
     * Sets the value of the dataField property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDataField(String value) {
        this.dataField = value;
    }

    /**
     * Gets the value of the literalValue property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLiteralValue() {
        return literalValue;
    }

    /**
     * Sets the value of the literalValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLiteralValue(String value) {
        this.literalValue = value;
    }

    /**
     * Gets the value of the justification property.
     * 
     * @return
     *     possible object is
     *     {@link DocTabZoneJustificationType }
     *     
     */
    public DocTabZoneJustificationType getJustification() {
        return justification;
    }

    /**
     * Sets the value of the justification property.
     * 
     * @param value
     *     allowed object is
     *     {@link DocTabZoneJustificationType }
     *     
     */
    public void setJustification(DocTabZoneJustificationType value) {
        this.justification = value;
    }

}

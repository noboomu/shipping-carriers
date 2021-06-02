
package com.fedex.ws.openship.v18;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Specifies the way in which aggregated data in a consolidation are to be determined.
 * 
 * <p>Java class for ConsolidationDataSource complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ConsolidationDataSource"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Field" type="{http://fedex.com/ws/openship/v18}ConsolidationDataType" minOccurs="0"/&gt;
 *         &lt;element name="Source" type="{http://fedex.com/ws/openship/v18}ConsolidationDataSourceType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ConsolidationDataSource", propOrder = {
    "field",
    "source"
})
public class ConsolidationDataSource {

    @XmlElement(name = "Field")
    @XmlSchemaType(name = "string")
    protected ConsolidationDataType field;
    @XmlElement(name = "Source")
    @XmlSchemaType(name = "string")
    protected ConsolidationDataSourceType source;

    /**
     * Gets the value of the field property.
     * 
     * @return
     *     possible object is
     *     {@link ConsolidationDataType }
     *     
     */
    public ConsolidationDataType getField() {
        return field;
    }

    /**
     * Sets the value of the field property.
     * 
     * @param value
     *     allowed object is
     *     {@link ConsolidationDataType }
     *     
     */
    public void setField(ConsolidationDataType value) {
        this.field = value;
    }

    /**
     * Gets the value of the source property.
     * 
     * @return
     *     possible object is
     *     {@link ConsolidationDataSourceType }
     *     
     */
    public ConsolidationDataSourceType getSource() {
        return source;
    }

    /**
     * Sets the value of the source property.
     * 
     * @param value
     *     allowed object is
     *     {@link ConsolidationDataSourceType }
     *     
     */
    public void setSource(ConsolidationDataSourceType value) {
        this.source = value;
    }

}

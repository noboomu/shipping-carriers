
package com.ups.schema.xpci._1_0.lc;

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
 *         &lt;element name="Response" type="{http://www.ups.com/schema/xpci/1.0/lc}ResponseTransportType"/&gt;
 *         &lt;choice&gt;
 *           &lt;element name="QueryResponse" type="{http://www.ups.com/schema/xpci/1.0/lc}QueryResponseType"/&gt;
 *           &lt;element name="EstimateResponse" type="{http://www.ups.com/schema/xpci/1.0/lc}EstimateResponseType"/&gt;
 *         &lt;/choice&gt;
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
    "response",
    "queryResponse",
    "estimateResponse"
})
@XmlRootElement(name = "LandedCostResponse")
public class LandedCostResponse {

    @XmlElement(name = "Response", required = true)
    protected ResponseTransportType response;
    @XmlElement(name = "QueryResponse")
    protected QueryResponseType queryResponse;
    @XmlElement(name = "EstimateResponse")
    protected EstimateResponseType estimateResponse;

    /**
     * Gets the value of the response property.
     * 
     * @return
     *     possible object is
     *     {@link ResponseTransportType }
     *     
     */
    public ResponseTransportType getResponse() {
        return response;
    }

    /**
     * Sets the value of the response property.
     * 
     * @param value
     *     allowed object is
     *     {@link ResponseTransportType }
     *     
     */
    public void setResponse(ResponseTransportType value) {
        this.response = value;
    }

    /**
     * Gets the value of the queryResponse property.
     * 
     * @return
     *     possible object is
     *     {@link QueryResponseType }
     *     
     */
    public QueryResponseType getQueryResponse() {
        return queryResponse;
    }

    /**
     * Sets the value of the queryResponse property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryResponseType }
     *     
     */
    public void setQueryResponse(QueryResponseType value) {
        this.queryResponse = value;
    }

    /**
     * Gets the value of the estimateResponse property.
     * 
     * @return
     *     possible object is
     *     {@link EstimateResponseType }
     *     
     */
    public EstimateResponseType getEstimateResponse() {
        return estimateResponse;
    }

    /**
     * Sets the value of the estimateResponse property.
     * 
     * @param value
     *     allowed object is
     *     {@link EstimateResponseType }
     *     
     */
    public void setEstimateResponse(EstimateResponseType value) {
        this.estimateResponse = value;
    }

}

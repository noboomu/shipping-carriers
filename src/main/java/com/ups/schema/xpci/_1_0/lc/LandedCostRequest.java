
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
 *         &lt;element name="Request" type="{http://www.ups.com/schema/xpci/1.0/lc}RequestTransportType"/&gt;
 *         &lt;choice&gt;
 *           &lt;element name="QueryRequest" type="{http://www.ups.com/schema/xpci/1.0/lc}QueryRequestType"/&gt;
 *           &lt;element name="EstimateRequest" type="{http://www.ups.com/schema/xpci/1.0/lc}EstimateRequestType"/&gt;
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
    "request",
    "queryRequest",
    "estimateRequest"
})
@XmlRootElement(name = "LandedCostRequest")
public class LandedCostRequest {

    @XmlElement(name = "Request", required = true)
    protected RequestTransportType request;
    @XmlElement(name = "QueryRequest")
    protected QueryRequestType queryRequest;
    @XmlElement(name = "EstimateRequest")
    protected EstimateRequestType estimateRequest;

    /**
     * Gets the value of the request property.
     * 
     * @return
     *     possible object is
     *     {@link RequestTransportType }
     *     
     */
    public RequestTransportType getRequest() {
        return request;
    }

    /**
     * Sets the value of the request property.
     * 
     * @param value
     *     allowed object is
     *     {@link RequestTransportType }
     *     
     */
    public void setRequest(RequestTransportType value) {
        this.request = value;
    }

    /**
     * Gets the value of the queryRequest property.
     * 
     * @return
     *     possible object is
     *     {@link QueryRequestType }
     *     
     */
    public QueryRequestType getQueryRequest() {
        return queryRequest;
    }

    /**
     * Sets the value of the queryRequest property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryRequestType }
     *     
     */
    public void setQueryRequest(QueryRequestType value) {
        this.queryRequest = value;
    }

    /**
     * Gets the value of the estimateRequest property.
     * 
     * @return
     *     possible object is
     *     {@link EstimateRequestType }
     *     
     */
    public EstimateRequestType getEstimateRequest() {
        return estimateRequest;
    }

    /**
     * Sets the value of the estimateRequest property.
     * 
     * @param value
     *     allowed object is
     *     {@link EstimateRequestType }
     *     
     */
    public void setEstimateRequest(EstimateRequestType value) {
        this.estimateRequest = value;
    }

}

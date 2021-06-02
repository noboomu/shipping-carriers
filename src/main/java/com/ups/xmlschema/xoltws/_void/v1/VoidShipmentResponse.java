
package com.ups.xmlschema.xoltws._void.v1;

import java.util.ArrayList;
import java.util.List;
import com.ups.xmlschema.xoltws.common.v1.ResponseType;
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
 *         &lt;element ref="{http://www.ups.com/XMLSchema/XOLTWS/Common/v1.0}Response"/&gt;
 *         &lt;element name="SummaryResult"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="Status" type="{http://www.ups.com/XMLSchema/XOLTWS/Void/v1.1}CodeDescriptionType"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="PackageLevelResult" type="{http://www.ups.com/XMLSchema/XOLTWS/Void/v1.1}PackageLevelResult" maxOccurs="unbounded" minOccurs="0"/&gt;
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
    "summaryResult",
    "packageLevelResult"
})
@XmlRootElement(name = "VoidShipmentResponse")
public class VoidShipmentResponse {

    @XmlElement(name = "Response", namespace = "http://www.ups.com/XMLSchema/XOLTWS/Common/v1.0", required = true)
    protected ResponseType response;
    @XmlElement(name = "SummaryResult", required = true)
    protected VoidShipmentResponse.SummaryResult summaryResult;
    @XmlElement(name = "PackageLevelResult")
    protected List<PackageLevelResult> packageLevelResult;

    /**
     * Gets the value of the response property.
     * 
     * @return
     *     possible object is
     *     {@link ResponseType }
     *     
     */
    public ResponseType getResponse() {
        return response;
    }

    /**
     * Sets the value of the response property.
     * 
     * @param value
     *     allowed object is
     *     {@link ResponseType }
     *     
     */
    public void setResponse(ResponseType value) {
        this.response = value;
    }

    /**
     * Gets the value of the summaryResult property.
     * 
     * @return
     *     possible object is
     *     {@link VoidShipmentResponse.SummaryResult }
     *     
     */
    public VoidShipmentResponse.SummaryResult getSummaryResult() {
        return summaryResult;
    }

    /**
     * Sets the value of the summaryResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link VoidShipmentResponse.SummaryResult }
     *     
     */
    public void setSummaryResult(VoidShipmentResponse.SummaryResult value) {
        this.summaryResult = value;
    }

    /**
     * Gets the value of the packageLevelResult property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the packageLevelResult property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPackageLevelResult().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PackageLevelResult }
     * 
     * 
     */
    public List<PackageLevelResult> getPackageLevelResult() {
        if (packageLevelResult == null) {
            packageLevelResult = new ArrayList<PackageLevelResult>();
        }
        return this.packageLevelResult;
    }


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
     *         &lt;element name="Status" type="{http://www.ups.com/XMLSchema/XOLTWS/Void/v1.1}CodeDescriptionType"/&gt;
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
        "status"
    })
    public static class SummaryResult {

        @XmlElement(name = "Status", required = true)
        protected CodeDescriptionType status;

        /**
         * Gets the value of the status property.
         * 
         * @return
         *     possible object is
         *     {@link CodeDescriptionType }
         *     
         */
        public CodeDescriptionType getStatus() {
            return status;
        }

        /**
         * Sets the value of the status property.
         * 
         * @param value
         *     allowed object is
         *     {@link CodeDescriptionType }
         *     
         */
        public void setStatus(CodeDescriptionType value) {
            this.status = value;
        }

    }

}

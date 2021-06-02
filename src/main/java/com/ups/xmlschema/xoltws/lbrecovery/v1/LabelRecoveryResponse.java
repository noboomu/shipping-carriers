
package com.ups.xmlschema.xoltws.lbrecovery.v1;

import java.util.ArrayList;
import java.util.List;
import com.ups.xmlschema.xoltws.common.v1.ResponseType;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlElements;
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
 *         &lt;element name="ShipmentIdentificationNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CODTurnInPage" type="{http://www.ups.com/XMLSchema/XOLTWS/LBRecovery/v1.0}ResponseImageType" minOccurs="0"/&gt;
 *         &lt;element name="Form" type="{http://www.ups.com/XMLSchema/XOLTWS/LBRecovery/v1.0}FormType" minOccurs="0"/&gt;
 *         &lt;element name="HighValueReport" type="{http://www.ups.com/XMLSchema/XOLTWS/LBRecovery/v1.0}HighValueReportType" minOccurs="0"/&gt;
 *         &lt;choice maxOccurs="unbounded" minOccurs="0"&gt;
 *           &lt;element name="LabelResults" type="{http://www.ups.com/XMLSchema/XOLTWS/LBRecovery/v1.0}LabelResultsType"/&gt;
 *           &lt;element name="TrackingCandidate" type="{http://www.ups.com/XMLSchema/XOLTWS/LBRecovery/v1.0}TrackingCandidateType"/&gt;
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
    "shipmentIdentificationNumber",
    "codTurnInPage",
    "form",
    "highValueReport",
    "labelResultsOrTrackingCandidate"
})
@XmlRootElement(name = "LabelRecoveryResponse")
public class LabelRecoveryResponse {

    @XmlElement(name = "Response", namespace = "http://www.ups.com/XMLSchema/XOLTWS/Common/v1.0", required = true)
    protected ResponseType response;
    @XmlElement(name = "ShipmentIdentificationNumber")
    protected String shipmentIdentificationNumber;
    @XmlElement(name = "CODTurnInPage")
    protected ResponseImageType codTurnInPage;
    @XmlElement(name = "Form")
    protected FormType form;
    @XmlElement(name = "HighValueReport")
    protected HighValueReportType highValueReport;
    @XmlElements({
        @XmlElement(name = "LabelResults", type = LabelResultsType.class),
        @XmlElement(name = "TrackingCandidate", type = TrackingCandidateType.class)
    })
    protected List<Object> labelResultsOrTrackingCandidate;

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
     * Gets the value of the shipmentIdentificationNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShipmentIdentificationNumber() {
        return shipmentIdentificationNumber;
    }

    /**
     * Sets the value of the shipmentIdentificationNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShipmentIdentificationNumber(String value) {
        this.shipmentIdentificationNumber = value;
    }

    /**
     * Gets the value of the codTurnInPage property.
     * 
     * @return
     *     possible object is
     *     {@link ResponseImageType }
     *     
     */
    public ResponseImageType getCODTurnInPage() {
        return codTurnInPage;
    }

    /**
     * Sets the value of the codTurnInPage property.
     * 
     * @param value
     *     allowed object is
     *     {@link ResponseImageType }
     *     
     */
    public void setCODTurnInPage(ResponseImageType value) {
        this.codTurnInPage = value;
    }

    /**
     * Gets the value of the form property.
     * 
     * @return
     *     possible object is
     *     {@link FormType }
     *     
     */
    public FormType getForm() {
        return form;
    }

    /**
     * Sets the value of the form property.
     * 
     * @param value
     *     allowed object is
     *     {@link FormType }
     *     
     */
    public void setForm(FormType value) {
        this.form = value;
    }

    /**
     * Gets the value of the highValueReport property.
     * 
     * @return
     *     possible object is
     *     {@link HighValueReportType }
     *     
     */
    public HighValueReportType getHighValueReport() {
        return highValueReport;
    }

    /**
     * Sets the value of the highValueReport property.
     * 
     * @param value
     *     allowed object is
     *     {@link HighValueReportType }
     *     
     */
    public void setHighValueReport(HighValueReportType value) {
        this.highValueReport = value;
    }

    /**
     * Gets the value of the labelResultsOrTrackingCandidate property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the labelResultsOrTrackingCandidate property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLabelResultsOrTrackingCandidate().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link LabelResultsType }
     * {@link TrackingCandidateType }
     * 
     * 
     */
    public List<Object> getLabelResultsOrTrackingCandidate() {
        if (labelResultsOrTrackingCandidate == null) {
            labelResultsOrTrackingCandidate = new ArrayList<Object>();
        }
        return this.labelResultsOrTrackingCandidate;
    }

}

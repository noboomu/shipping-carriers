
package com.fedex.ws.openship.v18;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CompletedConsolidationDetail complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CompletedConsolidationDetail"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ConsolidationShipments" type="{http://fedex.com/ws/openship/v18}ConsolidationShipment" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="Documents" type="{http://fedex.com/ws/openship/v18}ConsolidationDocument" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CompletedConsolidationDetail", propOrder = {
    "consolidationShipments",
    "documents"
})
public class CompletedConsolidationDetail {

    @XmlElement(name = "ConsolidationShipments")
    protected List<ConsolidationShipment> consolidationShipments;
    @XmlElement(name = "Documents")
    protected List<ConsolidationDocument> documents;

    /**
     * Gets the value of the consolidationShipments property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the consolidationShipments property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getConsolidationShipments().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ConsolidationShipment }
     * 
     * 
     */
    public List<ConsolidationShipment> getConsolidationShipments() {
        if (consolidationShipments == null) {
            consolidationShipments = new ArrayList<ConsolidationShipment>();
        }
        return this.consolidationShipments;
    }

    /**
     * Gets the value of the documents property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the documents property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDocuments().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ConsolidationDocument }
     * 
     * 
     */
    public List<ConsolidationDocument> getDocuments() {
        if (documents == null) {
            documents = new ArrayList<ConsolidationDocument>();
        }
        return this.documents;
    }

}

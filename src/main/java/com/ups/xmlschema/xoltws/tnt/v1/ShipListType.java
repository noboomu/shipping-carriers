
package com.ups.xmlschema.xoltws.tnt.v1;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ShipListType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ShipListType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Candidate" type="{http://www.ups.com/XMLSchema/XOLTWS/tnt/v1.0}CandidateType" maxOccurs="unbounded"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ShipListType", propOrder = {
    "candidate"
})
public class ShipListType {

    @XmlElement(name = "Candidate", required = true)
    protected List<CandidateType> candidate;

    /**
     * Gets the value of the candidate property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the candidate property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCandidate().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CandidateType }
     * 
     * 
     */
    public List<CandidateType> getCandidate() {
        if (candidate == null) {
            candidate = new ArrayList<CandidateType>();
        }
        return this.candidate;
    }

}


package com.fedex.ws.async.v4;

import javax.xml.namespace.QName;
import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.annotation.XmlElementDecl;
import jakarta.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.fedex.ws.async.v4 package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _RetrieveJobResultsReply_QNAME = new QName("http://fedex.com/ws/async/v4", "RetrieveJobResultsReply");
    private final static QName _RetrieveJobResultsRequest_QNAME = new QName("http://fedex.com/ws/async/v4", "RetrieveJobResultsRequest");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.fedex.ws.async.v4
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link RetrieveJobResultsReply }
     * 
     */
    public RetrieveJobResultsReply createRetrieveJobResultsReply() {
        return new RetrieveJobResultsReply();
    }

    /**
     * Create an instance of {@link RetrieveJobResultsRequest }
     * 
     */
    public RetrieveJobResultsRequest createRetrieveJobResultsRequest() {
        return new RetrieveJobResultsRequest();
    }

    /**
     * Create an instance of {@link ArtifactPart }
     * 
     */
    public ArtifactPart createArtifactPart() {
        return new ArtifactPart();
    }

    /**
     * Create an instance of {@link ArtifactRetrievalFilter }
     * 
     */
    public ArtifactRetrievalFilter createArtifactRetrievalFilter() {
        return new ArtifactRetrievalFilter();
    }

    /**
     * Create an instance of {@link ClientDetail }
     * 
     */
    public ClientDetail createClientDetail() {
        return new ClientDetail();
    }

    /**
     * Create an instance of {@link Localization }
     * 
     */
    public Localization createLocalization() {
        return new Localization();
    }

    /**
     * Create an instance of {@link Notification }
     * 
     */
    public Notification createNotification() {
        return new Notification();
    }

    /**
     * Create an instance of {@link NotificationParameter }
     * 
     */
    public NotificationParameter createNotificationParameter() {
        return new NotificationParameter();
    }

    /**
     * Create an instance of {@link RetrievedArtifact }
     * 
     */
    public RetrievedArtifact createRetrievedArtifact() {
        return new RetrievedArtifact();
    }

    /**
     * Create an instance of {@link TransactionDetail }
     * 
     */
    public TransactionDetail createTransactionDetail() {
        return new TransactionDetail();
    }

    /**
     * Create an instance of {@link WebAuthenticationDetail }
     * 
     */
    public WebAuthenticationDetail createWebAuthenticationDetail() {
        return new WebAuthenticationDetail();
    }

    /**
     * Create an instance of {@link WebAuthenticationCredential }
     * 
     */
    public WebAuthenticationCredential createWebAuthenticationCredential() {
        return new WebAuthenticationCredential();
    }

    /**
     * Create an instance of {@link VersionId }
     * 
     */
    public VersionId createVersionId() {
        return new VersionId();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RetrieveJobResultsReply }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link RetrieveJobResultsReply }{@code >}
     */
    @XmlElementDecl(namespace = "http://fedex.com/ws/async/v4", name = "RetrieveJobResultsReply")
    public JAXBElement<RetrieveJobResultsReply> createRetrieveJobResultsReply(RetrieveJobResultsReply value) {
        return new JAXBElement<RetrieveJobResultsReply>(_RetrieveJobResultsReply_QNAME, RetrieveJobResultsReply.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RetrieveJobResultsRequest }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link RetrieveJobResultsRequest }{@code >}
     */
    @XmlElementDecl(namespace = "http://fedex.com/ws/async/v4", name = "RetrieveJobResultsRequest")
    public JAXBElement<RetrieveJobResultsRequest> createRetrieveJobResultsRequest(RetrieveJobResultsRequest value) {
        return new JAXBElement<RetrieveJobResultsRequest>(_RetrieveJobResultsRequest_QNAME, RetrieveJobResultsRequest.class, null, value);
    }

}

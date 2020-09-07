
package com.amazonaws.mws.model;

import javax.xml.bind.annotation.*;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for anonymous complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Marketplace" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Merchant" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="FeedSubmissionIdList" type="{http://mws.amazonaws.com/doc/2009-01-01/}IdList" minOccurs="0"/>
 *         &lt;element name="FeedTypeList" type="{http://mws.amazonaws.com/doc/2009-01-01/}TypeList" minOccurs="0"/>
 *         &lt;element name="SubmittedFromDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="SubmittedToDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="MWSAuthToken" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * Generated by AWS Code Generator
 * <p/>
 * Wed Feb 18 13:28:59 PST 2009
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "marketplace",
    "merchant",
    "feedSubmissionIdList",
    "feedTypeList",
    "submittedFromDate",
    "submittedToDate",
    "mwsAuthToken"
})
@XmlRootElement(name = "CancelFeedSubmissionsRequest")
public class CancelFeedSubmissionsRequest {

    @XmlElement(name = "Marketplace")
    protected String marketplace;
    @XmlElement(name = "Merchant", required = true)
    protected String merchant;
    @XmlElement(name = "FeedSubmissionIdList")
    protected IdList feedSubmissionIdList;
    @XmlElement(name = "FeedTypeList")
    protected TypeList feedTypeList;
    @XmlElement(name = "SubmittedFromDate")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar submittedFromDate;
    @XmlElement(name = "SubmittedToDate")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar submittedToDate;
    @XmlElement(name = "MWSAuthToken")
    protected String mwsAuthToken;

    /**
     * Default constructor
     *
     */
    public CancelFeedSubmissionsRequest() {
        super();
    }

    /**
     * Value constructor
     *
     */
    public CancelFeedSubmissionsRequest(final String marketplace, final String merchant, final IdList feedSubmissionIdList, final TypeList feedTypeList, final XMLGregorianCalendar submittedFromDate, final XMLGregorianCalendar submittedToDate) {
        this(marketplace, merchant, feedSubmissionIdList, feedTypeList, submittedFromDate, submittedToDate, null);
    }

    public CancelFeedSubmissionsRequest(final String marketplace,
            final String merchant,
            final IdList feedSubmissionIdList,
            final TypeList feedTypeList,
            final XMLGregorianCalendar submittedFromDate,
            final XMLGregorianCalendar submittedToDate,
            final String mwsAuthToken) {
        this.marketplace = marketplace;
        this.merchant = merchant;
        this.feedSubmissionIdList = feedSubmissionIdList;
        this.feedTypeList = feedTypeList;
        this.submittedFromDate = submittedFromDate;
        this.submittedToDate = submittedToDate;
        this.mwsAuthToken = mwsAuthToken;
    }

    /**
     * Gets the value of the marketplace property.
     *
     * @deprecated  See {@link #setMarketplace(String)}
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getMarketplace() {
        return marketplace;
    }

    /**
     * Sets the value of the marketplace property.
     *
     * @deprecated Not used anymore.  MWS ignores this parameter, but it is left
     * in here for backwards compatibility.
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setMarketplace(String value) {
        this.marketplace = value;
    }

    /**
     * @deprecated  See {@link #setMarketplace(String)}
     */
    public boolean isSetMarketplace() {
        return (this.marketplace!= null);
    }

    /**
     * Gets the value of the merchant property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getMerchant() {
        return merchant;
    }

    /**
     * Sets the value of the merchant property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setMerchant(String value) {
        this.merchant = value;
    }

    public boolean isSetMerchant() {
        return (this.merchant!= null);
    }

    /**
     * Gets the value of the feedSubmissionIdList property.
     *
     * @return
     *     possible object is
     *     {@link IdList }
     *
     */
    public IdList getFeedSubmissionIdList() {
        return feedSubmissionIdList;
    }

    /**
     * Sets the value of the feedSubmissionIdList property.
     *
     * @param value
     *     allowed object is
     *     {@link IdList }
     *
     */
    public void setFeedSubmissionIdList(IdList value) {
        this.feedSubmissionIdList = value;
    }

    public boolean isSetFeedSubmissionIdList() {
        return (this.feedSubmissionIdList!= null);
    }

    /**
     * Gets the value of the feedTypeList property.
     *
     * @return
     *     possible object is
     *     {@link TypeList }
     *
     */
    public TypeList getFeedTypeList() {
        return feedTypeList;
    }

    /**
     * Sets the value of the feedTypeList property.
     *
     * @param value
     *     allowed object is
     *     {@link TypeList }
     *
     */
    public void setFeedTypeList(TypeList value) {
        this.feedTypeList = value;
    }

    public boolean isSetFeedTypeList() {
        return (this.feedTypeList!= null);
    }

    /**
     * Gets the value of the submittedFromDate property.
     *
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *
     */
    public XMLGregorianCalendar getSubmittedFromDate() {
        return submittedFromDate;
    }

    /**
     * Sets the value of the submittedFromDate property.
     *
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *
     */
    public void setSubmittedFromDate(XMLGregorianCalendar value) {
        this.submittedFromDate = value;
    }

    public boolean isSetSubmittedFromDate() {
        return (this.submittedFromDate!= null);
    }

    /**
     * Gets the value of the submittedToDate property.
     *
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *
     */
    public XMLGregorianCalendar getSubmittedToDate() {
        return submittedToDate;
    }

    /**
     * Sets the value of the submittedToDate property.
     *
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *
     */
    public void setSubmittedToDate(XMLGregorianCalendar value) {
        this.submittedToDate = value;
    }

    public boolean isSetSubmittedToDate() {
        return (this.submittedToDate!= null);
    }

    /**
     * Gets the value of the mwsAuthToken property.
     *
     * possible object is
     *     {@link String}
     */
    public String getMWSAuthToken() {
    	return mwsAuthToken;
    }

    /**
     * Sets the value of the mwsAuthToken property
     * @param authTokenValue
     * 		allowed object is
     * 		{@link String}
     */
    public void setMWSAuthToken(String authTokenValue) {
    	this.mwsAuthToken = authTokenValue;
    }

    public boolean isSetMWSAuthToken() {
    	return (this.mwsAuthToken!=null);
    }

    /**
     * Sets the value of the Marketplace property.
     *
     * @deprecated  See {@link #setMarketplace(String)}
     * @param value
     * @return
     *     this instance
     */
    public CancelFeedSubmissionsRequest withMarketplace(String value) {
        setMarketplace(value);
        return this;
    }

    /**
     * Sets the value of the Merchant property.
     *
     * @param value
     * @return
     *     this instance
     */
    public CancelFeedSubmissionsRequest withMerchant(String value) {
        setMerchant(value);
        return this;
    }

    /**
     * Sets the value of the MWSAuthToken property.
     *
     * @param value
     * @return
     *     this instance
     */
    public CancelFeedSubmissionsRequest withMWSAuthToken(String value) {
        setMWSAuthToken(value);
        return this;
    }

    /**
     * Sets the value of the FeedSubmissionIdList property.
     *
     * @param value
     * @return
     *     this instance
     */
    public CancelFeedSubmissionsRequest withFeedSubmissionIdList(IdList value) {
        setFeedSubmissionIdList(value);
        return this;
    }

    /**
     * Sets the value of the FeedTypeList property.
     *
     * @param value
     * @return
     *     this instance
     */
    public CancelFeedSubmissionsRequest withFeedTypeList(TypeList value) {
        setFeedTypeList(value);
        return this;
    }

    /**
     * Sets the value of the SubmittedFromDate property.
     *
     * @param value
     * @return
     *     this instance
     */
    public CancelFeedSubmissionsRequest withSubmittedFromDate(XMLGregorianCalendar value) {
        setSubmittedFromDate(value);
        return this;
    }

    /**
     * Sets the value of the SubmittedToDate property.
     *
     * @param value
     * @return
     *     this instance
     */
    public CancelFeedSubmissionsRequest withSubmittedToDate(XMLGregorianCalendar value) {
        setSubmittedToDate(value);
        return this;
    }



    /**
     *
     * JSON fragment representation of this object
     *
     * @return JSON fragment for this object. Name for outer
     * object expected to be set by calling method. This fragment
     * returns inner properties representation only
     *
     */
    protected String toJSONFragment() {
        StringBuffer json = new StringBuffer();
        boolean first = true;
        if (isSetMarketplace()) {
            if (!first) json.append(", ");
            json.append(quoteJSON("Marketplace"));
            json.append(" : ");
            json.append(quoteJSON(getMarketplace()));
            first = false;
        }
        if (isSetMerchant()) {
            if (!first) json.append(", ");
            json.append(quoteJSON("Merchant"));
            json.append(" : ");
            json.append(quoteJSON(getMerchant()));
            first = false;
        }
        if (isSetFeedSubmissionIdList()) {
            if (!first) json.append(", ");
            json.append("\"FeedSubmissionIdList\" : {");
            IdList  feedSubmissionIdList = getFeedSubmissionIdList();


            json.append(feedSubmissionIdList.toJSONFragment());
            json.append("}");
            first = false;
        }
        if (isSetFeedTypeList()) {
            if (!first) json.append(", ");
            json.append("\"FeedTypeList\" : {");
            TypeList  feedTypeList = getFeedTypeList();


            json.append(feedTypeList.toJSONFragment());
            json.append("}");
            first = false;
        }
        if (isSetSubmittedFromDate()) {
            if (!first) json.append(", ");
            json.append(quoteJSON("SubmittedFromDate"));
            json.append(" : ");
            json.append(quoteJSON(getSubmittedFromDate() + ""));
            first = false;
        }
        if (isSetSubmittedToDate()) {
            if (!first) json.append(", ");
            json.append(quoteJSON("SubmittedToDate"));
            json.append(" : ");
            json.append(quoteJSON(getSubmittedToDate() + ""));
            first = false;
        }
        if (isSetMWSAuthToken()) {
            if (!first) json.append(", ");
            json.append(quoteJSON("MWSAuthToken"));
            json.append(" : ");
            json.append(quoteJSON(getMWSAuthToken()));
            first = false;
        }
        return json.toString();
    }

    /**
     *
     * Quote JSON string
     */
    private String quoteJSON(String string) {
        StringBuffer sb = new StringBuffer();
        sb.append("\"");
        int length = string.length();
        for (int i = 0; i < length; ++i) {
            char c = string.charAt(i);
            switch (c) {
            case '"':
                sb.append("\\\"");
                break;
            case '\\':
                sb.append("\\\\");
                break;
            case '/':
                sb.append("\\/");
                break;
            case '\b':
                sb.append("\\b");
                break;
            case '\f':
                sb.append("\\f");
                break;
            case '\n':
                sb.append("\\n");
                break;
            case '\r':
                sb.append("\\r");
                break;
            case '\t':
                sb.append("\\t");
                break;
            default:
                if (c <  ' ') {
                    sb.append("\\u" + String.format("%03x", Integer.valueOf(c)));
                } else {
                sb.append(c);
            }
        }
        }
        sb.append("\"");
        return sb.toString();
    }


}

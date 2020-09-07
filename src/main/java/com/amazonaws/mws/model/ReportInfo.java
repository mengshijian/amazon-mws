
package com.amazonaws.mws.model;

import javax.xml.bind.annotation.*;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for ReportInfo complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="ReportInfo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ReportId" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="ReportType" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="ReportRequestId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AvailableDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="Acknowledged" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="AcknowledgedDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
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
@XmlType(name = "ReportInfo", propOrder = {
    "reportId",
    "reportType",
    "reportRequestId",
    "availableDate",
    "acknowledged",
    "acknowledgedDate"
})
public class ReportInfo {

    @XmlElement(name = "ReportId", required = true)
    protected String reportId;
    @XmlElement(name = "ReportType", required = true)
    protected String reportType;
    @XmlElement(name = "ReportRequestId")
    protected String reportRequestId;
    @XmlElement(name = "AvailableDate", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar availableDate;
    @XmlElement(name = "Acknowledged")
    protected boolean acknowledged;
    @XmlElement(name = "AcknowledgedDate", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar acknowledgedDate;

    /**
     * Default constructor
     *
     */
    public ReportInfo() {
        super();
    }

    /**
     * Value constructor
     *
     */
    public ReportInfo(final String reportId, final String reportType, final String reportRequestId, final XMLGregorianCalendar availableDate, final boolean acknowledged, final XMLGregorianCalendar acknowledgedDate) {
        this.reportId = reportId;
        this.reportType = reportType;
        this.reportRequestId = reportRequestId;
        this.availableDate = availableDate;
        this.acknowledged = acknowledged;
        this.acknowledgedDate = acknowledgedDate;
    }

    /**
     * Gets the value of the reportId property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getReportId() {
        return reportId;
    }

    /**
     * Sets the value of the reportId property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setReportId(String value) {
        this.reportId = value;
    }

    public boolean isSetReportId() {
        return (this.reportId!= null);
    }

    /**
     * Gets the value of the reportType property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getReportType() {
        return reportType;
    }

    /**
     * Sets the value of the reportType property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setReportType(String value) {
        this.reportType = value;
    }

    public boolean isSetReportType() {
        return (this.reportType!= null);
    }

    /**
     * Gets the value of the reportRequestId property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getReportRequestId() {
        return reportRequestId;
    }

    /**
     * Sets the value of the reportRequestId property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setReportRequestId(String value) {
        this.reportRequestId = value;
    }

    public boolean isSetReportRequestId() {
        return (this.reportRequestId!= null);
    }

    /**
     * Gets the value of the availableDate property.
     *
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *
     */
    public XMLGregorianCalendar getAvailableDate() {
        return availableDate;
    }

    /**
     * Sets the value of the availableDate property.
     *
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *
     */
    public void setAvailableDate(XMLGregorianCalendar value) {
        this.availableDate = value;
    }

    public boolean isSetAvailableDate() {
        return (this.availableDate!= null);
    }

    /**
     * Gets the value of the acknowledged property.
     *
     */
    public boolean isAcknowledged() {
        return acknowledged;
    }

    /**
     * Sets the value of the acknowledged property.
     *
     */
    public void setAcknowledged(boolean value) {
        this.acknowledged = value;
    }

    public boolean isSetAcknowledged() {
        return true;
    }

    /**
     * Gets the value of the acknowledgedDate property.
     *
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *
     */
    public XMLGregorianCalendar getAcknowledgedDate() {
        return acknowledgedDate;
    }

    /**
     * Sets the value of the acknowledgedDate property.
     *
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *
     */
    public void setAcknowledgedDate(XMLGregorianCalendar value) {
        this.acknowledgedDate = value;
    }

    public boolean isSetAcknowledgedDate() {
        return (this.acknowledgedDate!= null);
    }

    /**
     * Sets the value of the ReportId property.
     *
     * @param value
     * @return
     *     this instance
     */
    public ReportInfo withReportId(String value) {
        setReportId(value);
        return this;
    }

    /**
     * Sets the value of the ReportType property.
     *
     * @param value
     * @return
     *     this instance
     */
    public ReportInfo withReportType(String value) {
        setReportType(value);
        return this;
    }

    /**
     * Sets the value of the ReportRequestId property.
     *
     * @param value
     * @return
     *     this instance
     */
    public ReportInfo withReportRequestId(String value) {
        setReportRequestId(value);
        return this;
    }

    /**
     * Sets the value of the AvailableDate property.
     *
     * @param value
     * @return
     *     this instance
     */
    public ReportInfo withAvailableDate(XMLGregorianCalendar value) {
        setAvailableDate(value);
        return this;
    }

    /**
     * Sets the value of the Acknowledged property.
     *
     * @param value
     * @return
     *     this instance
     */
    public ReportInfo withAcknowledged(boolean value) {
        setAcknowledged(value);
        return this;
    }

    /**
     * Sets the value of the AcknowledgedDate property.
     *
     * @param value
     * @return
     *     this instance
     */
    public ReportInfo withAcknowledgedDate(XMLGregorianCalendar value) {
        setAcknowledgedDate(value);
        return this;
    }


    /**
     *
     * XML fragment representation of this object
     *
     * @return XML fragment for this object. Name for outer
     * tag expected to be set by calling method. This fragment
     * returns inner properties representation only
     */
    protected String toXMLFragment() {
        StringBuffer xml = new StringBuffer();
        if (isSetReportId()) {
            xml.append("<ReportId>");
            xml.append(escapeXML(getReportId()));
            xml.append("</ReportId>");
        }
        if (isSetReportType()) {
            xml.append("<ReportType>");
            xml.append(escapeXML(getReportType()));
            xml.append("</ReportType>");
        }
        if (isSetReportRequestId()) {
            xml.append("<ReportRequestId>");
            xml.append(escapeXML(getReportRequestId()));
            xml.append("</ReportRequestId>");
        }
        if (isSetAvailableDate()) {
            xml.append("<AvailableDate>");
            xml.append(getAvailableDate() + "");
            xml.append("</AvailableDate>");
        }
        if (isSetAcknowledged()) {
            xml.append("<Acknowledged>");
            xml.append(isAcknowledged() + "");
            xml.append("</Acknowledged>");
        }
        if (isSetAcknowledgedDate()) {
            xml.append("<AcknowledgedDate>");
            xml.append(getAcknowledgedDate() + "");
            xml.append("</AcknowledgedDate>");
        }
        return xml.toString();
    }

    /**
     *
     * Escape XML special characters
     */
    private String escapeXML(String string) {
        StringBuffer sb = new StringBuffer();
        int length = string.length();
        for (int i = 0; i < length; ++i) {
            char c = string.charAt(i);
            switch (c) {
            case '&':
                sb.append("&amp;");
                break;
            case '<':
                sb.append("&lt;");
                break;
            case '>':
                sb.append("&gt;");
                break;
            case '\'':
                sb.append("&#039;");
                break;
            case '"':
                sb.append("&quot;");
                break;
            default:
                sb.append(c);
            }
        }
        return sb.toString();
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
        if (isSetReportId()) {
            if (!first) json.append(", ");
            json.append(quoteJSON("ReportId"));
            json.append(" : ");
            json.append(quoteJSON(getReportId()));
            first = false;
        }
        if (isSetReportType()) {
            if (!first) json.append(", ");
            json.append(quoteJSON("ReportType"));
            json.append(" : ");
            json.append(quoteJSON(getReportType()));
            first = false;
        }
        if (isSetReportRequestId()) {
            if (!first) json.append(", ");
            json.append(quoteJSON("ReportRequestId"));
            json.append(" : ");
            json.append(quoteJSON(getReportRequestId()));
            first = false;
        }
        if (isSetAvailableDate()) {
            if (!first) json.append(", ");
            json.append(quoteJSON("AvailableDate"));
            json.append(" : ");
            json.append(quoteJSON(getAvailableDate() + ""));
            first = false;
        }
        if (isSetAcknowledged()) {
            if (!first) json.append(", ");
            json.append(quoteJSON("Acknowledged"));
            json.append(" : ");
            json.append(quoteJSON(isAcknowledged() + ""));
            first = false;
        }
        if (isSetAcknowledgedDate()) {
            if (!first) json.append(", ");
            json.append(quoteJSON("AcknowledgedDate"));
            json.append(" : ");
            json.append(quoteJSON(getAcknowledgedDate() + ""));
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

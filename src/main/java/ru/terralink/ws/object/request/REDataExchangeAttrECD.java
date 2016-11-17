
package ru.terralink.ws.object.request;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for REDataExchangeAttrECD complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="REDataExchangeAttrECD">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Header" type="{http://inform.gazprom.ru/C/SUIM/REDataExchange}REDataExchangeHeader"/>
 *         &lt;element name="OBJECT_REFS" maxOccurs="unbounded" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="OBJECT_REF" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="ObjCommType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="LINK" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="DOCGUID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="Delete" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="PARTNER_REFS" maxOccurs="unbounded" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="PARTNER_REF" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="LINK" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="DOCGUID" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="Delete" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="GENERAL">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="DOCTYPE" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="DOCGR_CODE" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="DOCNUM" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="DOCDATE" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *                   &lt;element name="DOCNAME" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="NODOCNUM" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *                   &lt;element name="NODOCDATE" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *                   &lt;element name="REMARKS" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="RERF" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="AUTORDOC" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="CONTRACT" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="BP1" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="XBP1" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="BP2" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="XBP2" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="RECNBEG" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *                   &lt;element name="RECNEND1ST" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *                   &lt;element name="RECNREGDJR" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *                   &lt;element name="RECNREGJR" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="RECNREGDCH" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *                   &lt;element name="RECNNRCH" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="RECNREGST" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="RECNREGDST" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="FINDOC" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="RECNNREXT" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="XCHILDORG" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="RECND" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *                   &lt;element name="AJAHR" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="RECNTYPE" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="SUMMA" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="TAXAMOUNT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="CALCCURR" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="DESCRIPTION" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="LETTERS" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="CHILDORG1" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="XCHILDORG1" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="SENDERFIO" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="CHILDORG2" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="XCHILDORG2" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="RECEIVERFIO" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="DESCRIPTION" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="SUMMA" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="CALCCURR" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="ANY" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="CUSTOMER" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="CHILDORG" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="XCHILDORG" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="PERIODBEGIN" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *                   &lt;element name="CONSTRUCTOBJECT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="CONSTRUCTNAME" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="PERIOD" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *                   &lt;element name="LINKDOCNUM" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="LINKDOCDATE" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *                   &lt;element name="SUMMA" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="CALCCURR" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="ACTS" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="BP1" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="XBP1" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="BP2" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="XBP2" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="RECVDOCNUM" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="RECVDOCDATE" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *                   &lt;element name="KADASTRNUM" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="KPD" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="LAWSUBJECT" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="XLAWSUBJECT" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="XOLTYPE" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="OLTYPE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="REGNUM" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="REGDATE" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *                   &lt;element name="CERTSER" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="CERTNUM" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="CERTDATE" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *                   &lt;element name="CHILDORG" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="XCHILDORG" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="XOBJOFLAW" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="KADASTRNUM" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="XLAWTYPE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="LAWTYPE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="INVENTORNUM" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="BP1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="RECNREGOROLD" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="DFV" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="MANAGING_SUBJEC" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="XMANAGING_SUBJEC" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="BUKRS" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="REGDATE" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *                   &lt;element name="REGNUM" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="DOCNUM" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="DOCDATE" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *                   &lt;element name="DOCNAME" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="NODOCNUM" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *                   &lt;element name="NODOCDATE" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *                   &lt;element name="REMARKS" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="REGORGAN" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="DESCRIPTION" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="NNA" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="CHILDORG1" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="XCHILDORG1" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="OBJNAME" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="OBJPLACE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="KADASTRNUM" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="OGRN" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="EGRJLDATE" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *                   &lt;element name="EGRPDATE" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *                   &lt;element name="EGRPNUM" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="CCC" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="RATINGOBJECT" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="ESTIMATEDORG" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="XESTIMATEDORG" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="AttrFile" type="{http://inform.gazprom.ru/C/SUIM/REDataExchange}REDataExchangeAttrFile" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "REDataExchangeAttrECD", namespace = "http://inform.gazprom.ru/C/SUIM/REDataExchange", propOrder = {
    "header",
    "objectrefs",
    "partnerrefs",
    "general",
    "contract",
    "findoc",
    "letters",
    "any",
    "acts",
    "kpd",
    "dfv",
    "nna",
    "ccc",
    "attrFile"
})
@Component("REDataExchangeAttrECD")
public class REDataExchangeAttrECD {

    @XmlElement(name = "Header", required = true)
    protected REDataExchangeHeader header;
    @XmlElement(name = "OBJECT_REFS")
    protected List<REDataExchangeAttrECD.OBJECTREFS> objectrefs;
    @XmlElement(name = "PARTNER_REFS")
    protected List<REDataExchangeAttrECD.PARTNERREFS> partnerrefs;
    @XmlElement(name = "GENERAL", required = true)
    protected REDataExchangeAttrECD.GENERAL general;
    @XmlElement(name = "CONTRACT")
    protected REDataExchangeAttrECD.CONTRACT contract;
    @XmlElement(name = "FINDOC")
    protected REDataExchangeAttrECD.FINDOC findoc;
    @XmlElement(name = "LETTERS")
    protected REDataExchangeAttrECD.LETTERS letters;
    @XmlElement(name = "ANY")
    protected REDataExchangeAttrECD.ANY any;
    @XmlElement(name = "ACTS")
    protected REDataExchangeAttrECD.ACTS acts;
    @XmlElement(name = "KPD")
    protected REDataExchangeAttrECD.KPD kpd;
    @XmlElement(name = "DFV")
    protected REDataExchangeAttrECD.DFV dfv;
    @XmlElement(name = "NNA")
    protected REDataExchangeAttrECD.NNA nna;
    @XmlElement(name = "CCC")
    protected REDataExchangeAttrECD.CCC ccc;
    @XmlElement(name = "AttrFile")
    protected List<REDataExchangeAttrFile> attrFile;

    /**
     * Gets the value of the header property.
     * 
     * @return
     *     possible object is
     *     {@link REDataExchangeHeader }
     *     
     */
    public REDataExchangeHeader getHeader() {
        return header;
    }

    /**
     * Sets the value of the header property.
     * 
     * @param value
     *     allowed object is
     *     {@link REDataExchangeHeader }
     *     
     */
    public void setHeader(REDataExchangeHeader value) {
        this.header = value;
    }

    /**
     * Gets the value of the objectrefs property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the objectrefs property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOBJECTREFS().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link REDataExchangeAttrECD.OBJECTREFS }
     * 
     * 
     */
    public List<REDataExchangeAttrECD.OBJECTREFS> getOBJECTREFS() {
        if (objectrefs == null) {
            objectrefs = new ArrayList<REDataExchangeAttrECD.OBJECTREFS>();
        }
        return this.objectrefs;
    }

    /**
     * Gets the value of the partnerrefs property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the partnerrefs property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPARTNERREFS().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link REDataExchangeAttrECD.PARTNERREFS }
     * 
     * 
     */
    public List<REDataExchangeAttrECD.PARTNERREFS> getPARTNERREFS() {
        if (partnerrefs == null) {
            partnerrefs = new ArrayList<REDataExchangeAttrECD.PARTNERREFS>();
        }
        return this.partnerrefs;
    }

    /**
     * Gets the value of the general property.
     * 
     * @return
     *     possible object is
     *     {@link REDataExchangeAttrECD.GENERAL }
     *     
     */
    public REDataExchangeAttrECD.GENERAL getGENERAL() {
        return general;
    }

    /**
     * Sets the value of the general property.
     * 
     * @param value
     *     allowed object is
     *     {@link REDataExchangeAttrECD.GENERAL }
     *     
     */
    public void setGENERAL(REDataExchangeAttrECD.GENERAL value) {
        this.general = value;
    }

    /**
     * Gets the value of the contract property.
     * 
     * @return
     *     possible object is
     *     {@link REDataExchangeAttrECD.CONTRACT }
     *     
     */
    public REDataExchangeAttrECD.CONTRACT getCONTRACT() {
        return contract;
    }

    /**
     * Sets the value of the contract property.
     * 
     * @param value
     *     allowed object is
     *     {@link REDataExchangeAttrECD.CONTRACT }
     *     
     */
    public void setCONTRACT(REDataExchangeAttrECD.CONTRACT value) {
        this.contract = value;
    }

    /**
     * Gets the value of the findoc property.
     * 
     * @return
     *     possible object is
     *     {@link REDataExchangeAttrECD.FINDOC }
     *     
     */
    public REDataExchangeAttrECD.FINDOC getFINDOC() {
        return findoc;
    }

    /**
     * Sets the value of the findoc property.
     * 
     * @param value
     *     allowed object is
     *     {@link REDataExchangeAttrECD.FINDOC }
     *     
     */
    public void setFINDOC(REDataExchangeAttrECD.FINDOC value) {
        this.findoc = value;
    }

    /**
     * Gets the value of the letters property.
     * 
     * @return
     *     possible object is
     *     {@link REDataExchangeAttrECD.LETTERS }
     *     
     */
    public REDataExchangeAttrECD.LETTERS getLETTERS() {
        return letters;
    }

    /**
     * Sets the value of the letters property.
     * 
     * @param value
     *     allowed object is
     *     {@link REDataExchangeAttrECD.LETTERS }
     *     
     */
    public void setLETTERS(REDataExchangeAttrECD.LETTERS value) {
        this.letters = value;
    }

    /**
     * Gets the value of the any property.
     * 
     * @return
     *     possible object is
     *     {@link REDataExchangeAttrECD.ANY }
     *     
     */
    public REDataExchangeAttrECD.ANY getANY() {
        return any;
    }

    /**
     * Sets the value of the any property.
     * 
     * @param value
     *     allowed object is
     *     {@link REDataExchangeAttrECD.ANY }
     *     
     */
    public void setANY(REDataExchangeAttrECD.ANY value) {
        this.any = value;
    }

    /**
     * Gets the value of the acts property.
     * 
     * @return
     *     possible object is
     *     {@link REDataExchangeAttrECD.ACTS }
     *     
     */
    public REDataExchangeAttrECD.ACTS getACTS() {
        return acts;
    }

    /**
     * Sets the value of the acts property.
     * 
     * @param value
     *     allowed object is
     *     {@link REDataExchangeAttrECD.ACTS }
     *     
     */
    public void setACTS(REDataExchangeAttrECD.ACTS value) {
        this.acts = value;
    }

    /**
     * Gets the value of the kpd property.
     * 
     * @return
     *     possible object is
     *     {@link REDataExchangeAttrECD.KPD }
     *     
     */
    public REDataExchangeAttrECD.KPD getKPD() {
        return kpd;
    }

    /**
     * Sets the value of the kpd property.
     * 
     * @param value
     *     allowed object is
     *     {@link REDataExchangeAttrECD.KPD }
     *     
     */
    public void setKPD(REDataExchangeAttrECD.KPD value) {
        this.kpd = value;
    }

    /**
     * Gets the value of the dfv property.
     * 
     * @return
     *     possible object is
     *     {@link REDataExchangeAttrECD.DFV }
     *     
     */
    public REDataExchangeAttrECD.DFV getDFV() {
        return dfv;
    }

    /**
     * Sets the value of the dfv property.
     * 
     * @param value
     *     allowed object is
     *     {@link REDataExchangeAttrECD.DFV }
     *     
     */
    public void setDFV(REDataExchangeAttrECD.DFV value) {
        this.dfv = value;
    }

    /**
     * Gets the value of the nna property.
     * 
     * @return
     *     possible object is
     *     {@link REDataExchangeAttrECD.NNA }
     *     
     */
    public REDataExchangeAttrECD.NNA getNNA() {
        return nna;
    }

    /**
     * Sets the value of the nna property.
     * 
     * @param value
     *     allowed object is
     *     {@link REDataExchangeAttrECD.NNA }
     *     
     */
    public void setNNA(REDataExchangeAttrECD.NNA value) {
        this.nna = value;
    }

    /**
     * Gets the value of the ccc property.
     * 
     * @return
     *     possible object is
     *     {@link REDataExchangeAttrECD.CCC }
     *     
     */
    public REDataExchangeAttrECD.CCC getCCC() {
        return ccc;
    }

    /**
     * Sets the value of the ccc property.
     * 
     * @param value
     *     allowed object is
     *     {@link REDataExchangeAttrECD.CCC }
     *     
     */
    public void setCCC(REDataExchangeAttrECD.CCC value) {
        this.ccc = value;
    }

    /**
     * Gets the value of the attrFile property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the attrFile property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAttrFile().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link REDataExchangeAttrFile }
     * 
     * 
     */
    public List<REDataExchangeAttrFile> getAttrFile() {
        if (attrFile == null) {
            attrFile = new ArrayList<REDataExchangeAttrFile>();
        }
        return this.attrFile;
    }


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
     *         &lt;element name="BP1" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="XBP1" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="BP2" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="XBP2" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="RECVDOCNUM" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="RECVDOCDATE" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
     *         &lt;element name="KADASTRNUM" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "bp1",
        "xbp1",
        "bp2",
        "xbp2",
        "recvdocnum",
        "recvdocdate",
        "kadastrnum"
    })
    public static class ACTS {

        @XmlElement(name = "BP1", required = true)
        protected String bp1;
        @XmlElement(name = "XBP1", required = true)
        protected String xbp1;
        @XmlElement(name = "BP2", required = true)
        protected String bp2;
        @XmlElement(name = "XBP2", required = true)
        protected String xbp2;
        @XmlElement(name = "RECVDOCNUM")
        protected String recvdocnum;
        @XmlElement(name = "RECVDOCDATE")
        @XmlSchemaType(name = "date")
        protected XMLGregorianCalendar recvdocdate;
        @XmlElement(name = "KADASTRNUM")
        protected String kadastrnum;

        /**
         * Gets the value of the bp1 property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getBP1() {
            return bp1;
        }

        /**
         * Sets the value of the bp1 property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setBP1(String value) {
            this.bp1 = value;
        }

        /**
         * Gets the value of the xbp1 property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getXBP1() {
            return xbp1;
        }

        /**
         * Sets the value of the xbp1 property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setXBP1(String value) {
            this.xbp1 = value;
        }

        /**
         * Gets the value of the bp2 property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getBP2() {
            return bp2;
        }

        /**
         * Sets the value of the bp2 property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setBP2(String value) {
            this.bp2 = value;
        }

        /**
         * Gets the value of the xbp2 property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getXBP2() {
            return xbp2;
        }

        /**
         * Sets the value of the xbp2 property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setXBP2(String value) {
            this.xbp2 = value;
        }

        /**
         * Gets the value of the recvdocnum property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getRECVDOCNUM() {
            return recvdocnum;
        }

        /**
         * Sets the value of the recvdocnum property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setRECVDOCNUM(String value) {
            this.recvdocnum = value;
        }

        /**
         * Gets the value of the recvdocdate property.
         * 
         * @return
         *     possible object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public XMLGregorianCalendar getRECVDOCDATE() {
            return recvdocdate;
        }

        /**
         * Sets the value of the recvdocdate property.
         * 
         * @param value
         *     allowed object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public void setRECVDOCDATE(XMLGregorianCalendar value) {
            this.recvdocdate = value;
        }

        /**
         * Gets the value of the kadastrnum property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getKADASTRNUM() {
            return kadastrnum;
        }

        /**
         * Sets the value of the kadastrnum property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setKADASTRNUM(String value) {
            this.kadastrnum = value;
        }

    }


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
     *         &lt;element name="CUSTOMER" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="CHILDORG" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="XCHILDORG" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="PERIODBEGIN" type="{http://www.w3.org/2001/XMLSchema}date"/>
     *         &lt;element name="CONSTRUCTOBJECT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="CONSTRUCTNAME" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="PERIOD" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
     *         &lt;element name="LINKDOCNUM" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="LINKDOCDATE" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
     *         &lt;element name="SUMMA" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="CALCCURR" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "customer",
        "childorg",
        "xchildorg",
        "periodbegin",
        "constructobject",
        "constructname",
        "period",
        "linkdocnum",
        "linkdocdate",
        "summa",
        "calccurr"
    })
    public static class ANY {

        @XmlElement(name = "CUSTOMER", required = true)
        protected String customer;
        @XmlElement(name = "CHILDORG", required = true)
        protected String childorg;
        @XmlElement(name = "XCHILDORG", required = true)
        protected String xchildorg;
        @XmlElement(name = "PERIODBEGIN", required = true)
        @XmlSchemaType(name = "date")
        protected XMLGregorianCalendar periodbegin;
        @XmlElement(name = "CONSTRUCTOBJECT")
        protected String constructobject;
        @XmlElement(name = "CONSTRUCTNAME")
        protected String constructname;
        @XmlElement(name = "PERIOD")
        @XmlSchemaType(name = "date")
        protected XMLGregorianCalendar period;
        @XmlElement(name = "LINKDOCNUM")
        protected String linkdocnum;
        @XmlElement(name = "LINKDOCDATE")
        @XmlSchemaType(name = "date")
        protected XMLGregorianCalendar linkdocdate;
        @XmlElement(name = "SUMMA")
        protected String summa;
        @XmlElement(name = "CALCCURR")
        protected String calccurr;

        /**
         * Gets the value of the customer property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCUSTOMER() {
            return customer;
        }

        /**
         * Sets the value of the customer property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCUSTOMER(String value) {
            this.customer = value;
        }

        /**
         * Gets the value of the childorg property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCHILDORG() {
            return childorg;
        }

        /**
         * Sets the value of the childorg property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCHILDORG(String value) {
            this.childorg = value;
        }

        /**
         * Gets the value of the xchildorg property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getXCHILDORG() {
            return xchildorg;
        }

        /**
         * Sets the value of the xchildorg property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setXCHILDORG(String value) {
            this.xchildorg = value;
        }

        /**
         * Gets the value of the periodbegin property.
         * 
         * @return
         *     possible object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public XMLGregorianCalendar getPERIODBEGIN() {
            return periodbegin;
        }

        /**
         * Sets the value of the periodbegin property.
         * 
         * @param value
         *     allowed object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public void setPERIODBEGIN(XMLGregorianCalendar value) {
            this.periodbegin = value;
        }

        /**
         * Gets the value of the constructobject property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCONSTRUCTOBJECT() {
            return constructobject;
        }

        /**
         * Sets the value of the constructobject property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCONSTRUCTOBJECT(String value) {
            this.constructobject = value;
        }

        /**
         * Gets the value of the constructname property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCONSTRUCTNAME() {
            return constructname;
        }

        /**
         * Sets the value of the constructname property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCONSTRUCTNAME(String value) {
            this.constructname = value;
        }

        /**
         * Gets the value of the period property.
         * 
         * @return
         *     possible object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public XMLGregorianCalendar getPERIOD() {
            return period;
        }

        /**
         * Sets the value of the period property.
         * 
         * @param value
         *     allowed object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public void setPERIOD(XMLGregorianCalendar value) {
            this.period = value;
        }

        /**
         * Gets the value of the linkdocnum property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getLINKDOCNUM() {
            return linkdocnum;
        }

        /**
         * Sets the value of the linkdocnum property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setLINKDOCNUM(String value) {
            this.linkdocnum = value;
        }

        /**
         * Gets the value of the linkdocdate property.
         * 
         * @return
         *     possible object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public XMLGregorianCalendar getLINKDOCDATE() {
            return linkdocdate;
        }

        /**
         * Sets the value of the linkdocdate property.
         * 
         * @param value
         *     allowed object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public void setLINKDOCDATE(XMLGregorianCalendar value) {
            this.linkdocdate = value;
        }

        /**
         * Gets the value of the summa property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getSUMMA() {
            return summa;
        }

        /**
         * Sets the value of the summa property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setSUMMA(String value) {
            this.summa = value;
        }

        /**
         * Gets the value of the calccurr property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCALCCURR() {
            return calccurr;
        }

        /**
         * Sets the value of the calccurr property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCALCCURR(String value) {
            this.calccurr = value;
        }

    }


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
     *         &lt;element name="RATINGOBJECT" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="ESTIMATEDORG" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="XESTIMATEDORG" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "ratingobject",
        "estimatedorg",
        "xestimatedorg"
    })
    public static class CCC {

        @XmlElement(name = "RATINGOBJECT", required = true)
        protected String ratingobject;
        @XmlElement(name = "ESTIMATEDORG")
        protected String estimatedorg;
        @XmlElement(name = "XESTIMATEDORG")
        protected String xestimatedorg;

        /**
         * Gets the value of the ratingobject property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getRATINGOBJECT() {
            return ratingobject;
        }

        /**
         * Sets the value of the ratingobject property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setRATINGOBJECT(String value) {
            this.ratingobject = value;
        }

        /**
         * Gets the value of the estimatedorg property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getESTIMATEDORG() {
            return estimatedorg;
        }

        /**
         * Sets the value of the estimatedorg property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setESTIMATEDORG(String value) {
            this.estimatedorg = value;
        }

        /**
         * Gets the value of the xestimatedorg property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getXESTIMATEDORG() {
            return xestimatedorg;
        }

        /**
         * Sets the value of the xestimatedorg property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setXESTIMATEDORG(String value) {
            this.xestimatedorg = value;
        }

    }


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
     *         &lt;element name="BP1" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="XBP1" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="BP2" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="XBP2" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="RECNBEG" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
     *         &lt;element name="RECNEND1ST" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
     *         &lt;element name="RECNREGDJR" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
     *         &lt;element name="RECNREGJR" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="RECNREGDCH" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
     *         &lt;element name="RECNNRCH" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="RECNREGST" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="RECNREGDST" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "bp1",
        "xbp1",
        "bp2",
        "xbp2",
        "recnbeg",
        "recnend1ST",
        "recnregdjr",
        "recnregjr",
        "recnregdch",
        "recnnrch",
        "recnregst",
        "recnregdst"
    })
    public static class CONTRACT {

        @XmlElement(name = "BP1", required = true)
        protected String bp1;
        @XmlElement(name = "XBP1", required = true)
        protected String xbp1;
        @XmlElement(name = "BP2", required = true)
        protected String bp2;
        @XmlElement(name = "XBP2", required = true)
        protected String xbp2;
        @XmlElement(name = "RECNBEG")
        @XmlSchemaType(name = "date")
        protected XMLGregorianCalendar recnbeg;
        @XmlElement(name = "RECNEND1ST")
        @XmlSchemaType(name = "date")
        protected XMLGregorianCalendar recnend1ST;
        @XmlElement(name = "RECNREGDJR")
        @XmlSchemaType(name = "date")
        protected XMLGregorianCalendar recnregdjr;
        @XmlElement(name = "RECNREGJR")
        protected String recnregjr;
        @XmlElement(name = "RECNREGDCH")
        @XmlSchemaType(name = "date")
        protected XMLGregorianCalendar recnregdch;
        @XmlElement(name = "RECNNRCH")
        protected String recnnrch;
        @XmlElement(name = "RECNREGST")
        protected String recnregst;
        @XmlElement(name = "RECNREGDST")
        @XmlSchemaType(name = "date")
        protected XMLGregorianCalendar recnregdst;

        /**
         * Gets the value of the bp1 property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getBP1() {
            return bp1;
        }

        /**
         * Sets the value of the bp1 property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setBP1(String value) {
            this.bp1 = value;
        }

        /**
         * Gets the value of the xbp1 property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getXBP1() {
            return xbp1;
        }

        /**
         * Sets the value of the xbp1 property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setXBP1(String value) {
            this.xbp1 = value;
        }

        /**
         * Gets the value of the bp2 property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getBP2() {
            return bp2;
        }

        /**
         * Sets the value of the bp2 property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setBP2(String value) {
            this.bp2 = value;
        }

        /**
         * Gets the value of the xbp2 property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getXBP2() {
            return xbp2;
        }

        /**
         * Sets the value of the xbp2 property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setXBP2(String value) {
            this.xbp2 = value;
        }

        /**
         * Gets the value of the recnbeg property.
         * 
         * @return
         *     possible object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public XMLGregorianCalendar getRECNBEG() {
            return recnbeg;
        }

        /**
         * Sets the value of the recnbeg property.
         * 
         * @param value
         *     allowed object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public void setRECNBEG(XMLGregorianCalendar value) {
            this.recnbeg = value;
        }

        /**
         * Gets the value of the recnend1ST property.
         * 
         * @return
         *     possible object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public XMLGregorianCalendar getRECNEND1ST() {
            return recnend1ST;
        }

        /**
         * Sets the value of the recnend1ST property.
         * 
         * @param value
         *     allowed object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public void setRECNEND1ST(XMLGregorianCalendar value) {
            this.recnend1ST = value;
        }

        /**
         * Gets the value of the recnregdjr property.
         * 
         * @return
         *     possible object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public XMLGregorianCalendar getRECNREGDJR() {
            return recnregdjr;
        }

        /**
         * Sets the value of the recnregdjr property.
         * 
         * @param value
         *     allowed object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public void setRECNREGDJR(XMLGregorianCalendar value) {
            this.recnregdjr = value;
        }

        /**
         * Gets the value of the recnregjr property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getRECNREGJR() {
            return recnregjr;
        }

        /**
         * Sets the value of the recnregjr property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setRECNREGJR(String value) {
            this.recnregjr = value;
        }

        /**
         * Gets the value of the recnregdch property.
         * 
         * @return
         *     possible object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public XMLGregorianCalendar getRECNREGDCH() {
            return recnregdch;
        }

        /**
         * Sets the value of the recnregdch property.
         * 
         * @param value
         *     allowed object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public void setRECNREGDCH(XMLGregorianCalendar value) {
            this.recnregdch = value;
        }

        /**
         * Gets the value of the recnnrch property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getRECNNRCH() {
            return recnnrch;
        }

        /**
         * Sets the value of the recnnrch property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setRECNNRCH(String value) {
            this.recnnrch = value;
        }

        /**
         * Gets the value of the recnregst property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getRECNREGST() {
            return recnregst;
        }

        /**
         * Sets the value of the recnregst property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setRECNREGST(String value) {
            this.recnregst = value;
        }

        /**
         * Gets the value of the recnregdst property.
         * 
         * @return
         *     possible object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public XMLGregorianCalendar getRECNREGDST() {
            return recnregdst;
        }

        /**
         * Sets the value of the recnregdst property.
         * 
         * @param value
         *     allowed object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public void setRECNREGDST(XMLGregorianCalendar value) {
            this.recnregdst = value;
        }

    }


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
     *         &lt;element name="MANAGING_SUBJEC" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="XMANAGING_SUBJEC" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="BUKRS" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="REGDATE" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
     *         &lt;element name="REGNUM" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="DOCNUM" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="DOCDATE" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
     *         &lt;element name="DOCNAME" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="NODOCNUM" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
     *         &lt;element name="NODOCDATE" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
     *         &lt;element name="REMARKS" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="REGORGAN" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="DESCRIPTION" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "managingsubjec",
        "xmanagingsubjec",
        "bukrs",
        "regdate",
        "regnum",
        "docnum",
        "docdate",
        "docname",
        "nodocnum",
        "nodocdate",
        "remarks",
        "regorgan",
        "description"
    })
    public static class DFV {

        @XmlElement(name = "MANAGING_SUBJEC", required = true)
        protected String managingsubjec;
        @XmlElement(name = "XMANAGING_SUBJEC")
        protected String xmanagingsubjec;
        @XmlElement(name = "BUKRS")
        protected String bukrs;
        @XmlElement(name = "REGDATE")
        @XmlSchemaType(name = "date")
        protected XMLGregorianCalendar regdate;
        @XmlElement(name = "REGNUM")
        protected String regnum;
        @XmlElement(name = "DOCNUM")
        protected String docnum;
        @XmlElement(name = "DOCDATE")
        @XmlSchemaType(name = "date")
        protected XMLGregorianCalendar docdate;
        @XmlElement(name = "DOCNAME")
        protected String docname;
        @XmlElement(name = "NODOCNUM")
        protected Boolean nodocnum;
        @XmlElement(name = "NODOCDATE")
        protected Boolean nodocdate;
        @XmlElement(name = "REMARKS")
        protected String remarks;
        @XmlElement(name = "REGORGAN")
        protected String regorgan;
        @XmlElement(name = "DESCRIPTION")
        protected String description;

        /**
         * Gets the value of the managingsubjec property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getMANAGINGSUBJEC() {
            return managingsubjec;
        }

        /**
         * Sets the value of the managingsubjec property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setMANAGINGSUBJEC(String value) {
            this.managingsubjec = value;
        }

        /**
         * Gets the value of the xmanagingsubjec property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getXMANAGINGSUBJEC() {
            return xmanagingsubjec;
        }

        /**
         * Sets the value of the xmanagingsubjec property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setXMANAGINGSUBJEC(String value) {
            this.xmanagingsubjec = value;
        }

        /**
         * Gets the value of the bukrs property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getBUKRS() {
            return bukrs;
        }

        /**
         * Sets the value of the bukrs property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setBUKRS(String value) {
            this.bukrs = value;
        }

        /**
         * Gets the value of the regdate property.
         * 
         * @return
         *     possible object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public XMLGregorianCalendar getREGDATE() {
            return regdate;
        }

        /**
         * Sets the value of the regdate property.
         * 
         * @param value
         *     allowed object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public void setREGDATE(XMLGregorianCalendar value) {
            this.regdate = value;
        }

        /**
         * Gets the value of the regnum property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getREGNUM() {
            return regnum;
        }

        /**
         * Sets the value of the regnum property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setREGNUM(String value) {
            this.regnum = value;
        }

        /**
         * Gets the value of the docnum property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getDOCNUM() {
            return docnum;
        }

        /**
         * Sets the value of the docnum property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setDOCNUM(String value) {
            this.docnum = value;
        }

        /**
         * Gets the value of the docdate property.
         * 
         * @return
         *     possible object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public XMLGregorianCalendar getDOCDATE() {
            return docdate;
        }

        /**
         * Sets the value of the docdate property.
         * 
         * @param value
         *     allowed object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public void setDOCDATE(XMLGregorianCalendar value) {
            this.docdate = value;
        }

        /**
         * Gets the value of the docname property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getDOCNAME() {
            return docname;
        }

        /**
         * Sets the value of the docname property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setDOCNAME(String value) {
            this.docname = value;
        }

        /**
         * Gets the value of the nodocnum property.
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isNODOCNUM() {
            return nodocnum;
        }

        /**
         * Sets the value of the nodocnum property.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setNODOCNUM(Boolean value) {
            this.nodocnum = value;
        }

        /**
         * Gets the value of the nodocdate property.
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isNODOCDATE() {
            return nodocdate;
        }

        /**
         * Sets the value of the nodocdate property.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setNODOCDATE(Boolean value) {
            this.nodocdate = value;
        }

        /**
         * Gets the value of the remarks property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getREMARKS() {
            return remarks;
        }

        /**
         * Sets the value of the remarks property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setREMARKS(String value) {
            this.remarks = value;
        }

        /**
         * Gets the value of the regorgan property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getREGORGAN() {
            return regorgan;
        }

        /**
         * Sets the value of the regorgan property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setREGORGAN(String value) {
            this.regorgan = value;
        }

        /**
         * Gets the value of the description property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getDESCRIPTION() {
            return description;
        }

        /**
         * Sets the value of the description property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setDESCRIPTION(String value) {
            this.description = value;
        }

    }


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
     *         &lt;element name="RECNNREXT" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="XCHILDORG" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="RECND" type="{http://www.w3.org/2001/XMLSchema}date"/>
     *         &lt;element name="AJAHR" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="RECNTYPE" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="SUMMA" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="TAXAMOUNT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="CALCCURR" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="DESCRIPTION" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "recnnrext",
        "xchildorg",
        "recnd",
        "ajahr",
        "recntype",
        "summa",
        "taxamount",
        "calccurr",
        "description"
    })
    public static class FINDOC {

        @XmlElement(name = "RECNNREXT", required = true)
        protected String recnnrext;
        @XmlElement(name = "XCHILDORG")
        protected String xchildorg;
        @XmlElement(name = "RECND", required = true)
        @XmlSchemaType(name = "date")
        protected XMLGregorianCalendar recnd;
        @XmlElement(name = "AJAHR")
        protected String ajahr;
        @XmlElement(name = "RECNTYPE", required = true)
        protected String recntype;
        @XmlElement(name = "SUMMA")
        protected String summa;
        @XmlElement(name = "TAXAMOUNT")
        protected String taxamount;
        @XmlElement(name = "CALCCURR")
        protected String calccurr;
        @XmlElement(name = "DESCRIPTION")
        protected String description;

        /**
         * Gets the value of the recnnrext property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getRECNNREXT() {
            return recnnrext;
        }

        /**
         * Sets the value of the recnnrext property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setRECNNREXT(String value) {
            this.recnnrext = value;
        }

        /**
         * Gets the value of the xchildorg property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getXCHILDORG() {
            return xchildorg;
        }

        /**
         * Sets the value of the xchildorg property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setXCHILDORG(String value) {
            this.xchildorg = value;
        }

        /**
         * Gets the value of the recnd property.
         * 
         * @return
         *     possible object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public XMLGregorianCalendar getRECND() {
            return recnd;
        }

        /**
         * Sets the value of the recnd property.
         * 
         * @param value
         *     allowed object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public void setRECND(XMLGregorianCalendar value) {
            this.recnd = value;
        }

        /**
         * Gets the value of the ajahr property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getAJAHR() {
            return ajahr;
        }

        /**
         * Sets the value of the ajahr property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setAJAHR(String value) {
            this.ajahr = value;
        }

        /**
         * Gets the value of the recntype property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getRECNTYPE() {
            return recntype;
        }

        /**
         * Sets the value of the recntype property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setRECNTYPE(String value) {
            this.recntype = value;
        }

        /**
         * Gets the value of the summa property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getSUMMA() {
            return summa;
        }

        /**
         * Sets the value of the summa property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setSUMMA(String value) {
            this.summa = value;
        }

        /**
         * Gets the value of the taxamount property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getTAXAMOUNT() {
            return taxamount;
        }

        /**
         * Sets the value of the taxamount property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setTAXAMOUNT(String value) {
            this.taxamount = value;
        }

        /**
         * Gets the value of the calccurr property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCALCCURR() {
            return calccurr;
        }

        /**
         * Sets the value of the calccurr property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCALCCURR(String value) {
            this.calccurr = value;
        }

        /**
         * Gets the value of the description property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getDESCRIPTION() {
            return description;
        }

        /**
         * Sets the value of the description property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setDESCRIPTION(String value) {
            this.description = value;
        }

    }


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
     *         &lt;element name="DOCTYPE" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="DOCGR_CODE" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="DOCNUM" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="DOCDATE" type="{http://www.w3.org/2001/XMLSchema}date"/>
     *         &lt;element name="DOCNAME" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="NODOCNUM" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
     *         &lt;element name="NODOCDATE" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
     *         &lt;element name="REMARKS" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="RERF" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="AUTORDOC" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "doctype",
        "docgrcode",
        "docnum",
        "docdate",
        "docname",
        "nodocnum",
        "nodocdate",
        "remarks",
        "rerf",
        "autordoc"
    })
    public static class GENERAL {

        @XmlElement(name = "DOCTYPE", required = true)
        protected String doctype;
        @XmlElement(name = "DOCGR_CODE", required = true)
        protected String docgrcode;
        @XmlElement(name = "DOCNUM", required = true)
        protected String docnum;
        @XmlElement(name = "DOCDATE", required = true)
        @XmlSchemaType(name = "date")
        protected XMLGregorianCalendar docdate;
        @XmlElement(name = "DOCNAME")
        protected String docname;
        @XmlElement(name = "NODOCNUM")
        protected Boolean nodocnum;
        @XmlElement(name = "NODOCDATE")
        protected Boolean nodocdate;
        @XmlElement(name = "REMARKS")
        protected String remarks;
        @XmlElement(name = "RERF", required = true)
        protected String rerf;
        @XmlElement(name = "AUTORDOC", required = true)
        protected String autordoc;

        /**
         * Gets the value of the doctype property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getDOCTYPE() {
            return doctype;
        }

        /**
         * Sets the value of the doctype property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setDOCTYPE(String value) {
            this.doctype = value;
        }

        /**
         * Gets the value of the docgrcode property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getDOCGRCODE() {
            return docgrcode;
        }

        /**
         * Sets the value of the docgrcode property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setDOCGRCODE(String value) {
            this.docgrcode = value;
        }

        /**
         * Gets the value of the docnum property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getDOCNUM() {
            return docnum;
        }

        /**
         * Sets the value of the docnum property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setDOCNUM(String value) {
            this.docnum = value;
        }

        /**
         * Gets the value of the docdate property.
         * 
         * @return
         *     possible object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public XMLGregorianCalendar getDOCDATE() {
            return docdate;
        }

        /**
         * Sets the value of the docdate property.
         * 
         * @param value
         *     allowed object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public void setDOCDATE(XMLGregorianCalendar value) {
            this.docdate = value;
        }

        /**
         * Gets the value of the docname property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getDOCNAME() {
            return docname;
        }

        /**
         * Sets the value of the docname property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setDOCNAME(String value) {
            this.docname = value;
        }

        /**
         * Gets the value of the nodocnum property.
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isNODOCNUM() {
            return nodocnum;
        }

        /**
         * Sets the value of the nodocnum property.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setNODOCNUM(Boolean value) {
            this.nodocnum = value;
        }

        /**
         * Gets the value of the nodocdate property.
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isNODOCDATE() {
            return nodocdate;
        }

        /**
         * Sets the value of the nodocdate property.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setNODOCDATE(Boolean value) {
            this.nodocdate = value;
        }

        /**
         * Gets the value of the remarks property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getREMARKS() {
            return remarks;
        }

        /**
         * Sets the value of the remarks property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setREMARKS(String value) {
            this.remarks = value;
        }

        /**
         * Gets the value of the rerf property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getRERF() {
            return rerf;
        }

        /**
         * Sets the value of the rerf property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setRERF(String value) {
            this.rerf = value;
        }

        /**
         * Gets the value of the autordoc property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getAUTORDOC() {
            return autordoc;
        }

        /**
         * Sets the value of the autordoc property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setAUTORDOC(String value) {
            this.autordoc = value;
        }

    }


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
     *         &lt;element name="LAWSUBJECT" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="XLAWSUBJECT" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="XOLTYPE" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="OLTYPE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="REGNUM" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="REGDATE" type="{http://www.w3.org/2001/XMLSchema}date"/>
     *         &lt;element name="CERTSER" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="CERTNUM" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="CERTDATE" type="{http://www.w3.org/2001/XMLSchema}date"/>
     *         &lt;element name="CHILDORG" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="XCHILDORG" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="XOBJOFLAW" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="KADASTRNUM" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="XLAWTYPE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="LAWTYPE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="INVENTORNUM" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="BP1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="RECNREGOROLD" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "lawsubject",
        "xlawsubject",
        "xoltype",
        "oltype",
        "regnum",
        "regdate",
        "certser",
        "certnum",
        "certdate",
        "childorg",
        "xchildorg",
        "xobjoflaw",
        "kadastrnum",
        "xlawtype",
        "lawtype",
        "inventornum",
        "bp1",
        "recnregorold"
    })
    public static class KPD {

        @XmlElement(name = "LAWSUBJECT", required = true)
        protected String lawsubject;
        @XmlElement(name = "XLAWSUBJECT", required = true)
        protected String xlawsubject;
        @XmlElement(name = "XOLTYPE", required = true)
        protected String xoltype;
        @XmlElement(name = "OLTYPE")
        protected String oltype;
        @XmlElement(name = "REGNUM", required = true)
        protected String regnum;
        @XmlElement(name = "REGDATE", required = true)
        @XmlSchemaType(name = "date")
        protected XMLGregorianCalendar regdate;
        @XmlElement(name = "CERTSER", required = true)
        protected String certser;
        @XmlElement(name = "CERTNUM", required = true)
        protected String certnum;
        @XmlElement(name = "CERTDATE", required = true)
        @XmlSchemaType(name = "date")
        protected XMLGregorianCalendar certdate;
        @XmlElement(name = "CHILDORG", required = true)
        protected String childorg;
        @XmlElement(name = "XCHILDORG", required = true)
        protected String xchildorg;
        @XmlElement(name = "XOBJOFLAW", required = true)
        protected String xobjoflaw;
        @XmlElement(name = "KADASTRNUM")
        protected String kadastrnum;
        @XmlElement(name = "XLAWTYPE")
        protected String xlawtype;
        @XmlElement(name = "LAWTYPE")
        protected String lawtype;
        @XmlElement(name = "INVENTORNUM")
        protected String inventornum;
        @XmlElement(name = "BP1")
        protected String bp1;
        @XmlElement(name = "RECNREGOROLD")
        protected String recnregorold;

        /**
         * Gets the value of the lawsubject property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getLAWSUBJECT() {
            return lawsubject;
        }

        /**
         * Sets the value of the lawsubject property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setLAWSUBJECT(String value) {
            this.lawsubject = value;
        }

        /**
         * Gets the value of the xlawsubject property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getXLAWSUBJECT() {
            return xlawsubject;
        }

        /**
         * Sets the value of the xlawsubject property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setXLAWSUBJECT(String value) {
            this.xlawsubject = value;
        }

        /**
         * Gets the value of the xoltype property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getXOLTYPE() {
            return xoltype;
        }

        /**
         * Sets the value of the xoltype property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setXOLTYPE(String value) {
            this.xoltype = value;
        }

        /**
         * Gets the value of the oltype property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getOLTYPE() {
            return oltype;
        }

        /**
         * Sets the value of the oltype property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setOLTYPE(String value) {
            this.oltype = value;
        }

        /**
         * Gets the value of the regnum property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getREGNUM() {
            return regnum;
        }

        /**
         * Sets the value of the regnum property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setREGNUM(String value) {
            this.regnum = value;
        }

        /**
         * Gets the value of the regdate property.
         * 
         * @return
         *     possible object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public XMLGregorianCalendar getREGDATE() {
            return regdate;
        }

        /**
         * Sets the value of the regdate property.
         * 
         * @param value
         *     allowed object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public void setREGDATE(XMLGregorianCalendar value) {
            this.regdate = value;
        }

        /**
         * Gets the value of the certser property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCERTSER() {
            return certser;
        }

        /**
         * Sets the value of the certser property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCERTSER(String value) {
            this.certser = value;
        }

        /**
         * Gets the value of the certnum property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCERTNUM() {
            return certnum;
        }

        /**
         * Sets the value of the certnum property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCERTNUM(String value) {
            this.certnum = value;
        }

        /**
         * Gets the value of the certdate property.
         * 
         * @return
         *     possible object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public XMLGregorianCalendar getCERTDATE() {
            return certdate;
        }

        /**
         * Sets the value of the certdate property.
         * 
         * @param value
         *     allowed object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public void setCERTDATE(XMLGregorianCalendar value) {
            this.certdate = value;
        }

        /**
         * Gets the value of the childorg property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCHILDORG() {
            return childorg;
        }

        /**
         * Sets the value of the childorg property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCHILDORG(String value) {
            this.childorg = value;
        }

        /**
         * Gets the value of the xchildorg property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getXCHILDORG() {
            return xchildorg;
        }

        /**
         * Sets the value of the xchildorg property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setXCHILDORG(String value) {
            this.xchildorg = value;
        }

        /**
         * Gets the value of the xobjoflaw property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getXOBJOFLAW() {
            return xobjoflaw;
        }

        /**
         * Sets the value of the xobjoflaw property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setXOBJOFLAW(String value) {
            this.xobjoflaw = value;
        }

        /**
         * Gets the value of the kadastrnum property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getKADASTRNUM() {
            return kadastrnum;
        }

        /**
         * Sets the value of the kadastrnum property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setKADASTRNUM(String value) {
            this.kadastrnum = value;
        }

        /**
         * Gets the value of the xlawtype property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getXLAWTYPE() {
            return xlawtype;
        }

        /**
         * Sets the value of the xlawtype property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setXLAWTYPE(String value) {
            this.xlawtype = value;
        }

        /**
         * Gets the value of the lawtype property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getLAWTYPE() {
            return lawtype;
        }

        /**
         * Sets the value of the lawtype property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setLAWTYPE(String value) {
            this.lawtype = value;
        }

        /**
         * Gets the value of the inventornum property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getINVENTORNUM() {
            return inventornum;
        }

        /**
         * Sets the value of the inventornum property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setINVENTORNUM(String value) {
            this.inventornum = value;
        }

        /**
         * Gets the value of the bp1 property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getBP1() {
            return bp1;
        }

        /**
         * Sets the value of the bp1 property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setBP1(String value) {
            this.bp1 = value;
        }

        /**
         * Gets the value of the recnregorold property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getRECNREGOROLD() {
            return recnregorold;
        }

        /**
         * Sets the value of the recnregorold property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setRECNREGOROLD(String value) {
            this.recnregorold = value;
        }

    }


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
     *         &lt;element name="CHILDORG1" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="XCHILDORG1" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="SENDERFIO" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="CHILDORG2" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="XCHILDORG2" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="RECEIVERFIO" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="DESCRIPTION" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="SUMMA" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="CALCCURR" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "childorg1",
        "xchildorg1",
        "senderfio",
        "childorg2",
        "xchildorg2",
        "receiverfio",
        "description",
        "summa",
        "calccurr"
    })
    public static class LETTERS {

        @XmlElement(name = "CHILDORG1", required = true)
        protected String childorg1;
        @XmlElement(name = "XCHILDORG1", required = true)
        protected String xchildorg1;
        @XmlElement(name = "SENDERFIO", required = true)
        protected String senderfio;
        @XmlElement(name = "CHILDORG2", required = true)
        protected String childorg2;
        @XmlElement(name = "XCHILDORG2", required = true)
        protected String xchildorg2;
        @XmlElement(name = "RECEIVERFIO")
        protected String receiverfio;
        @XmlElement(name = "DESCRIPTION")
        protected String description;
        @XmlElement(name = "SUMMA")
        protected String summa;
        @XmlElement(name = "CALCCURR")
        protected String calccurr;

        /**
         * Gets the value of the childorg1 property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCHILDORG1() {
            return childorg1;
        }

        /**
         * Sets the value of the childorg1 property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCHILDORG1(String value) {
            this.childorg1 = value;
        }

        /**
         * Gets the value of the xchildorg1 property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getXCHILDORG1() {
            return xchildorg1;
        }

        /**
         * Sets the value of the xchildorg1 property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setXCHILDORG1(String value) {
            this.xchildorg1 = value;
        }

        /**
         * Gets the value of the senderfio property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getSENDERFIO() {
            return senderfio;
        }

        /**
         * Sets the value of the senderfio property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setSENDERFIO(String value) {
            this.senderfio = value;
        }

        /**
         * Gets the value of the childorg2 property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCHILDORG2() {
            return childorg2;
        }

        /**
         * Sets the value of the childorg2 property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCHILDORG2(String value) {
            this.childorg2 = value;
        }

        /**
         * Gets the value of the xchildorg2 property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getXCHILDORG2() {
            return xchildorg2;
        }

        /**
         * Sets the value of the xchildorg2 property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setXCHILDORG2(String value) {
            this.xchildorg2 = value;
        }

        /**
         * Gets the value of the receiverfio property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getRECEIVERFIO() {
            return receiverfio;
        }

        /**
         * Sets the value of the receiverfio property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setRECEIVERFIO(String value) {
            this.receiverfio = value;
        }

        /**
         * Gets the value of the description property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getDESCRIPTION() {
            return description;
        }

        /**
         * Sets the value of the description property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setDESCRIPTION(String value) {
            this.description = value;
        }

        /**
         * Gets the value of the summa property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getSUMMA() {
            return summa;
        }

        /**
         * Sets the value of the summa property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setSUMMA(String value) {
            this.summa = value;
        }

        /**
         * Gets the value of the calccurr property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCALCCURR() {
            return calccurr;
        }

        /**
         * Sets the value of the calccurr property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCALCCURR(String value) {
            this.calccurr = value;
        }

    }


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
     *         &lt;element name="CHILDORG1" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="XCHILDORG1" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="OBJNAME" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="OBJPLACE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="KADASTRNUM" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="OGRN" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="EGRJLDATE" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
     *         &lt;element name="EGRPDATE" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
     *         &lt;element name="EGRPNUM" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "childorg1",
        "xchildorg1",
        "objname",
        "objplace",
        "kadastrnum",
        "ogrn",
        "egrjldate",
        "egrpdate",
        "egrpnum"
    })
    public static class NNA {

        @XmlElement(name = "CHILDORG1", required = true)
        protected String childorg1;
        @XmlElement(name = "XCHILDORG1", required = true)
        protected String xchildorg1;
        @XmlElement(name = "OBJNAME")
        protected String objname;
        @XmlElement(name = "OBJPLACE")
        protected String objplace;
        @XmlElement(name = "KADASTRNUM")
        protected String kadastrnum;
        @XmlElement(name = "OGRN")
        protected String ogrn;
        @XmlElement(name = "EGRJLDATE")
        @XmlSchemaType(name = "date")
        protected XMLGregorianCalendar egrjldate;
        @XmlElement(name = "EGRPDATE")
        @XmlSchemaType(name = "date")
        protected XMLGregorianCalendar egrpdate;
        @XmlElement(name = "EGRPNUM")
        protected String egrpnum;

        /**
         * Gets the value of the childorg1 property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCHILDORG1() {
            return childorg1;
        }

        /**
         * Sets the value of the childorg1 property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCHILDORG1(String value) {
            this.childorg1 = value;
        }

        /**
         * Gets the value of the xchildorg1 property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getXCHILDORG1() {
            return xchildorg1;
        }

        /**
         * Sets the value of the xchildorg1 property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setXCHILDORG1(String value) {
            this.xchildorg1 = value;
        }

        /**
         * Gets the value of the objname property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getOBJNAME() {
            return objname;
        }

        /**
         * Sets the value of the objname property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setOBJNAME(String value) {
            this.objname = value;
        }

        /**
         * Gets the value of the objplace property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getOBJPLACE() {
            return objplace;
        }

        /**
         * Sets the value of the objplace property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setOBJPLACE(String value) {
            this.objplace = value;
        }

        /**
         * Gets the value of the kadastrnum property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getKADASTRNUM() {
            return kadastrnum;
        }

        /**
         * Sets the value of the kadastrnum property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setKADASTRNUM(String value) {
            this.kadastrnum = value;
        }

        /**
         * Gets the value of the ogrn property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getOGRN() {
            return ogrn;
        }

        /**
         * Sets the value of the ogrn property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setOGRN(String value) {
            this.ogrn = value;
        }

        /**
         * Gets the value of the egrjldate property.
         * 
         * @return
         *     possible object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public XMLGregorianCalendar getEGRJLDATE() {
            return egrjldate;
        }

        /**
         * Sets the value of the egrjldate property.
         * 
         * @param value
         *     allowed object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public void setEGRJLDATE(XMLGregorianCalendar value) {
            this.egrjldate = value;
        }

        /**
         * Gets the value of the egrpdate property.
         * 
         * @return
         *     possible object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public XMLGregorianCalendar getEGRPDATE() {
            return egrpdate;
        }

        /**
         * Sets the value of the egrpdate property.
         * 
         * @param value
         *     allowed object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public void setEGRPDATE(XMLGregorianCalendar value) {
            this.egrpdate = value;
        }

        /**
         * Gets the value of the egrpnum property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getEGRPNUM() {
            return egrpnum;
        }

        /**
         * Sets the value of the egrpnum property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setEGRPNUM(String value) {
            this.egrpnum = value;
        }

    }


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
     *         &lt;element name="OBJECT_REF" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="ObjCommType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="LINK" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="DOCGUID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="Delete" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "objectref",
        "objCommType",
        "link",
        "docguid",
        "delete"
    })
    public static class OBJECTREFS {

        @XmlElement(name = "OBJECT_REF", required = true)
        protected String objectref;
        @XmlElement(name = "ObjCommType")
        protected String objCommType;
        @XmlElement(name = "LINK")
        protected String link;
        @XmlElement(name = "DOCGUID")
        protected String docguid;
        @XmlElement(name = "Delete")
        protected Boolean delete;

        /**
         * Gets the value of the objectref property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getOBJECTREF() {
            return objectref;
        }

        /**
         * Sets the value of the objectref property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setOBJECTREF(String value) {
            this.objectref = value;
        }

        /**
         * Gets the value of the objCommType property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getObjCommType() {
            return objCommType;
        }

        /**
         * Sets the value of the objCommType property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setObjCommType(String value) {
            this.objCommType = value;
        }

        /**
         * Gets the value of the link property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getLINK() {
            return link;
        }

        /**
         * Sets the value of the link property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setLINK(String value) {
            this.link = value;
        }

        /**
         * Gets the value of the docguid property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getDOCGUID() {
            return docguid;
        }

        /**
         * Sets the value of the docguid property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setDOCGUID(String value) {
            this.docguid = value;
        }

        /**
         * Gets the value of the delete property.
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isDelete() {
            return delete;
        }

        /**
         * Sets the value of the delete property.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setDelete(Boolean value) {
            this.delete = value;
        }

    }


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
     *         &lt;element name="PARTNER_REF" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="LINK" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="DOCGUID" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="Delete" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "partnerref",
        "link",
        "docguid",
        "delete"
    })
    public static class PARTNERREFS {

        @XmlElement(name = "PARTNER_REF", required = true)
        protected String partnerref;
        @XmlElement(name = "LINK")
        protected String link;
        @XmlElement(name = "DOCGUID", required = true)
        protected String docguid;
        @XmlElement(name = "Delete")
        protected Boolean delete;

        /**
         * Gets the value of the partnerref property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getPARTNERREF() {
            return partnerref;
        }

        /**
         * Sets the value of the partnerref property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setPARTNERREF(String value) {
            this.partnerref = value;
        }

        /**
         * Gets the value of the link property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getLINK() {
            return link;
        }

        /**
         * Sets the value of the link property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setLINK(String value) {
            this.link = value;
        }

        /**
         * Gets the value of the docguid property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getDOCGUID() {
            return docguid;
        }

        /**
         * Sets the value of the docguid property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setDOCGUID(String value) {
            this.docguid = value;
        }

        /**
         * Gets the value of the delete property.
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isDelete() {
            return delete;
        }

        /**
         * Sets the value of the delete property.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setDelete(Boolean value) {
            this.delete = value;
        }

    }

}

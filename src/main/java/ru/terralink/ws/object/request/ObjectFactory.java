
package ru.terralink.ws.object.request;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the ru.terralink.ws.object.request package. 
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

    private final static QName _REAttrDataExchangeMessage_QNAME = new QName("http://inform.gazprom.ru/C/SUIM/REDataExchange", "REAttrDataExchangeMessage");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: ru.terralink.ws.object.request
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link REDataExchangeAttrECD }
     * 
     */
    public REDataExchangeAttrECD createREDataExchangeAttrECD() {
        return new REDataExchangeAttrECD();
    }

    /**
     * Create an instance of {@link REDataExchangeAttrFile }
     * 
     */
    public REDataExchangeAttrFile createREDataExchangeAttrFile() {
        return new REDataExchangeAttrFile();
    }

    /**
     * Create an instance of {@link REDataExchangeHeader }
     * 
     */
    public REDataExchangeHeader createREDataExchangeHeader() {
        return new REDataExchangeHeader();
    }

    /**
     * Create an instance of {@link REDataExchangeAttrECD.OBJECTREFS }
     * 
     */
    public REDataExchangeAttrECD.OBJECTREFS createREDataExchangeAttrECDOBJECTREFS() {
        return new REDataExchangeAttrECD.OBJECTREFS();
    }

    /**
     * Create an instance of {@link REDataExchangeAttrECD.PARTNERREFS }
     * 
     */
    public REDataExchangeAttrECD.PARTNERREFS createREDataExchangeAttrECDPARTNERREFS() {
        return new REDataExchangeAttrECD.PARTNERREFS();
    }

    /**
     * Create an instance of {@link REDataExchangeAttrECD.GENERAL }
     * 
     */
    public REDataExchangeAttrECD.GENERAL createREDataExchangeAttrECDGENERAL() {
        return new REDataExchangeAttrECD.GENERAL();
    }

    /**
     * Create an instance of {@link REDataExchangeAttrECD.CONTRACT }
     * 
     */
    public REDataExchangeAttrECD.CONTRACT createREDataExchangeAttrECDCONTRACT() {
        return new REDataExchangeAttrECD.CONTRACT();
    }

    /**
     * Create an instance of {@link REDataExchangeAttrECD.FINDOC }
     * 
     */
    public REDataExchangeAttrECD.FINDOC createREDataExchangeAttrECDFINDOC() {
        return new REDataExchangeAttrECD.FINDOC();
    }

    /**
     * Create an instance of {@link REDataExchangeAttrECD.LETTERS }
     * 
     */
    public REDataExchangeAttrECD.LETTERS createREDataExchangeAttrECDLETTERS() {
        return new REDataExchangeAttrECD.LETTERS();
    }

    /**
     * Create an instance of {@link REDataExchangeAttrECD.ANY }
     * 
     */
    public REDataExchangeAttrECD.ANY createREDataExchangeAttrECDANY() {
        return new REDataExchangeAttrECD.ANY();
    }

    /**
     * Create an instance of {@link REDataExchangeAttrECD.ACTS }
     * 
     */
    public REDataExchangeAttrECD.ACTS createREDataExchangeAttrECDACTS() {
        return new REDataExchangeAttrECD.ACTS();
    }

    /**
     * Create an instance of {@link REDataExchangeAttrECD.KPD }
     * 
     */
    public REDataExchangeAttrECD.KPD createREDataExchangeAttrECDKPD() {
        return new REDataExchangeAttrECD.KPD();
    }

    /**
     * Create an instance of {@link REDataExchangeAttrECD.DFV }
     * 
     */
    public REDataExchangeAttrECD.DFV createREDataExchangeAttrECDDFV() {
        return new REDataExchangeAttrECD.DFV();
    }

    /**
     * Create an instance of {@link REDataExchangeAttrECD.NNA }
     * 
     */
    public REDataExchangeAttrECD.NNA createREDataExchangeAttrECDNNA() {
        return new REDataExchangeAttrECD.NNA();
    }

    /**
     * Create an instance of {@link REDataExchangeAttrECD.CCC }
     * 
     */
    public REDataExchangeAttrECD.CCC createREDataExchangeAttrECDCCC() {
        return new REDataExchangeAttrECD.CCC();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link REDataExchangeAttrECD }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://inform.gazprom.ru/C/SUIM/REDataExchange", name = "REAttrDataExchangeMessage")
    public JAXBElement<REDataExchangeAttrECD> createREAttrDataExchangeMessage(REDataExchangeAttrECD value) {
        return new JAXBElement<REDataExchangeAttrECD>(_REAttrDataExchangeMessage_QNAME, REDataExchangeAttrECD.class, null, value);
    }

}

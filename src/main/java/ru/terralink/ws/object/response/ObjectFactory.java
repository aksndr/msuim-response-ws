
package ru.terralink.ws.object.response;

import javax.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the ru.terralink.ws.object package. 
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


    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: ru.terralink.ws.object
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link REAttrDataExchangeResponse }
     * 
     */
    public REAttrDataExchangeResponse createREAttrDataExchangeResponse() {
        return new REAttrDataExchangeResponse();
    }

    /**
     * Create an instance of {@link REAttrDataExchangeResponse.Files }
     * 
     */
    public REAttrDataExchangeResponse.Files createREAttrDataExchangeResponseFiles() {
        return new REAttrDataExchangeResponse.Files();
    }

    /**
     * Create an instance of {@link REAttrDataExchangeResponse.Files.File }
     * 
     */
    public REAttrDataExchangeResponse.Files.File createREAttrDataExchangeResponseFilesFile() {
        return new REAttrDataExchangeResponse.Files.File();
    }

    /**
     * Create an instance of {@link REAttrDataExchangeResponse.ErrorText }
     * 
     */
    public REAttrDataExchangeResponse.ErrorText createREAttrDataExchangeResponseErrorText() {
        return new REAttrDataExchangeResponse.ErrorText();
    }

    /**
     * Create an instance of {@link REAttrDataExchangeResponse.Files.File.ErrorText }
     * 
     */
    public REAttrDataExchangeResponse.Files.File.ErrorText createREAttrDataExchangeResponseFilesFileErrorText() {
        return new REAttrDataExchangeResponse.Files.File.ErrorText();
    }

}

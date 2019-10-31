
package com.fonowizja.client;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.fonowizja.client package. 
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

    private final static QName _GetNextWorkingDay_QNAME = new QName("http://api.fonowizja.com/", "getNextWorkingDay");
    private final static QName _GetNextWorkingDayResponse_QNAME = new QName("http://api.fonowizja.com/", "getNextWorkingDayResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.fonowizja.client
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GetNextWorkingDayResponse }
     * 
     */
    public GetNextWorkingDayResponse createGetNextWorkingDayResponse() {
        return new GetNextWorkingDayResponse();
    }

    /**
     * Create an instance of {@link GetNextWorkingDay }
     * 
     */
    public GetNextWorkingDay createGetNextWorkingDay() {
        return new GetNextWorkingDay();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetNextWorkingDay }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://api.fonowizja.com/", name = "getNextWorkingDay")
    public JAXBElement<GetNextWorkingDay> createGetNextWorkingDay(GetNextWorkingDay value) {
        return new JAXBElement<GetNextWorkingDay>(_GetNextWorkingDay_QNAME, GetNextWorkingDay.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetNextWorkingDayResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://api.fonowizja.com/", name = "getNextWorkingDayResponse")
    public JAXBElement<GetNextWorkingDayResponse> createGetNextWorkingDayResponse(GetNextWorkingDayResponse value) {
        return new JAXBElement<GetNextWorkingDayResponse>(_GetNextWorkingDayResponse_QNAME, GetNextWorkingDayResponse.class, null, value);
    }

}

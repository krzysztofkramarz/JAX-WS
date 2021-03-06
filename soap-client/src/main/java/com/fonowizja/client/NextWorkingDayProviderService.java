
package com.fonowizja.client;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.Action;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 */
@WebService(name = "NextWorkingDayProviderService", targetNamespace = "http://api.fonowizja.com/")
@XmlSeeAlso({
        ObjectFactory.class
})
public interface NextWorkingDayProviderService {


    /**
     * @param dataPoprzednia
     * @return returns java.lang.String
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "mojaOperacja", targetNamespace = "http://api.fonowizja.com/", className = "com.fonowizja.client.MojaOperacja")
    @ResponseWrapper(localName = "mojaOperacjaResponse", targetNamespace = "http://api.fonowizja.com/", className = "com.fonowizja.client.MojaOperacjaResponse")
    @Action(input = "http://api.fonowizja.com/NextWorkingDayProviderService/mojaOperacjaRequest", output = "http://api.fonowizja.com/NextWorkingDayProviderService/mojaOperacjaResponse")
    public String mojaOperacja(
            @WebParam(name = "dataPoprzednia", targetNamespace = "")
                    String dataPoprzednia);

    /**
     * @param arg0
     * @return returns com.fonowizja.client.Person
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getPerson", targetNamespace = "http://api.fonowizja.com/", className = "com.fonowizja.client.GetPerson")
    @ResponseWrapper(localName = "getPersonResponse", targetNamespace = "http://api.fonowizja.com/", className = "com.fonowizja.client.GetPersonResponse")
    @Action(input = "http://api.fonowizja.com/NextWorkingDayProviderService/getPersonRequest", output = "http://api.fonowizja.com/NextWorkingDayProviderService/getPersonResponse")
    public Person getPerson(
            @WebParam(name = "arg0", targetNamespace = "")
                    Long arg0);

}

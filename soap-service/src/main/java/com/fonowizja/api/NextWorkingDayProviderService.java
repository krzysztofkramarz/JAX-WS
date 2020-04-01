package com.fonowizja.api;

import com.fonowizja.api.model.Person;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;

/**
 * @author krzysztof.kramarz
 */
//@WebService(name = "NextWorkingDayPort", portName = "NextWorkingDayPort",
//        serviceName = "NextWorkingDay") //serviceName nie działa, portName nie działa
//    XSD definicję schematu XML*
@WebService
@SOAPBinding(style = SOAPBinding.Style.DOCUMENT, use = SOAPBinding.Use.ENCODED) //nie działa encoded
public interface NextWorkingDayProviderService {

    //    @WebResult(name = "odpowiedzSerwisu", partName = "mojePartName") //nie działa @WebResult#name ani partName
    //    @ResponseWrapper(localName = "owijka") //tworzy owijkę-element  "owijka", pewnie trzeba zdefiniować w targetNamespace
    @WebMethod(operationName = "mojaOperacja")
    String getNextWorkingDay(@WebParam(name = "dataPoprzednia") String previousDate);

    @WebMethod
    Person getPerson(Long id) throws IllegalArgumentException;
}

package com.fonowizja.api;

import javax.jws.WebMethod;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;

/**
 * @author krzysztof.kramarz
 */
//@WebService(name = "NextWorkingDayPort", portName = "NextWorkingDayPort",
//        serviceName = "NextWorkingDay") //serviceName nie działa, portName nie działa
@WebService
@SOAPBinding(style = SOAPBinding.Style.DOCUMENT, use = SOAPBinding.Use.ENCODED) //nie działa encoded
public interface NextWorkingDayProviderService {

    @WebMethod
//    @WebResult(targetNamespace = "namespaceForMyTargets")
    @WebResult(name = "odpowiedzSerwisu")
        //nie działa @WebResult#name ani partName
//    @ResponseWrapper(localName = "owijka") //tworzy owijkę-element  "owijka", pewniw trzeba zdefiniować w targetNamespace
    String getNextWorkingDay(String previousDate);
}

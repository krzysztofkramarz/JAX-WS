package com.fonowizja.api;

import lombok.Getter;
import lombok.Setter;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.ws.WebEndpoint;

/**
 * @author krzysztof.kramarz
 */
@Getter
@Setter
class Client {
    @XmlElement
//    @XmlJavaTypeAdapter()
    private String name;

    @WebEndpoint
    String ggg() {
        return "";
    }

}

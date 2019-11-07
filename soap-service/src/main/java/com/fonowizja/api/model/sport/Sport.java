package com.fonowizja.api.model.sport;

import lombok.Getter;
import lombok.Setter;

import javax.xml.bind.annotation.*;

/**
 * @author krzysztof.kramarz
 */
@Getter
@Setter
@XmlRootElement
@XmlType(propOrder = {"gender", "type", "punkty"})
@XmlAccessorType(XmlAccessType.FIELD)
public class Sport {

    @XmlAttribute
    private String type;

    @XmlAttribute
    private String gender;

    //value zadziała, ale dajemy element zamiast value, bo jedno albo drugie
//    @XmlValue
//    private String desription;

    @XmlElement
    private Integer punkty;
}

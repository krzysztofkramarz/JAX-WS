package com.fonowizja.api.model.address;

import lombok.Getter;
import lombok.NonNull;
import lombok.Setter;

import javax.xml.bind.annotation.*;

/**
 * @author krzysztof.kramarz
 */
@Getter
@Setter
@XmlRootElement
@XmlType(propOrder = {"ulica"})
@XmlAccessorType(XmlAccessType.FIELD)
public class Adres {

    //można dać XmlElement, ale my nie będziemy listować pól, bo bedzie tylko jedno, dlatego damy @XmlValue
//    @XmlElement
    //@NonNull must be for @RequiredArgsConstructor
    @XmlValue
    private @NonNull String ulica;

}

package com.fonowizja.api.model.address;

import lombok.Getter;
import lombok.Setter;

import javax.xml.bind.annotation.*;

/**
 * @author krzysztof.kramarz
 */
@Getter
@Setter
@XmlRootElement
@XmlType(propOrder = {"key", "value"})
@XmlAccessorType(XmlAccessType.FIELD)
public class AddressMapEntry {
    @XmlAttribute
    private String key;

//    mozna tu dać @XmlValue
//    @XmlElement
    @XmlValue
    private Adres value;

}

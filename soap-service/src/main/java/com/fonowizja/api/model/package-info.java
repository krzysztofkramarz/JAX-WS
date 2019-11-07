/**
 * @author krzysztof.kramarz
 */
//we obtain e.g.: <ns3:adresy>
@XmlSchema(
        namespace = "http://www.example.org/package",
        elementFormDefault = XmlNsForm.QUALIFIED)
package com.fonowizja.api.model;

import javax.xml.bind.annotation.XmlNsForm;
import javax.xml.bind.annotation.XmlSchema;


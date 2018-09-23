
package edu.cs356.model.character;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{}CharSpecialization"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "charSpecialization"
})
@XmlRootElement(name = "Specializations")
public class Specializations {

    @XmlElement(name = "CharSpecialization", required = true)
    protected CharSpecialization charSpecialization;

    /**
     * Gets the value of the charSpecialization property.
     * 
     * @return
     *     possible object is
     *     {@link CharSpecialization }
     *     
     */
    public CharSpecialization getCharSpecialization() {
        return charSpecialization;
    }

    /**
     * Sets the value of the charSpecialization property.
     * 
     * @param value
     *     allowed object is
     *     {@link CharSpecialization }
     *     
     */
    public void setCharSpecialization(CharSpecialization value) {
        this.charSpecialization = value;
    }

}

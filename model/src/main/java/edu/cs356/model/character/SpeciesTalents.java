
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
 *         &lt;element ref="{}CharTalent"/>
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
    "charTalent"
})
@XmlRootElement(name = "SpeciesTalents")
public class SpeciesTalents {

    @XmlElement(name = "CharTalent", required = true)
    protected CharTalent charTalent;

    /**
     * Gets the value of the charTalent property.
     * 
     * @return
     *     possible object is
     *     {@link CharTalent }
     *     
     */
    public CharTalent getCharTalent() {
        return charTalent;
    }

    /**
     * Sets the value of the charTalent property.
     * 
     * @param value
     *     allowed object is
     *     {@link CharTalent }
     *     
     */
    public void setCharTalent(CharTalent value) {
        this.charTalent = value;
    }

}

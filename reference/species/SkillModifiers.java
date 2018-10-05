
package edu.cs356.model.species;

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
 *         &lt;element ref="{}SkillModifier"/>
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
    "skillModifier"
})
@XmlRootElement(name = "SkillModifiers")
public class SkillModifiers {

    @XmlElement(name = "SkillModifier", required = true)
    protected SkillModifier skillModifier;

    /**
     * Gets the value of the skillModifier property.
     * 
     * @return
     *     possible object is
     *     {@link SkillModifier }
     *     
     */
    public SkillModifier getSkillModifier() {
        return skillModifier;
    }

    /**
     * Sets the value of the skillModifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link SkillModifier }
     *     
     */
    public void setSkillModifier(SkillModifier value) {
        this.skillModifier = value;
    }

}

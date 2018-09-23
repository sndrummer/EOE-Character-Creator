
package edu.cs356.model.character;

import java.math.BigInteger;
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
 *         &lt;element ref="{}ExperienceRanks"/>
 *         &lt;element ref="{}UsedExperience"/>
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
    "experienceRanks",
    "usedExperience"
})
@XmlRootElement(name = "Experience")
public class Experience {

    @XmlElement(name = "ExperienceRanks", required = true)
    protected ExperienceRanks experienceRanks;
    @XmlElement(name = "UsedExperience", required = true)
    protected BigInteger usedExperience;

    /**
     * Gets the value of the experienceRanks property.
     * 
     * @return
     *     possible object is
     *     {@link ExperienceRanks }
     *     
     */
    public ExperienceRanks getExperienceRanks() {
        return experienceRanks;
    }

    /**
     * Sets the value of the experienceRanks property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExperienceRanks }
     *     
     */
    public void setExperienceRanks(ExperienceRanks value) {
        this.experienceRanks = value;
    }

    /**
     * Gets the value of the usedExperience property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getUsedExperience() {
        return usedExperience;
    }

    /**
     * Sets the value of the usedExperience property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setUsedExperience(BigInteger value) {
        this.usedExperience = value;
    }

}

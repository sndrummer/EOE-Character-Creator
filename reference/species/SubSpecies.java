
package edu.cs356.model.species;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


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
 *         &lt;element ref="{}Key"/>
 *         &lt;element ref="{}Name"/>
 *         &lt;element ref="{}Description"/>
 *         &lt;element ref="{}SkillModifiers" minOccurs="0"/>
 *         &lt;element ref="{}OptionChoices"/>
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
    "key",
    "name",
    "description",
    "skillModifiers",
    "optionChoices"
})
@XmlRootElement(name = "SubSpecies")
public class SubSpecies {

    @XmlElement(name = "Key", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "NCName")
    protected String key;
    @XmlElement(name = "Name", required = true)
    protected String name;
    @XmlElement(name = "Description", required = true)
    protected String description;
    @XmlElement(name = "SkillModifiers")
    protected SkillModifiers skillModifiers;
    @XmlElement(name = "OptionChoices", required = true)
    protected OptionChoices optionChoices;

    /**
     * Gets the value of the key property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKey() {
        return key;
    }

    /**
     * Sets the value of the key property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKey(String value) {
        this.key = value;
    }

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Gets the value of the description property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescription() {
        return description;
    }

    /**
     * Sets the value of the description property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescription(String value) {
        this.description = value;
    }

    /**
     * Gets the value of the skillModifiers property.
     * 
     * @return
     *     possible object is
     *     {@link SkillModifiers }
     *     
     */
    public SkillModifiers getSkillModifiers() {
        return skillModifiers;
    }

    /**
     * Sets the value of the skillModifiers property.
     * 
     * @param value
     *     allowed object is
     *     {@link SkillModifiers }
     *     
     */
    public void setSkillModifiers(SkillModifiers value) {
        this.skillModifiers = value;
    }

    /**
     * Gets the value of the optionChoices property.
     * 
     * @return
     *     possible object is
     *     {@link OptionChoices }
     *     
     */
    public OptionChoices getOptionChoices() {
        return optionChoices;
    }

    /**
     * Sets the value of the optionChoices property.
     * 
     * @param value
     *     allowed object is
     *     {@link OptionChoices }
     *     
     */
    public void setOptionChoices(OptionChoices value) {
        this.optionChoices = value;
    }

}

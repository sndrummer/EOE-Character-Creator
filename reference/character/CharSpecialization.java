
package edu.cs356.model.character;

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
 *         &lt;element ref="{}isStartingSpec"/>
 *         &lt;element ref="{}isCareerSpec"/>
 *         &lt;element ref="{}Talents"/>
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
    "isStartingSpec",
    "isCareerSpec",
    "talents"
})
@XmlRootElement(name = "CharSpecialization")
public class CharSpecialization {

    @XmlElement(name = "Key", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "NMTOKEN")
    protected String key;
    @XmlElement(name = "Name", required = true)
    protected String name;
    protected boolean isStartingSpec;
    protected boolean isCareerSpec;
    @XmlElement(name = "Talents", required = true)
    protected Talents talents;

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
     * Gets the value of the isStartingSpec property.
     * 
     */
    public boolean isIsStartingSpec() {
        return isStartingSpec;
    }

    /**
     * Sets the value of the isStartingSpec property.
     * 
     */
    public void setIsStartingSpec(boolean value) {
        this.isStartingSpec = value;
    }

    /**
     * Gets the value of the isCareerSpec property.
     * 
     */
    public boolean isIsCareerSpec() {
        return isCareerSpec;
    }

    /**
     * Sets the value of the isCareerSpec property.
     * 
     */
    public void setIsCareerSpec(boolean value) {
        this.isCareerSpec = value;
    }

    /**
     * Gets the value of the talents property.
     * 
     * @return
     *     possible object is
     *     {@link Talents }
     *     
     */
    public Talents getTalents() {
        return talents;
    }

    /**
     * Sets the value of the talents property.
     * 
     * @param value
     *     allowed object is
     *     {@link Talents }
     *     
     */
    public void setTalents(Talents value) {
        this.talents = value;
    }

}


package edu.cs356.model.character;

import java.math.BigInteger;
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
 *         &lt;element ref="{}CharName"/>
 *         &lt;element ref="{}PlayerName"/>
 *         &lt;element ref="{}GenderValue"/>
 *         &lt;element ref="{}Age"/>
 *         &lt;element ref="{}Height"/>
 *         &lt;element ref="{}Build"/>
 *         &lt;element ref="{}Hair"/>
 *         &lt;element ref="{}Eyes"/>
 *         &lt;element ref="{}Gender"/>
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
    "charName",
    "playerName",
    "genderValue",
    "age",
    "height",
    "build",
    "hair",
    "eyes",
    "gender"
})
@XmlRootElement(name = "Description")
public class Description {

    @XmlElement(name = "CharName", required = true)
    protected String charName;
    @XmlElement(name = "PlayerName", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "NCName")
    protected String playerName;
    @XmlElement(name = "GenderValue", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "NCName")
    protected String genderValue;
    @XmlElement(name = "Age", required = true)
    protected BigInteger age;
    @XmlElement(name = "Height", required = true)
    protected String height;
    @XmlElement(name = "Build", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "NCName")
    protected String build;
    @XmlElement(name = "Hair", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "NCName")
    protected String hair;
    @XmlElement(name = "Eyes", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "NCName")
    protected String eyes;
    @XmlElement(name = "Gender", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "NCName")
    protected String gender;

    /**
     * Gets the value of the charName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCharName() {
        return charName;
    }

    /**
     * Sets the value of the charName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCharName(String value) {
        this.charName = value;
    }

    /**
     * Gets the value of the playerName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPlayerName() {
        return playerName;
    }

    /**
     * Sets the value of the playerName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPlayerName(String value) {
        this.playerName = value;
    }

    /**
     * Gets the value of the genderValue property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGenderValue() {
        return genderValue;
    }

    /**
     * Sets the value of the genderValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGenderValue(String value) {
        this.genderValue = value;
    }

    /**
     * Gets the value of the age property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getAge() {
        return age;
    }

    /**
     * Sets the value of the age property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setAge(BigInteger value) {
        this.age = value;
    }

    /**
     * Gets the value of the height property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHeight() {
        return height;
    }

    /**
     * Sets the value of the height property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHeight(String value) {
        this.height = value;
    }

    /**
     * Gets the value of the build property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBuild() {
        return build;
    }

    /**
     * Sets the value of the build property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBuild(String value) {
        this.build = value;
    }

    /**
     * Gets the value of the hair property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHair() {
        return hair;
    }

    /**
     * Sets the value of the hair property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHair(String value) {
        this.hair = value;
    }

    /**
     * Gets the value of the eyes property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEyes() {
        return eyes;
    }

    /**
     * Sets the value of the eyes property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEyes(String value) {
        this.eyes = value;
    }

    /**
     * Gets the value of the gender property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGender() {
        return gender;
    }

    /**
     * Sets the value of the gender property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGender(String value) {
        this.gender = value;
    }

}

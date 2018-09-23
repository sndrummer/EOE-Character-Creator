
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
 *         &lt;element ref="{}SoakValue"/>
 *         &lt;element ref="{}WoundThreshold"/>
 *         &lt;element ref="{}StrainThreshold"/>
 *         &lt;element ref="{}DefenseRanged"/>
 *         &lt;element ref="{}DefenseMelee"/>
 *         &lt;element ref="{}ForceRating"/>
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
    "soakValue",
    "woundThreshold",
    "strainThreshold",
    "defenseRanged",
    "defenseMelee",
    "forceRating"
})
@XmlRootElement(name = "Attributes")
public class Attributes {

    @XmlElement(name = "SoakValue", required = true)
    protected SoakValue soakValue;
    @XmlElement(name = "WoundThreshold", required = true)
    protected WoundThreshold woundThreshold;
    @XmlElement(name = "StrainThreshold", required = true)
    protected StrainThreshold strainThreshold;
    @XmlElement(name = "DefenseRanged", required = true)
    protected DefenseRanged defenseRanged;
    @XmlElement(name = "DefenseMelee", required = true)
    protected DefenseMelee defenseMelee;
    @XmlElement(name = "ForceRating", required = true)
    protected ForceRating forceRating;

    /**
     * Gets the value of the soakValue property.
     * 
     * @return
     *     possible object is
     *     {@link SoakValue }
     *     
     */
    public SoakValue getSoakValue() {
        return soakValue;
    }

    /**
     * Sets the value of the soakValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link SoakValue }
     *     
     */
    public void setSoakValue(SoakValue value) {
        this.soakValue = value;
    }

    /**
     * Gets the value of the woundThreshold property.
     * 
     * @return
     *     possible object is
     *     {@link WoundThreshold }
     *     
     */
    public WoundThreshold getWoundThreshold() {
        return woundThreshold;
    }

    /**
     * Sets the value of the woundThreshold property.
     * 
     * @param value
     *     allowed object is
     *     {@link WoundThreshold }
     *     
     */
    public void setWoundThreshold(WoundThreshold value) {
        this.woundThreshold = value;
    }

    /**
     * Gets the value of the strainThreshold property.
     * 
     * @return
     *     possible object is
     *     {@link StrainThreshold }
     *     
     */
    public StrainThreshold getStrainThreshold() {
        return strainThreshold;
    }

    /**
     * Sets the value of the strainThreshold property.
     * 
     * @param value
     *     allowed object is
     *     {@link StrainThreshold }
     *     
     */
    public void setStrainThreshold(StrainThreshold value) {
        this.strainThreshold = value;
    }

    /**
     * Gets the value of the defenseRanged property.
     * 
     * @return
     *     possible object is
     *     {@link DefenseRanged }
     *     
     */
    public DefenseRanged getDefenseRanged() {
        return defenseRanged;
    }

    /**
     * Sets the value of the defenseRanged property.
     * 
     * @param value
     *     allowed object is
     *     {@link DefenseRanged }
     *     
     */
    public void setDefenseRanged(DefenseRanged value) {
        this.defenseRanged = value;
    }

    /**
     * Gets the value of the defenseMelee property.
     * 
     * @return
     *     possible object is
     *     {@link DefenseMelee }
     *     
     */
    public DefenseMelee getDefenseMelee() {
        return defenseMelee;
    }

    /**
     * Sets the value of the defenseMelee property.
     * 
     * @param value
     *     allowed object is
     *     {@link DefenseMelee }
     *     
     */
    public void setDefenseMelee(DefenseMelee value) {
        this.defenseMelee = value;
    }

    /**
     * Gets the value of the forceRating property.
     * 
     * @return
     *     possible object is
     *     {@link ForceRating }
     *     
     */
    public ForceRating getForceRating() {
        return forceRating;
    }

    /**
     * Sets the value of the forceRating property.
     * 
     * @param value
     *     allowed object is
     *     {@link ForceRating }
     *     
     */
    public void setForceRating(ForceRating value) {
        this.forceRating = value;
    }

}

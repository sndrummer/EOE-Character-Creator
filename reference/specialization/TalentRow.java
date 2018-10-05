
package edu.cs356.model.specialization;

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
 *         &lt;element ref="{}Index"/>
 *         &lt;element ref="{}Cost"/>
 *         &lt;element ref="{}Talents"/>
 *         &lt;element ref="{}Directions"/>
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
    "index",
    "cost",
    "talents",
    "directions"
})
@XmlRootElement(name = "TalentRow")
public class TalentRow {

    @XmlElement(name = "Index", required = true)
    protected BigInteger index;
    @XmlElement(name = "Cost", required = true)
    protected BigInteger cost;
    @XmlElement(name = "Talents", required = true)
    protected Talents talents;
    @XmlElement(name = "Directions", required = true)
    protected Directions directions;

    /**
     * Gets the value of the index property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getIndex() {
        return index;
    }

    /**
     * Sets the value of the index property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setIndex(BigInteger value) {
        this.index = value;
    }

    /**
     * Gets the value of the cost property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getCost() {
        return cost;
    }

    /**
     * Sets the value of the cost property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setCost(BigInteger value) {
        this.cost = value;
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

    /**
     * Gets the value of the directions property.
     * 
     * @return
     *     possible object is
     *     {@link Directions }
     *     
     */
    public Directions getDirections() {
        return directions;
    }

    /**
     * Sets the value of the directions property.
     * 
     * @param value
     *     allowed object is
     *     {@link Directions }
     *     
     */
    public void setDirections(Directions value) {
        this.directions = value;
    }

}

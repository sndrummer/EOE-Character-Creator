
package species;

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
 *         &lt;element ref="{}Brawn"/>
 *         &lt;element ref="{}Agility"/>
 *         &lt;element ref="{}Intellect"/>
 *         &lt;element ref="{}Cunning"/>
 *         &lt;element ref="{}Willpower"/>
 *         &lt;element ref="{}Presence"/>
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
    "brawn",
    "agility",
    "intellect",
    "cunning",
    "willpower",
    "presence"
})
@XmlRootElement(name = "StartingChars")
public class StartingChars {

    @XmlElement(name = "Brawn", required = true)
    protected BigInteger brawn;
    @XmlElement(name = "Agility", required = true)
    protected BigInteger agility;
    @XmlElement(name = "Intellect", required = true)
    protected BigInteger intellect;
    @XmlElement(name = "Cunning", required = true)
    protected BigInteger cunning;
    @XmlElement(name = "Willpower", required = true)
    protected BigInteger willpower;
    @XmlElement(name = "Presence", required = true)
    protected BigInteger presence;

    /**
     * Gets the value of the brawn property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getBrawn() {
        return brawn;
    }

    /**
     * Sets the value of the brawn property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setBrawn(BigInteger value) {
        this.brawn = value;
    }

    /**
     * Gets the value of the agility property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getAgility() {
        return agility;
    }

    /**
     * Sets the value of the agility property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setAgility(BigInteger value) {
        this.agility = value;
    }

    /**
     * Gets the value of the intellect property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getIntellect() {
        return intellect;
    }

    /**
     * Sets the value of the intellect property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setIntellect(BigInteger value) {
        this.intellect = value;
    }

    /**
     * Gets the value of the cunning property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getCunning() {
        return cunning;
    }

    /**
     * Sets the value of the cunning property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setCunning(BigInteger value) {
        this.cunning = value;
    }

    /**
     * Gets the value of the willpower property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getWillpower() {
        return willpower;
    }

    /**
     * Sets the value of the willpower property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setWillpower(BigInteger value) {
        this.willpower = value;
    }

    /**
     * Gets the value of the presence property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getPresence() {
        return presence;
    }

    /**
     * Sets the value of the presence property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setPresence(BigInteger value) {
        this.presence = value;
    }

}

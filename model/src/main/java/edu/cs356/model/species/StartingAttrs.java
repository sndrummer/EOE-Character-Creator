
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
 *         &lt;element ref="{}WoundThreshold"/>
 *         &lt;element ref="{}StrainThreshold"/>
 *         &lt;element ref="{}Experience"/>
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
    "woundThreshold",
    "strainThreshold",
    "experience"
})
@XmlRootElement(name = "StartingAttrs")
public class StartingAttrs {

    @XmlElement(name = "WoundThreshold", required = true)
    protected BigInteger woundThreshold;
    @XmlElement(name = "StrainThreshold", required = true)
    protected BigInteger strainThreshold;
    @XmlElement(name = "Experience", required = true)
    protected BigInteger experience;

    /**
     * Gets the value of the woundThreshold property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getWoundThreshold() {
        return woundThreshold;
    }

    /**
     * Sets the value of the woundThreshold property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setWoundThreshold(BigInteger value) {
        this.woundThreshold = value;
    }

    /**
     * Gets the value of the strainThreshold property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getStrainThreshold() {
        return strainThreshold;
    }

    /**
     * Sets the value of the strainThreshold property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setStrainThreshold(BigInteger value) {
        this.strainThreshold = value;
    }

    /**
     * Gets the value of the experience property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getExperience() {
        return experience;
    }

    /**
     * Sets the value of the experience property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setExperience(BigInteger value) {
        this.experience = value;
    }

}

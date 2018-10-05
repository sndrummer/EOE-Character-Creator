
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
 *         &lt;element ref="{}CareerKey"/>
 *         &lt;element ref="{}StartingSpecKey"/>
 *         &lt;element ref="{}CareerSkills"/>
 *         &lt;element ref="{}CareerSpecSkills"/>
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
    "careerKey",
    "startingSpecKey",
    "careerSkills",
    "careerSpecSkills"
})
@XmlRootElement(name = "Career")
public class Career {

    @XmlElement(name = "CareerKey", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "NCName")
    protected String careerKey;
    @XmlElement(name = "StartingSpecKey", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "NCName")
    protected String startingSpecKey;
    @XmlElement(name = "CareerSkills", required = true)
    protected CareerSkills careerSkills;
    @XmlElement(name = "CareerSpecSkills", required = true)
    protected CareerSpecSkills careerSpecSkills;

    /**
     * Gets the value of the careerKey property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCareerKey() {
        return careerKey;
    }

    /**
     * Sets the value of the careerKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCareerKey(String value) {
        this.careerKey = value;
    }

    /**
     * Gets the value of the startingSpecKey property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStartingSpecKey() {
        return startingSpecKey;
    }

    /**
     * Sets the value of the startingSpecKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStartingSpecKey(String value) {
        this.startingSpecKey = value;
    }

    /**
     * Gets the value of the careerSkills property.
     * 
     * @return
     *     possible object is
     *     {@link CareerSkills }
     *     
     */
    public CareerSkills getCareerSkills() {
        return careerSkills;
    }

    /**
     * Sets the value of the careerSkills property.
     * 
     * @param value
     *     allowed object is
     *     {@link CareerSkills }
     *     
     */
    public void setCareerSkills(CareerSkills value) {
        this.careerSkills = value;
    }

    /**
     * Gets the value of the careerSpecSkills property.
     * 
     * @return
     *     possible object is
     *     {@link CareerSpecSkills }
     *     
     */
    public CareerSpecSkills getCareerSpecSkills() {
        return careerSpecSkills;
    }

    /**
     * Sets the value of the careerSpecSkills property.
     * 
     * @param value
     *     allowed object is
     *     {@link CareerSpecSkills }
     *     
     */
    public void setCareerSpecSkills(CareerSpecSkills value) {
        this.careerSpecSkills = value;
    }

}

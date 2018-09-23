
package career;

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
 *         &lt;element ref="{}Source"/>
 *         &lt;element ref="{}CareerSkills"/>
 *         &lt;element ref="{}Specializations"/>
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
    "source",
    "careerSkills",
    "specializations"
})
@XmlRootElement(name = "Career")
public class Career {

    @XmlElement(name = "Key", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "NCName")
    protected String key;
    @XmlElement(name = "Name", required = true)
    protected String name;
    @XmlElement(name = "Description", required = true)
    protected String description;
    @XmlElement(name = "Source", required = true)
    protected Source source;
    @XmlElement(name = "CareerSkills", required = true)
    protected CareerSkills careerSkills;
    @XmlElement(name = "Specializations", required = true)
    protected Specializations specializations;

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
     * Gets the value of the source property.
     * 
     * @return
     *     possible object is
     *     {@link Source }
     *     
     */
    public Source getSource() {
        return source;
    }

    /**
     * Sets the value of the source property.
     * 
     * @param value
     *     allowed object is
     *     {@link Source }
     *     
     */
    public void setSource(Source value) {
        this.source = value;
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
     * Gets the value of the specializations property.
     * 
     * @return
     *     possible object is
     *     {@link Specializations }
     *     
     */
    public Specializations getSpecializations() {
        return specializations;
    }

    /**
     * Sets the value of the specializations property.
     * 
     * @param value
     *     allowed object is
     *     {@link Specializations }
     *     
     */
    public void setSpecializations(Specializations value) {
        this.specializations = value;
    }

}

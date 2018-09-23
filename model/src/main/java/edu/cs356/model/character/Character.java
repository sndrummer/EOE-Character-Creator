
package edu.cs356.model.character;

import java.lang.Class;

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
 *         &lt;element ref="{}LastChanged"/>
 *         &lt;element ref="{}NotPersisted"/>
 *         &lt;element ref="{}FileName"/>
 *         &lt;element ref="{}Name"/>
 *         &lt;element ref="{}Key"/>
 *         &lt;element ref="{}Description"/>
 *         &lt;element ref="{}Characteristics"/>
 *         &lt;element ref="{}Motivations"/>
 *         &lt;element ref="{}Specializations"/>
 *         &lt;element ref="{}ForcePowers"/>
 *         &lt;element ref="{}SigAbilities"/>
 *         &lt;element ref="{}Skills"/>
 *         &lt;element ref="{}ObOptions"/>
 *         &lt;element ref="{}Obligations"/>
 *         &lt;element ref="{}DutOptions"/>
 *         &lt;element ref="{}Duties"/>
 *         &lt;element ref="{}Experience"/>
 *         &lt;element ref="{}Attributes"/>
 *         &lt;element ref="{}Species"/>
 *         &lt;element ref="{}Career"/>
 *         &lt;element ref="{}Class"/>
 *         &lt;element ref="{}Hook"/>
 *         &lt;element ref="{}Attitude"/>
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
    "lastChanged",
    "notPersisted",
    "fileName",
    "name",
    "key",
    "description",
    "characteristics",
    "motivations",
    "specializations",
    "forcePowers",
    "sigAbilities",
    "skills",
    "obOptions",
    "obligations",
    "dutOptions",
    "duties",
    "experience",
    "attributes",
    "species",
    "career",
    "clazz",
    "hook",
    "attitude"
})
@XmlRootElement(name = "Character")
public class Character {

    @XmlElement(name = "LastChanged", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "NMTOKEN")
    protected String lastChanged;
    @XmlElement(name = "NotPersisted")
    protected boolean notPersisted;
    @XmlElement(name = "FileName", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "NCName")
    protected String fileName;
    @XmlElement(name = "Name", required = true)
    protected String name;
    @XmlElement(name = "Key", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "NMTOKEN")
    protected String key;
    @XmlElement(name = "Description", required = true)
    protected Description description;
    @XmlElement(name = "Characteristics", required = true)
    protected Characteristics characteristics;
    @XmlElement(name = "Motivations", required = true)
    protected Motivations motivations;
    @XmlElement(name = "Specializations", required = true)
    protected Specializations specializations;
    @XmlElement(name = "ForcePowers", required = true)
    protected ForcePowers forcePowers;
    @XmlElement(name = "SigAbilities", required = true)
    protected SigAbilities sigAbilities;
    @XmlElement(name = "Skills", required = true)
    protected Skills skills;
    @XmlElement(name = "ObOptions", required = true)
    protected StartingSize obOptions;
    @XmlElement(name = "Obligations", required = true)
    protected Obligations obligations;
    @XmlElement(name = "DutOptions", required = true)
    protected StartingSize dutOptions;
    @XmlElement(name = "Duties", required = true)
    protected Duties duties;
    @XmlElement(name = "Experience", required = true)
    protected Experience experience;
    @XmlElement(name = "Attributes", required = true)
    protected Attributes attributes;
    @XmlElement(name = "Species", required = true)
    protected Species species;
    @XmlElement(name = "Career", required = true)
    protected Career career;
    @XmlElement(name = "Class", required = true)
    protected java.lang.Class clazz;
    @XmlElement(name = "Hook", required = true)
    protected Hook hook;
    @XmlElement(name = "Attitude", required = true)
    protected Attitude attitude;

    /**
     * Gets the value of the lastChanged property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLastChanged() {
        return lastChanged;
    }

    /**
     * Sets the value of the lastChanged property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLastChanged(String value) {
        this.lastChanged = value;
    }

    /**
     * Gets the value of the notPersisted property.
     * 
     */
    public boolean isNotPersisted() {
        return notPersisted;
    }

    /**
     * Sets the value of the notPersisted property.
     * 
     */
    public void setNotPersisted(boolean value) {
        this.notPersisted = value;
    }

    /**
     * Gets the value of the fileName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFileName() {
        return fileName;
    }

    /**
     * Sets the value of the fileName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFileName(String value) {
        this.fileName = value;
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
     * Gets the value of the description property.
     * 
     * @return
     *     possible object is
     *     {@link Description }
     *     
     */
    public Description getDescription() {
        return description;
    }

    /**
     * Sets the value of the description property.
     * 
     * @param value
     *     allowed object is
     *     {@link Description }
     *     
     */
    public void setDescription(Description value) {
        this.description = value;
    }

    /**
     * Gets the value of the characteristics property.
     * 
     * @return
     *     possible object is
     *     {@link Characteristics }
     *     
     */
    public Characteristics getCharacteristics() {
        return characteristics;
    }

    /**
     * Sets the value of the characteristics property.
     * 
     * @param value
     *     allowed object is
     *     {@link Characteristics }
     *     
     */
    public void setCharacteristics(Characteristics value) {
        this.characteristics = value;
    }

    /**
     * Gets the value of the motivations property.
     * 
     * @return
     *     possible object is
     *     {@link Motivations }
     *     
     */
    public Motivations getMotivations() {
        return motivations;
    }

    /**
     * Sets the value of the motivations property.
     * 
     * @param value
     *     allowed object is
     *     {@link Motivations }
     *     
     */
    public void setMotivations(Motivations value) {
        this.motivations = value;
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

    /**
     * Gets the value of the forcePowers property.
     * 
     * @return
     *     possible object is
     *     {@link ForcePowers }
     *     
     */
    public ForcePowers getForcePowers() {
        return forcePowers;
    }

    /**
     * Sets the value of the forcePowers property.
     * 
     * @param value
     *     allowed object is
     *     {@link ForcePowers }
     *     
     */
    public void setForcePowers(ForcePowers value) {
        this.forcePowers = value;
    }

    /**
     * Gets the value of the sigAbilities property.
     * 
     * @return
     *     possible object is
     *     {@link SigAbilities }
     *     
     */
    public SigAbilities getSigAbilities() {
        return sigAbilities;
    }

    /**
     * Sets the value of the sigAbilities property.
     * 
     * @param value
     *     allowed object is
     *     {@link SigAbilities }
     *     
     */
    public void setSigAbilities(SigAbilities value) {
        this.sigAbilities = value;
    }

    /**
     * Gets the value of the skills property.
     * 
     * @return
     *     possible object is
     *     {@link Skills }
     *     
     */
    public Skills getSkills() {
        return skills;
    }

    /**
     * Sets the value of the skills property.
     * 
     * @param value
     *     allowed object is
     *     {@link Skills }
     *     
     */
    public void setSkills(Skills value) {
        this.skills = value;
    }

    /**
     * Gets the value of the obOptions property.
     * 
     * @return
     *     possible object is
     *     {@link StartingSize }
     *     
     */
    public StartingSize getObOptions() {
        return obOptions;
    }

    /**
     * Sets the value of the obOptions property.
     * 
     * @param value
     *     allowed object is
     *     {@link StartingSize }
     *     
     */
    public void setObOptions(StartingSize value) {
        this.obOptions = value;
    }

    /**
     * Gets the value of the obligations property.
     * 
     * @return
     *     possible object is
     *     {@link Obligations }
     *     
     */
    public Obligations getObligations() {
        return obligations;
    }

    /**
     * Sets the value of the obligations property.
     * 
     * @param value
     *     allowed object is
     *     {@link Obligations }
     *     
     */
    public void setObligations(Obligations value) {
        this.obligations = value;
    }

    /**
     * Gets the value of the dutOptions property.
     * 
     * @return
     *     possible object is
     *     {@link StartingSize }
     *     
     */
    public StartingSize getDutOptions() {
        return dutOptions;
    }

    /**
     * Sets the value of the dutOptions property.
     * 
     * @param value
     *     allowed object is
     *     {@link StartingSize }
     *     
     */
    public void setDutOptions(StartingSize value) {
        this.dutOptions = value;
    }

    /**
     * Gets the value of the duties property.
     * 
     * @return
     *     possible object is
     *     {@link Duties }
     *     
     */
    public Duties getDuties() {
        return duties;
    }

    /**
     * Sets the value of the duties property.
     * 
     * @param value
     *     allowed object is
     *     {@link Duties }
     *     
     */
    public void setDuties(Duties value) {
        this.duties = value;
    }

    /**
     * Gets the value of the experience property.
     * 
     * @return
     *     possible object is
     *     {@link Experience }
     *     
     */
    public Experience getExperience() {
        return experience;
    }

    /**
     * Sets the value of the experience property.
     * 
     * @param value
     *     allowed object is
     *     {@link Experience }
     *     
     */
    public void setExperience(Experience value) {
        this.experience = value;
    }

    /**
     * Gets the value of the attributes property.
     * 
     * @return
     *     possible object is
     *     {@link Attributes }
     *     
     */
    public Attributes getAttributes() {
        return attributes;
    }

    /**
     * Sets the value of the attributes property.
     * 
     * @param value
     *     allowed object is
     *     {@link Attributes }
     *     
     */
    public void setAttributes(Attributes value) {
        this.attributes = value;
    }

    /**
     * Gets the value of the species property.
     * 
     * @return
     *     possible object is
     *     {@link Species }
     *     
     */
    public Species getSpecies() {
        return species;
    }

    /**
     * Sets the value of the species property.
     * 
     * @param value
     *     allowed object is
     *     {@link Species }
     *     
     */
    public void setSpecies(Species value) {
        this.species = value;
    }

    /**
     * Gets the value of the career property.
     * 
     * @return
     *     possible object is
     *     {@link Career }
     *     
     */
    public Career getCareer() {
        return career;
    }

    /**
     * Sets the value of the career property.
     * 
     * @param value
     *     allowed object is
     *     {@link Career }
     *     
     */
    public void setCareer(Career value) {
        this.career = value;
    }

    /**
     * Gets the value of the clazz property.
     * 
     * @return
     *     possible object is
     *     {@link java.lang.Class }
     *     
     */
    public java.lang.Class getClazz() {
        return clazz;
    }

    /**
     * Sets the value of the clazz property.
     * 
     * @param value
     *     allowed object is
     *     {@link java.lang.Class }
     *     
     */
    public void setClazz(Class value) {
        this.clazz = value;
    }

    /**
     * Gets the value of the hook property.
     * 
     * @return
     *     possible object is
     *     {@link Hook }
     *     
     */
    public Hook getHook() {
        return hook;
    }

    /**
     * Sets the value of the hook property.
     * 
     * @param value
     *     allowed object is
     *     {@link Hook }
     *     
     */
    public void setHook(Hook value) {
        this.hook = value;
    }

    /**
     * Gets the value of the attitude property.
     * 
     * @return
     *     possible object is
     *     {@link Attitude }
     *     
     */
    public Attitude getAttitude() {
        return attitude;
    }

    /**
     * Sets the value of the attitude property.
     * 
     * @param value
     *     allowed object is
     *     {@link Attitude }
     *     
     */
    public void setAttitude(Attitude value) {
        this.attitude = value;
    }

}


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
 *         &lt;element ref="{}SpeciesKey"/>
 *         &lt;element ref="{}SubSpeciesKey"/>
 *         &lt;element ref="{}SelectedOptions"/>
 *         &lt;element ref="{}SpeciesTalents"/>
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
    "speciesKey",
    "subSpeciesKey",
    "selectedOptions",
    "speciesTalents"
})
@XmlRootElement(name = "Species")
public class Species {

    @XmlElement(name = "SpeciesKey", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "NCName")
    protected String speciesKey;
    @XmlElement(name = "SubSpeciesKey", required = true)
    protected SubSpeciesKey subSpeciesKey;
    @XmlElement(name = "SelectedOptions", required = true)
    protected SelectedOptions selectedOptions;
    @XmlElement(name = "SpeciesTalents", required = true)
    protected SpeciesTalents speciesTalents;

    /**
     * Gets the value of the speciesKey property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSpeciesKey() {
        return speciesKey;
    }

    /**
     * Sets the value of the speciesKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSpeciesKey(String value) {
        this.speciesKey = value;
    }

    /**
     * Gets the value of the subSpeciesKey property.
     * 
     * @return
     *     possible object is
     *     {@link SubSpeciesKey }
     *     
     */
    public SubSpeciesKey getSubSpeciesKey() {
        return subSpeciesKey;
    }

    /**
     * Sets the value of the subSpeciesKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link SubSpeciesKey }
     *     
     */
    public void setSubSpeciesKey(SubSpeciesKey value) {
        this.subSpeciesKey = value;
    }

    /**
     * Gets the value of the selectedOptions property.
     * 
     * @return
     *     possible object is
     *     {@link SelectedOptions }
     *     
     */
    public SelectedOptions getSelectedOptions() {
        return selectedOptions;
    }

    /**
     * Sets the value of the selectedOptions property.
     * 
     * @param value
     *     allowed object is
     *     {@link SelectedOptions }
     *     
     */
    public void setSelectedOptions(SelectedOptions value) {
        this.selectedOptions = value;
    }

    /**
     * Gets the value of the speciesTalents property.
     * 
     * @return
     *     possible object is
     *     {@link SpeciesTalents }
     *     
     */
    public SpeciesTalents getSpeciesTalents() {
        return speciesTalents;
    }

    /**
     * Sets the value of the speciesTalents property.
     * 
     * @param value
     *     allowed object is
     *     {@link SpeciesTalents }
     *     
     */
    public void setSpeciesTalents(SpeciesTalents value) {
        this.speciesTalents = value;
    }

}


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
 *         &lt;element ref="{}Rank"/>
 *         &lt;element ref="{}isCareer" minOccurs="0"/>
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
    "rank",
    "isCareer"
})
@XmlRootElement(name = "CharSkill")
public class CharSkill {

    @XmlElement(name = "Key", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "NMTOKEN")
    protected String key;
    @XmlElement(name = "Rank", required = true)
    protected Rank rank;
    protected Boolean isCareer;

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
     * Gets the value of the rank property.
     * 
     * @return
     *     possible object is
     *     {@link Rank }
     *     
     */
    public Rank getRank() {
        return rank;
    }

    /**
     * Sets the value of the rank property.
     * 
     * @param value
     *     allowed object is
     *     {@link Rank }
     *     
     */
    public void setRank(Rank value) {
        this.rank = value;
    }

    /**
     * Gets the value of the isCareer property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsCareer() {
        return isCareer;
    }

    /**
     * Sets the value of the isCareer property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsCareer(Boolean value) {
        this.isCareer = value;
    }

}

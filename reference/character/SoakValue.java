
package edu.cs356.model.character;

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
 *         &lt;element ref="{}StartingRanks"/>
 *         &lt;element ref="{}PurchasedRanks"/>
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
    "startingRanks",
    "purchasedRanks"
})
@XmlRootElement(name = "SoakValue")
public class SoakValue {

    @XmlElement(name = "StartingRanks", required = true)
    protected BigInteger startingRanks;
    @XmlElement(name = "PurchasedRanks", required = true)
    protected BigInteger purchasedRanks;

    /**
     * Gets the value of the startingRanks property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getStartingRanks() {
        return startingRanks;
    }

    /**
     * Sets the value of the startingRanks property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setStartingRanks(BigInteger value) {
        this.startingRanks = value;
    }

    /**
     * Gets the value of the purchasedRanks property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getPurchasedRanks() {
        return purchasedRanks;
    }

    /**
     * Sets the value of the purchasedRanks property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setPurchasedRanks(BigInteger value) {
        this.purchasedRanks = value;
    }

}

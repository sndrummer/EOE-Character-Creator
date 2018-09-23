
package specialization;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlElementRefs;
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
 *       &lt;choice maxOccurs="unbounded" minOccurs="0">
 *         &lt;element ref="{}Down"/>
 *         &lt;element ref="{}Left"/>
 *         &lt;element ref="{}Right"/>
 *         &lt;element ref="{}Up"/>
 *       &lt;/choice>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "downOrLeftOrRight"
})
@XmlRootElement(name = "Direction")
public class Direction {

    @XmlElementRefs({
        @XmlElementRef(name = "Down", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "Left", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "Right", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "Up", type = JAXBElement.class, required = false)
    })
    protected List<JAXBElement<Boolean>> downOrLeftOrRight;

    /**
     * Gets the value of the downOrLeftOrRight property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the downOrLeftOrRight property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDownOrLeftOrRight().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     * {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     * {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     * {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     * 
     * 
     */
    public List<JAXBElement<Boolean>> getDownOrLeftOrRight() {
        if (downOrLeftOrRight == null) {
            downOrLeftOrRight = new ArrayList<JAXBElement<Boolean>>();
        }
        return this.downOrLeftOrRight;
    }

}

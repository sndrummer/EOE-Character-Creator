
package edu.cs356.model.specialization;

import java.math.BigInteger;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the specialization package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _Down_QNAME = new QName("", "Down");
    private final static QName _Description_QNAME = new QName("", "Description");
    private final static QName _Left_QNAME = new QName("", "Left");
    private final static QName _Right_QNAME = new QName("", "Right");
    private final static QName _Index_QNAME = new QName("", "Index");
    private final static QName _Up_QNAME = new QName("", "Up");
    private final static QName _Cost_QNAME = new QName("", "Cost");
    private final static QName _Key_QNAME = new QName("", "Key");
    private final static QName _Name_QNAME = new QName("", "Name");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: specialization
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link Directions }
     * 
     */
    public Directions createDirections() {
        return new Directions();
    }

    /**
     * Create an instance of {@link Direction }
     * 
     */
    public Direction createDirection() {
        return new Direction();
    }

    /**
     * Create an instance of {@link TalentRow }
     * 
     */
    public TalentRow createTalentRow() {
        return new TalentRow();
    }

    /**
     * Create an instance of {@link Talents }
     * 
     */
    public Talents createTalents() {
        return new Talents();
    }

    /**
     * Create an instance of {@link Source }
     * 
     */
    public Source createSource() {
        return new Source();
    }

    /**
     * Create an instance of {@link CareerSkills }
     * 
     */
    public CareerSkills createCareerSkills() {
        return new CareerSkills();
    }

    /**
     * Create an instance of {@link Specialization }
     * 
     */
    public Specialization createSpecialization() {
        return new Specialization();
    }

    /**
     * Create an instance of {@link TalentRows }
     * 
     */
    public TalentRows createTalentRows() {
        return new TalentRows();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "Down")
    public JAXBElement<Boolean> createDown(Boolean value) {
        return new JAXBElement<Boolean>(_Down_QNAME, Boolean.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "Description")
    public JAXBElement<String> createDescription(String value) {
        return new JAXBElement<String>(_Description_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "Left")
    public JAXBElement<Boolean> createLeft(Boolean value) {
        return new JAXBElement<Boolean>(_Left_QNAME, Boolean.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "Right")
    public JAXBElement<Boolean> createRight(Boolean value) {
        return new JAXBElement<Boolean>(_Right_QNAME, Boolean.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "Index")
    public JAXBElement<BigInteger> createIndex(BigInteger value) {
        return new JAXBElement<BigInteger>(_Index_QNAME, BigInteger.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "Up")
    public JAXBElement<Boolean> createUp(Boolean value) {
        return new JAXBElement<Boolean>(_Up_QNAME, Boolean.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "Cost")
    public JAXBElement<BigInteger> createCost(BigInteger value) {
        return new JAXBElement<BigInteger>(_Cost_QNAME, BigInteger.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "Key")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createKey(String value) {
        return new JAXBElement<String>(_Key_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "Name")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createName(String value) {
        return new JAXBElement<String>(_Name_QNAME, String.class, null, value);
    }

}

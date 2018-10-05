
package edu.cs356.model.species;

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
 * generated in the species package. 
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

    private final static QName _Description_QNAME = new QName("", "Description");
    private final static QName _StrainThreshold_QNAME = new QName("", "StrainThreshold");
    private final static QName _RankLimit_QNAME = new QName("", "RankLimit");
    private final static QName _Name_QNAME = new QName("", "Name");
    private final static QName _WoundThreshold_QNAME = new QName("", "WoundThreshold");
    private final static QName _Experience_QNAME = new QName("", "Experience");
    private final static QName _Intellect_QNAME = new QName("", "Intellect");
    private final static QName _Agility_QNAME = new QName("", "Agility");
    private final static QName _Presence_QNAME = new QName("", "Presence");
    private final static QName _Cunning_QNAME = new QName("", "Cunning");
    private final static QName _Willpower_QNAME = new QName("", "Willpower");
    private final static QName _Key_QNAME = new QName("", "Key");
    private final static QName _RankStart_QNAME = new QName("", "RankStart");
    private final static QName _Brawn_QNAME = new QName("", "Brawn");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: species
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link OptionChoices }
     * 
     */
    public OptionChoices createOptionChoices() {
        return new OptionChoices();
    }

    /**
     * Create an instance of {@link OptionChoice }
     * 
     */
    public OptionChoice createOptionChoice() {
        return new OptionChoice();
    }

    /**
     * Create an instance of {@link Options }
     * 
     */
    public Options createOptions() {
        return new Options();
    }

    /**
     * Create an instance of {@link Option }
     * 
     */
    public Option createOption() {
        return new Option();
    }

    /**
     * Create an instance of {@link SkillModifiers }
     * 
     */
    public SkillModifiers createSkillModifiers() {
        return new SkillModifiers();
    }

    /**
     * Create an instance of {@link SkillModifier }
     * 
     */
    public SkillModifier createSkillModifier() {
        return new SkillModifier();
    }

    /**
     * Create an instance of {@link StartingAttrs }
     * 
     */
    public StartingAttrs createStartingAttrs() {
        return new StartingAttrs();
    }

    /**
     * Create an instance of {@link Source }
     * 
     */
    public Source createSource() {
        return new Source();
    }

    /**
     * Create an instance of {@link StartingChars }
     * 
     */
    public StartingChars createStartingChars() {
        return new StartingChars();
    }

    /**
     * Create an instance of {@link Species }
     * 
     */
    public Species createSpecies() {
        return new Species();
    }

    /**
     * Create an instance of {@link SubSpeciesList }
     * 
     */
    public SubSpeciesList createSubSpeciesList() {
        return new SubSpeciesList();
    }

    /**
     * Create an instance of {@link SubSpecies }
     * 
     */
    public SubSpecies createSubSpecies() {
        return new SubSpecies();
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
     * Create an instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "StrainThreshold")
    public JAXBElement<BigInteger> createStrainThreshold(BigInteger value) {
        return new JAXBElement<BigInteger>(_StrainThreshold_QNAME, BigInteger.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "RankLimit")
    public JAXBElement<BigInteger> createRankLimit(BigInteger value) {
        return new JAXBElement<BigInteger>(_RankLimit_QNAME, BigInteger.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "Name")
    public JAXBElement<String> createName(String value) {
        return new JAXBElement<String>(_Name_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "WoundThreshold")
    public JAXBElement<BigInteger> createWoundThreshold(BigInteger value) {
        return new JAXBElement<BigInteger>(_WoundThreshold_QNAME, BigInteger.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "Experience")
    public JAXBElement<BigInteger> createExperience(BigInteger value) {
        return new JAXBElement<BigInteger>(_Experience_QNAME, BigInteger.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "Intellect")
    public JAXBElement<BigInteger> createIntellect(BigInteger value) {
        return new JAXBElement<BigInteger>(_Intellect_QNAME, BigInteger.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "Agility")
    public JAXBElement<BigInteger> createAgility(BigInteger value) {
        return new JAXBElement<BigInteger>(_Agility_QNAME, BigInteger.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "Presence")
    public JAXBElement<BigInteger> createPresence(BigInteger value) {
        return new JAXBElement<BigInteger>(_Presence_QNAME, BigInteger.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "Cunning")
    public JAXBElement<BigInteger> createCunning(BigInteger value) {
        return new JAXBElement<BigInteger>(_Cunning_QNAME, BigInteger.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "Willpower")
    public JAXBElement<BigInteger> createWillpower(BigInteger value) {
        return new JAXBElement<BigInteger>(_Willpower_QNAME, BigInteger.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "RankStart")
    public JAXBElement<BigInteger> createRankStart(BigInteger value) {
        return new JAXBElement<BigInteger>(_RankStart_QNAME, BigInteger.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "Brawn")
    public JAXBElement<BigInteger> createBrawn(BigInteger value) {
        return new JAXBElement<BigInteger>(_Brawn_QNAME, BigInteger.class, null, value);
    }

}

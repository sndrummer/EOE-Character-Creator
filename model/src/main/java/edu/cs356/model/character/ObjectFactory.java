
package edu.cs356.model.character;

import java.lang.Character;
import java.lang.Class;
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
 * generated in the character package. 
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

    private final static QName _IsCareerSpec_QNAME = new QName("", "isCareerSpec");
    private final static QName _StartingSpecKey_QNAME = new QName("", "StartingSpecKey");
    private final static QName _UsedExperience_QNAME = new QName("", "UsedExperience");
    private final static QName _StartingSize_QNAME = new QName("", "StartingSize");
    private final static QName _Size_QNAME = new QName("", "Size");
    private final static QName _FileName_QNAME = new QName("", "FileName");
    private final static QName _CharName_QNAME = new QName("", "CharName");
    private final static QName _Purchased_QNAME = new QName("", "Purchased");
    private final static QName _NotPersisted_QNAME = new QName("", "NotPersisted");
    private final static QName _Gender_QNAME = new QName("", "Gender");
    private final static QName _Name_QNAME = new QName("", "Name");
    private final static QName _StartingRanks_QNAME = new QName("", "StartingRanks");
    private final static QName _AttitudeKey_QNAME = new QName("", "AttitudeKey");
    private final static QName _Ranks_QNAME = new QName("", "Ranks");
    private final static QName _Build_QNAME = new QName("", "Build");
    private final static QName _PlayerName_QNAME = new QName("", "PlayerName");
    private final static QName _Height_QNAME = new QName("", "Height");
    private final static QName _GenderValue_QNAME = new QName("", "GenderValue");
    private final static QName _LastChanged_QNAME = new QName("", "LastChanged");
    private final static QName _Age_QNAME = new QName("", "Age");
    private final static QName _IsCareer_QNAME = new QName("", "isCareer");
    private final static QName _Hair_QNAME = new QName("", "Hair");
    private final static QName _Col_QNAME = new QName("", "Col");
    private final static QName _Eyes_QNAME = new QName("", "Eyes");
    private final static QName _HookKey_QNAME = new QName("", "HookKey");
    private final static QName _ObKey_QNAME = new QName("", "ObKey");
    private final static QName _DutOptions_QNAME = new QName("", "DutOptions");
    private final static QName _PurchasedRanks_QNAME = new QName("", "PurchasedRanks");
    private final static QName _SpeciesKey_QNAME = new QName("", "SpeciesKey");
    private final static QName _ClassKey_QNAME = new QName("", "ClassKey");
    private final static QName _NonCareerRanks_QNAME = new QName("", "NonCareerRanks");
    private final static QName _Row_QNAME = new QName("", "Row");
    private final static QName _ObOptions_QNAME = new QName("", "ObOptions");
    private final static QName _IsStartingSpec_QNAME = new QName("", "isStartingSpec");
    private final static QName _SpeciesRanks_QNAME = new QName("", "SpeciesRanks");
    private final static QName _Key_QNAME = new QName("", "Key");
    private final static QName _CareerKey_QNAME = new QName("", "CareerKey");
    private final static QName _TalentRanks_QNAME = new QName("", "TalentRanks");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: character
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link CharSpecialization }
     * 
     */
    public CharSpecialization createCharSpecialization() {
        return new CharSpecialization();
    }

    /**
     * Create an instance of {@link Talents }
     * 
     */
    public Talents createTalents() {
        return new Talents();
    }

    /**
     * Create an instance of {@link CharTalent }
     * 
     */
    public CharTalent createCharTalent() {
        return new CharTalent();
    }

    /**
     * Create an instance of {@link Attributes }
     * 
     */
    public Attributes createAttributes() {
        return new Attributes();
    }

    /**
     * Create an instance of {@link SoakValue }
     * 
     */
    public SoakValue createSoakValue() {
        return new SoakValue();
    }

    /**
     * Create an instance of {@link WoundThreshold }
     * 
     */
    public WoundThreshold createWoundThreshold() {
        return new WoundThreshold();
    }

    /**
     * Create an instance of {@link StrainThreshold }
     * 
     */
    public StrainThreshold createStrainThreshold() {
        return new StrainThreshold();
    }

    /**
     * Create an instance of {@link DefenseRanged }
     * 
     */
    public DefenseRanged createDefenseRanged() {
        return new DefenseRanged();
    }

    /**
     * Create an instance of {@link DefenseMelee }
     * 
     */
    public DefenseMelee createDefenseMelee() {
        return new DefenseMelee();
    }

    /**
     * Create an instance of {@link ForceRating }
     * 
     */
    public ForceRating createForceRating() {
        return new ForceRating();
    }

    /**
     * Create an instance of {@link SubSpeciesKey }
     * 
     */
    public SubSpeciesKey createSubSpeciesKey() {
        return new SubSpeciesKey();
    }

    /**
     * Create an instance of {@link SelectedOptions }
     * 
     */
    public SelectedOptions createSelectedOptions() {
        return new SelectedOptions();
    }

    /**
     * Create an instance of {@link CareerSpecSkills }
     * 
     */
    public CareerSpecSkills createCareerSpecSkills() {
        return new CareerSpecSkills();
    }

    /**
     * Create an instance of {@link CharObligation }
     * 
     */
    public CharObligation createCharObligation() {
        return new CharObligation();
    }

    /**
     * Create an instance of {@link ExperienceRanks }
     * 
     */
    public ExperienceRanks createExperienceRanks() {
        return new ExperienceRanks();
    }

    /**
     * Create an instance of {@link Specializations }
     * 
     */
    public Specializations createSpecializations() {
        return new Specializations();
    }

    /**
     * Create an instance of {@link CharSkill }
     * 
     */
    public CharSkill createCharSkill() {
        return new CharSkill();
    }

    /**
     * Create an instance of {@link Rank }
     * 
     */
    public Rank createRank() {
        return new Rank();
    }

    /**
     * Create an instance of {@link Species }
     * 
     */
    public Species createSpecies() {
        return new Species();
    }

    /**
     * Create an instance of {@link SpeciesTalents }
     * 
     */
    public SpeciesTalents createSpeciesTalents() {
        return new SpeciesTalents();
    }

    /**
     * Create an instance of {@link ForcePowers }
     * 
     */
    public ForcePowers createForcePowers() {
        return new ForcePowers();
    }

    /**
     * Create an instance of {@link java.lang.Character }
     * 
     */
    public java.lang.Character createCharacter() {
        return new Character();
    }

    /**
     * Create an instance of {@link Description }
     * 
     */
    public Description createDescription() {
        return new Description();
    }

    /**
     * Create an instance of {@link Characteristics }
     * 
     */
    public Characteristics createCharacteristics() {
        return new Characteristics();
    }

    /**
     * Create an instance of {@link CharCharacteristic }
     * 
     */
    public CharCharacteristic createCharCharacteristic() {
        return new CharCharacteristic();
    }

    /**
     * Create an instance of {@link Motivations }
     * 
     */
    public Motivations createMotivations() {
        return new Motivations();
    }

    /**
     * Create an instance of {@link SigAbilities }
     * 
     */
    public SigAbilities createSigAbilities() {
        return new SigAbilities();
    }

    /**
     * Create an instance of {@link Skills }
     * 
     */
    public Skills createSkills() {
        return new Skills();
    }

    /**
     * Create an instance of {@link StartingSize }
     * 
     */
    public StartingSize createStartingSize() {
        return new StartingSize();
    }

    /**
     * Create an instance of {@link Obligations }
     * 
     */
    public Obligations createObligations() {
        return new Obligations();
    }

    /**
     * Create an instance of {@link Duties }
     * 
     */
    public Duties createDuties() {
        return new Duties();
    }

    /**
     * Create an instance of {@link Experience }
     * 
     */
    public Experience createExperience() {
        return new Experience();
    }

    /**
     * Create an instance of {@link Career }
     * 
     */
    public Career createCareer() {
        return new Career();
    }

    /**
     * Create an instance of {@link CareerSkills }
     * 
     */
    public CareerSkills createCareerSkills() {
        return new CareerSkills();
    }

    /**
     * Create an instance of {@link java.lang.Class }
     * 
     */
    public java.lang.Class createClass() {
        return new Class();
    }

    /**
     * Create an instance of {@link Hook }
     * 
     */
    public Hook createHook() {
        return new Hook();
    }

    /**
     * Create an instance of {@link Attitude }
     * 
     */
    public Attitude createAttitude() {
        return new Attitude();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "isCareerSpec")
    public JAXBElement<Boolean> createIsCareerSpec(Boolean value) {
        return new JAXBElement<Boolean>(_IsCareerSpec_QNAME, Boolean.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "StartingSpecKey")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createStartingSpecKey(String value) {
        return new JAXBElement<String>(_StartingSpecKey_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "UsedExperience")
    public JAXBElement<BigInteger> createUsedExperience(BigInteger value) {
        return new JAXBElement<BigInteger>(_UsedExperience_QNAME, BigInteger.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "StartingSize")
    public JAXBElement<BigInteger> createStartingSize(BigInteger value) {
        return new JAXBElement<BigInteger>(_StartingSize_QNAME, BigInteger.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "Size")
    public JAXBElement<BigInteger> createSize(BigInteger value) {
        return new JAXBElement<BigInteger>(_Size_QNAME, BigInteger.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "FileName")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createFileName(String value) {
        return new JAXBElement<String>(_FileName_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "CharName")
    public JAXBElement<String> createCharName(String value) {
        return new JAXBElement<String>(_CharName_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "Purchased")
    public JAXBElement<Boolean> createPurchased(Boolean value) {
        return new JAXBElement<Boolean>(_Purchased_QNAME, Boolean.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "NotPersisted")
    public JAXBElement<Boolean> createNotPersisted(Boolean value) {
        return new JAXBElement<Boolean>(_NotPersisted_QNAME, Boolean.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "Gender")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createGender(String value) {
        return new JAXBElement<String>(_Gender_QNAME, String.class, null, value);
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
    @XmlElementDecl(namespace = "", name = "StartingRanks")
    public JAXBElement<BigInteger> createStartingRanks(BigInteger value) {
        return new JAXBElement<BigInteger>(_StartingRanks_QNAME, BigInteger.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "AttitudeKey")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createAttitudeKey(String value) {
        return new JAXBElement<String>(_AttitudeKey_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "Ranks")
    public JAXBElement<BigInteger> createRanks(BigInteger value) {
        return new JAXBElement<BigInteger>(_Ranks_QNAME, BigInteger.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "Build")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createBuild(String value) {
        return new JAXBElement<String>(_Build_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "PlayerName")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createPlayerName(String value) {
        return new JAXBElement<String>(_PlayerName_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "Height")
    public JAXBElement<String> createHeight(String value) {
        return new JAXBElement<String>(_Height_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "GenderValue")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createGenderValue(String value) {
        return new JAXBElement<String>(_GenderValue_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "LastChanged")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createLastChanged(String value) {
        return new JAXBElement<String>(_LastChanged_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "Age")
    public JAXBElement<BigInteger> createAge(BigInteger value) {
        return new JAXBElement<BigInteger>(_Age_QNAME, BigInteger.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "isCareer")
    public JAXBElement<Boolean> createIsCareer(Boolean value) {
        return new JAXBElement<Boolean>(_IsCareer_QNAME, Boolean.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "Hair")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createHair(String value) {
        return new JAXBElement<String>(_Hair_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "Col")
    public JAXBElement<BigInteger> createCol(BigInteger value) {
        return new JAXBElement<BigInteger>(_Col_QNAME, BigInteger.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "Eyes")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createEyes(String value) {
        return new JAXBElement<String>(_Eyes_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "HookKey")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createHookKey(String value) {
        return new JAXBElement<String>(_HookKey_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "ObKey")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createObKey(String value) {
        return new JAXBElement<String>(_ObKey_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link StartingSize }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "DutOptions")
    public JAXBElement<StartingSize> createDutOptions(StartingSize value) {
        return new JAXBElement<StartingSize>(_DutOptions_QNAME, StartingSize.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "PurchasedRanks")
    public JAXBElement<BigInteger> createPurchasedRanks(BigInteger value) {
        return new JAXBElement<BigInteger>(_PurchasedRanks_QNAME, BigInteger.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "SpeciesKey")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createSpeciesKey(String value) {
        return new JAXBElement<String>(_SpeciesKey_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "ClassKey")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createClassKey(String value) {
        return new JAXBElement<String>(_ClassKey_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "NonCareerRanks")
    public JAXBElement<BigInteger> createNonCareerRanks(BigInteger value) {
        return new JAXBElement<BigInteger>(_NonCareerRanks_QNAME, BigInteger.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "Row")
    public JAXBElement<BigInteger> createRow(BigInteger value) {
        return new JAXBElement<BigInteger>(_Row_QNAME, BigInteger.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link StartingSize }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "ObOptions")
    public JAXBElement<StartingSize> createObOptions(StartingSize value) {
        return new JAXBElement<StartingSize>(_ObOptions_QNAME, StartingSize.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "isStartingSpec")
    public JAXBElement<Boolean> createIsStartingSpec(Boolean value) {
        return new JAXBElement<Boolean>(_IsStartingSpec_QNAME, Boolean.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "SpeciesRanks")
    public JAXBElement<BigInteger> createSpeciesRanks(BigInteger value) {
        return new JAXBElement<BigInteger>(_SpeciesRanks_QNAME, BigInteger.class, null, value);
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
    @XmlElementDecl(namespace = "", name = "CareerKey")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createCareerKey(String value) {
        return new JAXBElement<String>(_CareerKey_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "TalentRanks")
    public JAXBElement<BigInteger> createTalentRanks(BigInteger value) {
        return new JAXBElement<BigInteger>(_TalentRanks_QNAME, BigInteger.class, null, value);
    }

}

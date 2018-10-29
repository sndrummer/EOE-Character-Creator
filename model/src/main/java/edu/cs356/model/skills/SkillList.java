package edu.cs356.model.skills;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import edu.cs356.edgeoftheempirecharactercreator.model.XPModel.AttrType;
import edu.cs356.model.Character;
import edu.cs356.model.species.Species;

public class SkillList {

    public SkillList(Character character) {
        this.character = character;

        initSkillList();
    }

    private Character character;

    private List<Skill> skillList;

    private Map<Skill, String> skillDescriptionMap;

    private Species.Characteristic BR = Species.Characteristic.BR;
    private Species.Characteristic AG = Species.Characteristic.AG;
    private Species.Characteristic INT = Species.Characteristic.INT;
    private Species.Characteristic CUN = Species.Characteristic.CUN;
    private Species.Characteristic WILL = Species.Characteristic.WILL;
    private Species.Characteristic PR = Species.Characteristic.PR;

    private void initSkillList() {
        skillList = new ArrayList<>();

        addSkill(astrogation);
        addSkill(athletics);
        addSkill(charm);
        addSkill(coercion);

        addSkill(computers);
        addSkill(cool);
        addSkill(coordination);
        addSkill(deception);

        addSkill(discipline);
        addSkill(leadership);
        addSkill(mechanics);
        addSkill(medicine);

        addSkill(negotiation);
        addSkill(perception);
        addSkill(piloting_space);
        addSkill(piloting_planetary);
        addSkill(resilience);

        addSkill(skullduggery);
        addSkill(stealth);
        addSkill(streetwise);
        addSkill(vigilance);

        addSkill(brawl);
        addSkill(gunnery);
        addSkill(melee);
        addSkill(ranged_heavy);
        addSkill(ranged_light);

        //Knowledge
        addSkill(core_worlds);
        addSkill(education);
        addSkill(outer_rim);
        addSkill(lore);
        addSkill(underworld);
        addSkill(warfare);
        addSkill(xenology);

        initSkillDescriptionMap();
    }

    //Initializes the skill with the character's base characteristic ie no ranks
    private void addSkill(Skill skill) {
        Species.Characteristic att = skill.getGoverningAtt();
        int ability = character.getSpecies().getCharacteristicValue(att);
        skill.setAbility(ability);

        skillList.add(skill);
    }

    public Integer getAttr(Species.Characteristic ATTR) {

        switch (ATTR) {
            case BR:
                return character.getBrawn();
            case AG:
                return character.getAgility();
            case INT:
                return character.getIntellect();
            case CUN:
                return character.getCunning();
            case WILL:
                return character.getWillpower();
            case PR:
                return character.getPresence();
                default:
                    return null;
        }
    }

    //skills
    private Skill astrogation = new Skill("Astrogation", INT, this);
    private Skill athletics = new Skill("Athletics", BR, this);
    private Skill charm = new Skill("Charm", PR, this);
    private Skill coercion = new Skill("Coercion", WILL, this);

    private Skill computers = new Skill("Computers", INT, this);
    private Skill cool = new Skill("Cool", PR, this);
    private Skill coordination = new Skill("Coordination", AG, this);
    private Skill deception = new Skill("Deception", CUN, this);

    private Skill discipline = new Skill("Discipline", WILL, this);
    private Skill leadership = new Skill("Leadership", PR, this);
    private Skill mechanics = new Skill("Mechanics", INT, this);
    private Skill medicine = new Skill("Medicine", INT, this);

    private Skill negotiation = new Skill("Negotiation", PR, this);
    private Skill perception = new Skill("Perception", CUN, this);
    private Skill piloting_space = new Skill("Piloting - Space", AG, this);
    private Skill piloting_planetary = new Skill("Piloting - Planetary", AG, this);
    private Skill resilience = new Skill("Resilience", BR, this);

    private Skill skullduggery = new Skill("Skullduggery", CUN, this);
    private Skill stealth = new Skill("Stealth", AG, this);
    private Skill streetwise = new Skill("Streetwise", CUN, this);
    private Skill survival = new Skill("Survival", CUN, this);
    private Skill vigilance = new Skill("Vigilance", WILL, this);

    //COMBAT SKILLS
    private Skill brawl = new Skill("Brawl", BR, this);
    private Skill gunnery = new Skill("Gunnery", AG, this);
    private Skill melee = new Skill("Melee", BR, this);
    private Skill ranged_heavy = new Skill("Ranged - Heavy", AG, this);
    private Skill ranged_light = new Skill("Ranged - Light", AG, this);

    //Knowledge skills
    private Skill core_worlds = new Skill("Core Worlds", INT, this);
    private Skill education = new Skill("Education", INT, this);
    private Skill lore = new Skill("Lore", INT, this);
    private Skill outer_rim = new Skill("Outer Rim", INT, this);
    private Skill underworld = new Skill("Underworld", INT, this);
    private Skill warfare = new Skill("Warfare", INT, this);
    private Skill xenology = new Skill("Xenology", INT, this);


    //getters


    public List<Skill> getList() {
        return skillList;
    }

    public Skill getSkillByName(String skillName) {
        Skill result = null;

        String name = skillName.toUpperCase();

        switch (name) {
            case "ASTROGATION":
                result = astrogation;
                break;
            case "ATHLETICS":
                result = athletics;
                break;
            case "CHARM":
                result = charm;
                break;
            case "COERCION":
                result = coercion;
                break;

            case "COMPUTERS":
                result = computers;
                break;
            case "COOL":
                result = cool;
                break;
            case "COORDINATION":
                result = coordination;
                break;
            case "DECEPTION":
                result = deception;
                break;

            case "DISCIPLINE":
                result = discipline;
                break;
            case "LEADERSHIP":
                result = leadership;
                break;
            case "MECHANICS":
                result = mechanics;
                break;
            case "MEDICINE":
                result = medicine;
                break;

            case "NEGOTIATION":
                result = negotiation;
                break;
            case "PERCEPTION":
                result = perception;
                break;
            case "PILOTING_SPACE":
                result = piloting_space;
                break;
            case "PILOTING PLANETARY":
                result = piloting_planetary;
                break;
            case "RESILIENCE":
                result = resilience;
                break;

            case "SKULLDUGGERY":
                result = skullduggery;
                break;
            case "STEALTH":
                result = stealth;
                break;
            case "STREETWISE":
                result = streetwise;
                break;
            case "VIGILANCE":
                result = vigilance;
                break;

            //Combat
            case "BRAWL":
                result = brawl;
                break;
            case "GUNNERY":
                result = gunnery;
                break;
            case "MELEE":
                result = melee;
                break;
            case "RANGED HEAVY":
                result = ranged_heavy;
                break;
            case "RANGED LIGHT":
                result = ranged_light;
                break;


            //Knowledge
            case "CORE WORLDS":
                result = core_worlds;
                break;
            case "EDUCATION":
                result = education;
                break;
            case "LORE":
                result = lore;
                break;
            case "OUTER RIM":
                result = outer_rim;
                break;
            case "UNDERWORLD":
                result = underworld;
                break;
            case "WARFARE":
                result = warfare;
                break;
            case "XENOLOGY":
                result = xenology;
                break;

        }
        return result;
    }

    public void updateSkillAttributes(AttrType ATTR) {

        switch (ATTR){
            case BRAWN:

        }
    }

    public Skill getSkillByType(Skill.SkillType skillType) {
        Skill result = null;

        switch (skillType) {
            case ASTROGATION:
                result = astrogation;
                break;
            case ATHLETICS:
                result = athletics;
                break;
            case CHARM:
                result = charm;
                break;
            case COERCION:
                result = coercion;
                break;

            case COMPUTERS:
                result = computers;
                break;
            case COOL:
                result = cool;
                break;
            case COORDINATION:
                result = coordination;
                break;
            case DECEPTION:
                result = deception;
                break;

            case DISCIPLINE:
                result = discipline;
                break;
            case LEADERSHIP:
                result = leadership;
                break;
            case MECHANICS:
                result = mechanics;
                break;
            case MEDICINE:
                result = medicine;
                break;

            case NEGOTIATION:
                result = negotiation;
                break;
            case PERCEPTION:
                result = perception;
                break;
            case PILOTING_SPACE:
                result = piloting_space;
                break;
            case PILOTING_PLANETARY:
                result = piloting_planetary;
                break;
            case RESILIENCE:
                result = resilience;
                break;

            case SKULLDUGGERY:
                result = skullduggery;
                break;
            case STEALTH:
                result = stealth;
                break;
            case STREETWISE:
                result = streetwise;
                break;
            case VIGILANCE:
                result = vigilance;
                break;

            //Combat
            case BRAWL:
                result = brawl;
                break;
            case GUNNERY:
                result = gunnery;
                break;
            case MELEE:
                result = melee;
                break;
            case RANGED_HEAVY:
                result = ranged_heavy;
                break;
            case RANGED_LIGHT:
                result = ranged_light;
                break;


            //Knowledge
            case CORE_WORLDS:
                result = core_worlds;
                break;
            case EDUCATION:
                result = education;
                break;
            case LORE:
                result = lore;
                break;
            case OUTER_RIM:
                result = outer_rim;
                break;
            case UNDERWORLD:
                result = underworld;
                break;
            case WARFARE:
                result = warfare;
                break;
            case XENOLOGY:
                result = xenology;
                break;

        }
        return result;
    }



    @Override
    public String toString() {

        StringBuilder sb = new StringBuilder();
        sb.append("SkillList{");
        for (Skill skill : skillList) {
            sb.append("\n");
            sb.append(skill.toString());
        }

        return sb.toString();
    }

    public Map<Skill, String> getSkillDescriptionMap() {
        return skillDescriptionMap;
    }

    private void initSkillDescriptionMap(){
        skillDescriptionMap = new HashMap<>();

        skillDescriptionMap.put(getAthletics(), "");

        skillDescriptionMap.put(getAstrogation(), "- Program a navicomputer for a hyperspace jump.\n" +
                "- Basic knowledge of galactic geography.\n" +
                "- Use navicomputer to identify location.\n" +
                "- Familiarity with hyperspace routes and the types of craft and commerce most common along a route.\n");

        skillDescriptionMap.put(getAthletics(), "- Climb -- including rappel or swing on a line -- difficulty determined by surface and weather conditions.\n" +
                "- Swim -- difficulty determined by water conditions (waves, currents and tides).\n" +
                "- Jump horizontally or vertically -- difficulty determined by gravitational conditions and distance\n" +
                "required.\n" +
                "- Push movement to a longer speed or run for an extended time.");

        skillDescriptionMap.put(getCharm(), "- Persuade an individual to make a special exception to usual practices through flattery, flirting and\n" +
                "grace.\n" +
                "- Appeal to an individual's better nature, requiring them to go out of their way to aid the characters\n" +
                "without any hope of remuneration.\n" +
                "-Sincere seduction attempts (use Deception when interest is feigned)");

        skillDescriptionMap.put(getCoercion(), "- Issue a threat, whether accompanied by hostile actions or implied, such as gesturing or pointing\n" +
                "towards a weapon.\n" +
                "- Question or persuade a target under conditions of physical captivity.\n" +
                "- Acts of torture");


        skillDescriptionMap.put(getComputers(), "- Open a locked door, control an elevator or bypass a security system.\n" +
                "- Search through records, particularly if encrypted.\n" +
                "- Investigate what actions a slicer might have taken against a computer system.\n" +
                "- Alter a droid's programming or gain access to its memories.\n" +
                "- Recover data from a system that has suffered physical damage.\n");


        skillDescriptionMap.put(getCool(), "- Resist efforts to hide the truth among overt niceties.\n" +
                "- Check for initiative when carefully and calmly prepared.\n" +
                "- Check for initiative in a social situation/discussion where timing matters.");


        skillDescriptionMap.put(getCoordination(), "Reduce damage when falling (see p140).\n" +
                "- Walk across a narrow surface, whether a wide beam or a thin pipe.\n" +
                "- Escape from restraints.\n" +
                "- Crawl through the twists and turns of a sewage pipe, ventilation duct or garbage chute");

        skillDescriptionMap.put(getDeception(), "- Mislead a buyer or seller about the value of an object.\n" +
                "- Distract an opponent through guile.\n" +
                "- Lay a false trail when pursued");

        skillDescriptionMap.put(getDiscipline(), "- Act normally while pinned down by heavy fire.\n" +
                "- Engage, rather than flee before, a creature with inherently horrifying aspects.\n" +
                "- Resist a tempting deal that seems far too good to be true");


        skillDescriptionMap.put(getLeadership(), "- Rally allies subject to the effects of fear (see p189).\n" +
                "- Sway a crowd in a public venue to take action, most often of a political nature.\n" +
                "- Reassert the loyalty of underlings that have fallen before the guile of an opponent");


        skillDescriptionMap.put(getMechanics(), "- Repair physical damage to a device, provided necessary tools and replacement components are\n" +
                "available.\n" +
                "- Repair starship or vehicle (see p155).\n" +
                "- Identify the parts and tools necessary for a repair job, along with approximate cost.\n" +
                "- Construct a completely new device from discrete components and damaged devices.\n" +
                "- Make a healing check on a droid (see Medicine, p177).");


        skillDescriptionMap.put(getMedicine(), "Apply routine first aid, including medpacs.\n" +
                "- Treat or inflict a poison, pharmaceutical or recreational drug.\n" +
                "- Identify symptoms and treatment for infectious diseases and parasites.\n" +
                "- More serious treatment -- including surgery, cybernetic augmentation and psychotherapy, provided\n" +
                "necessary pharmaceuticals and medical instruments are available.");
        skillDescriptionMap.put(getNegotiation(), "- Adjust the purchase price when buying goods or services.\n" +
                "- Adjust the selling price when selling goods or services.\n" +
                "-Participate in skill-based gambling (use Deception when cheating).");
        skillDescriptionMap.put(getPerception(), "- Detect a trap or ambush, prior to falling prey to the assault.\n" +
                "- Detect a disguised individual, when not actively looking.\n" +
                "- Notice a subtle clue -- overheard conversation, the stink of a Jawa, drug introduced to beverage.\n" +
                "- Accidently notice subtly hidden objects, such as the latch securing a smuggling compartment.");
        skillDescriptionMap.put(getPiloting_planetary(), "- Decipher basic controls of completely foreign type of atmospheric craft.\n" +
                "- Determine results of a race upon a world's surface.\n" +
                "- Maintain a tail or lose a chaser.\n" +
                "- Navigate through a familiar environment, representing knowledge of typical traffic patterns.");
        skillDescriptionMap.put(getPiloting_space(), "- Determine results of a race between the stars.\n" +
                "- Resolve chases, whether through asteroid belts, a crowded battlefield or skirting the edge of a\n" +
                "gravimetric instability.\n" +
                "- Jockey for position in a space conflict, to determine which shields face the enemy and which weapons\n" +
                "may be brought to bear");
        skillDescriptionMap.put(getResilience(), "- Go without sleep for significantly longer than is healthy for species.\n" +
                "- Resist the effects of a toxin.\n" +
                "- Endure prolonged exposure to a hostile environment -- including heat, cold or toxic pollution.\n" +
                "- Resist the effects of dehydration and malnutrition");
        skillDescriptionMap.put(getSkullduggery(), "- Pick a lock or pocket using physical tools rather than programming.\n" +
                "- Escape from a cell (after using Coordination to slip any bonds) and navigate away from security\n" +
                "elements.\n" +
                "- Identify the most vulnerable aspects of a security scheme.");
        skillDescriptionMap.put(getStealth(), "- Blend in with a crowd, hiding by acting as though you belong.\n" +
                "- Hide from an opponent's senses, modified by ambient conditions and applicable gear.\n" +
                "- Hide people or objects from the attentions of others, either through concealment or misdirection.");
        skillDescriptionMap.put(getStreetwise(), "- Locate a merchant who specialises in unsavoury goods or illicit services.\n" +
                "- Pick up subtle cues from the language and attitudes of those who operate outside of legal structures.\n" +
                "Understand subtle references within conversations.\n" +
                "- Discover what rumours are actively circulating within a region.");
        skillDescriptionMap.put(getSurvival(), "- Identify safe food, potable water or shelter in a natural environment.\n" +
                "- Understand weather patterns. Recognise the signs of imminent dangerous conditions and know the\n" +
                "best way to prepare.\n" +
                "- Track a subject through the wilderness -- whether game or bounty.\n" +
                "- Handle domesticated animals, so they may be used as beasts of burden or transport.\n");

        skillDescriptionMap.put(getVigilance(), "- Check for initiative when unprepared.\n" +
                "- Use ability associated with the Force dependent on Vigilance.\n" +
                "- Determine how prepared you are for unexpected crises. Resolve questions about whether or not a\n" +
                "small piece of gear is available.");
        skillDescriptionMap.put(getCore_worlds(), "- Identify a person's planet of origin without asking, by recognising traits of accent, dress and\n" +
                "mannerisms associated with a particular world.\n" +
                "- Know what behaviours are considered necessary and polite, as opposed to ones that could be\n" +
                "offensive when interacting with someone from a Core World.\n" +
                "- Identify which markets are the best places to sell or purchase a particular cargo (in the Core Worlds).\n" +
                "Recognise any worlds where such goods could be illegal.");
        skillDescriptionMap.put(getEducation(), "- Identify the best way to proceed when interacting with a government entity.\n" +
                "- Employ basic scientific knowledge in an analysis.\n" +
                "- Understand any question that doesn't obviously fall under another knowledge skill.");
        skillDescriptionMap.put(getLore(), "- Decipher an ancient piece of writing or identify its context.\n" +
                "- Know legends associated with the exploits of an ancient hero");
        skillDescriptionMap.put(getOuter_rim(), "- Find a planet with a particular resource or service among the systems of the Outer Rim.\n" +
                "- Identify which markets are the best places to sell or purchase a particular cargo (in the Outer Rim).\n" +
                "Recognise any worlds where such goods could be illegal.\n" +
                "- Know what behaviours are considered necessary and polite, as opposed to ones that could be\n" +
                "offensive when interacting with someone from an Outer Rim world.");
        skillDescriptionMap.put(getUnderworld(), "- Know which nearby worlds are the best locations for a particular type of illegal business.\n" +
                "- Determine the most common methods an opponent might use for a particular type of criminal activity.");
        skillDescriptionMap.put(getXenology(), "- Know what behaviours are considered necessary and polite, as opposed to ones that could be\n" +
                "offensive when interacting with a member of an unfamiliar species.\n" +
                "- Identify a particular way to injure or a characteristic vulnerability, to either help or harm a member of\n" +
                "another species.\n" +
                "- Know appropriate environmental conditions and foodstuffs for a member of another species.");


        //COMBAT
        skillDescriptionMap.put(getBrawl(), "- Make a melee attack while unarmed or using a Brawl weapon.");
        skillDescriptionMap.put(getMelee(), "- Make a melee attack using a Melee weapon");
        skillDescriptionMap.put(getGunnery(), "- Make a ranged attack using a Gunnery weapon.\n" +
                "- Operate complex targeting computers and automated weapons mounts.");
        skillDescriptionMap.put(getRanged_heavy(), "- Make a ranged attack using a Ranged (Heavy) weapon.\n");
        skillDescriptionMap.put(getRanged_light(), "- Make a ranged attack using a Ranged (Light) weapon");
    }

    public Skill getAstrogation() {
        return astrogation;
    }

    public Skill getAthletics() {
        return athletics;
    }

    public Skill getCharm() {
        return charm;
    }

    public Skill getCoercion() {
        return coercion;
    }

    public Skill getComputers() {
        return computers;
    }

    public Skill getCool() {
        return cool;
    }

    public Skill getCoordination() {
        return coordination;
    }

    public Skill getDeception() {
        return deception;
    }

    public Skill getDiscipline() {
        return discipline;
    }

    public Skill getLeadership() {
        return leadership;
    }

    public Skill getMechanics() {
        return mechanics;
    }

    public Skill getMedicine() {
        return medicine;
    }

    public Skill getNegotiation() {
        return negotiation;
    }

    public Skill getPerception() {
        return perception;
    }

    public Skill getPiloting_space() {
        return piloting_space;
    }

    public Skill getPiloting_planetary() {
        return piloting_planetary;
    }

    public Skill getResilience() {
        return resilience;
    }

    public Skill getSkullduggery() {
        return skullduggery;
    }

    public Skill getStealth() {
        return stealth;
    }

    public Skill getStreetwise() {
        return streetwise;
    }

    public Skill getSurvival() {
        return survival;
    }

    public Skill getVigilance() {
        return vigilance;
    }

    public Skill getBrawl() {
        return brawl;
    }

    public Skill getGunnery() {
        return gunnery;
    }

    public Skill getMelee() {
        return melee;
    }

    public Skill getRanged_heavy() {
        return ranged_heavy;
    }

    public Skill getRanged_light() {
        return ranged_light;
    }

    public Skill getCore_worlds() {
        return core_worlds;
    }

    public Skill getEducation() {
        return education;
    }

    public Skill getLore() {
        return lore;
    }

    public Skill getOuter_rim() {
        return outer_rim;
    }

    public Skill getUnderworld() {
        return underworld;
    }

    public Skill getWarfare() {
        return warfare;
    }

    public Skill getXenology() {
        return xenology;
    }


}

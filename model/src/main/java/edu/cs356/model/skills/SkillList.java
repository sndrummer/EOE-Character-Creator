package edu.cs356.model.skills;

import java.util.ArrayList;
import java.util.List;

import edu.cs356.model.Character;
import edu.cs356.model.species.Species;

public class SkillList {

    public SkillList(Character character) {
        this.character = character;

        initSkillList();
    }

    private Character character;

    private List<Skill> skillList;

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
        addSkill(piloting);
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
    }

    //Initializes the skill with the character's base characteristic ie no ranks
    private void addSkill(Skill skill) {
        Species.Characteristic att = skill.getGoverningAtt();
        int ability = character.getSpecies().getCharacteristicValue(att);
        skill.setAbility(ability);

        skillList.add(skill);
    }

    //skills
    private Skill astrogation = new Skill("Astrogation", INT);
    private Skill athletics = new Skill("Athletics", BR);
    private Skill charm = new Skill("Charm", PR);
    private Skill coercion = new Skill("Coercion", WILL);

    private Skill computers = new Skill("Computers", INT);
    private Skill cool = new Skill("Cool", PR);
    private Skill coordination = new Skill("Coordination", AG);
    private Skill deception = new Skill("Deception", CUN);

    private Skill discipline = new Skill("Discipline", WILL);
    private Skill leadership = new Skill("Leadership", PR);
    private Skill mechanics = new Skill("Mechanics", INT);
    private Skill medicine = new Skill("Medicine", INT);

    private Skill negotiation = new Skill("Negotiation", PR);
    private Skill perception = new Skill("Perception", CUN);
    private Skill piloting = new Skill("Piloting", AG);
    private Skill resilience = new Skill("Resilience", BR);

    private Skill skullduggery = new Skill("Skullduggery", CUN);
    private Skill stealth = new Skill("Stealth", AG);
    private Skill streetwise = new Skill("Streetwise", CUN);
    private Skill survival = new Skill("Survival", CUN);
    private Skill vigilance = new Skill("Vigilance", WILL);

    //COMBAT SKILLS
    private Skill brawl = new Skill("Brawl", BR);
    private Skill gunnery = new Skill("Gunnery", AG);
    private Skill melee = new Skill("Melee", BR);
    private Skill ranged_heavy = new Skill("Ranged - Heavy", AG);
    private Skill ranged_light = new Skill("Ranged - Light", AG);

    //Knowledge skills
    private Skill core_worlds = new Skill("Core Worlds", INT);
    private Skill education = new Skill("Education", INT);
    private Skill lore = new Skill("Lore", INT);
    private Skill outer_rim = new Skill("Outer Rim", INT);
    private Skill underworld = new Skill("Underworld", INT);
    private Skill warfare = new Skill("Warfare", INT);
    private Skill xenology = new Skill("Xenology", INT);


    //getters


    public List<Skill> getList() {
        return skillList;
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
            case PILOTING:
                result = piloting;
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
}

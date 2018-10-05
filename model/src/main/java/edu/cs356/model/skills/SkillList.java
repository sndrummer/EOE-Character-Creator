package edu.cs356.model.skills;

import java.util.ArrayList;
import java.util.List;

import edu.cs356.model.Character;
import edu.cs356.model.species.Species;

public class SkillList {

    public SkillList(Character character){
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

    private void initSkillList(){
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

    }

    private void addSkill(Skill skill){
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



}

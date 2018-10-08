package edu.cs356.model.skills;

import edu.cs356.model.species.Species;

public class Skill {

    /* MAX DICE ROLLS !!!!!!!!!
    6 Ability -- green
    5 Proficiency -- yellow
    5 Difficulty -- purple
    5 Challenge -- red
     */

    public Skill(String name, Species.Characteristic governingAtt) {
        this.name = name;
        this.governingAtt = governingAtt;
    }

    public enum SkillType {
        ASTROGATION,
        ATHLETICS,
        CHARM,
        COERCION,

        COMPUTERS,
        COOL,
        COORDINATION,
        DECEPTION,

        DISCIPLINE,
        LEADERSHIP,
        MECHANICS,
        MEDICINE,

        NEGOTIATION,
        PERCEPTION,
        PILOTING,
        RESILIENCE,

        SKULLDUGGERY,
        STEALTH,
        STREETWISE,
        VIGILANCE,

        BRAWL,
        GUNNERY,
        MELEE,
        RANGED_HEAVY,
        RANGED_LIGHT,

        //Knowledge Skills
        CORE_WORLDS,
        EDUCATION,
        LORE,
        OUTER_RIM,
        UNDERWORLD,
        WARFARE,
        XENOLOGY;
    }


    private String name;

    public static final int MAX_RANK = 5;
    //private static final int MAX_ABILITY = 6;

    private Species.Characteristic governingAtt;

    private int ability; //green dice

    private int rank = 0; //yellow dice

    private int bonus = 0;
    private int setback = 0;

    public int getAbility() {
        return ability;
    }

    public void setAbility(int ability) {
        this.ability = ability;
    }

    public int getRank() {
        return rank;
    }

    public void incrementRank() {
        if (rank < MAX_RANK) rank++;
    }

    public int getBonus() {
        return bonus;
    }

    public void setBonus(int bonus) {
        this.bonus = bonus;
    }

    public int getSetback() {
        return setback;
    }

    public void setSetback(int setback) {
        this.setback = setback;
    }

    public Species.Characteristic getGoverningAtt() {
        return governingAtt;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


}

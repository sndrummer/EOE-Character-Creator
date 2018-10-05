package edu.cs356.model.skills;

import edu.cs356.model.species.Species;

public class Skill {

    /* MAX DICE ROLLS !!!!!!!!!
    6 Ability -- green
    5 Proficiency -- yellow
    5 Difficulty -- purple
    5 Challenge -- red
     */

    public Skill(String name, Species.Characteristic governingAtt){
        this.name = name;
        this.governingAtt = governingAtt;
    }

    private String name;

    public static final int MAX_RANK = 5;
    //private static final int MAX_ABILITY = 6;

    private Species.Characteristic governingAtt;

    private int ability; //green dice

    private int rank; //yellow dice

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

    public void setRank(int rank) {
        this.rank = rank;
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

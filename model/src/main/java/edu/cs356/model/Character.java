package edu.cs356.model;

import edu.cs356.model.career.Career;
import edu.cs356.model.skills.SkillList;
import edu.cs356.model.species.Species;

public class Character {

    private String name;
    private Career career;

    private int wound;
    private int strain;
    private int soak;

    private String imagePath;


    public Character(Species species, String name){
        this.name = name;
        setSpecies(species);
        this.skillList = new SkillList(this);
    }

    //USE COMPOSITION, IE the character HAS a species, not IS a species
    private Species species;
    private SkillList skillList;
    private int XP;

    public Species getSpecies() {
        return species;
    }

    public void setSpecies(Species species) {
        this.species = species;
        setXP(species.getStartingXP());
    }

    public int getXP() {
        return XP;
    }

    private void setXP(int XP) {
        this.XP = XP;
    }

    public void spendXP(int cost){
       int curXP =  this.XP - cost;
       setXP(curXP);
    }

    public int getWound() {
        return wound;
    }

    public void setWound(int wound) {
        this.wound = wound;
    }

    public int getStrain() {
        return strain;
    }

    public void setStrain(int strain) {
        this.strain = strain;
    }

    public int getSoak() {
        return soak;
    }

    public void setSoak(int soak) {
        this.soak = soak;
    }

    public SkillList getSkillList() {
        return skillList;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Career getCareer() {
        return career;
    }

    public void setCareer(Career career) {
        this.career = career;
    }

    public String getImagePath() {
        return imagePath;
    }

    public void setImagePath(String imagePath) {
        this.imagePath = imagePath;
    }
}

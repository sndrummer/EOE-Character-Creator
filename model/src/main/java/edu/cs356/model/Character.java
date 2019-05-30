package edu.cs356.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import edu.cs356.model.career.Career;
import edu.cs356.model.skills.Skill;
import edu.cs356.model.skills.SkillListWrapper;
import edu.cs356.model.species.Species;

public class Character implements Serializable {

    private String name;
    private transient Career career;

    private Integer brawn;
    private Integer agility;
    private Integer intellect;
    private Integer cunning;
    private Integer willpower;
    private Integer presence;

    private int wound;
    private int strain;
    private int soak;

    private String imagePath;

    private List<Skill> careerSkills;


    public Character(Species species, String name){
        this.name = name;
        setSpecies(species);
        this.skillList = new SkillListWrapper(this);

        brawn = species.getBrawn();
        agility = species.getAgility();
        intellect = species.getIntelligence();
        cunning = species.getCunning();
        willpower = species.getWillpower();
        presence = species.getPresence();

        wound = species.getBaseWound()+brawn;
        strain = species.getBaseStrain()+willpower;
        soak = species.getBrawn();

        careerSkills = new ArrayList<>();
    }

    //USE COMPOSITION, IE the character HAS a species, not IS a species
    private Species species;
    private SkillListWrapper skillList;
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

    public SkillListWrapper getSkillList() {
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
        this.careerSkills = career.getCareerSkillsList();
    }

    public String getImagePath() {
        return imagePath;
    }

    public void setImagePath(String imagePath) {
        this.imagePath = imagePath;
    }

    public Integer getBrawn() {
        return brawn;
    }

    public void setBrawn(Integer brawn) {
        this.brawn = brawn;
    }

    public Integer getAgility() {
        return agility;
    }

    public void setAgility(Integer agility) {
        this.agility = agility;
    }

    public Integer getIntellect() {
        return intellect;
    }

    public void setIntellect(Integer intellect) {
        this.intellect = intellect;
    }

    public Integer getCunning() {
        return cunning;
    }

    public void setCunning(Integer cunning) {
        this.cunning = cunning;
    }

    public Integer getWillpower() {
        return willpower;
    }

    public void setWillpower(Integer willpower) {
        this.willpower = willpower;
    }

    public Integer getPresence() {
        return presence;
    }

    public void setPresence(Integer presence) {
        this.presence = presence;
    }

    public boolean isCareerSkill(Skill skill) {
        return careerSkills.contains(skill);
    }
}

package edu.cs356.model;

import edu.cs356.model.species.Species;

public class Character {

    private int wound;
    private int strain;
    private int soak;

    public Character(Species species){
        setSpecies(species);
    }

    //USE COMPOSITION, IE the character HAS a species, not IS a species
    private Species species;

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
}

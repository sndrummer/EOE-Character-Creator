package edu.cs356.model.species;

public abstract class Species {

    //Characteristics
    private int brawn;
    private int agility;
    private int intelligence;
    private int cunning;
    private int willpower;
    private int presence;

    //Starting XP
    private int startingXP;

    //Max Characteristics is six
    public static final int MAX_ATT = 6;

    public enum Characteristic {
        BR,
        AG,
        INT,
        CUN,
        WILL,
        PR;
    }

    public abstract String getDescription();
    public abstract String getName();

    public void purchaseCharacteristic(Characteristic c) {
        switch (c) {
            case BR:
                if (brawn < MAX_ATT) brawn++;
                break;
            case AG:
                if (agility < MAX_ATT) agility++;
                break;
            case INT:
                if (intelligence < MAX_ATT) intelligence++;
                break;
            case CUN:
                if (cunning < MAX_ATT) cunning++;
                break;
            case WILL:
                if (willpower < MAX_ATT) willpower++;
                break;
            case PR:
                if (presence < MAX_ATT) presence++;
                break;
        }
    }

    public int getCharacteristicValue(Characteristic c) {
        int value = 0;
        switch (c) {
            case BR:
                value = brawn;
                break;
            case AG:
                value = agility;
                break;
            case INT:
                value = intelligence;
                break;
            case CUN:
                value = cunning;
                break;
            case WILL:
                value = willpower;
                break;
            case PR:
                value = presence;
                break;
        }
        return value;
    }


    //getters and setters
    public int getBrawn() {
        return brawn;
    }

    public void setBrawn(int brawn) {
        this.brawn = brawn;
    }

    public int getAgility() {
        return agility;
    }

    public void setAgility(int agility) {
        this.agility = agility;
    }

    public int getIntelligence() {
        return intelligence;
    }

    public void setIntelligence(int intelligence) {
        this.intelligence = intelligence;
    }

    public int getCunning() {
        return cunning;
    }

    public void setCunning(int cunning) {
        this.cunning = cunning;
    }

    public int getWillpower() {
        return willpower;
    }

    public void setWillpower(int willpower) {
        this.willpower = willpower;
    }

    public int getPresence() {
        return presence;
    }

    public void setPresence(int presence) {
        this.presence = presence;
    }

    public int getStartingXP() {
        return startingXP;
    }

    public void setStartingXP(int startingXP) {
        this.startingXP = startingXP;
    }
}

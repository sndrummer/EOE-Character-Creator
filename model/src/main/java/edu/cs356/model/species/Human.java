package edu.cs356.model.species;

public class Human extends Species{


    //Species	Brawn	Agility	Int	    Cun	    Will	Presence	EXP
    //Human	    2	    2	    2	    2	    2	    2	        110
    public Human(){
        setBrawn(2);
        setAgility(2);
        setIntelligence(2);
        setCunning(2);
        setWillpower(2);
        setPresence(2);

        setStartingXP(110);
    }


    /*
     private int brawn;
    private int agility;
    private int intelligence;
    private int cunning;
    private int willpower;
    private int presence;
     */



}

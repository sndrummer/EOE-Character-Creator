package edu.cs356.model.species;

public class Wookiee extends Species {
    //Species	Brawn	Agility	Int	    Cun	    Will	Presence	EXP
    //Wookiee	3	    2	    2	    2	    1	    2	        90

    public Wookiee(){
        setBrawn(3);
        setAgility(2);
        setIntelligence(2);
        setCunning(2);
        setWillpower(1);
        setPresence(2);

        setStartingXP(90);
    }

}

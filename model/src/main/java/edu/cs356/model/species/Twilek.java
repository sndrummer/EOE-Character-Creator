package edu.cs356.model.species;

public class Twilek extends Species {

    //Species	Brawn	Agility	Int	    Cun	    Will	Presence	EXP
    //Twi’lek	1	    2	    2	    2	    2	    3	        100
    public Twilek() {
        setBrawn(1);
        setAgility(2);
        setIntelligence(2);
        setCunning(2);
        setWillpower(2);
        setPresence(3);

        setStartingXP(100);
    }
}

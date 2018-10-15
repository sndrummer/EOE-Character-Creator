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

    private String name = "Wookiee";

    @Override
    public String getName() {
        return name;
    }

    private String description = "Strong, intelligent, and fierce in battle, Wookiees\n" +
            "make the best of friends for those to whom they are\n" +
            "loyal, and the worst of enemies for anyone to whom\n" +
            "they are not. Unfortunately, Wookiees have virtually\n" +
            "disappeared from the population at large and are becoming\n" +
            "a faded memory of the Old Republic.";


    @Override
    public String getDescription() {
        return description;
    }
}

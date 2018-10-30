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

        setBaseWound(10);
        setBaseStrain(10);
    }

    private String name = "Human";

    @Override
    public String getName() {
        return name;
    }

    public String description = "Humans are the most populous and gregarious of the\n" +
            "galaxy's sapient species. They seem to be present on\n" +
            "almost every open planet that harbors life while traveling\n" +
            "the spacelanes looking for more.";

    @Override
    public String getDescription() {
        return description;
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

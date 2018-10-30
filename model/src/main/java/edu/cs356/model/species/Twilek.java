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

        setBaseWound(10);
        setBaseStrain(11);
    }

    private String name = "Twi'lek";

    @Override
    public String getName() {
        return name;
    }

    private String description = "The Twi'leks are among the most prominent non-human\n" +
            "species in the galaxy. They are expert bargainers,\n" +
            "sly at reading other species and using cunning to\n" +
            "get what they want.";

    @Override
    public String getDescription() {
        return description;
    }
}

package edu.cs356.model;

import edu.cs356.model.career.Career;

/**
 * Created by Samuel Nuttall on 5/30/2019.
 */
public class SerializableCharacter {

    private String name;
    private Career career;

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
    public SerializableCharacter(Character character) {

    }
}

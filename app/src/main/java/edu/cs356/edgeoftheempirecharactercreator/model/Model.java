package edu.cs356.edgeoftheempirecharactercreator.model;

import edu.cs356.model.Character;
import edu.cs356.model.species.Species;

public class Model {

    private Character character = null;

    private static Model sInstance;
    private Model() {

    }
    public static Model getInstance() {
        if (sInstance == null) {
            sInstance = new Model();
        }
        return sInstance;
    }

    public void selectSpecies(Species species){
        character = new Character(species);
    }
}

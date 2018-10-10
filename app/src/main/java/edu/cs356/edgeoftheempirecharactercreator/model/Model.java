package edu.cs356.edgeoftheempirecharactercreator.model;

import android.graphics.drawable.Drawable;

import edu.cs356.model.Character;
import edu.cs356.model.species.Species;

public class Model {

    private Character character = null;

    private Drawable characterDrawable;

    private static Model sInstance;
    private Model() {

    }
    public static Model getInstance() {
        if (sInstance == null) {
            sInstance = new Model();
        }
        return sInstance;
    }

    public void selectSpeciesAndName(Species species, String name){
        character = new Character(species, name);
    }

    public Character getCharacter() {
        return character;
    }

    public Drawable getCharacterDrawable() {
        return characterDrawable;
    }

    public void setCharacterDrawable(Drawable characterDrawable) {
        this.characterDrawable = characterDrawable;
    }
}

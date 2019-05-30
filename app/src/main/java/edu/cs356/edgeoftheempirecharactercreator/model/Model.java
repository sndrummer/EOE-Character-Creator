package edu.cs356.edgeoftheempirecharactercreator.model;

import android.content.Intent;
import android.graphics.drawable.Drawable;

import edu.cs356.model.Character;
import edu.cs356.model.species.Species;

public class Model {

    private Intent backGroundMusic;
    private boolean music;

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

    public static void loadInstance(Model instance) {
        sInstance = instance;
    }

    public void selectSpeciesAndName(Species species, String name){
        character = new Character(species, name);
    }

    public void setCharacter(Character character) {
        this.character = character;
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

    public Intent getBackGroundMusic() {
        return backGroundMusic;
    }

    public void setBackGroundMusic(Intent backGroundMusic) {
        this.backGroundMusic = backGroundMusic;
    }

    public boolean isMusic() {
        return music;
    }

    public void setMusic(boolean music) {
        this.music = music;
    }
}

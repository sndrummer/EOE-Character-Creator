package edu.cs356.edgeoftheempirecharactercreator.activities;

import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.Button;
import android.widget.TextView;

import edu.cs356.edgeoftheempirecharactercreator.R;
import edu.cs356.edgeoftheempirecharactercreator.model.Model;
import edu.cs356.model.career.Career;

/**
 * Created by jalton on 10/9/18.
 */

public class CareerSelection extends AppCompatActivity {

    private static final String TAG = "CareerSelectionTAG";

    //Buttons
    private Button mToPrevBtn;
    private Button mToNextBtn;

    //Career
    private Career career;

    private TextView mCharacterName;


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_career_selection);

        mCharacterName = findViewById(R.id.char_name_summary);


    }

    private void proceedToNextScreen(){
        //Log.log(Log.Level.DEBUG, this.getClass(), "Starting GameListActivity");
        //Character character = Model.getInstance().getCharacter();

        //character.setCareer(new Smuggler(character));

        Intent intent = new Intent(CareerSelection.this, CharacterSummary.class);

        startActivity(intent);
    }
}

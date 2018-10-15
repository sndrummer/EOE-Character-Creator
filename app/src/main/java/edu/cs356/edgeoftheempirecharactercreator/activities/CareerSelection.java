package edu.cs356.edgeoftheempirecharactercreator.activities;

import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

import edu.cs356.edgeoftheempirecharactercreator.R;
import edu.cs356.edgeoftheempirecharactercreator.model.Model;
import edu.cs356.model.Character;
import edu.cs356.model.career.BountyHunter;
import edu.cs356.model.career.Career;
import edu.cs356.model.career.Smuggler;
import edu.cs356.model.career.Technician;

/**
 * Created by jalton on 10/9/18.
 */

public class CareerSelection extends AppCompatActivity {

    private static final String TAG = "CareerSelectionTAG";

    //Buttons
    private Button mToPrevBtn; //career_prev
    private Button mToNextBtn; //career_next

    //Relative Layouts --> Career selection
    private RelativeLayout mBountyHunter;
    private RelativeLayout mSmuggler;
    private RelativeLayout mTechnician;

    private RelativeLayout selection;

    //Career
    private Career career;

    private Character character = Model.getInstance().getCharacter();

    private TextView mCharacterName; //char_name_career


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_career_selection);

        mCharacterName = findViewById(R.id.char_name_career);
        mToNextBtn = findViewById(R.id.career_next);
        mToPrevBtn = findViewById(R.id.career_prev);

        mBountyHunter = findViewById(R.id.bounty_hunter_career);
        mSmuggler = findViewById(R.id.smuggler_career);
        mTechnician = findViewById(R.id.technician_career);

        String upperCaseName = character.getName().toUpperCase();
        mCharacterName.setText(upperCaseName);

        mToPrevBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });

        mToNextBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                proceedToNextScreen();
            }
        });

        mBountyHunter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               makeSelection(mBountyHunter);
            }
        });

        mSmuggler.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               makeSelection(mSmuggler);
            }
        });

        mTechnician.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                makeSelection(mTechnician);
            }
        });
    }

    private void makeSelection(RelativeLayout curSelection){
        clearSelection();
        selection = curSelection;
        Drawable background = getDrawable(R.drawable.customborder2);
        curSelection.setBackground(background);
        float scale = getResources().getDisplayMetrics().density;
        int pixels = convertToPixels(1, scale);
        curSelection.setPadding(pixels,pixels,pixels,pixels);
    }

    private void clearSelection(){
        if (selection != null){
            //Change padding to 1dp and change backg
            selection.setBackgroundColor(Color.GRAY);
            selection.setPadding(0,0,0,0);
        }
    }

    private int convertToPixels(int sizeInDp, float scale){

        int dpAsPixels = (int) (sizeInDp*scale + 0.5f);

        return dpAsPixels;
    }

    private Career selectCareer(){
        Career career = null;
        if (selection == mBountyHunter){
            career = new BountyHunter(character);
        }
        else if (selection == mSmuggler){
            career = new Smuggler(character);
        }
        else if (selection == mTechnician){
            career = new Technician(character);
        }
        return career;
    }

    private void proceedToNextScreen(){
        Log.d(TAG, "Starting Character Summary Activity");
        Character character = Model.getInstance().getCharacter();
        career = selectCareer();
        if (career == null){
            displayMessage("Please select a career");
            return;
        }

        character.setCareer(career);
        Intent intent = new Intent(CareerSelection.this, CareerSkillSelection.class);
        startActivity(intent);
    }

    public void displayMessage(String message) {
        Toast.makeText(getBaseContext(), message, Toast.LENGTH_SHORT).show();
    }
}

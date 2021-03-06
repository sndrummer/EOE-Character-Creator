package edu.cs356.edgeoftheempirecharactercreator.activities;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.support.design.widget.TextInputEditText;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import edu.cs356.edgeoftheempirecharactercreator.R;
import edu.cs356.edgeoftheempirecharactercreator.model.Model;
import edu.cs356.edgeoftheempirecharactercreator.services.OnSwipeTouchListener;
import edu.cs356.edgeoftheempirecharactercreator.ui.InfoDialogue;
import edu.cs356.model.Character;
import edu.cs356.model.career.BountyHunter;
import edu.cs356.model.career.Smuggler;
import edu.cs356.model.species.Human;
import edu.cs356.model.species.Species;
import edu.cs356.model.species.Twilek;
import edu.cs356.model.species.Wookiee;

public class SpeciesSelection extends AppCompatActivity {

    private static final String TAG = "SpeciesSelectionTAG";
    //Species Image
    private ImageView mSpeciesImg; //species_img

    //Buttons
    private Button mSpeciesLeftBtn;
    private Button mSpeciesRightBtn;
    private Button mToMainBtn;
    private Button mToNextBtn;
    private Button mSpeciesInfoBtn; //species_info_btn

    //Selection arrays
    private int[] mSpeciesSelection;


    //Character Name EditText
    private TextInputEditText mCharName;

    //Species List
    private Species[] mSpecies;

    //Species Selection Text
    private TextView mSpeciesText; //species_text

    private int curSelection = 0; //Current species Selection

    boolean switching = false;
    Model model;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        //Music Controls
        switching = false;
        model = Model.getInstance();

        setContentView(R.layout.activity_species_selection);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);


        mSpeciesImg = (ImageView) findViewById(R.id.species_img);
        mSpeciesText = (TextView) findViewById(R.id.species_text);
        mCharName = (TextInputEditText) findViewById(R.id.char_name);

        initSpeciesOptions();

        mSpeciesLeftBtn = (Button) findViewById(R.id.species_left_btn);
        mSpeciesRightBtn = (Button) findViewById(R.id.species_right_btn);
        mToMainBtn = (Button) findViewById(R.id.to_main_btn);
        mToNextBtn = (Button) findViewById(R.id.to_background_btn);
        mSpeciesInfoBtn = (Button) findViewById(R.id.species_info_btn);

        setSwipeListeners(this.getApplicationContext());
        setButtonListeners();

    }

    @Override
    protected void onPause(){
        super.onPause();
        if(!switching) {
            model.getBackGroundMusic().setAction("PAUSE");
            startService(model.getBackGroundMusic());
        }
    }

    @Override
    protected void onResume(){
        super.onResume();
        if(!switching) {
            model.getBackGroundMusic().setAction("RESUME");
            startService(model.getBackGroundMusic());
        }
        else switching = false;
    }

    private void initSpeciesOptions() {
        Log.d(TAG, "initiating DRAWABLE!!!!!");
        mSpeciesSelection = new int[]{
                R.drawable.human,
                R.drawable.wookiee,
                R.drawable.twilek
        };

        mSpecies = new Species[]{
                new Human(),
                new Wookiee(),
                new Twilek()
        };
    }

    private void setSwipeListeners(Context context) {
        mSpeciesImg.setOnTouchListener(new OnSwipeTouchListener(context) {
            @Override
            public void onSwipeRight() {
                Log.d(TAG, "Right Swipe");
                changeSpecies(false);
            }

            @Override
            public void onSwipeLeft() {
                Log.d(TAG, "Left Swipe");
                changeSpecies(true);
            }
        });
    }

    private void setButtonListeners() {
        mSpeciesLeftBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.d(TAG, "Left Button Clicked");
                changeSpecies(false);
            }
        });

        mSpeciesRightBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.d(TAG, "Right Button Clicked");
                changeSpecies(true);
            }
        });

        mToNextBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.d(TAG, "To BackGround Button Clicked");
                String characterName;
                if (mCharName.getText() == null || mCharName.getText().toString().trim().equals("")){
                    showKeyboard(mCharName, getApplicationContext());
                    displayMessage("Please enter a character name");
                    return;
                }
                else characterName = mCharName.getText().toString().trim();
                model.selectSpeciesAndName(getSpeciesBySelection(), characterName);


                proceedToNextScreen();
            }
        });

        mToMainBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                switching = true;
                finish();
            }
        });

        mSpeciesInfoBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                InfoDialogue dialogue = new InfoDialogue(SpeciesSelection.this, mSpecies[curSelection].getDescription());
                dialogue.show();
            }
        });

        //E/RecyclerView: No adapter attached; skipping layout

    }

    public static void showKeyboard(TextInputEditText mEditText, Context context) {
        mEditText.requestFocus();
        InputMethodManager imm = (InputMethodManager) context.getSystemService(Activity.INPUT_METHOD_SERVICE);
        imm.toggleSoftInput(InputMethodManager.HIDE_IMPLICIT_ONLY, 0);
    }
    private void changeSpecies(boolean next) {
        if(next) {
            curSelection = (curSelection + 1) % 3;
            mSpeciesImg.setImageDrawable(getDrawable(mSpeciesSelection[curSelection]));
            mSpeciesText.setText(mSpecies[curSelection].getName());
        }
        else {
            if (curSelection == 0) {
                curSelection = 2;
            } else curSelection--;
            mSpeciesImg.setImageDrawable(getDrawable(mSpeciesSelection[curSelection]));
            mSpeciesText.setText(mSpecies[curSelection].getName());
        }
    }

    private Species getSpeciesBySelection(){
        Species species = null;
        switch (curSelection){
            case 0:
                species = new Human();
                break;
            case 1:
                species = new Wookiee();
                break;
            case 2:
                species = new Twilek();
                break;
        }
        return species;
    }

    private void proceedToNextScreen(){
        //Log.log(Log.Level.DEBUG, this.getClass(), "Starting GameListActivity");
        //Character character = Model.getInstance().getCharacter();

        //character.setCareer(new Smuggler(character));
        switching = true;

        Drawable drawable = mSpeciesImg.getDrawable();
        model.setCharacterDrawable(drawable);

        Intent intent = new Intent(SpeciesSelection.this, CareerSelection.class);

        startActivity(intent);
    }
    public void displayMessage(String message) {
        Toast.makeText(getBaseContext(), message, Toast.LENGTH_SHORT).show();
    }

}

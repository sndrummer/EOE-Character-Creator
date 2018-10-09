package edu.cs356.edgeoftheempirecharactercreator.activities;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.util.SparseIntArray;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import edu.cs356.edgeoftheempirecharactercreator.R;
import edu.cs356.edgeoftheempirecharactercreator.model.Model;
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
    private Button mToBackGroundBtn;

    //Selection arrays
    private int[] mSpeciesSelection;
    private String[] mSpeciesNames;

    //Species List
    //private Species[] mSpeciesList;

    //Species Selection Text
    private TextView mSpeciesText; //species_text

    private int curSelection = 0; //Current species Selection

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_species_selection);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);


        mSpeciesImg = (ImageView) findViewById(R.id.species_img);
        mSpeciesText = (TextView) findViewById(R.id.species_text);

        initSpeciesOptions();

        mSpeciesLeftBtn = (Button) findViewById(R.id.species_left_btn);
        mSpeciesRightBtn = (Button) findViewById(R.id.species_right_btn);
        mToMainBtn = (Button) findViewById(R.id.to_main_btn);
        mToBackGroundBtn = (Button) findViewById(R.id.to_background_btn);

        setButtonListeners();
        
    }

    private void initSpeciesOptions() {
        Log.d(TAG, "initiating DRAWABLE!!!!!");
        mSpeciesSelection = new int[]{
                R.drawable.human,
                R.drawable.wookiee,
                R.drawable.twilek
        };

        mSpeciesNames = new String[]{
                "Human",
                "Wookiee",
                "Twi'lek"
        };
    }

    private void setButtonListeners() {
        mSpeciesLeftBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.d(TAG, "Left Button Clicked");
                if (curSelection == 0) {
                    curSelection = 2;
                } else curSelection--;
                mSpeciesImg.setImageDrawable(getDrawable(mSpeciesSelection[curSelection]));
                mSpeciesText.setText(mSpeciesNames[curSelection]);

            }
        });

        mSpeciesRightBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.d(TAG, "Right Button Clicked");
                curSelection = (curSelection + 1) % 3;
                mSpeciesImg.setImageDrawable(getDrawable(mSpeciesSelection[curSelection]));
                mSpeciesText.setText(mSpeciesNames[curSelection]);
            }
        });

        mToBackGroundBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.d(TAG, "To BackGround Button Clicked");
                Model.getInstance().selectSpecies(getSpeciesBySelection());
            }
        });
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


}

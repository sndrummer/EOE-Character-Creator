package edu.cs356.edgeoftheempirecharactercreator.activities;

import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.design.widget.TextInputEditText;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import edu.cs356.edgeoftheempirecharactercreator.R;
import edu.cs356.edgeoftheempirecharactercreator.model.Model;
import edu.cs356.edgeoftheempirecharactercreator.services.BackgroundSoundService;

/**
 * Created by jalton on 10/18/18.
 */

public class MainScreen extends AppCompatActivity {

    private static final String TAG = "MainScreenTAG";

    //Buttons
    private Button mNewBtn;
    private Button mLoadBtn;
    private boolean mMusic = false;
    private boolean switching = false;
    private Model model;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        model = Model.getInstance();
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        mNewBtn = (Button) findViewById(R.id.new_btn);
        mLoadBtn = (Button) findViewById(R.id.load_btn);

        setButtonListeners();


        Model.getInstance().setMusic(mMusic);
        Model.getInstance().setBackGroundMusic( new Intent(this, BackgroundSoundService.class));
        Model.getInstance().getBackGroundMusic().setAction("PAUSE");

        if (mMusic){
            Model.getInstance().getBackGroundMusic().setAction("PLAY");
        }
        startService(Model.getInstance().getBackGroundMusic());

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



    private void setButtonListeners() {

        mNewBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.d(TAG, "New Character Button Clicked");

                proceedToNextScreen();
            }
        });

        mLoadBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.d(TAG, "Load Character Button Clicked");

                Log.d(TAG, "Loading files ... ");

                for ( String file : fileList()) {
                    Log.d(TAG, "File: " + file);
                }
            }
        });

        //E/RecyclerView: No adapter attached; skipping layout

    }

    private void proceedToNextScreen(){
        //Log.log(Log.Level.DEBUG, this.getClass(), "Starting GameListActivity");
        //Character character = Model.getInstance().getCharacter();

        //character.setCareer(new Smuggler(character));
        switching = true;

        Intent intent = new Intent(MainScreen.this, SpeciesSelection.class);

        startActivity(intent);
    }
    public void displayMessage(String message) {
        Toast.makeText(getBaseContext(), message, Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
    }
}

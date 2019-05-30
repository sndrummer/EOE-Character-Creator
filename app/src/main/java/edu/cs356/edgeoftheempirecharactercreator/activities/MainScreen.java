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

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.ObjectInputStream;
import java.io.Reader;

import edu.cs356.edgeoftheempirecharactercreator.R;
import edu.cs356.edgeoftheempirecharactercreator.model.Model;
import edu.cs356.edgeoftheempirecharactercreator.services.BackgroundSoundService;
import edu.cs356.model.TestSave;

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
        Model.getInstance().setBackGroundMusic(new Intent(this, BackgroundSoundService.class));
        Model.getInstance().getBackGroundMusic().setAction("PAUSE");

        if (mMusic) {
            Model.getInstance().getBackGroundMusic().setAction("PLAY");
        }
        startService(Model.getInstance().getBackGroundMusic());

    }

    @Override
    protected void onPause() {
        super.onPause();
        if (!switching) {
            model.getBackGroundMusic().setAction("PAUSE");
            startService(model.getBackGroundMusic());
        }

    }

    @Override
    protected void onResume() {
        super.onResume();
        if (!switching) {
            model.getBackGroundMusic().setAction("RESUME");
            startService(model.getBackGroundMusic());
        } else switching = false;
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


//                Log.d(TAG, "LOADING FILE");
//                StringBuilder sb = new StringBuilder();
//                sb.append(getApplicationContext().getFilesDir().getPath());
//                sb.append("/");
//                sb.append("samuel");
//                sb.append(".json");
//                Log.d(TAG, sb.toString());

                try {

//                    Gson gson = new GsonBuilder().create();
//                    TestSave test = gson.fromJson(new FileReader(sb.toString()), TestSave.class);
//                    //output.close();
//                    displayMessage("Character loaded "  + test.getCheese());
//                    Toast.makeText(getApplicationContext(), "Character loaded", Toast.LENGTH_LONG).show();

                } catch (Exception ex) {
                    displayMessage("Load Failed!");
                    Log.e(TAG, ex.getMessage());
                }

            }
        });

        //E/RecyclerView: No adapter attached; skipping layout

    }

    private void proceedToNextScreen() {
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

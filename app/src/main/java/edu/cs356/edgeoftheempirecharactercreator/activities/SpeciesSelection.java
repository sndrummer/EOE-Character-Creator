package edu.cs356.edgeoftheempirecharactercreator.activities;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

import edu.cs356.edgeoftheempirecharactercreator.R;

public class SpeciesSelection extends AppCompatActivity {

    //Buttons
    private ImageButton mSpeciesLeftBtn;
    private ImageButton mSpeciesRightBtn;
    private Button mToBackGround;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_species_selection);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);


    }

}

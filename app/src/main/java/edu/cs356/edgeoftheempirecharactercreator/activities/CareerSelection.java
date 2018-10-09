package edu.cs356.edgeoftheempirecharactercreator.activities;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.Button;
import android.widget.TextView;

import edu.cs356.edgeoftheempirecharactercreator.R;

/**
 * Created by jalton on 10/9/18.
 */

public class CareerSelection extends AppCompatActivity {

    private static final String TAG = "CareerSelectionTAG";

    //Buttons
    private Button mToMainBtn;
    private Button mToBackGroundBtn;

    private TextView mCharacterName;

    private int curSelection = 0;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_career_selection);

        mCharacterName = findViewById(R.id.char_name_summary);




    }
}

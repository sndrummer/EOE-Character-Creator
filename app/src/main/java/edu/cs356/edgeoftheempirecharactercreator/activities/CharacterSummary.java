package edu.cs356.edgeoftheempirecharactercreator.activities;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import edu.cs356.edgeoftheempirecharactercreator.R;

public class CharacterSummary extends AppCompatActivity {

    //TextViews
    private TextView mCharacterName;
    private TextView mSpeciesClassDescriptor;

    //ImageViews
    private ImageView mCharacterImg; //char_summary_img

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_character_summary);

        mCharacterName = findViewById(R.id.char_name_summary);
        mSpeciesClassDescriptor = findViewById(R.id.char_species_class);
        mCharacterImg = findViewById(R.id.char_summary_img);
    }
}

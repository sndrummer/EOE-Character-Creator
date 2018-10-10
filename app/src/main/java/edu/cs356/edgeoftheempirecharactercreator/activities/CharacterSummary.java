package edu.cs356.edgeoftheempirecharactercreator.activities;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

import edu.cs356.edgeoftheempirecharactercreator.R;
import edu.cs356.edgeoftheempirecharactercreator.adapters.SkillsAdapter;
import edu.cs356.edgeoftheempirecharactercreator.model.Model;
import edu.cs356.model.skills.Skill;

public class CharacterSummary extends AppCompatActivity {

    private static final String TAG = "CharacterSummaryTAG";

    //Button
    private Button mSkillsInfoBtn; //skills_info_btn

    //RecyclerView
    private RecyclerView mSkillsList;
    private RecyclerView.Adapter mAdapter;
    private RecyclerView.LayoutManager mLayoutManager;

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
        mSkillsInfoBtn = findViewById(R.id.skills_info_btn);

        mSkillsList = findViewById(R.id.skills_list);
        mSkillsList.setHasFixedSize(true);

        mLayoutManager = new LinearLayoutManager(this);
        mSkillsList.setLayoutManager(mLayoutManager);

        List<Skill> skillList = Model.getInstance().getCharacter().getSkillList().getList();
        String skillString = skillList.toString();
        Log.d(TAG, skillString);



        SkillsAdapter adapter = new SkillsAdapter(skillList);

        mSkillsList.setAdapter(adapter);



        //mAdapter = new MyAdapter(myDataset);
    }
}

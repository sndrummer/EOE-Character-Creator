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
import edu.cs356.model.Character;
import edu.cs356.model.skills.Skill;

public class CharacterSummary extends AppCompatActivity {

    private static final String TAG = "CharacterSummaryTAG";

    private Character character = Model.getInstance().getCharacter();

    //Button
    private Button mSkillsInfoBtn; //skills_info_btn

    //RecyclerView
    private RecyclerView mSkillsList;
    private RecyclerView.Adapter mAdapter;
    private RecyclerView.LayoutManager mLayoutManager;

    //TextViews
    private TextView mCharacterName;
    private TextView mSpeciesClassDescriptor;

    //Characteristic Value Text Views
    private TextView mBrawnValue;
    private TextView mAgilityValue;
    private TextView mIntValue;
    private TextView mCunValue;
    private TextView mWillValue;
    private TextView mPresValue;


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

        mBrawnValue = findViewById(R.id.brawn_value);
        mAgilityValue = findViewById(R.id.agility_value);
        mIntValue = findViewById(R.id.intellect_value);
        mCunValue = findViewById(R.id.cunning_value);
        mWillValue = findViewById(R.id.willpower_value);
        mPresValue = findViewById(R.id.presence_value);

        initDisplay();
        initAdapter();

        //mAdapter = new MyAdapter(myDataset);
    }


    private void initDisplay() {
        Model model = Model.getInstance();
        mCharacterImg.setImageDrawable(model.getCharacterDrawable());
        mCharacterName.setText(character.getName());
        StringBuilder sb = new StringBuilder();
        sb.append(character.getSpecies().getName().toLowerCase());
        sb.append(" ");
        sb.append(character.getCareer().getName().toLowerCase());
        mSpeciesClassDescriptor.setText(sb.toString());

        initCharact();

    }

    private void initAdapter() {
        mSkillsList = findViewById(R.id.skills_list);
        mSkillsList.setHasFixedSize(true);
        mLayoutManager = new LinearLayoutManager(this);
        mSkillsList.setLayoutManager(mLayoutManager);
        List<Skill> skillList = character.getSkillList().getList();
//        String skillString = skillList.toString();
//        Log.d(TAG, skillString);


        SkillsAdapter adapter = new SkillsAdapter(skillList);

        mSkillsList.setAdapter(adapter);
    }

    private void initCharact() {
        Integer brawn = character.getSpecies().getBrawn();
        Integer agility = character.getSpecies().getAgility();
        Integer cun = character.getSpecies().getCunning();
        Integer will = character.getSpecies().getWillpower();
        Integer pres = character.getSpecies().getPresence();
        Integer intelligence = character.getSpecies().getIntelligence();

        mBrawnValue.setText(brawn.toString());
        mAgilityValue.setText(agility.toString());
        mIntValue.setText(intelligence.toString());
        mCunValue.setText(cun.toString());
        mWillValue.setText(will.toString());
        mPresValue.setText(pres.toString());
    }
}

package edu.cs356.edgeoftheempirecharactercreator.activities;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import java.util.List;
import java.util.Map;

import edu.cs356.edgeoftheempirecharactercreator.R;
import edu.cs356.edgeoftheempirecharactercreator.adapters.CareerSkillsAdapter;
import edu.cs356.edgeoftheempirecharactercreator.model.Model;
import edu.cs356.model.Character;
import edu.cs356.model.skills.Skill;
import edu.cs356.model.skills.SkillList;

public class SkillSelection extends AppCompatActivity {

    private static final String TAG = "SkillSelectionTAG";
    private Character character = Model.getInstance().getCharacter();

    //RecyclerView
    private RecyclerView mSkillsList;
    private RecyclerView.Adapter mAdapter;
    private RecyclerView.LayoutManager mLayoutManager;

    //Buttons
    private Button mToPrevBtn; //career_prev
    private Button mToNextBtn; //career_next

    //TextView
    private TextView mCharacterName; //char_name_career_skills
    private TextView mChooseFourText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_skill_selection);


        Character character = Model.getInstance().getCharacter();
        SkillList skillList = Model.getInstance().getCharacter().getSkillList();
        Map<Skill, Boolean> skillsUsedMap = character.getCareer().getSkillsUsed();
        Log.d(TAG, "Beginning search...");

        for (Skill skill1 : skillsUsedMap.keySet()){
            Log.d(TAG, skill1.toString());
        }


        mCharacterName = findViewById(R.id.char_name_career_skills);
        mCharacterName.setText(character.getName().toUpperCase());

        mChooseFourText = findViewById(R.id.choose_four);
        mChooseFourText.append(" - " + character.getCareer().getName());

        mToPrevBtn = findViewById(R.id.career_skills_prev);
        mToPrevBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                resetSkills();
                finish();
            }
        });

        mToNextBtn = findViewById(R.id.career_skills_next);

        mToNextBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                proceedToNextScreen();
            }
        });


        initAdapter();
    }

    private void resetSkills() {
        Map<Skill, Boolean> skillsUsedMap = character.getCareer().getSkillsUsed();
        for (Map.Entry<Skill, Boolean> entry : skillsUsedMap.entrySet()) {
            skillsUsedMap.put(entry.getKey(), false);
        }

        character.getCareer().setSkillsUsed(skillsUsedMap);
    }

    private void proceedToNextScreen() {

        Intent intent = new Intent(SkillSelection.this, CharacterSummary.class);
        startActivity(intent);
    }

    private void initAdapter() {
        mSkillsList = findViewById(R.id.career_skills_list);
        mSkillsList.setHasFixedSize(true);
        mLayoutManager = new LinearLayoutManager(this);
        mSkillsList.setLayoutManager(mLayoutManager);
        List<Skill> skillList = character.getSkillList().getList();

        Map<Skill, String> skillDescMap = character.getSkillList().getSkillDescriptionMap();
        CareerSkillsAdapter adapter = new CareerSkillsAdapter(character.getCareer().getCareerSkillsList(), skillDescMap);

        mSkillsList.setAdapter(adapter);
    }

    public void displayMessage(String message) {
        Toast.makeText(getBaseContext(), message, Toast.LENGTH_SHORT).show();
    }
}

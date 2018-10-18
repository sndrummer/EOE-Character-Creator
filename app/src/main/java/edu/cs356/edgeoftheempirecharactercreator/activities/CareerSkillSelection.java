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

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import edu.cs356.edgeoftheempirecharactercreator.R;
import edu.cs356.edgeoftheempirecharactercreator.adapters.CareerSkillsAdapter;
import edu.cs356.edgeoftheempirecharactercreator.model.Model;
import edu.cs356.model.Character;
import edu.cs356.model.skills.Skill;
import edu.cs356.model.skills.SkillList;

public class CareerSkillSelection extends AppCompatActivity {

    private static final String TAG = "SkillSelectionTAG";
    private Character character = Model.getInstance().getCharacter();

    //RecyclerView
    private RecyclerView mSkillsList;
    private CareerSkillsAdapter mAdapter;
    private RecyclerView.LayoutManager mLayoutManager;

    //Buttons
    private Button mToPrevBtn; //career_prev
    private Button mToNextBtn; //career_next

    //TextView
    private TextView mCharacterName; //char_name_career_skills
    private TextView mChooseFourText;

    //Music Control
    private boolean switching = false;
    private Model model;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_skill_selection);

        model = Model.getInstance();

        Character character = Model.getInstance().getCharacter();
        SkillList skillList = Model.getInstance().getCharacter().getSkillList();
        Map<Skill, Boolean> skillsUsedMap = character.getCareer().getSkillsUsed();
        Log.d(TAG, "Beginning search...");

        for (Skill skill1 : skillsUsedMap.keySet()) {
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
                switching = true;
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

    @Override
    protected void onPause(){
        super.onPause();
        if(!switching) {
            model.getBackGroundMusic().setAction("PAUSE");
            startService(model.getBackGroundMusic());
        }
    }

    private void resetSkills() {
        Map<Skill, Boolean> skillsUsedMap = character.getCareer().getSkillsUsed();
        for (Map.Entry<Skill, Boolean> entry : skillsUsedMap.entrySet()) {
            skillsUsedMap.put(entry.getKey(), false);
        }

        character.getCareer().setSkillsUsed(skillsUsedMap);
    }

    private void proceedToNextScreen() {

        if (mAdapter.mSkillsRemaining == 0){

            switching = true;

            for (Skill skill : mAdapter.mSkillsChosen) {
                character.getCareer().chooseCareerSkill(skill);
            }

            Intent intent = new Intent(CareerSkillSelection.this, CharacterSummary.class);
            startActivity(intent);
        }
        else {
            displayMessage("Please select " + mAdapter.mSkillsRemaining + " more skill(s)");
        }


    }

    private void initAdapter() {
        mSkillsList = findViewById(R.id.career_skills_list);
        mSkillsList.setHasFixedSize(true);
        mLayoutManager = new LinearLayoutManager(this);
        mSkillsList.setLayoutManager(mLayoutManager);
        List<Skill> skillList = character.getSkillList().getList();

        Map<Skill, String> skillDescMap = character.getSkillList().getSkillDescriptionMap();
        mAdapter = new CareerSkillsAdapter(character.getCareer().getCareerSkillsList(), skillDescMap);

        mSkillsList.setAdapter(mAdapter);
    }

    public void displayMessage(String message) {
        Toast.makeText(getBaseContext(), message, Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onResume() {
        mAdapter.mSkillsChosen = new ArrayList<>();
        mAdapter.mSkillsRemaining = 4;
        mAdapter.mSkillsUsedMap = character.getCareer().getSkillsUsed();
        mAdapter.notifyDataSetChanged();
        super.onResume();
        if(!switching) {
            model.getBackGroundMusic().setAction("RESUME");
            startService(model.getBackGroundMusic());
        }
        else switching = false;
    }
}

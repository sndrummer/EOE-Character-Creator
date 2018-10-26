package edu.cs356.edgeoftheempirecharactercreator.activities;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

import edu.cs356.edgeoftheempirecharactercreator.R;
import edu.cs356.edgeoftheempirecharactercreator.adapters.SkillsAdapter;
import edu.cs356.edgeoftheempirecharactercreator.model.Model;
import edu.cs356.model.Character;
import edu.cs356.model.skills.Skill;

public class SpendXP extends AppCompatActivity {

    private static final String TAG = "CharacterSummaryTAG";

    private Character character = Model.getInstance().getCharacter();

    //Button
    private Button mSkillsInfoBtn; //skills_info_btn
    private ImageButton mUndoBtn;

    //RecyclerView
    private RecyclerView mSkillsList;
    private RecyclerView.Adapter mAdapter;
    private RecyclerView.LayoutManager mLayoutManager;

    //TextViews
    private TextView mCharacterName;

    //Characteristic Value Text Views
    private TextView mBrawnValue;
    private TextView mAgilityValue;
    private TextView mIntValue;
    private TextView mCunValue;
    private TextView mWillValue;
    private TextView mPresValue;

    private ImageView mBrView;
    private ImageView mAgView;
    private ImageView mIntView;
    private ImageView mCunView;
    private ImageView mWillView;
    private ImageView mPrView;

    private TextView mExperience;

    private TextView mWoundValue;
    private TextView mSoakValue;
    private TextView mStrainValue;

    //ImageViews
    private ImageView mCharacterImg; //char_summary_img

    //Sound
    private boolean switching = false;
    private Model model;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_spend_xp);

        model = Model.getInstance();

        mCharacterName = findViewById(R.id.char_name_xp);
        mSkillsInfoBtn = findViewById(R.id.skills_info_btn);
        mUndoBtn = findViewById(R.id.undo_btn);

        mBrView = findViewById(R.id.br_view);
        mAgView = findViewById(R.id.ag_view);
        mIntView = findViewById(R.id.int_view);
        mCunView = findViewById(R.id.cun_view);
        mPrView = findViewById(R.id.pr_view);
        mWillView = findViewById(R.id.will_view);

        mBrawnValue = findViewById(R.id.brawn_value);
        mAgilityValue = findViewById(R.id.agility_value);
        mIntValue = findViewById(R.id.intellect_value);
        mCunValue = findViewById(R.id.cunning_value);
        mWillValue = findViewById(R.id.willpower_value);
        mPresValue = findViewById(R.id.presence_value);

        mExperience = findViewById(R.id.xp);

        mWoundValue = findViewById(R.id.wound_value);
        mStrainValue = findViewById(R.id.strain_value);
        mSoakValue = findViewById(R.id.soak_value);

        initDisplay();
        initAdapter();

        //mAdapter = new MyAdapter(myDataset);
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


    private void initDisplay() {
        Character character = Model.getInstance().getCharacter();
        mCharacterName.setText(character.getName());

        mUndoBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                onUndoPressed();
            }
        });

        mBrView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                onBrTouched();
            }
        });

        mAgView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                onAgTouched();
            }
        });

        mIntView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                onIntTouched();
            }
        });

        mCunView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                onCunTouched();
            }
        });

        mWillView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                onWillTouched();
            }
        });

        mPrView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                onPrTouched();
            }
        });

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

        mExperience.setText(character.getSpecies().getStartingXP());
    }

    @Override
    public void onBackPressed()
    {
        Model.getInstance().getCharacter().getCareer().resetCareerSkills();
        switching = true;
        super.onBackPressed();  // optional depending on your needs
    }

    public void onUndoPressed(){

    }

    public void onBrTouched(){
    }

    public void onAgTouched(){
    }

    public void onIntTouched(){
    }

    public void onCunTouched(){
    }

    public void onPrTouched(){
    }

    public void onWillTouched(){
    }
}

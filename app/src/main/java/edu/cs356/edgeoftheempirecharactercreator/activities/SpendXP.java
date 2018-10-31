package edu.cs356.edgeoftheempirecharactercreator.activities;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.List;

import edu.cs356.edgeoftheempirecharactercreator.R;
import edu.cs356.edgeoftheempirecharactercreator.adapters.SkillsAdapter;
import edu.cs356.edgeoftheempirecharactercreator.adapters.XPSkillsAdapter;
import edu.cs356.edgeoftheempirecharactercreator.model.Model;
import edu.cs356.edgeoftheempirecharactercreator.model.Result;
import edu.cs356.edgeoftheempirecharactercreator.model.XPModel;
import edu.cs356.edgeoftheempirecharactercreator.ui.InfoDialogue;
import edu.cs356.edgeoftheempirecharactercreator.ui.XPInfoDialogue2;
import edu.cs356.model.Character;
import edu.cs356.model.skills.Skill;
import edu.cs356.model.species.Species;

import static edu.cs356.model.species.Species.Characteristic.AG;
import static edu.cs356.model.species.Species.Characteristic.BR;
import static edu.cs356.model.species.Species.Characteristic.CUN;
import static edu.cs356.model.species.Species.Characteristic.INT;
import static edu.cs356.model.species.Species.Characteristic.PR;
import static edu.cs356.model.species.Species.Characteristic.WILL;
public class SpendXP extends AppCompatActivity {

    private static final String TAG = "CharacterSummaryTAG";

    private Character character = Model.getInstance().getCharacter();
    private XPModel xpModel = XPModel.getInstance();

    //Button
    private Button mSkillsInfoBtn; //skills_info_btn
    private ImageButton mUndoBtn;
    private ImageButton mSaveBtn;

    //RecyclerView
    private RecyclerView mSkillsList;
    private RecyclerView.Adapter mAdapter;
    private RecyclerView.LayoutManager mLayoutManager;

    //TextViews
    //private TextView mCharacterName;

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

    //ICONS
    private ImageView mStrainIcon;
    private ImageView mWoundsIcon;
    private ImageView mSoakIcon;

    private TextView mExperience;

    private TextView mWoundValue;
    private TextView mSoakValue;
    private TextView mStrainValue;

    //Sound
    private boolean switching = false;
    private Model model;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_spend_xp);

        model = Model.getInstance();

        //mCharacterName = findViewById(R.id.char_name_xp);
        mSkillsInfoBtn = findViewById(R.id.skills_info_btn);
        mUndoBtn = findViewById(R.id.undo_btn);
        mSaveBtn = findViewById(R.id.save_button);

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

        //ICONS
        mWoundsIcon = findViewById(R.id.wound_icon);
        mStrainIcon = findViewById(R.id.strain_icon);
        mSoakIcon = findViewById(R.id.soak_icon);

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
        //mCharacterName.setText(character.getName());

        mUndoBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                onUndoPressed();
            }
        });

        mSaveBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                proceedToNextScreen();
            }
        });

        mSkillsInfoBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                InfoDialogue dialogue = new XPInfoDialogue2(SpendXP.this, true);
                dialogue.show();
            }
        });

        setIconListener(mSoakIcon);
        setIconListener(mWoundsIcon);
        setIconListener(mStrainIcon);

        mBrView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                onAttrTouched(BR);
            }
        });

        mAgView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                onAttrTouched(AG);
            }
        });

        mIntView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                onAttrTouched(INT);
            }
        });

        mCunView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                onAttrTouched(CUN);
            }
        });

        mWillView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                onAttrTouched(WILL);
            }
        });

        mPrView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                onAttrTouched(PR);
            }
        });

        initCharact();

    }

    private void setIconListener(ImageView icon){
        icon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                InfoDialogue dialogue = new XPInfoDialogue2(SpendXP.this, false);
                dialogue.show();
            }
        });
    }

    private void initAdapter() {
        mSkillsList = findViewById(R.id.skills_list);
        mSkillsList.setHasFixedSize(true);
        mLayoutManager = new LinearLayoutManager(this);
        mSkillsList.setLayoutManager(mLayoutManager);
        List<Skill> skillList = character.getSkillList().getList();
//        String skillString = skillList.toString();
//        Log.d(TAG, skillString);


        XPSkillsAdapter adapter = new XPSkillsAdapter(skillList, xpModel, this);

        mSkillsList.setAdapter(adapter);
    }

    private void initCharact() {
        xpModel.initValues(character);

        mBrawnValue.setText(xpModel.getBrawnValue().toString());
        mAgilityValue.setText(xpModel.getAgilityValue().toString());
        mIntValue.setText(xpModel.getIntValue().toString());
        mCunValue.setText(xpModel.getCunValue().toString());
        mWillValue.setText(xpModel.getWillValue().toString());
        mPresValue.setText(xpModel.getPresValue().toString());

        updateXP();

        mWoundValue.setText(xpModel.getMaxWound().toString());
        mStrainValue.setText(xpModel.getMaxStrain().toString());
        mSoakValue.setText(xpModel.getSoak().toString());
    }

    @Override
    public void onBackPressed()
    {
        Model.getInstance().getCharacter().getCareer().resetCareerSkills();

        for(int i = xpModel.stepsToReset(); i > 0; i-- ) {
            onUndoPressed();
        }

        switching = true;
        super.onBackPressed();  // optional depending on your needs
    }

    public void onUndoPressed(){
        Result result = xpModel.undoAction();

        if (result.isSuccess()) {
            if (result.getResult() instanceof Species.Characteristic) {
                updateAttr( (Species.Characteristic) result.getResult());
            }
            else updateSkill( (Skill) result.getResult());
        }

    }

    private void onAttrTouched(Species.Characteristic ATTR) {
        Result result = xpModel.increaseAttr(ATTR);

        if (result.isSuccess()){
            updateAttr(ATTR);
        }
    }

    private void updateAttr(Species.Characteristic ATTR){

        switch(ATTR){
            case BR:
                mBrawnValue.setText(xpModel.getBrawnValue().toString());
                mWoundValue.setText(xpModel.getMaxWound().toString());
                mSoakValue.setText(xpModel.getSoak().toString());
                break;
            case AG:
                mAgilityValue.setText(xpModel.getAgilityValue().toString());
                break;
            case INT:
                mIntValue.setText(xpModel.getIntValue().toString());
                break;
            case CUN:
                mCunValue.setText(xpModel.getCunValue().toString());
                break;
            case WILL:
                mWillValue.setText(xpModel.getWillValue().toString());
                mStrainValue.setText(xpModel.getMaxStrain().toString());
                break;
            case PR:
                mPresValue.setText(xpModel.getPresValue().toString());
                break;
            default:
        }

        updateXP();
    }

    public void updateXP(){
        mExperience.setText(xpModel.getXp().toString());
    }

    public void updateSkill(Skill skill){
        ((XPSkillsAdapter) mSkillsList.getAdapter()).updateSkill(skill);
        updateXP();
    }

    private void proceedToNextScreen() {

        if (xpModel.getXp() != 0) {
            displayMessage(xpModel.getXp() + " xp remaining");
        }

            switching = true;

            character.setBrawn(xpModel.getBrawnValue());
            character.setAgility(xpModel.getAgilityValue());
            character.setIntellect(xpModel.getIntValue());
            character.setCunning(xpModel.getCunValue());
            character.setWillpower(xpModel.getWillValue());
            character.setPresence(xpModel.getPresValue());

            character.setStrain(xpModel.getMaxStrain());
            character.setWound(xpModel.getMaxWound());
            character.setSoak(xpModel.getSoak());

            Intent intent = new Intent(SpendXP.this, CharacterSummary.class);
            startActivity(intent);
    }

    public void displayMessage(String message) {
        Toast.makeText(getBaseContext(), message, Toast.LENGTH_SHORT).show();
    }


}

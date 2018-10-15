package edu.cs356.edgeoftheempirecharactercreator.adapters;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import edu.cs356.edgeoftheempirecharactercreator.R;
import edu.cs356.edgeoftheempirecharactercreator.activities.CareerSkillSelection;
import edu.cs356.edgeoftheempirecharactercreator.model.Model;
import edu.cs356.model.skills.Skill;

public class CareerSkillsAdapter extends RecyclerView.Adapter {
    private static final String TAG = "CareerSkillsAdapterTAG";

    private List<Skill> mSkillList;
    private Map<Skill, String> mSkillDescMap;
    public Map<Skill, Boolean> mSkillsUsedMap = Model.getInstance().getCharacter().getCareer().getSkillsUsed();
    public int mSkillsRemaining = 4;

    public List<Skill> mSkillsChosen = new ArrayList<>();


    // Provide a reference to the views for each data item
    // Complex data items may need more than one view per item, and
    // you provide access to all the views for a data item in a view holder
    public static class CareerSkillViewHolder extends RecyclerView.ViewHolder {
        // each data item is just a string in this case

        public LinearLayout mLinearLayout;
        public TextView mSkillText; //career_skill_name
        public TextView mSkillDesc; //skill_desc
        public CheckBox mSkillCheckBox; //career_skill_checkbox

        public CareerSkillSelection curActivity;


        public CareerSkillViewHolder(LinearLayout layout) {
            super(layout);
            mLinearLayout = layout;

            curActivity = (CareerSkillSelection) layout.getContext();
        }
    }


    // Provide a suitable constructor (depends on the kind of dataset)
    public CareerSkillsAdapter(List<Skill> skillList, Map<Skill, String> skillDescMap) {
        mSkillList = skillList;
        mSkillDescMap = skillDescMap;
    }

    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {

        // create a new view
        LinearLayout layout = (LinearLayout) LayoutInflater.from(viewGroup.getContext())
                .inflate(R.layout.career_skill_item, viewGroup, false);


        CareerSkillViewHolder vh = new CareerSkillViewHolder(layout);
        vh.mSkillText = layout.findViewById(R.id.career_skill_name);
        vh.mSkillDesc = layout.findViewById(R.id.skill_desc);
        vh.mSkillCheckBox = layout.findViewById(R.id.career_skill_checkbox);


        return vh;

    }

    // Replace the contents of a view (invoked by the layout manager)
    @Override
    public void onBindViewHolder(@NonNull final RecyclerView.ViewHolder viewHolder, int i) {
        // - get element from your dataset at this position
        // - replace the contents of the view with that element
        final Skill skill = mSkillList.get(i);
        // viewHolder.mSkillText.setText(skill.getName());
        CareerSkillViewHolder skillViewHolder = (CareerSkillViewHolder) viewHolder;
        StringBuilder sb = new StringBuilder();
        sb.append(skill.getName());
        sb.append(" ");
        sb.append(skill.getGoverningAttString());
        skillViewHolder.mSkillText.setText(sb.toString());

        //Set desc Text
        String description = mSkillDescMap.get(skill);
        skillViewHolder.mSkillDesc.setText(description);


        CheckBox checkBox = skillViewHolder.mSkillCheckBox;

        Log.d(TAG, "HELOO!!!!!!!!!!!!!!!!!!!!!");
        checkBox.setChecked(mSkillsUsedMap.get(skill));
        Log.d(TAG, "SETTING " + ((CareerSkillViewHolder) viewHolder).mSkillText.getText().toString() + ", SKILL: " + skill.getName() + " to -->: " + mSkillsUsedMap.get(skill));

        final int j = i;
        checkBox.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                CareerSkillViewHolder skillViewHolder = (CareerSkillViewHolder) viewHolder;
                CheckBox checkBox = skillViewHolder.mSkillCheckBox;
                if (buttonView.isPressed()) {
                    Skill checkedSkill = mSkillList.get(j);
                    //Log.d(TAG, "IS " + ((CareerSkillViewHolder) viewHolder).mSkillText.getText().toString() + " Checked!!: " + isChecked);



                    if (isChecked && mSkillsRemaining < 1) {
                        checkBox.setChecked(false);
                        skillViewHolder.curActivity.displayMessage("Max amount of skills chosen");
                        mSkillsUsedMap.put(checkedSkill, false);

                    } else if (isChecked) {
                        mSkillsRemaining--;
                        mSkillsChosen.add(checkedSkill);
                        mSkillsUsedMap.put(checkedSkill, true);
                        //Log.d(TAG, checkedSkill.getName() + " added!");
                        // Log.d(TAG, "chosen size: " + mSkillsChosen.size());
                    } else {
                        if (mSkillsRemaining < 4) {
                            mSkillsRemaining++;
                        }
                        mSkillsChosen.remove(checkedSkill);
                        mSkillsUsedMap.put(checkedSkill, false);
                        //Log.d(TAG, checkedSkill.getName() + " removed!");
                        //Log.d(TAG, "chosen size: " + mSkillsChosen.size());
                    }

                }
            }
        });

    }

    @Override
    public void onViewRecycled(@NonNull RecyclerView.ViewHolder holder) {
        super.onViewRecycled(holder);
        CareerSkillViewHolder skillViewHolder = (CareerSkillViewHolder) holder;
        CheckBox checkBox = skillViewHolder.mSkillCheckBox;


        //checkBox.setChecked(mSkillsUsedMap.get(skill));


        // CareerSkillViewHolder skillViewHolder = (CareerSkillViewHolder) holder;

    }


    @Override
    public int getItemCount() {
        return mSkillList.size();
    }
}

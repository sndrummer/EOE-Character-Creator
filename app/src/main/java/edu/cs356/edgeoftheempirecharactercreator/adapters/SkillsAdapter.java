package edu.cs356.edgeoftheempirecharactercreator.adapters;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.List;

import edu.cs356.edgeoftheempirecharactercreator.R;
import edu.cs356.model.skills.Skill;

public class SkillsAdapter extends RecyclerView.Adapter {
    private List<Skill> mSkillList;

    private ImageView mDice1;
    private ImageView mDice2;
    private ImageView mDice3;
    private ImageView mDice4;
    private ImageView mDice5;
    private ImageView mDice6;
    private ImageView mDice7;
    private ImageView[] mDiceImages;

    public TextView mSkillText;

    // Provide a reference to the views for each data item
    // Complex data items may need more than one view per item, and
    // you provide access to all the views for a data item in a view holder
    public static class SkillViewHolder extends RecyclerView.ViewHolder {
        // each data item is just a string in this case
        public LinearLayout mLinearLayout;

        public SkillViewHolder(LinearLayout layout) {
            super(layout);
            mLinearLayout = layout;
        }
    }

    // Provide a suitable constructor (depends on the kind of dataset)
    public SkillsAdapter(List<Skill> skillList) {
        mSkillList = skillList;
    }

    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {

        // create a new view
        LinearLayout layout = (LinearLayout) LayoutInflater.from(viewGroup.getContext())
                .inflate(R.layout.skill_item_linear, viewGroup, false);
        mSkillText = layout.findViewById(R.id.skill_name);

        //Assign Dice Images
        mDice1 = layout.findViewById(R.id.dice1);
        mDice2 = layout.findViewById(R.id.dice2);
        mDice3 = layout.findViewById(R.id.dice3);
        mDice4 = layout.findViewById(R.id.dice4);
        mDice5 = layout.findViewById(R.id.dice5);
        mDice6 = layout.findViewById(R.id.dice6);
        mDice7 = layout.findViewById(R.id.dice7);

        mDiceImages = new ImageView[]{
                mDice1,
                mDice2,
                mDice3,
                mDice4,
                mDice5,
                mDice6,
                mDice7
        };


        SkillViewHolder vh = new SkillViewHolder(layout);
        return vh;
    }

    // Replace the contents of a view (invoked by the layout manager)
    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder viewHolder, int i) {
        // - get element from your dataset at this position
        // - replace the contents of the view with that element
        Skill skill = mSkillList.get(i);
        mSkillText.setText(skill.getName());

        setDiceImages(skill, viewHolder);

    }

    private void setDiceImages(Skill skill, RecyclerView.ViewHolder viewHolder) {
        int prof = skill.getRank();
        for (int i = 0; i < skill.getAbility(); i++) {
            if (prof >= 1) {
                mDiceImages[i].setImageDrawable(viewHolder.itemView.getContext().getDrawable(R.drawable.proficiencybg));
                mDiceImages[i].setVisibility(View.VISIBLE);
                prof--;
            }
            else {
                mDiceImages[i].setImageDrawable(viewHolder.itemView.getContext().getDrawable(R.drawable.abilitybg));
                mDiceImages[i].setVisibility(View.VISIBLE);
            }
        }
    }

    @Override
    public int getItemCount() {
        return mSkillList.size();
    }
}

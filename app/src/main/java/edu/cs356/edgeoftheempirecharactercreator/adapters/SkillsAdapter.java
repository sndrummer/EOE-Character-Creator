package edu.cs356.edgeoftheempirecharactercreator.adapters;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import edu.cs356.edgeoftheempirecharactercreator.R;
import edu.cs356.edgeoftheempirecharactercreator.activities.SkillSelection;
import edu.cs356.model.skills.Skill;

public class SkillsAdapter extends RecyclerView.Adapter {
    private List<Skill> mSkillList;


    // Provide a reference to the views for each data item
    // Complex data items may need more than one view per item, and
    // you provide access to all the views for a data item in a view holder
    public static class SkillViewHolder extends RecyclerView.ViewHolder {
        // each data item is just a string in this case
        public LinearLayout mLinearLayout;
        public TextView mSkillText;

        private ImageView mDice1;
        private ImageView mDice2;
        private ImageView mDice3;
        private ImageView mDice4;
        private ImageView mDice5;
        private ImageView mDice6;
        private ImageView mDice7;
        private ImageView[] mDiceImages;



        public SkillViewHolder(LinearLayout layout) {
            super(layout);
            mLinearLayout = layout;

        }
    }

    // Provide a suitable constructor (depends on the kind of dataset)
    public SkillsAdapter(List<Skill> skillList) {
       /* Collections.sort(skillList, new Comparator<Skill>() {
            @Override
            public int compare(Skill skill1, Skill skill2) {
                return (skill1.getName().compareTo(skill2.getName()));
            }
        });*/
        mSkillList = skillList;
    }

    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {

        // create a new view
        LinearLayout layout = (LinearLayout) LayoutInflater.from(viewGroup.getContext())
                .inflate(R.layout.skill_item_linear, viewGroup, false);


        SkillViewHolder vh = new SkillViewHolder(layout);
        vh.mSkillText = layout.findViewById(R.id.skill_name);

        //Assign Dice Images
        vh.mDice1 = layout.findViewById(R.id.dice1);
        vh.mDice2 = layout.findViewById(R.id.dice2);
        vh.mDice3 = layout.findViewById(R.id.dice3);
        vh.mDice4 = layout.findViewById(R.id.dice4);
        vh.mDice5 = layout.findViewById(R.id.dice5);
        vh.mDice6 = layout.findViewById(R.id.dice6);
        vh.mDice7 = layout.findViewById(R.id.dice7);

        vh.mDiceImages = new ImageView[]{
                vh.mDice1,
                vh.mDice2,
                vh.mDice3,
                vh.mDice4,
                vh.mDice5,
                vh.mDice6,
                vh.mDice7
        };


        return vh;

    }

    // Replace the contents of a view (invoked by the layout manager)
    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder viewHolder, int i) {
        // - get element from your dataset at this position
        // - replace the contents of the view with that element
        Skill skill = mSkillList.get(i);
       // viewHolder.mSkillText.setText(skill.getName());
        SkillViewHolder skillViewHolder = (SkillViewHolder) viewHolder;
        StringBuilder sb = new StringBuilder();
        sb.append(skill.getName());
        sb.append(" ");
        sb.append(skill.getGoverningAttString());
        skillViewHolder.mSkillText.setText(sb.toString());

        setDiceImages(skill, skillViewHolder);

    }

    @Override
    public void onViewRecycled(@NonNull RecyclerView.ViewHolder holder) {
        super.onViewRecycled(holder);
        SkillViewHolder skillViewHolder = (SkillViewHolder) holder;

        for (ImageView img: skillViewHolder.mDiceImages) {
            img.setVisibility(View.INVISIBLE);
        }
    }

    private void setDiceImages(Skill skill, SkillViewHolder skillViewHolder) {

        int prof = skill.getRank(); //3
        int tmp = 0;
        for (int i = 0; i < skill.getAbility(); i++) { //2
            if (prof >= 1) {
                skillViewHolder.mDiceImages[i].setImageDrawable(skillViewHolder.itemView.getContext().getDrawable(R.drawable.proficiencybg));
                skillViewHolder.mDiceImages[i].setVisibility(View.VISIBLE);
                prof--;
            }
            else {
                skillViewHolder.mDiceImages[i].setImageDrawable(skillViewHolder.itemView.getContext().getDrawable(R.drawable.abilitybg));
                skillViewHolder.mDiceImages[i].setVisibility(View.VISIBLE);
            }
            tmp = i + 1;
        }
        while (prof != 0 && (tmp < 7)){
            skillViewHolder.mDiceImages[tmp].setImageDrawable(skillViewHolder.itemView.getContext().getDrawable(R.drawable.abilitybg));
            skillViewHolder.mDiceImages[tmp].setVisibility(View.VISIBLE);
            prof--;

            if (prof != 0){
                skillViewHolder.mDiceImages[tmp].setImageDrawable(skillViewHolder.itemView.getContext().getDrawable(R.drawable.proficiencybg));
                skillViewHolder.mDiceImages[tmp].setVisibility(View.VISIBLE);
                prof--;
            }
            tmp++;
        }
    }



    @Override
    public int getItemCount() {
        return mSkillList.size();
    }
}

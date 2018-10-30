package edu.cs356.edgeoftheempirecharactercreator.adapters;

import android.graphics.Typeface;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import edu.cs356.edgeoftheempirecharactercreator.R;
import edu.cs356.edgeoftheempirecharactercreator.activities.SpendXP;
import edu.cs356.edgeoftheempirecharactercreator.model.Result;
import edu.cs356.edgeoftheempirecharactercreator.model.XPModel;
import edu.cs356.model.skills.Skill;

public class XPSkillsAdapter extends RecyclerView.Adapter {
    private List<Skill> mSkillList;

    private XPModel xpModel;

    private SpendXP wrapper;

    private Map<String, SkillViewHolder> holderMap;
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
    public XPSkillsAdapter(List<Skill> skillList, XPModel model, SpendXP wrapper) {
       /* Collections.sort(skillList, new Comparator<Skill>() {
            @Override
            public int compare(Skill skill1, Skill skill2) {
                return (skill1.getName().compareTo(skill2.getName()));
            }
        });*/
        mSkillList = skillList;
        xpModel = model;
        this.wrapper = wrapper;

        holderMap = new HashMap<>();
    }

    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {

        // create a new view
        LinearLayout layout = (LinearLayout) LayoutInflater.from(viewGroup.getContext())
                .inflate(R.layout.skill_item_linear, viewGroup, false);


        final SkillViewHolder vh = new SkillViewHolder(layout);
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

        for (int j = 0; j < 7; j++) {
            vh.mDiceImages[j].setImageDrawable(vh.itemView.getContext().getDrawable(R.drawable.abilitybg));
        }

        vh.mLinearLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TextView skillName = (TextView) ((LinearLayout) v).getChildAt(0);

                final int position = vh.getAdapterPosition();
                Skill skill = mSkillList.get(position);

                if (xpModel.increaseSkill2(skill).isSuccess()){
                    updateSkill(skill);
                    wrapper.updateXP();
                    Toast.makeText(v.getContext(), skill.getName() + " rank " + skill.getRank(), Toast.LENGTH_SHORT).show();
                }

            }
        });



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

        if (xpModel.isCareerSkill(skill)) {
            skillViewHolder.mSkillText.setTypeface(Typeface.DEFAULT_BOLD);
        }

        holderMap.put(skill.getName(), skillViewHolder);

        setDiceImages(skill, skillViewHolder);

    }

    @Override
    public void onViewRecycled(@NonNull RecyclerView.ViewHolder holder) {
        super.onViewRecycled(holder);
        SkillViewHolder skillViewHolder = (SkillViewHolder) holder;

        for (ImageView img: skillViewHolder.mDiceImages) {
            img.setVisibility(View.INVISIBLE);
        }

        final int position = holder.getAdapterPosition();
        Skill skill = mSkillList.get(position);

        holderMap.remove(skill.getName());
    }

    public void setDiceImages(Skill skill, SkillViewHolder skillViewHolder) {


        for (int i = 0; i < 7; i++) {
            skillViewHolder.mDiceImages[i].setVisibility(View.INVISIBLE);
        }


        for (int i = 0; i < skill.getRank(); i++){
            skillViewHolder.mDiceImages[i].setVisibility(View.VISIBLE);
        }
    }


    public Skill getSkill(int i) {
        return mSkillList.get(i);
    }

    @Override
    public int getItemCount() {
        return mSkillList.size();
    }

    public void updateSkill(Skill skill){
        if  (holderMap.containsKey(skill.getName())) {
            SkillViewHolder holder = holderMap.get(skill.getName());

            setDiceImages(skill, holder);
        }
    }
}

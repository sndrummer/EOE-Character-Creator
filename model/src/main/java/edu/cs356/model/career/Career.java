package edu.cs356.model.career;

import java.util.Map;

import edu.cs356.model.Character;
import edu.cs356.model.skills.Skill;

public abstract class Career {

    Character character;
    Map<Skill.SkillType, Boolean> skillsUsed;

    public abstract String getDescription();

    public abstract String getSkillsDescription();

    public abstract Map<Skill.SkillType, Boolean> getCareerSkills();

    public abstract String getName();

    //public abstract void chooseCareerSkill(Skill.SkillType type);
    abstract void initCareerSkills();

    public Career(Character character) {
        this.character = character;
        initCareerSkills();
    }


    public void chooseCareerSkill(Skill.SkillType type) {
        Skill skill = character.getSkillList().getSkillByType(type);
        if (!skillsUsed.get(type)) {
            skill.incrementRank();
            skillsUsed.put(type, Boolean.TRUE);
        }


    }
}

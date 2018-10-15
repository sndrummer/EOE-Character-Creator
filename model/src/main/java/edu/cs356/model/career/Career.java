package edu.cs356.model.career;

import java.util.List;
import java.util.Map;

import edu.cs356.model.Character;
import edu.cs356.model.skills.Skill;

public abstract class Career {

    Character character;
    Map<Skill, Boolean> skillsUsed;
    List<Skill> careerSkillsList;

    public abstract String getDescription();

    public abstract String getSkillsDescription();

    public abstract Map<Skill, Boolean> getCareerSkills();

    public abstract String getName();

    //public abstract void chooseCareerSkill(Skill.SkillType type);
    abstract void initCareerSkills();

    public Career(Character character) {
        this.character = character;
        initCareerSkills();
    }


    public void chooseCareerSkill(Skill skill) {
        skill.incrementRank();
        skillsUsed.put(skill, Boolean.TRUE);

    }

    public Map<Skill, Boolean> getSkillsUsed() {
        return skillsUsed;
    }

    public void setSkillsUsed(Map<Skill, Boolean> skillsUsed) {
        this.skillsUsed = skillsUsed;
    }

    public List<Skill> getCareerSkillsList() {
        return careerSkillsList;
    }

    public void setCareerSkillsList(List<Skill> careerSkillsList) {
        this.careerSkillsList = careerSkillsList;
    }
}

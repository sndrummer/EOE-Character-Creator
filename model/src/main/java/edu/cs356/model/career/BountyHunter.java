package edu.cs356.model.career;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import edu.cs356.model.Character;
import edu.cs356.model.skills.Skill;
import edu.cs356.model.skills.SkillList;

public class BountyHunter extends Career {

    public BountyHunter(Character character) {
        super(character);
    }

    private String name = "Bounty Hunter";


    private String description = "Pretty much anything to do with technology or mechanical\n" +
            "devices lies within the Technician's purview. He\n" +
            "knows how to operate, maintain, repair, and upgrade\n" +
            "just about anything with power or gears. Most Technicians\n" +
            "would rather deal with machines and droids than\n" +
            "people; the latter are just too unpredictable.";


    private String skillsDescription = "Technicians are both knowledgeable and handy, and\n" +
            "their skills show it: Astrogation, Computers, Coordination,\n" +
            "Discipline, Knowledge (Outer Rim),\n" +
            "Mechanics, Perception, and Piloting (Planetary)\n" +
            "He automatically gains one rank in four of these skills\n" +
            "(of his choosing) without spending experience, and\n" +
            "he receives a discount when he spends experience to\n" +
            "purchase ranks in any of these skills.";

    void initCareerSkills() {
        skillsUsed = new HashMap<>();
        careerSkillsList = new ArrayList<>();
        SkillList skillList = character.getSkillList();

        skillsUsed.put(skillList.getAthletics(), Boolean.FALSE);
        skillsUsed.put(skillList.getBrawl(), Boolean.FALSE);
        skillsUsed.put(skillList.getPerception(), Boolean.FALSE);
        skillsUsed.put(skillList.getPiloting_space(), Boolean.FALSE);
        skillsUsed.put(skillList.getPiloting_planetary(), Boolean.FALSE);
        skillsUsed.put(skillList.getRanged_heavy(), Boolean.FALSE);
        skillsUsed.put(skillList.getStreetwise(), Boolean.FALSE);
        skillsUsed.put(skillList.getVigilance(), Boolean.FALSE);

        careerSkillsList.add(skillList.getAthletics());
        careerSkillsList.add(skillList.getBrawl());
        careerSkillsList.add(skillList.getPerception());
        careerSkillsList.add(skillList.getPiloting_space());
        careerSkillsList.add(skillList.getPiloting_planetary());
        careerSkillsList.add(skillList.getRanged_heavy());
        careerSkillsList.add(skillList.getStreetwise());
        careerSkillsList.add(skillList.getVigilance());

    }

    @Override
    public String getDescription() {
        return description;
    }

    @Override
    public String getSkillsDescription() {
        return skillsDescription;
    }

    @Override
    public Map<Skill, Boolean> getCareerSkills() {
        return skillsUsed;
    }

    @Override
    public String getName() {
        return name;
    }
}

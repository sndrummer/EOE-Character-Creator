package edu.cs356.model.career;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import edu.cs356.model.Character;
import edu.cs356.model.skills.Skill;
import edu.cs356.model.skills.SkillList;

public class Smuggler extends Career {

    public Smuggler(Character character) {
        super(character);
    }

    private String name = "Smuggler";


    private String description = "Though they spend most of their lives\n" +
            "struggling to avoid Imperial entanglements,\n" +
            "keeping their ships flying, dodgng\n" +
            "blaster fire, and having enough to\n" +
            "eat, Smugglers are often seen as the\n" +
            "freest beings in the galaxy. They travel\n" +
            "the hyperspace lanes, system to system,\n" +
            "planet to planet, bringing what\n" +
            "people want and need (and cannot\n" +
            "get through legitimate means).";


    private String skillsDescription = "Smugglers are a crafty, diverse bunch with\n" +
            "core skills as follows: Coordination, Deception,\n" +
            "Knowledge (Underworld), Perception,\n" +
            "Piloting (Space), Skulduggery,\n" +
            "Streetwise, and Vigilance.";

    void initCareerSkills() {
        skillsUsed = new HashMap<>();
        SkillList skillList = character.getSkillList();
        careerSkillsList = new ArrayList<>();


        skillsUsed.put(skillList.getCoordination(), Boolean.FALSE);
        skillsUsed.put(skillList.getDeception(), Boolean.FALSE);
        skillsUsed.put(skillList.getUnderworld(), Boolean.FALSE);
        skillsUsed.put(skillList.getPiloting_space(), Boolean.FALSE);
        skillsUsed.put(skillList.getPerception(), Boolean.FALSE);
        skillsUsed.put(skillList.getSkullduggery(), Boolean.FALSE);
        skillsUsed.put(skillList.getStreetwise(), Boolean.FALSE);
        skillsUsed.put(skillList.getVigilance(), Boolean.FALSE);

        careerSkillsList.add(skillList.getCoordination());
        careerSkillsList.add(skillList.getDeception());
        careerSkillsList.add(skillList.getUnderworld());
        careerSkillsList.add(skillList.getPiloting_space());
        careerSkillsList.add(skillList.getPerception());
        careerSkillsList.add(skillList.getSkullduggery());
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


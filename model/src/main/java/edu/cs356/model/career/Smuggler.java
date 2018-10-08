package edu.cs356.model.career;

import java.util.HashMap;
import java.util.Map;

import edu.cs356.model.Character;
import edu.cs356.model.skills.Skill;

public class Smuggler extends Career {

    public Smuggler(Character character) {
        super(character);
    }


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
        skillsUsed.put(Skill.SkillType.COORDINATION, Boolean.FALSE);
        skillsUsed.put(Skill.SkillType.DECEPTION, Boolean.FALSE);
        skillsUsed.put(Skill.SkillType.UNDERWORLD, Boolean.FALSE);
        skillsUsed.put(Skill.SkillType.PILOTING, Boolean.FALSE);
        skillsUsed.put(Skill.SkillType.PERCEPTION, Boolean.FALSE);
        skillsUsed.put(Skill.SkillType.SKULLDUGGERY, Boolean.FALSE);
        skillsUsed.put(Skill.SkillType.STREETWISE, Boolean.FALSE);
        skillsUsed.put(Skill.SkillType.VIGILANCE, Boolean.FALSE);
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
    public Map<Skill.SkillType, Boolean> getCareerSkills() {
        return skillsUsed;
    }
}

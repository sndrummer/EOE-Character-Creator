package edu.cs356.model.career;

import java.util.HashMap;
import java.util.Map;

import edu.cs356.model.Character;
import edu.cs356.model.skills.Skill;

public class Technician extends Career {

    public Technician(Character character) {
        super(character);
    }

    private String name = "Technician";

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


    private String skillsDescription = "Astrogation, Computers, Coordination,\n" +
            "Discipline, Knowledge (Outer Rim),\n" +
            "Mechanics, Perception, and Piloting (Planetary)\n" +
            "He automatically gains one rank in four of these skills\n" +
            "(of his choosing) without spending experience, and\n" +
            "he receives a discount when he spends experience to\n" +
            "purchase ranks in any of these skills.";

    void initCareerSkills() {
        skillsUsed = new HashMap<>();
        skillsUsed.put(Skill.SkillType.ASTROGATION, Boolean.FALSE);
        skillsUsed.put(Skill.SkillType.COMPUTERS, Boolean.FALSE);
        skillsUsed.put(Skill.SkillType.COORDINATION, Boolean.FALSE);
        skillsUsed.put(Skill.SkillType.DISCIPLINE, Boolean.FALSE);
        skillsUsed.put(Skill.SkillType.OUTER_RIM, Boolean.FALSE);
        skillsUsed.put(Skill.SkillType.MECHANICS, Boolean.FALSE);
        skillsUsed.put(Skill.SkillType.PERCEPTION, Boolean.FALSE);
        skillsUsed.put(Skill.SkillType.PILOTING, Boolean.FALSE);
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

    @Override
    public String getName() {
        return name;
    }
}

package edu.cs356.model.career;

import java.util.HashMap;
import java.util.Map;

import edu.cs356.model.Character;
import edu.cs356.model.skills.Skill;

public class BountyHunter extends Career {

    public BountyHunter(Character character) {
        super(character);
    }


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
        skillsUsed.put(Skill.SkillType.ATHLETICS, Boolean.FALSE);
        skillsUsed.put(Skill.SkillType.BRAWL, Boolean.FALSE);
        skillsUsed.put(Skill.SkillType.PERCEPTION, Boolean.FALSE);
        skillsUsed.put(Skill.SkillType.PILOTING, Boolean.FALSE);
        skillsUsed.put(Skill.SkillType.RANGED_HEAVY, Boolean.FALSE);
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

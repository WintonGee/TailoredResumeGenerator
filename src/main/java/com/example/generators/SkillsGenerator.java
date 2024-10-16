package com.example.generators;

import com.example.data.Skills;
import com.example.util.LatexUtils;

public class SkillsGenerator {

    private Skills skills;

    public SkillsGenerator(Skills skills) {
        this.skills = skills;
    }

    public String generateSkills() {
        StringBuilder skillsSection = new StringBuilder();
        String section = LatexUtils.generateSectionHeader("Skills");
        skillsSection.append(section);

        skillsSection.append("\\textbf{Programming Languages}: ");
        skillsSection.append(String.join(", ", skills.getProgrammingLanguages()));
        skillsSection.append("\\\\\n");

        skillsSection.append("\\textbf{Software Tools}: ");
        skillsSection.append(String.join(", ", skills.getTools()));
        skillsSection.append("\\\\\n");

        return skillsSection.toString();
    }
}

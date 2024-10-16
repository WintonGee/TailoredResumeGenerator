package com.example.initializers;

import com.example.data.Skills;

public class SkillInitializer {
    public static Skills initializeSkills() {
        Skills skills = new Skills();
        skills.addProgrammingLanguage("Java", "Python", "JavaScript", "SQL", "C++", "C", "Scala", "HTML/CSS", "Assembly", "C#");
        skills.addTool("Git", "Linux", "MongoDB", "JSON", "OpenAI", "Computer Vision", "Spark", "REST API", "React", "Express");
        return skills;
    }
}

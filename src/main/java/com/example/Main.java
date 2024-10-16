package com.example;

import com.example.generators.*;
import com.example.data.*;
import com.example.util.KeywordExtractor;
import com.example.initializers.ExperienceInitializer;
import com.example.initializers.ProjectInitializer;
import com.example.initializers.SkillInitializer;
import com.example.initializers.KeywordInitializer;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        HeaderGenerator headerGenerator = new HeaderGenerator();
        EducationGenerator educationGenerator = new EducationGenerator();
        ExperienceGenerator experienceGenerator = new ExperienceGenerator(ExperienceInitializer.initializeExperiences());
        ProjectsGenerator projectsGenerator = new ProjectsGenerator(ProjectInitializer.initializeProjects());
        SkillsGenerator skillsGenerator = new SkillsGenerator(SkillInitializer.initializeSkills());

        // Extract keywords from job description
        List<String> keywords = KeywordInitializer.initializeKeywords();
        KeywordExtractor.extractKeywords(keywords, "job_description.txt");

        ResumeGenerator resumeGenerator = new ResumeGenerator(headerGenerator, educationGenerator, experienceGenerator, projectsGenerator, skillsGenerator);
        resumeGenerator.generateResume();

        // TEST
        System.out.println(KeywordExtractor.readKeywordsFromJson());
    }
}

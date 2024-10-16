package com.example.generators;

import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class ResumeGenerator {

    // This is used to keep track of which keywords have already been used
    public static List<String> USED_KEYWORDS = new ArrayList<>();

    private HeaderGenerator headerGenerator;
    private EducationGenerator educationGenerator;
    private ExperienceGenerator experienceGenerator;
    private ProjectsGenerator projectsGenerator;
    private SkillsGenerator skillsGenerator;

    public ResumeGenerator(HeaderGenerator headerGenerator, EducationGenerator educationGenerator, ExperienceGenerator experienceGenerator, ProjectsGenerator projectsGenerator, SkillsGenerator skillsGenerator) {
        this.headerGenerator = headerGenerator;
        this.educationGenerator = educationGenerator;
        this.experienceGenerator = experienceGenerator;
        this.projectsGenerator = projectsGenerator;
        this.skillsGenerator = skillsGenerator;
    }

    public void generateResume() {
        String header = headerGenerator.getLatexString();
        String education = educationGenerator.getLatexString();
        String experience = experienceGenerator.generateExperience();
        String projects = projectsGenerator.generateProjects();
        String skills = skillsGenerator.generateSkills();

        StringBuilder resumeContent = new StringBuilder();
        resumeContent.append("\\documentclass[a4paper,10pt]{article}\n")
                     .append("\\usepackage[margin=0.5in]{geometry}\n")
                     .append("\\usepackage{hyperref}\n")
                     .append("\\usepackage[utf8]{inputenc}\n")
                     .append("\\usepackage{tabularx}\n")
                     .append("\\usepackage{array}\n")
                     .append("\\usepackage{enumitem}\n")
                     .append("\\usepackage[none]{hyphenat}\n")
                     .append("\\pagestyle{empty}\n")
                     .append("\\hypersetup{\n")
                     .append("    colorlinks=true,\n")
                     .append("    linkcolor=blue,\n")
                     .append("    filecolor=blue,\n")
                     .append("    urlcolor=blue,\n")
                     .append("}\n")
                     .append("\\begin{document}\n")
                     .append(header)
                     .append(education)
                     .append(experience)
                     .append(projects)
                     .append(skills)
                     .append("\\end{document}\n");

        try {
            Files.write(Paths.get("output/resume.tex"), resumeContent.toString().getBytes());
        } catch (Exception e) {
            e.printStackTrace();
        }

        try {
            Process process = Runtime.getRuntime().exec("pdflatex -output-directory=output output/resume.tex");
            process.waitFor();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

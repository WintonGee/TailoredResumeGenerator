package com.example.generators;

import com.example.data.Project;
import com.example.util.LatexUtils;
import java.util.List;

public class ProjectsGenerator {

    private List<Project> projects;

    public ProjectsGenerator(List<Project> projects) {
        this.projects = projects;
    }

    public String generateProjects() {
        StringBuilder projectSection = new StringBuilder();
        projectSection.append(LatexUtils.generateSectionHeader("Projects"));

        for (Project project : projects) {
            projectSection.append("\\begin{tabularx}{\\textwidth}{@{}lXr@{}}\n")
                          .append("\\textbf{").append(project.getName()).append("} \\textbar{} ").append(project.getKeywordsAsString()).append(" \\\\\n")
                          .append("\\end{tabularx}\n")
                          .append("\\begin{itemize}[leftmargin=*,label=\\textbullet]\n");

            for (String detail : project.getDetails()) {
                projectSection.append("  \\item ").append(detail).append("\n");
            }

            projectSection.append("\\end{itemize}\n")
                          .append("\\vspace{10pt}\n");  // Space between projects
        }

        return projectSection.toString();
    }
}

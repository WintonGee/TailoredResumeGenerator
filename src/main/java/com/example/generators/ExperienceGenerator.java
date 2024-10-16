package com.example.generators;

import com.example.data.Experience;
import com.example.util.LatexUtils;
import java.util.List;

public class ExperienceGenerator {

    private List<Experience> experiences;

    public ExperienceGenerator(List<Experience> experiences) {
        this.experiences = experiences;
    }

    public String generateExperience() {
        StringBuilder experience = new StringBuilder();
        String section = LatexUtils.generateSectionHeader("Experience");
        experience.append(section);

        for (Experience exp : experiences) {
            experience.append("\\begin{tabularx}{\\textwidth}{@{} >{\\raggedright\\arraybackslash}X >{\\centering\\arraybackslash}X >{\\raggedleft\\arraybackslash}X @{} }\n")
                      .append("\\textbf{").append(exp.getTitle()).append("} & \\textbf{").append(exp.getCompany()).append("} & \\textbf{").append(exp.getDate()).append("} \\\\\n")
                      .append("\\end{tabularx}\n")
                      .append("\\begin{itemize}[leftmargin=*,label=\\textbullet]\n");
            for (String responsibility : exp.getResponsibilities()) {
                experience.append("  \\item ").append(responsibility).append("\n");
            }
            experience.append("\\end{itemize}\n").append("\\vspace{10pt}\n");
        }

        return experience.toString();
    }
}

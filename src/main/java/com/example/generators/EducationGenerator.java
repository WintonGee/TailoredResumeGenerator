package com.example.generators;

import com.example.util.LatexUtils;

public class EducationGenerator extends AbstractGenerator {

    @Override
    public void loadMasterData() {
        throw new UnsupportedOperationException("Unimplemented method 'loadMasterData'");
    }

    @Override
    public String getLatexString() {
        StringBuilder education = new StringBuilder();
        education.append(LatexUtils.generateSectionHeader("Education"))
                 .append("\\begin{tabularx}{\\textwidth}{@{}lXr@{}}\n")
                 .append("\\textbf{California Polytechnic State University} & & San Luis Obispo, CA \\\\\n")
                 .append("Bachelor of Science Degree in \\textbf{Computer Science} & & June 2024\n")
                 .append("\\end{tabularx}\n");

        return education.toString();
    }

}

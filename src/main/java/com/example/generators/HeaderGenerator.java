package com.example.generators;

public class HeaderGenerator extends AbstractGenerator {

    @Override
    public void loadMasterData() {
        throw new UnsupportedOperationException("Unimplemented method 'loadMasterData'");
    }

    @Override
    public String getLatexString() {
        String name = "Winton Gee";
        String email = "wintongee@gmail.com";
        String phone = "415-806-3004";
        String linkedIn = "linkedin.com/in/wintongee";
        String website = "wintongee.com";
        String gitHub = "github.com/wintongee";
        String location = "San Francisco, CA";

        return String.format(
                "\\begin{center}\n" +
                "    \\begin{tabularx}{\\textwidth}{@{} >{\\raggedright\\arraybackslash}X >{\\centering\\arraybackslash}X >{\\raggedleft\\arraybackslash}X @{} }\n" +
                "        \\begin{tabular}{@{}l@{}}\n" +
                "            %s \\\\\n" +
                "            \\href{mailto:%s}{%s} \\\\\n" +
                "            %s\n" +
                "        \\end{tabular} &\n" +
                "        \\textbf{\\Large %s} &\n" +
                "        \\begin{tabular}{@{}r@{}}\n" +
                "            \\href{https://%s}{%s} \\\\\n" +
                "            \\href{https://%s}{%s} \\\\\n" +
                "            \\href{https://%s}{%s}\n" +
                "        \\end{tabular}\n" +
                "    \\end{tabularx}\n" +
                "\\end{center}\n",
                location, email, email, phone,
                name,
                linkedIn, linkedIn,
                website, website,
                gitHub, gitHub
        );    
    }
}

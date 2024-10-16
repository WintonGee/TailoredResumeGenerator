package com.example.util;

public class LatexUtils {
    public static String latexify(String input) {
        if (input == null) {
            return "";
        }
        return input.replace("\\", "\\textbackslash{}")
                    .replace("{", "\\{")
                    .replace("}", "\\}")
                    .replace("#", "\\#")
                    .replace("_", "\\_")
                    .replace("^", "\\^{}")
                    .replace("~", "\\~{}")
                    .replace("%", "\\%")
                    .replace("$", "\\$")
                    .replace("&", "\\&");
    }

    public static String generateSectionHeader(String sectionName) {
        return String.format("\\section*{\\large %s}\n\\vspace{-18pt}\n\\noindent\\rule{\\textwidth}{0.4pt}\n\\vspace{5pt}\n", sectionName.toUpperCase());
    }

    public static String bold(String input) {
        if (input == null) {
            return "";
        }
        return "\\textbf{" + latexify(input) + "}";
    }

}

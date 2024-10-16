package com.example.data;

import com.example.util.LatexUtils;
import java.util.ArrayList;
import java.util.List;

public class Skills {
    private List<String> programmingLanguages;
    private List<String> tools;

    public Skills() {
        this.programmingLanguages = new ArrayList<>();
        this.tools = new ArrayList<>();
    }

    public void addProgrammingLanguage(String... programmingLanguage) {
        for (String language : programmingLanguage) {
            this.programmingLanguages.add(LatexUtils.latexify(language));
        }
    }

    public void addTool(String... tool) {
        for (String t : tool) {
            this.tools.add(LatexUtils.latexify(t));
        }
    }

    public List<String> getProgrammingLanguages() {
        return programmingLanguages;
    }

    public List<String> getTools() {
        return tools;
    }

}

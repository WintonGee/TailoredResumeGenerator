package com.example.data;

import com.example.util.LatexUtils;
import java.util.ArrayList;
import java.util.List;

public class Project {
    private String name;
    private List<String> keywords;
    private List<String> details;

    public Project(String name) {
        this.name = LatexUtils.latexify(name);
        this.keywords = new ArrayList<>();
        this.details = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public List<String> getKeywords() {
        return keywords;
    }

    public List<String> getDetails() {
        return details;
    }

    public void addKeyword(String... keyword) {
        for (String key : keyword) {
            this.keywords.add(LatexUtils.latexify(key));
        }
    }

    public void addDetail(String... detail) {
        for (String d : detail) {
            this.details.add(LatexUtils.latexify(d));
        }
    }

    public String getKeywordsAsString() {
        return String.join(" \\textbar{} ", keywords);
    }
}

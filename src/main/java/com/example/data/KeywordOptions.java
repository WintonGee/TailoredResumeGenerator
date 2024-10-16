package com.example.data;

import java.util.*;
import java.util.stream.Collectors;

import com.example.util.KeywordExtractor;

public class KeywordOptions {
    private String defaultValue;
    private List<String> alternativeValues;

    private boolean useBestKeyword = true;
    
    public KeywordOptions(String defaultValue, String... alternativeValues) {
        this.defaultValue = defaultValue;
        this.alternativeValues = new ArrayList<>(List.of(alternativeValues));
    }

    public String getDefaultValue() {
        return defaultValue;
    }

    public List<String> getAlternativeValues() {
        return alternativeValues;
    }

    public void setUseBestKeyword(boolean useBestKeyword) {
        this.useBestKeyword = useBestKeyword;
    }


    public List<String> getAllValues() {
        ArrayList<String> allValues = new ArrayList<>();
        allValues.add(defaultValue);
        allValues.addAll(alternativeValues);
        return allValues;
    }


    // TODO Add some logic, use the best keyword, or able to return multiple keywords
    public String getKeywordValues() {
        List<String> keywords = KeywordExtractor.readKeywordsFromJson().keySet().stream().collect(Collectors.toList());
        List<String> allValues = getAllValues();

        // Get the keywords that are contained in all values
        List<String> keywordsInAllValues = keywords.stream().filter(keyword -> allValues.contains(keyword)).collect(Collectors.toList());

        if (keywordsInAllValues.size() == 0) {
            return defaultValue;
        }

        if (useBestKeyword) {
            return keywordsInAllValues.get(0);
        }

        return String.join(" ", keywordsInAllValues);
    }
}

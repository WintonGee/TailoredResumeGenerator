package com.example.data;

import java.util.HashMap;
import java.util.Map;

import com.example.util.LatexUtils;
import com.example.util.KeywordExtractor;

public class DynamicSentence {

    private String template;
    private Map<String, KeywordOptions> keywordMap;

    private boolean isDescription = false;
    // TODO have a boolean variable that indicates whether this is a descriptive sentence or not
    // this means that this is always the first sentence to describe the experience/project
    // if the experience or project is selected, then this sentence must be included in details

    public DynamicSentence(String template) {
        this.template = template;
        this.keywordMap = new HashMap<>();
    }

    public void setKeyword(String key, KeywordOptions keywordOptions) {
        this.keywordMap.put(key, keywordOptions);
    }

    public void setIsDescription(boolean isDescription) {
        this.isDescription = isDescription;
    }

    public boolean isDescription() {
        return isDescription;
    }

    public String generate() {
        String result = template;
        for (Map.Entry<String, KeywordOptions> entry : keywordMap.entrySet()) {
            String values = entry.getValue().getKeywordValues();
            result = result.replace("{" + entry.getKey() + "}", values);
        }
        return LatexUtils.latexify(result);
    }

    // This function returns the score of this sentence based on the frequency of the keywords
    public int getScore() {

        int score = 0;
        String generatedString = generate();
        Map<String, Integer> keywordFrequency = KeywordExtractor.readKeywordsFromJson();

        for (Map.Entry<String, Integer> entry : keywordFrequency.entrySet()) {
            if (generatedString.contains(entry.getKey())) {
                score += entry.getValue();
            }
        }

        return score;
    }
}

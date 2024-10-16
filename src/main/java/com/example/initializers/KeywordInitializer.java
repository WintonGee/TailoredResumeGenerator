package com.example.initializers;

import com.example.data.KeywordCategory;

import java.util.ArrayList;
import java.util.List;
import java.util.HashSet;
import java.util.Set;

public class KeywordInitializer {

    public static List<String> initializeKeywords() {
        Set<String> keywords = new HashSet<>();

        for (KeywordCategory category : KeywordCategory.values()) {
            keywords.addAll(category.getKeywords());
        }

        return new ArrayList<>(keywords);
    }
}

package com.example.util;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.reflect.TypeToken;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.charset.StandardCharsets;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Stream;
import java.util.logging.Logger;
import java.util.stream.Collectors;


public class KeywordExtractor {
    private static final Logger LOGGER = Logger.getLogger(KeywordExtractor.class.getName());

    public static void extractKeywords(List<String> keywords, String jobDescriptionPath) {
        Map<String, Integer> keywordFrequency = new HashMap<>();

        try (Stream<String> lines = Files.lines(Paths.get(jobDescriptionPath), StandardCharsets.UTF_8)) {
            lines.forEach(line -> {
                // Preprocess the line to remove commas, slashes, and other unwanted characters
                line = preprocessLine(line);

                for (String keyword : keywords) {
                    Pattern pattern = Pattern.compile("(?<!\\w)" + Pattern.quote(keyword) + "(?!\\w)", Pattern.CASE_INSENSITIVE);
                    Matcher matcher = pattern.matcher(line);
                    while (matcher.find()) {
                        keywordFrequency.put(keyword, keywordFrequency.getOrDefault(keyword, 0) + 1);
                    }
                }
            });
        } catch (IOException e) {
            LOGGER.severe("Error reading job description file: " + e.getMessage());
        }

        // Sort the keyword frequencies
        Map<String, Integer> sortedKeywordFrequency = sortByValue(keywordFrequency);

        // Convert the result to JSON and save to a file
        Gson gson = new GsonBuilder().setPrettyPrinting().create();
        try {
            Files.createDirectories(Paths.get("output"));
            Files.write(Paths.get("output/keywords.json"), gson.toJson(sortedKeywordFrequency).getBytes(StandardCharsets.UTF_8));
        } catch (IOException e) {
            LOGGER.severe("Error writing keywords to JSON file: " + e.getMessage());
        }
    }
    private static String preprocessLine(String line) {
        // Replace various punctuation with spaces
        String cleanedLine = line.replaceAll("[,./;:!?()\"']", " ");
        
        // Replace multiple whitespace characters with a single space
        cleanedLine = cleanedLine.replaceAll("\\s+", " ");
        
        // Trim leading and trailing whitespace
        return cleanedLine.trim();
    }
    

    private static Map<String, Integer> sortByValue(Map<String, Integer> unsortedMap) {
        List<Map.Entry<String, Integer>> list = new ArrayList<>(unsortedMap.entrySet());
        list.sort(Map.Entry.comparingByValue(Comparator.reverseOrder()));

        Map<String, Integer> sortedMap = new LinkedHashMap<>();
        for (Map.Entry<String, Integer> entry : list) {
            sortedMap.put(entry.getKey(), entry.getValue());
        }
        return sortedMap;
    }

    public static Map<String, Integer> readKeywordsFromJson() {
        Gson gson = new Gson();
        Map<String, Integer> keywordFrequency = new HashMap<>();

        try {
            String json = new String(Files.readAllBytes(Paths.get("output/keywords.json")), StandardCharsets.UTF_8);
            keywordFrequency = gson.fromJson(json, new TypeToken<Map<String, Integer>>(){}.getType());
        } catch (Exception e) {
            e.printStackTrace();
        }

        return keywordFrequency;
    }
}

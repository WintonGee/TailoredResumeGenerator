package com.example.initializers;

import com.example.data.Project;
import java.util.ArrayList;
import java.util.List;

public class ProjectInitializer {
    public static List<Project> initializeProjects() {
        List<Project> projects = new ArrayList<>();
        Project proj1 = new Project("PantryCraft");
        proj1.addKeyword("JavaScript", "HTML/CSS", "Python", "SQL");
        proj1.addDetail("Built a Full Stack recipe generation website using user-input ingredients, handling 100+ requests daily");
        proj1.addDetail("Implemented OpenAI for dynamic recipe generation and OCR for simplified ingredient input via receipt scanning");
        proj1.addDetail("Utilized React for frontend, Express for backend, and MongoDB for storing recipes and user inputs");

        Project proj2 = new Project("Cryptocurrency Trading Bot");
        proj2.addKeyword("Java");
        proj2.addDetail("Developed a trading bot to identify market trends and execute trades, achieving a 15% monthly profit");
        proj2.addDetail("Applied 6 trading indicators, including moving averages and Bollinger bands, to inform trade decisions");
        proj2.addDetail("Processed 5 years of historical trade data using Binance API and Gson API");

        Project proj3 = new Project("Hotel Reservation System");
        proj3.addKeyword("SQL", "Java");
        proj3.addDetail("Created a SQL-based hotel reservation system managing 10,000+ reservations");
        proj3.addDetail("Generated personalized reservation options based on user preferences, increasing booking accuracy by 30%");
        proj3.addDetail("Implemented robust error handling to ensure date and room availability validation");

        Project proj4 = new Project("Tailored Resume Generator");
        proj4.addKeyword("Java", "LaTeX", "Automation", "PDF Generation");
        proj4.addDetail("Developed a Java-based program to generate LaTeX resumes tailored to job descriptions");
        proj4.addDetail("Integrated LaTeX for high-quality PDF output");
        proj4.addDetail("Dynamically generated resume sections: header, education, experience, projects, and skills");
        proj4.addDetail("Maintained consistent formatting and alignment across sections");
        proj4.addDetail("Provided a user-friendly interface for managing resume data");

        projects.add(proj1);
        projects.add(proj2);
        projects.add(proj3);
        projects.add(proj4);

        return projects;
    }
}

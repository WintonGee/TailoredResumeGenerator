package com.example.data;

import java.util.*;

public enum KeywordCategory {

    PROGRAMMING_LANGUAGES("C", "C#", "C++", "Java", "JavaScript", "Python", "Ruby", "Scala", "Kotlin", "Go", "PHP", "Swift", "TypeScript", "Rust", "Perl", "Golang"),

    FRONTEND_FRAMEWORKS("React", "Angular", "Vue.js", "Next.js", "Nuxt.js", "Svelte", "Backbone.js", "Bootstrap", "Tailwind CSS", "Material-UI", "Chakra UI", "Ant Design", "jQuery", "AJAX", "JSON", "OpenGL", "ReactJS"),

    BACKEND_FRAMEWORKS("Spring", "Spring Boot", "Django", "Flask", "Ruby on Rails", "Express.js", "ASP.NET", "Hibernate", "Node.js", "Koa", "Gin", "SOAP", "API", "Kernel"),

    DATABASES("MySQL", "PostgreSQL", "MongoDB", "Redis", "Elasticsearch", "SQLite", "MariaDB", "Oracle DB", "Microsoft SQL Server", "Cassandra", "Firebase Realtime Database", "Firestore", "DynamoDB", "CouchDB", "Neo4j", "GraphDB", "Oracle", "NoSQL", "Postgres", "Database"),

    TOOLS("Git", "Docker", "Kubernetes", "Terraform", "Ansible", "Jenkins", "Travis CI", "CircleCI", "AWS", "Azure", "Google Cloud Platform", "GitHub", "GitLab", "Bitbucket", "JIRA", "Confluence", "Slack", "Visual Studio", "Pipeline", "End-to-End", "Firmware", "Prototypes", "Specification", "Linux", "Unix", "GCP", "CI/CD", "Continuous Integration", "RHEL"),

    CONCEPTS("Microservices", "CI/CD", "REST API", "GraphQL", "Agile", "Scrum", "TDD", "BDD", "Serverless", "Cloud Computing", "DevOps", "Performance Tuning", "Scalability", "Load Balancing", "OAuth", "JWT", "Message Brokers", "Service Mesh", "MVC", "ORM", "API Gateway", "SOAP", "data modeling", "computer science", "Operating Systems", "Networking", "Distributed Systems", "Cloud Infrastructure", "Cloud", "Communication"),

    AI_ML("Machine Learning", "Deep Learning", "Natural Language Processing", "Computer Vision", "TensorFlow", "Keras", "PyTorch", "Scikit-Learn", "Pandas", "NumPy", "Jupyter", "Kaggle", "AWS SageMaker", "Google AI Platform", "Hadoop", "Spark", "Kafka", "Data Visualization", "Data Analysis", "Feature Engineering", "Model Deployment", "Hyperparameter Tuning"),

    VERSION_CONTROL("GitHub", "GitLab", "Bitbucket"),
    
    PROJECT_MANAGEMENT("JIRA", "Trello", "Asana", "Monday.com"),

    ROLES("Software Engineer", "Software Developer"),

    TESTING("Testing", "RSpec");

    private final List<String> keywords;

    KeywordCategory(String... keywords) {
        List<String> keywordList = Arrays.asList(keywords);
        Collections.sort(keywordList);
        this.keywords = Collections.unmodifiableList(keywordList);
    }

    public List<String> getKeywords() {
        return keywords;
    }

    public static KeywordOptions getKeywordOptions(KeywordCategory category, String defaultValue) {
        return new KeywordOptions(defaultValue, category.getKeywords().toArray(new String[0]));
    }
}

package com.example.initializers;

import com.example.data.DynamicSentence;
import com.example.data.Experience;
import com.example.data.KeywordOptions;
import com.example.data.KeywordCategory;

import java.util.ArrayList;
import java.util.List;

public class ExperienceInitializer {
    public static List<Experience> initializeExperiences() {
        List<Experience> experiences = new ArrayList<>();

        KeywordOptions programmingLanguages = KeywordCategory.getKeywordOptions(KeywordCategory.PROGRAMMING_LANGUAGES, "Java");
        KeywordOptions frontendFramework = KeywordCategory.getKeywordOptions(KeywordCategory.FRONTEND_FRAMEWORKS, "React");
        KeywordOptions backendFramework = KeywordCategory.getKeywordOptions(KeywordCategory.BACKEND_FRAMEWORKS, "Spring Boot");
        KeywordOptions database = KeywordCategory.getKeywordOptions(KeywordCategory.DATABASES, "MySQL");
        KeywordOptions tools = KeywordCategory.getKeywordOptions(KeywordCategory.TOOLS, "Git");
        KeywordOptions concepts = KeywordCategory.getKeywordOptions(KeywordCategory.CONCEPTS, "Microservices");
        KeywordOptions aiMl = KeywordCategory.getKeywordOptions(KeywordCategory.AI_ML, "Machine Learning");
        KeywordOptions versionControl = KeywordCategory.getKeywordOptions(KeywordCategory.VERSION_CONTROL, "GitHub");
        KeywordOptions projectManagement = KeywordCategory.getKeywordOptions(KeywordCategory.PROJECT_MANAGEMENT, "JIRA");

        // Experience at Ricoh USA
        Experience expRicohUSA = new Experience("Software Engineering Intern", "Ricoh USA", "June 2023 - September 2023");

        DynamicSentence lambdaFunctionSentence = new DynamicSentence("Developed 8 {programmingLang} Lambda functions to interact with SQL servers, increasing scalability by 15%");
        lambdaFunctionSentence.setIsDescription(true);
        lambdaFunctionSentence.setKeyword("programmingLang", programmingLanguages);
        expRicohUSA.addDetail(lambdaFunctionSentence);

        DynamicSentence postmanSentence = new DynamicSentence("Ensured 99.9% uptime by leveraging Postman for API testing, identifying and resolving discrepancies in SQL servers, reducing downtime by 5%");
        DynamicSentence azureDevOpsSentence = new DynamicSentence("Improved deployment speed by 10% by adhering to Azure DevOps guidelines, automating deployment processes, and reducing manual interventions");
        DynamicSentence monitoringToolsSentence = new DynamicSentence("Developed and integrated monitoring tools for SQL servers, reducing system downtime by 5%");
        DynamicSentence legacyCodeSentence = new DynamicSentence("Refactored legacy backend code using {programmingLang}, reducing technical debt by 10% and improving code maintainability");
        legacyCodeSentence.setKeyword("programmingLang", programmingLanguages);
        DynamicSentence apiIntegrationSentence = new DynamicSentence("Integrated third-party APIs with {backendFramework} to enhance application functionality");
        apiIntegrationSentence.setKeyword("backendFramework", backendFramework);
        DynamicSentence dataMigrationSentence = new DynamicSentence("Led data migration projects to move legacy data to {database}, improving data accessibility and security");
        dataMigrationSentence.setKeyword("database", database);
        DynamicSentence serverlessArchitectureSentence = new DynamicSentence("Designed serverless architecture using AWS Lambda and {tools}, reducing infrastructure costs by 20%");
        serverlessArchitectureSentence.setKeyword("tools", tools);
        DynamicSentence versionControlSentence = new DynamicSentence("Maintained code quality and version control using {versionControl}, resulting in 25% fewer merge conflicts");
        versionControlSentence.setKeyword("versionControl", versionControl);
        DynamicSentence projectManagementSentence = new DynamicSentence("Coordinated project tasks using {projectManagement}, ensuring timely completion of milestones");
        projectManagementSentence.setKeyword("projectManagement", projectManagement);
        DynamicSentence ciCdImplementationSentence = new DynamicSentence("Implemented CI/CD pipelines using {tools}, reducing deployment time by 30%");
        ciCdImplementationSentence.setKeyword("tools", tools);
        DynamicSentence containerizationSentence = new DynamicSentence("Containerized applications using Docker, improving deployment consistency and scalability");

        expRicohUSA.addDetail(postmanSentence);
        expRicohUSA.addDetail(azureDevOpsSentence);
        expRicohUSA.addDetail(monitoringToolsSentence);
        expRicohUSA.addDetail(legacyCodeSentence);
        expRicohUSA.addDetail(apiIntegrationSentence);
        expRicohUSA.addDetail(dataMigrationSentence);
        expRicohUSA.addDetail(serverlessArchitectureSentence);
        expRicohUSA.addDetail(versionControlSentence);
        expRicohUSA.addDetail(projectManagementSentence);
        expRicohUSA.addDetail(ciCdImplementationSentence);
        expRicohUSA.addDetail(containerizationSentence);

        experiences.add(expRicohUSA);

        // Experience at ListIt
        Experience expListIt = new Experience("Software Engineering Intern", "ListIt", "April 2023 - June 2023");

        DynamicSentence todoAppSentence = new DynamicSentence("Developed a todo list web app, increasing user productivity by 20% using {frontendFramework}");
        todoAppSentence.setIsDescription(true);
        todoAppSentence.setKeyword("frontendFramework", frontendFramework);
        expListIt.addDetail(todoAppSentence);

        DynamicSentence jestSentence = new DynamicSentence("Achieved 100% test coverage across 57 {programmingLang} functions using JEST");
        jestSentence.setKeyword("programmingLang", programmingLanguages);
        DynamicSentence ciSentence = new DynamicSentence("Reduced merge errors by 50% by implementing CI, ESLint, and Prettier");
        DynamicSentence backendFrameworkSentence = new DynamicSentence("Integrated {backendFramework} for server-side logic, enhancing data processing efficiency by 25%");
        backendFrameworkSentence.setKeyword("backendFramework", backendFramework);
        DynamicSentence oauthSentence = new DynamicSentence("Enhanced application security by implementing OAuth authentication");
        DynamicSentence responsiveDesignSentence = new DynamicSentence("Implemented responsive design principles using {frontendFramework}, ensuring the app works seamlessly across devices and screen sizes");
        responsiveDesignSentence.setKeyword("frontendFramework", frontendFramework);
        DynamicSentence performanceOptimizationSentence = new DynamicSentence("Optimized front-end performance, reducing load times by 30% using {frontendFramework}");
        performanceOptimizationSentence.setKeyword("frontendFramework", frontendFramework);
        DynamicSentence userFeedbackSentence = new DynamicSentence("Incorporated user feedback into design iterations using {projectManagement}, improving user satisfaction by 25%");
        userFeedbackSentence.setKeyword("projectManagement", projectManagement);
        DynamicSentence agileMethodologySentence = new DynamicSentence("Applied Agile methodologies using {tools}, completing all project sprints on time and within budget");
        agileMethodologySentence.setKeyword("tools", tools);
        DynamicSentence databaseIntegrationSentence = new DynamicSentence("Integrated {database} for storing user data, enhancing data management and accessibility");
        databaseIntegrationSentence.setKeyword("database", database);

        expListIt.addDetail(jestSentence);
        expListIt.addDetail(ciSentence);
        expListIt.addDetail(backendFrameworkSentence);
        expListIt.addDetail(oauthSentence);
        expListIt.addDetail(responsiveDesignSentence);
        expListIt.addDetail(performanceOptimizationSentence);
        expListIt.addDetail(userFeedbackSentence);
        expListIt.addDetail(agileMethodologySentence);
        expListIt.addDetail(databaseIntegrationSentence);

        experiences.add(expListIt);

        // Experience at Tribot
        Experience expTribot = new Experience("Software Engineer Intern", "Tribot", "March 2020 - August 2022");

        DynamicSentence mmorpgAutomationSentence = new DynamicSentence("Automated character progression and resource collection in an MMORPG game using {programmingLang}, enhancing user experience by 40%");
        mmorpgAutomationSentence.setIsDescription(true);
        mmorpgAutomationSentence.setKeyword("programmingLang", programmingLanguages);
        expTribot.addDetail(mmorpgAutomationSentence);

        DynamicSentence attractUsersSentence = new DynamicSentence("Attracted 250 users by releasing 4 free software automation products");
        DynamicSentence improveEfficiencySentence = new DynamicSentence("Improved resource efficiency and organization by rewriting code on free products, exploring new tools like {frontendFramework}, {database}, and {tools}");
        improveEfficiencySentence.setKeyword("frontendFramework", frontendFramework);
        improveEfficiencySentence.setKeyword("database", database);
        improveEfficiencySentence.setKeyword("tools", tools);
        DynamicSentence optimizeScriptsSentence = new DynamicSentence("Increased task automation speed by 50% by optimizing {programmingLang} scripts");
        optimizeScriptsSentence.setKeyword("programmingLang", programmingLanguages);
        DynamicSentence enhanceSatisfactionSentence = new DynamicSentence("Enhanced user satisfaction by 30% through regular updates and bug fixes");
        DynamicSentence aiModelsSentence = new DynamicSentence("Implemented {aiMl} models to predict in-game economy trends, increasing profitability by 25%");
        aiModelsSentence.setKeyword("aiMl", aiMl);
        DynamicSentence customScriptsSentence = new DynamicSentence("Utilized {programmingLang} to develop custom automation scripts, reducing manual effort by 60%");
        customScriptsSentence.setKeyword("programmingLang", programmingLanguages);
        DynamicSentence monitoringToolsSentenceTribot = new DynamicSentence("Leveraged {tools} for continuous monitoring and debugging of automation scripts");
        monitoringToolsSentenceTribot.setKeyword("tools", tools);
        DynamicSentence manageUserDataSentence = new DynamicSentence("Deployed {database} to store and manage user data efficiently");
        manageUserDataSentence.setKeyword("database", database);
        DynamicSentence taskManagementSentence = new DynamicSentence("Managed and tracked development tasks using {projectManagement}, ensuring timely completion of project milestones");
        taskManagementSentence.setKeyword("projectManagement", projectManagement);
        DynamicSentence codeQualitySentence = new DynamicSentence("Maintained high code quality by implementing code reviews and using {versionControl} for version control");
        codeQualitySentence.setKeyword("versionControl", versionControl);
        DynamicSentence gameMechanicsSentence = new DynamicSentence("Analyzed game mechanics and developed strategies to optimize resource collection, increasing efficiency by 35%");

        expTribot.addDetail(attractUsersSentence);
        expTribot.addDetail(improveEfficiencySentence);
        expTribot.addDetail(optimizeScriptsSentence);
        expTribot.addDetail(enhanceSatisfactionSentence);
        expTribot.addDetail(aiModelsSentence);
        expTribot.addDetail(customScriptsSentence);
        expTribot.addDetail(monitoringToolsSentenceTribot);
        expTribot.addDetail(manageUserDataSentence);
        expTribot.addDetail(taskManagementSentence);
        expTribot.addDetail(codeQualitySentence);
        expTribot.addDetail(gameMechanicsSentence);

        experiences.add(expTribot);

        return experiences;
    }
}

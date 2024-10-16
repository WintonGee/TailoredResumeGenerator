# Tailored Resume Generator

A Java-based resume generator that dynamically creates high-quality PDF resumes tailored to job descriptions, ensuring consistent formatting across sections like header, education, experience, and projects.

## Features
- **Automated PDF Generation**: Dynamically produces tailored resumes in PDF format using LaTeX.
- **Customization**: Parses JSON input from job descriptions to adjust resume content.
- **User-Friendly Interface**: Simplifies data input and formatting management.
- **Cloud-Ready**: Scalable infrastructure using AWS Lambda for real-time resume generation.

## Technologies Used
- Java
- Maven
- LaTeX
- Gson (for JSON parsing)
- PDFBox (for PDF generation)
- Spring Boot (for API development)
- AWS Lambda (for automation)

## Installation

1. Clone the repository:
    ```bash
    git clone https://github.com/yourusername/TailoredResumeGenerator.git
    ```
2. Navigate to the project directory:
    ```bash
    cd TailoredResumeGenerator
    ```
3. Build the project using Maven:
    ```bash
    mvn clean install
    ```

## Usage

1. Run the application:
    ```bash
    java -jar target/TailoredResumeGenerator.jar
    ```
2. Input job descriptions via JSON to dynamically generate tailored resumes.

## Contributing

Contributions are welcome! Please fork the repository and submit a pull request.

## License

This project is licensed under the MIT License - see the [LICENSE](LICENSE) file for details.

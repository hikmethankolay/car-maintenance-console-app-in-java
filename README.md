# Car Maintenance Console Application in Java

This is a console-based Java application for managing car maintenance tasks. It allows users to track service history, schedule maintenance, log expenses, and monitor fuel efficiency. The project is structured as a Maven project for easier dependency management and build automation.

---

## Functionalities

### Menu Options
- **View, Register, Update, or Delete Records**: Users can manage crop and livestock records separately for better organization.
- **User Authentication**: Ensures only authorized users can access or modify records.

### Car Management System Features:
1. **Service History Tracking**:
   - Vehicle Model
   - Service Kilometers
   - Service Provider
   - Service Cost
2. **Maintenance Reminders**:
   - Vehicle Model
   - Service Kilometers
   - Service Type
3. **Expense Logging**:
   - Vehicle Model
   - Expense Type
   - Expense Date
   - Cost
4. **Fuel Efficiency Reports**:
   - Vehicle Model
   - Fuel Consumption (L/100KM)

---

## Platforms

- ![Ubuntu badge](assets/badge-ubuntu.svg)

- ![macOS badge](assets/badge-macos.svg)

- ![Windows badge](assets/badge-windows.svg)

## Test Coverage

[![Release](https://github.com/ucoruh/eclipse-java-maven-template/actions/workflows/release.yml/badge.svg)](https://github.com/ucoruh/eclipse-java-maven-template/actions/workflows/release.yml)

**Coverage**

- ![All](assets/badge_combined.svg)

**Branch Coverage**

- ![Branch Coverage](assets/badge_branchcoverage.svg)

**Line Coverage**

- ![Line Coverage](assets/badge_linecoverage.svg)

**Method Coverage**

- ![Method Coverage](assets/badge_methodcoverage.svg)

---

## Testing and Validation

- **Unit Testing**: Comprehensive testing using JUnit 4 with 100% test coverage and success rate.
- **Validation**: Ensures all functionalities operate as expected, even with large datasets.

---

## Installation and Setup

1. **Clone the Repository**:
   ```bash
   git clone https://github.com/hikmethankolay/car-maintenance-console-app-in-java.git
   cd car-maintenance-console-app-in-java
   ```

2. **Run Setup Scripts**:
   The following `.bat` files are provided to streamline the setup process:
   - **`2-create-git-ignore.bat`**: Sets up `.gitignore` for the project.
   - **`3-install-package-manager.bat`**: Installs required package managers like Chocolatey and Scoop.
   - **`4-install-astyle.bat`**: Installs AStyle for automatic code formatting.
   - **`4-install-coverxygen.bat`**: Installs Coverxygen for parsing Doxygen XML files.
   - **`4-install-lcov.bat`**: Installs LCOV for generating coverage reports.
   - **`5-format-code.bat`**: Formats the codebase using AStyle.
   - **`6_install_mkdocs_required_apps.bat`**: Sets up MkDocs and related tools for documentation.
   - **`7-build-app.bat`**: Builds the Maven project and creates a JAR file.
   - **`8-run-app.bat`**: Runs the application after a successful build.
   - **`9-run-webpage.bat`**: Launches a local webpage to view the project documentation.

3. **Build the Project**:
   Execute the `7-build-app.bat` script:
   ```bash
   7-build-app.bat
   ```

4. **Run the Application**:
   Use the `8-run-app.bat` file to execute the application:
   ```bash
   8-run-app.bat
   ```

5. **Run Tests**:
   Execute tests using:
   ```bash
   test.bat
   ```

6. **View Documentation**:
   Launch the project webpage with `9-run-webpage.bat`:
   ```bash
   9-run-webpage.bat
   ```

---

## Test Coverage and Reports

- **Code Coverage**:
  - Use `lcov` to generate coverage reports.
  - Example command:
    ```bash
    lcov --capture --directory . --output-file coverage.info
    genhtml coverage.info --output-directory coverage-report
    ```
- **HTML Coverage Reports**:
  - Generated using `ReportGenerator`:
    ```bash
    reportgenerator "-reports:target/site/jacoco/jacoco.xml" "-sourcedirs:src/main/java" "-targetdir:coveragereport" -reporttypes:Html
    ```
- **Documentation Coverage**:
  - Generated using `coverxygen` and `lcov`.

---

## Required Tools and Dependencies

- **Eclipse**: [Download Eclipse](https://www.eclipse.org/downloads/)
- **Maven**: [Download Apache Maven](https://maven.apache.org/download.cgi)
- **JDK**: Ensure Java Development Kit is installed.
- **LCOV**: Used for generating code coverage reports.
- **Coverxygen**: For documentation coverage.
- **MkDocs**: For generating project documentation.

---

## License

This project is licensed under the [AGPL-3.0 License](LICENSE).

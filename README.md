# Defect Tracker

A simple **Defect Tracker** application to manage software defects, their statuses, priorities, and assignments to developers. This application allows you to create defects, track their progress through different statuses (e.g., "Open", "In Progress", "Resolved"), and assign developers to resolve them.

---

## Table of Contents
1. [Overview](#overview)
2. [Features](#features)
3. [Installation Instructions](#installation-instructions)
4. [Running the Application](#running-the-application)
5. [Test Cases](#test-cases)
6. [Technologies Used](#technologies-used)
7. [License](#license)

---

## Overview

The **Defect Tracker** is designed to help development teams manage bugs and defects that arise during the development process. This tool allows users to:

- **Create new defects** with detailed descriptions and assigned priorities.
- **Update defect statuses** (e.g., from "Open" to "Resolved").
- **Assign defects to developers** for resolution.
- Track the **time of resolution** when a defect is marked as "Resolved".

The application is implemented using **Java**, **JavaFX**, and **JUnit** for unit testing.

---

## Features

- **Defect Creation**: Create defects with an ID, description, priority, and assigned developer.
- **Status Management**: Set the status of defects (e.g., "Open", "In Progress", "Resolved"). Automatically records the **resolved date** when the status is changed to "Resolved".
- **Developer Assignment**: Assign developers to resolve specific defects.
- **Date Tracking**: Tracks the **created date** and **resolved date** for defects.
- **Unit Testing**: JUnit test cases for validating the functionality of the `Defect` class and its methods (e.g., status updates, assignment).

---

## Installation Instructions

To run the **Defect Tracker**, follow these steps:

1. **Clone the repository**:
    ```bash
    git clone https://github.com/yourusername/defect-tracker.git
    ```

2. **Install Java**:
    Make sure you have **Java 11** or later installed. You can download it from the [Oracle website](https://www.oracle.com/java/technologies/javase-jdk11-downloads.html) or use OpenJDK.

3. **Install JavaFX**:
    Download the **JavaFX SDK** from the [official website](https://openjfx.io/), and follow the instructions for setting it up in your IDE.

4. **Set Up Your IDE** (e.g., IntelliJ IDEA):
    - Open the project in IntelliJ IDEA or your preferred Java IDE.
    - Make sure to configure the **JavaFX SDK** as a global library and link it to your project.
    - Ensure you have **JUnit 5** set up to run the tests.

5. **Maven Configuration**:
    If you are using **Maven**, ensure the necessary dependencies (for **JavaFX**, **JUnit**, etc.) are in the `pom.xml`.

---

## Running the Application

1. **Running from IntelliJ IDEA**:
   - Open the project in IntelliJ IDEA.
   - Make sure your **JavaFX SDK** and **JUnit** dependencies are set up.
   - Run the `DefectTracker` class (the main class).

2. **Command Line**:
   - Navigate to the project directory.
   - Use **Maven** or **Gradle** to build and run the application.

---

## Test Cases

The `Defect` class is thoroughly tested using **JUnit**. Below are some of the test cases implemented to verify its functionality:

### **Test Case 1: Defect Constructor**
- **Objective**: Verify that a defect is created with the correct attributes and default status is "Open".

### **Test Case 2: Setter and Getter Methods**
- **Objective**: Verify that the setter methods (`setStatus()`, `setAssignedTo()`) correctly update the defect's attributes.

### **Test Case 3: `setStatus()` for "Resolved"**
- **Objective**: Verify that when the `status` is set to "Resolved", the `resolvedDate` is automatically set to the current time.

### **Test Case 4: `setStatus()` for Non-"Resolved"**
- **Objective**: Verify that the `resolvedDate` remains `null` when the `status` is set to a non-"Resolved" value.

### **Test Case 5: `setAssignedTo()` Method**
- **Objective**: Verify that the `assignedTo` attribute can be updated correctly.

---

## Technologies Used

- **Java**: The programming language used for implementation.
- **JavaFX**: For building the graphical user interface (GUI).
- **JUnit**: For unit testing and validating the functionality of the `Defect` class and the **Defect Tracker** system.
- **Maven**: For project dependency management.

---

## License

This project is licensed under the **MIT License** - see the [LICENSE](LICENSE) file for details.

---

### **Contributions**:
Feel free to submit pull requests or open issues if you encounter bugs or have suggestions for improvements!

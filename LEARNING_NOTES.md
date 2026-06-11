# LEARNING_NOTES.md

# Learning Notes

---

# Day 1

## Git & GitHub

### Learned

* Importance of version control in software development.
* Creating and managing GitHub repositories.
* Initializing a local Git repository.
* Connecting local repository to remote GitHub repository.
* Basic Git workflow.

### Commands Used

```bash
git init
git add .
git commit -m "message"
git remote add origin <url>
git push -u origin main
```

### Interview Questions

Q. What is Git?

A. Git is a distributed version control system used to track changes in source code.

Q. What is GitHub?

A. GitHub is a cloud-based platform used for hosting Git repositories.

Q. Difference between Git and GitHub?

A. Git is a version control tool while GitHub is a hosting platform for Git repositories.

---

## Project Planning

### Learned

* Importance of designing before coding.
* Breaking a large project into smaller milestones.
* Documentation-driven development.
* Creating project roadmap and architecture.

### Outcome

Created the complete roadmap for the Emergency Response Dispatch System.

---

# Day 2

## Spring Boot Fundamentals

### Learned

@SpringBootApplication

* Main entry point of Spring Boot application.
* Combines configuration, component scanning, and auto configuration.

Embedded Tomcat

* Built-in web server.
* Eliminates need for external deployment server.

application.properties

* Centralized configuration file.
* Used for database and application settings.

Spring Data JPA

* Simplifies database operations.
* Reduces boilerplate SQL code.

Hibernate

* ORM framework used by JPA.
* Converts Java objects into database records.

### Maven

### Learned

Maven

* Build automation and dependency management tool.

Maven Wrapper

* Allows project-specific Maven execution.
* Removes dependency on system Maven installation.

pom.xml

* Central dependency and build configuration file.

### Database Integration

### Learned

* MySQL database configuration.
* JDBC connection setup.
* Hibernate automatic schema generation.
* Spring Boot database connectivity.

### Interview Questions

Q. What is Spring Boot?

A. Spring Boot is a framework used to rapidly develop production-ready Java applications.

Q. What is JPA?

A. Java Persistence API used for object-relational mapping.

Q. What is Hibernate?

A. Hibernate is the most popular implementation of JPA.

Q. Why use Maven?

A. Maven manages project dependencies and automates build processes.

### Outcome

Successfully connected Spring Boot application with MySQL database.

---

# Day 3

## Layered Architecture

    Controller
        ↓
    Service
        ↓
    Repository
        ↓
    Database

### Learned

Controller

* Handles incoming HTTP requests.
* Returns responses to clients.

Service

* Contains business logic.
* Acts as bridge between controller and repository.

Repository

* Handles database operations.
* Uses Spring Data JPA.

Entity

* Represents database table.
* Maps Java class to relational table.

Dependency Injection

* Spring automatically provides required objects.

REST API

* Standard communication mechanism between frontend and backend.

### Spring Data JPA

JpaRepository

* Provides CRUD operations automatically.

findAll()

* Retrieves all records.

findById()

* Retrieves specific record.

save()

* Inserts or updates record.

orElseThrow()

* Throws exception when resource is not found.

### Interview Questions

Q. Why use Service Layer?

A. To separate business logic from controller logic.

Q. What is Dependency Injection?

A. A design pattern where Spring automatically injects required objects.

Q. Why use JpaRepository?

A. It reduces boilerplate code and provides built-in CRUD operations.

Q. What is an Entity?

A. A Java class mapped to a database table using JPA annotations.

### Outcome

Built the complete Emergency Request module with CRUD APIs.

---

# Day 4

## DTO Pattern

### Learned

DTO (Data Transfer Object)

* Used to transfer data between layers.
* Prevents direct exposure of entities.
* Improves security and maintainability.

### Validation

@NotBlank

* Ensures field is not empty.

@NotNull

* Ensures field is not null.

@Min

* Defines minimum allowed value.

@Max

* Defines maximum allowed value.

@Valid

* Automatically validates incoming request data.

### Exception Handling

Custom Exception

* ResourceNotFoundException created for missing records.

Global Exception Handler

* Centralized error handling mechanism.

@RestControllerAdvice

* Handles exceptions globally.

### Professional API Design

ApiResponse

* Standardized response format.
* Provides consistency across APIs.

Validation Error Handling

* Returns field-specific validation errors.

### Interview Questions

Q. Why use DTO instead of Entity?

A. DTO prevents exposing internal database structure and improves security.

Q. What is @Valid?

A. It triggers automatic validation of incoming request data.

Q. What is Global Exception Handling?

A. A centralized mechanism for handling exceptions across the application.

Q. Why use Response Wrappers?

A. To maintain consistent API response structure.

Q. What is Separation of Concerns?

A. Dividing application responsibilities into independent layers.

### Outcome

Converted the application into a production-style backend architecture with validation, DTOs, and exception handling.

# Day 5 Learning Notes

## Hospital Management Module

### Hospital Entity

Purpose:
Represents hospitals available in the emergency response network.

Key Fields:

* hospitalName
* address
* latitude
* longitude
* availableBeds
* contactNumber
* createdAt

### DTO Pattern

HospitalDTO was introduced to separate API input from database entities.

Benefits:

* Better security
* Input validation
* Clean architecture
* Easier maintenance

### Service Layer Responsibilities

The Service Layer:

* Handles business logic
* Converts DTOs into Entities
* Communicates with Repository Layer
* Keeps Controllers lightweight

### Controller Layer

Responsibilities:

* Accept HTTP requests
* Validate input data
* Call Service Layer
* Return responses

### Validation

Annotations Used:

@NotBlank

* Ensures text fields are not empty

@NotNull

* Ensures required values are provided

@Min

* Ensures numerical values stay within acceptable limits

### Professional API Design

ApiResponse Wrapper:

Benefits:

* Consistent responses
* Better frontend integration
* Easier debugging

Example Structure:

{
"success": true,
"message": "Hospital created successfully",
"data": { ... }
}

### Spring Boot Concepts Learned

@RestController

* Exposes REST endpoints

@RequestMapping

* Defines base API path

@PostMapping

* Handles POST requests

@GetMapping

* Handles GET requests

@Valid

* Triggers DTO validation automatically

### Interview Questions

Q. Why use DTOs instead of Entities directly?
A. DTOs protect internal data structures and provide validation.

Q. What is the role of Service Layer?
A. It contains business logic and coordinates data flow between Controller and Repository.

Q. Why use ApiResponse?
A. To standardize API responses and improve maintainability.

Q. What is the purpose of validation?
A. To prevent invalid data from entering the application.

## Architecture Understanding

Request Flow:

                               Client
                                  ↓
                              Controller
                                  ↓
                            DTO Validation
                                  ↓
                               Service
                                  ↓
                              Repository
                                  ↓
                               Database

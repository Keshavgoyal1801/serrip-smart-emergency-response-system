# Learning Notes

## Day 1

### Git

Learned:
-

Questions:
-

### Project Setup

Learned:
-

Questions:
-

# LEARNING_NOTES.md

# Learning Notes

## Day 2

### Spring Boot Concepts

@SpringBootApplication

* Main entry point of Spring Boot application

Embedded Tomcat

* Built-in web server running on port 8080

application.properties

* Central configuration file

Spring Data JPA

* Simplifies database operations

Hibernate

* ORM implementation used by JPA

### Maven

Maven

* Build and dependency management tool

Maven Wrapper

* Project-specific Maven executable

### Git Concepts

git add

* Stage files

git commit

* Create snapshot

git push

* Upload changes to GitHub

git status

* Check repository state

### Interview Questions

Q. What is Spring Boot?
A. Framework used to rapidly build production-ready Java applications.

Q. What is JPA?
A. Java Persistence API used for ORM.

Q. What is Hibernate?
A. Popular implementation of JPA.

---

## Day 3

### Layered Architecture

Controller
↓
Service
↓
Repository
↓
Database

### Concepts Learned

Entity

* Represents database table

Repository

* Handles database operations

Service

* Contains business logic

Controller

* Handles HTTP requests

Dependency Injection

* Spring automatically injects required objects

REST API

* Communication layer between frontend and backend

### Spring Data JPA

JpaRepository

* Provides CRUD operations automatically

findById()

* Returns Optional

orElseThrow()

* Throws exception when record not found

### Interview Questions

Q. Why use Service Layer?
A. Separates business logic from controller.

Q. What is Dependency Injection?
A. Spring automatically provides required objects.

Q. Why use JpaRepository?
A. Reduces boilerplate code and provides built-in CRUD operations.

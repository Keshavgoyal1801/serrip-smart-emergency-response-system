# DAILY_PROGRESS.md

# Daily Progress Log

## Day 2 - Backend Infrastructure Setup

Date: 2026-06-07

### Completed Tasks

* Created Spring Boot backend project
* Selected Java 21 and Spring Boot 3.5.14
* Added required dependencies:

    * Spring Web
    * Spring Data JPA
    * MySQL Driver
    * Lombok
    * Validation
    * DevTools
* Configured Git and GitHub integration
* Learned Git workflow:

    * git add
    * git commit
    * git push
    * git status
* Connected Spring Boot with MySQL
* Created database: serrip_db
* Fixed datasource configuration issues
* Successfully started application on port 8080
* Created backend package structure

### Challenges Faced

* Maven command not recognized
* Git identity configuration issue
* Spring Boot datasource error
* IntelliJ indexing slowdown

### Solutions

* Used Maven Wrapper
* Configured Git username and email
* Added datasource properties
* Verified MySQL configuration

### Outcome

Backend environment successfully configured and operational.

---

## Day 3 - First API Development

Date: 2026-06-08

### Completed Tasks

* Created EmergencyRequest entity
* Generated emergency_requests table
* Created EmergencyRequestRepository
* Created EmergencyRequestService
* Created EmergencyRequestController
* Implemented REST APIs:

    * POST /api/emergencies
    * GET /api/emergencies
    * GET /api/emergencies/{id}
* Added exception handling using orElseThrow()
* Tested APIs successfully using Postman
* Verified data persistence in MySQL

### Key Achievement

Completed first end-to-end backend feature from database to API testing.

### Next Goals

* Validation Layer
* DTO Layer
* Global Exception Handling
* Hospital Entity
* Ambulance Entity

### Project Status

Backend Foundation Complete ✅

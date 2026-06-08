# ARCHITECTURE.md

# SERRIP Architecture

Current Architecture

Client (Postman)
|
v
EmergencyRequestController
|
v
EmergencyRequestService
|
v
EmergencyRequestRepository
|
v
MySQL Database

Technology Stack

Backend:
- Java 21
- Spring Boot 3.5.14
- Spring Data JPA
- Hibernate

Database:
- MySQL

Tools:
- IntelliJ IDEA
- Postman
- Git
- GitHub

Future Architecture

React Frontend
|
v
REST APIs
|
v
Dispatch Engine
|
+--> Dijkstra Route Engine
|
+--> Priority Queue Engine
|
+--> Ambulance Allocation Engine
|
+--> Hospital Selection Engine
|
v
MySQL Database
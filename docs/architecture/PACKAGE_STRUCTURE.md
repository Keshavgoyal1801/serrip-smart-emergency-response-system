# Package Structure

This document explains the backend package organization of the SERRIP (Smart Emergency Response & Resource Intelligence Platform) project.

---

# Backend Package Structure

```
backend
└── src
    └── main
        ├── java
        │   └── com.serrip.backend
        │       ├── controller
        │       ├── dto
        │       ├── entity
        │       ├── exception
        │       ├── repository
        │       ├── response
        │       ├── routing
        │       ├── security
        │       ├── service
        │       ├── util
        │       └── BackendApplication.java
        │
        └── resources
            ├── application.properties
            └── ...
```

---

# Package Responsibilities

## controller

Handles all incoming HTTP requests and returns API responses.

### Responsibilities

- REST API Endpoints
- Request Mapping
- Request Validation
- Response Handling

Examples

- AuthController
- EmergencyController
- HospitalController
- AmbulanceController
- DispatchController
- RouteController

---

## service

Contains the complete business logic of the application.

### Responsibilities

- Business Rules
- Data Processing
- Authentication Logic
- Dispatch Logic
- Routing Logic

Examples

- AuthenticationService
- EmergencyService
- HospitalService
- AmbulanceService
- DispatchService
- RouteService

---

## repository

Provides database access using Spring Data JPA.

### Responsibilities

- CRUD Operations
- Database Queries
- Entity Persistence

Examples

- UserRepository
- EmergencyRepository
- HospitalRepository
- AmbulanceRepository
- DispatchRecordRepository

---

## entity

Represents database tables.

### Responsibilities

- JPA Entity Mapping
- Table Definition
- Column Mapping

Examples

- User
- EmergencyRequest
- Hospital
- Ambulance
- DispatchRecord

---

## dto

Contains Data Transfer Objects used for API communication.

### Responsibilities

- Request Models
- Response Models
- Input Validation
- Data Abstraction

Examples

- RegisterRequest
- LoginRequest
- LoginResponse
- LogoutResponse

---

## security

Implements authentication and authorization.

### Responsibilities

- Spring Security Configuration
- JWT Authentication
- Password Encryption
- User Authentication
- Exception Handling

Examples

- SecurityConfig
- JwtService
- JwtAuthenticationFilter
- CustomUserDetailsService
- JwtAuthenticationEntryPoint
- JwtAccessDeniedHandler

---

## routing

Contains graph-based routing implementation.

### Responsibilities

- Road Network
- Graph Representation
- Dijkstra Algorithm
- Traffic Simulation
- Route Optimization

Examples

- RoadGraph
- GraphNode
- GraphEdge
- RouteResult

---

## exception

Handles application-wide exceptions.

### Responsibilities

- Global Exception Handling
- Custom Exceptions
- Standard Error Responses

Examples

- GlobalExceptionHandler

---

## response

Provides a common API response format.

### Responsibilities

- Standard Success Response
- Standard Error Response
- Response Consistency

Examples

- ApiResponse

---

## util

Contains reusable helper classes.

### Responsibilities

- Utility Methods
- Helper Functions
- Common Constants

---

## resources

Stores application configuration files.

### Responsibilities

- Application Configuration
- Database Configuration
- JWT Configuration
- Server Configuration

Examples

- application.properties

---

# Architecture Flow

```
Client

    │

    ▼

Controller

    │

    ▼

Service

    │

    ▼

Repository

    │

    ▼

Database
```

---

# Design Principles

The project follows a layered architecture to ensure:

- Separation of Concerns
- High Maintainability
- Low Coupling
- High Cohesion
- Easy Testing
- Better Scalability

---

# Technologies Used

- Java
- Spring Boot
- Spring Security
- Spring Data JPA
- JWT
- MySQL
- Maven

---

# Best Practices Followed

- Layered Architecture
- DTO Pattern
- Repository Pattern
- Dependency Injection
- Global Exception Handling
- JWT-Based Authentication
- Role-Based Authorization
- RESTful API Design
- Standardized API Responses

---

# Current Status

| Package | Status |
|----------|--------|
| controller | Complete |
| service | Complete |
| repository | Complete |
| entity | Complete |
| dto | Complete |
| security | Complete |
| routing | Complete |
| exception | Complete |
| response | Complete |
| util | Complete |

---

# Notes

- Each package has a single responsibility.
- Business logic is isolated from API endpoints.
- Database operations are handled through repositories.
- Security is centralized within the security package.
- The routing package contains all graph-related implementations.
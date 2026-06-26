# DAILY PROGRESS

## Day 1

### Objectives

* Initialize project
* Create project roadmap
* Setup GitHub repository

### Completed

* Created repository
* Added documentation structure
* Defined project architecture
* Created master development plan

### Status

Project planning completed.

---

## Day 2

### Objectives

* Setup backend project
* Configure database connectivity

### Completed

* Created Spring Boot application
* Configured Maven
* Connected MySQL database
* Verified application startup

### Status

Backend infrastructure completed.

---

## Day 3

### Objectives

* Implement Emergency Request module

### Completed

* EmergencyRequest entity created
* Repository implemented
* Service implemented
* Controller implemented
* CRUD APIs developed
* APIs tested in Postman

### Status

Emergency Request module operational.

---

## Day 4

### Objectives

* Improve API architecture
* Add validation and exception handling

### Completed

* DTO implementation
* Request validation
* Exception handling
* Global exception handler
* Professional API responses
* Postman validation testing

### Status

Production-style API architecture established.

---

## Day 5

### Objectives

* Develop Hospital Management Module
* Implement hospital-related APIs

### Completed

* Hospital Entity
* Hospital DTO
* Hospital Repository
* Hospital Service
* Hospital Controller
* Hospital API validation
* Professional API responses
* Postman API testing

### Status

Hospital Management Module completed and integrated successfully.

---

## Day 6

### Objectives

* Develop Ambulance Management Module
* Implement ambulance-related APIs

### Completed

* Ambulance Entity
* Ambulance DTO
* Ambulance Repository
* Ambulance Service
* Ambulance Controller
* Ambulance API validation
* Professional API responses
* Ambulance status tracking
* Postman API testing

### Status

Ambulance Management Module completed and integrated successfully.

---

## Day 7

### Objectives

* Build Dispatch Engine
* Implement Resource Allocation
* Automate Ambulance Assignment

### Completed

* DispatchRecord Entity
* DispatchRecord Repository
* Dispatch Service
* Dispatch Controller
* Manual Dispatch API
* Ambulance Availability Validation
* Auto Dispatch API
* Dispatch History Storage
* Resource Allocation Engine V1
* Custom Query Method Implementation
* Postman Testing

### Status

First intelligent dispatch engine completed successfully with automatic ambulance assignment and resource allocation.

---

## Day 8

### Objectives

* Implement intelligent ambulance selection
* Develop automatic dispatch functionality
* Introduce distance-based resource allocation

### Completed

* Added nearest ambulance search logic
* Implemented distance calculation algorithm
* Added auto-dispatch API
* Filtered ambulances by AVAILABLE status
* Automatic ambulance assignment
* Automatic status update to ON_ROUTE
* Dispatch record generation
* Postman testing and verification

### Status

Smart Auto-Dispatch Engine completed successfully. System now automatically selects and dispatches the nearest available ambulance.

---

## Day 9

### Objectives

* Build Routing Intelligence Foundation
* Design Road Network Model
* Implement Graph Data Structure
* Implement Adjacency List Representation
* Create Routing APIs
* Prepare system for Dijkstra Algorithm

### Completed

* GraphNode model created
* GraphEdge model created
* RoadGraph implementation completed
* RouteNetworkService implemented
* GraphController developed
* RouteController developed
* GraphTestService implemented
* Road Network Model completed
* Weighted Graph structure completed
* Adjacency List implementation completed
* Sample route network created
* Route APIs tested successfully
* Graph APIs tested successfully
* Maven build verification completed
* Spring Boot application verified
* Routing foundation integrated with backend

### Status

Routing Intelligence Foundation completed successfully.

The system can now model road networks using weighted graphs and adjacency lists. Backend architecture is fully prepared for shortest-path computation using Dijkstra's Algorithm.

---

## Day 10

### Objectives

* Build road network model
* Implement graph data structure
* Implement Dijkstra shortest path algorithm
* Expose routing APIs

### Completed

* GraphNode implementation
* GraphEdge implementation
* RoadGraph implementation
* RouteNetworkService
* Adjacency List Design
* Priority Queue implementation
* Dijkstra Algorithm
* Distance Relaxation Logic
* Previous Node Tracking
* Path Reconstruction
* RouteResult DTO
* Graph API
* Shortest Route API
* Invalid Route Handling
* Postman Testing (5/5 Passed)

### Status

Routing Intelligence Engine V1 completed successfully.
System can now calculate shortest ambulance routes using Dijkstra's Algorithm.

---

## Day 11

### Objectives

* Implement Routing Intelligence
* Develop Dijkstra Algorithm
* Add Dynamic Road Blocking
* Simulate Traffic Conditions
* Build Traffic-Aware Route Optimization

### Completed

* GraphNode Model
* GraphEdge Model
* RoadGraph Implementation
* Route Network Service
* Route Controller
* Dijkstra Algorithm
* Priority Queue Integration
* Shortest Path Engine
* Route Reconstruction Logic
* Road Blocking API
* Road Unblocking API
* Traffic Delay API
* Traffic Delay Clearing API
* Traffic-Aware Routing Logic
* Postman Testing

### Status

Routing Intelligence Engine completed successfully with shortest-path calculation, dynamic road blocking, and traffic-aware route optimization.
---

# Day 12 Progress Report (Security Foundation)

**Date:** __________

---

## Objective

Start implementing the Security module by integrating Spring Security into the Emergency Response Dispatch System.

---

## Completed Tasks

### Security Foundation

- ✅ Added Spring Security dependency
- ✅ Configured Spring Security
- ✅ Disabled CSRF for REST APIs
- ✅ Configured public and protected endpoints
- ✅ Enabled HTTP Basic Authentication
- ✅ Enabled Form Login

### User Management

- ✅ Created User entity
- ✅ Created Role enum
- ✅ Created UserRepository
- ✅ Implemented CustomUserDetailsService
- ✅ Integrated UserRepository with Spring Security

### Authentication Infrastructure

- ✅ Configured AuthenticationManager
- ✅ Configured BCryptPasswordEncoder
- ✅ Registered security beans
- ✅ Created Authentication Test Controller

### Testing

- ✅ Project builds successfully
- ✅ Application starts successfully
- ✅ Public endpoint testing completed
- ✅ Protected endpoint testing completed
- ✅ Spring Security configuration verified

---

## Files Created

- User.java
- Role.java
- UserRepository.java
- CustomUserDetailsService.java
- SecurityConfig.java
- AuthController.java

---

## Concepts Learned

- Spring Security Architecture
- Authentication vs Authorization
- UserDetailsService
- AuthenticationManager
- BCrypt Password Encoding
- SecurityFilterChain
- HTTP Basic Authentication
- Form Login
- Public vs Protected APIs

---

## Challenges Faced

- Fixed Maven command issue (`mvn` vs `.\mvnw.cmd`)
- Understood Spring Security default login behavior
- Configured endpoint access rules correctly

---

## Build Status

- ✅ Build Successful
- ✅ Application Running
- ✅ Security Configuration Working

---

## GitHub Commits

- Security foundation setup
- User authentication infrastructure

---

## Progress

Completed the Security foundation required before implementing JWT Authentication.

Overall Project Progress: **~78%**

---

# Day 13 — Spring Security Foundation

## Goal

Understand how Spring Security secures a Spring Boot application.

---

## What I Learned

### 1. Spring Security

Spring Security is the standard authentication and authorization framework for Spring Boot.

Responsibilities:

- Authentication
- Authorization
- Password Encryption
- Session Management
- Filter Chain
- Security Context

---

### 2. UserDetailsService

Spring Security never queries the database directly.

Instead it asks:

UserDetailsService

to load the user.

CustomUserDetailsService connects Spring Security with our User table.

---

### 3. AuthenticationManager

AuthenticationManager verifies

Username

Password

using UserDetailsService and PasswordEncoder.

It throws BadCredentialsException if authentication fails.

---

### 4. BCrypt Password Encoder

Passwords should never be stored in plain text.

BCrypt

- hashes passwords
- automatically salts passwords
- prevents rainbow table attacks

Example

password

becomes

$2a$10$xxxxxxxxxxxxxxxx

---

### 5. SecurityFilterChain

Security configuration decides

Which APIs are public

Which APIs require authentication

Current configuration

/api/auth/**

is public

Everything else requires authentication.

---

### 6. Stateless Authentication

Instead of sessions

every request sends a JWT

Server stores nothing

This is ideal for REST APIs.

---

## Important Classes

SecurityConfig

CustomUserDetailsService

AuthenticationManager

PasswordEncoder

UserRepository

Role Enum

User Entity

---

## Interview Questions

What is Spring Security?

Difference between Authentication and Authorization?

Why use BCrypt?

What is UserDetailsService?

What is AuthenticationManager?

Why Stateless APIs?

# Day 14 — JWT Authentication

## Goal

Implement JWT Authentication using Spring Security.

---

## What I Learned

### 1. JSON Web Token (JWT)

JWT allows stateless authentication.

Instead of server sessions

the client stores the token.

Every request sends

Authorization

Bearer <token>

---

### 2. JWT Structure

JWT has three parts

Header

Payload

Signature

Header

contains algorithm

Payload

contains claims

Signature

verifies authenticity

---

### 3. JwtService

Implemented

Generate Token

Extract Username

Validate Token

Check Expiration

Parse Claims

---

### 4. JwtAuthenticationFilter

Every incoming request passes through this filter.

Flow

Request

↓

Authorization Header

↓

Extract JWT

↓

Extract Username

↓

Load User

↓

Validate Token

↓

Create Authentication Object

↓

Store in SecurityContext

↓

Continue Request

---

### 5. SecurityContextHolder

After authentication

Spring stores the authenticated user

inside

SecurityContextHolder

Controllers later access this authenticated user automatically.

---

### 6. OncePerRequestFilter

Runs exactly once

for every HTTP request.

Ideal place for JWT validation.

---

### 7. UsernamePasswordAuthenticationToken

Represents an authenticated user.

Contains

UserDetails

Credentials

Authorities

---

### 8. SecurityContext

Stores current logged-in user.

Without setting SecurityContext

Spring treats request as anonymous.

---

### 9. Protected APIs

Public

/api/auth/**

Protected

/api/emergencies/**

Hospital

Dispatch

Ambulance

etc.

---

### 10. Authorization Header

Format

Authorization

Bearer eyJhbGciOi...

Always starts with

Bearer

followed by a space.

---

### 11. Exception Handling

BadCredentialsException

returns

401 Unauthorized

instead of

400 Bad Request

This is REST best practice.

---

## Authentication Flow

Client

↓

Login

↓

AuthenticationManager

↓

JwtService

↓

JWT Generated

↓

Client Stores Token

↓

Client Sends Token

↓

JwtAuthenticationFilter

↓

Token Validation

↓

SecurityContext

↓

Controller

---

## Important Classes

JwtService

JwtAuthenticationFilter

AuthenticationService

CustomUserDetailsService

SecurityConfig

SecurityContextHolder

UsernamePasswordAuthenticationToken

AuthenticationManager

PasswordEncoder

---

## Common Mistakes

Using plain password

Using sessions with JWT

Not setting SecurityContext

Not checking expiration

Using weak secret key

Forgetting Bearer prefix

---

## Interview Questions

What is JWT?

Difference between JWT and Session Authentication?

What is JwtAuthenticationFilter?

Why OncePerRequestFilter?

What is SecurityContextHolder?

What is UsernamePasswordAuthenticationToken?

Why BCrypt?

Difference between Authentication and Authorization?

How is JWT validated?

Why Stateless Authentication?

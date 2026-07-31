<div align="center">

# 🚑 SERRIP

### Smart Emergency Response & Resource Intelligence Platform

*A full-stack emergency response system powered by Spring Boot, JWT Authentication, and Graph-Based Route Optimization.*

<br>

![Java](https://img.shields.io/badge/Java-25-red)
![Spring Boot](https://img.shields.io/badge/Spring%20Boot-3.x-brightgreen)
![React](https://img.shields.io/badge/React-Planned-blue)
![MySQL](https://img.shields.io/badge/MySQL-Database-orange)
![JWT](https://img.shields.io/badge/JWT-Secured-yellow)
![Maven](https://img.shields.io/badge/Maven-Build-red)
![License](https://img.shields.io/badge/License-MIT-green)

</div>

## Quick Navigation

- [Project Overview](#project-overview)
- [Key Features](#key-features)
- [System Architecture](#system-architecture)
- [Technology Stack](#technology-stack)
- [Installation](#installation--setup)
- [API Overview](#api-overview)
- [Documentation](#documentation)
- [Development Roadmap](#development-roadmap)
- [Future Enhancements](#future-enhancements)
---

## Smart Emergency Response Starts Here

SERRIP is a full-stack emergency response platform designed to improve the efficiency of emergency services by automating ambulance dispatch, optimizing route selection, and securely managing healthcare resources.

The system combines **Spring Boot**, **JWT Authentication**, **MySQL**, and **Graph Algorithms** to deliver a scalable and modular backend that can support real-world emergency management scenarios.

The project is being developed as an end-to-end software engineering project following modern development practices, clean architecture, and comprehensive documentation.

# Project Overview

Traditional emergency response systems often rely on manual coordination, making ambulance allocation and route planning time-consuming during critical situations.

SERRIP addresses these challenges by providing a centralized platform that can:

- Manage emergency requests
- Maintain hospital and ambulance records
- Automatically assign the nearest available ambulance
- Calculate optimal routes using Dijkstra's Algorithm
- Simulate traffic conditions and blocked roads
- Secure all APIs using JWT Authentication
- Provide a scalable architecture for future real-time enhancements

The project emphasizes modular design, maintainability, and extensibility, making it suitable for academic learning as well as enterprise-level development practices.

# Problem Statement

Emergency response operations involve multiple stakeholders, including dispatch centers, hospitals, ambulances, and emergency callers.

Common challenges include:

- Delayed ambulance assignment
- Inefficient route selection
- Manual coordination between resources
- Lack of centralized emergency management
- Poor scalability for increasing emergency requests
- Limited security for sensitive operational data

These issues can increase response time and reduce operational efficiency during emergencies.

# Solution

SERRIP provides a centralized emergency response platform that integrates resource management, secure authentication, and intelligent routing into a single system.

Key capabilities include:

- Secure user authentication using JWT
- Centralized emergency request management
- Hospital and ambulance resource management
- Automatic ambulance dispatch
- Shortest path calculation using Dijkstra's Algorithm
- Dynamic route recalculation based on traffic conditions
- Modular architecture for future scalability

The platform is designed to minimize emergency response time while maintaining a clean and extensible software architecture.

# Key Features

SERRIP combines intelligent routing, secure authentication, and emergency resource management into a unified platform.

| Feature | Status | Description |
|---------|--------|-------------|
| 🚨 Emergency Management | ✅ Completed | Create, manage, and track emergency requests. |
| 🏥 Hospital Management | ✅ Completed | Manage hospital information and healthcare resources. |
| 🚑 Ambulance Management | ✅ Completed | Register ambulances, monitor availability, and update operational status. |
| 📍 Smart Dispatch Engine | ✅ Completed | Automatically assign the nearest available ambulance based on resource availability. |
| 🗺️ Intelligent Routing | ✅ Completed | Calculate the shortest route using Dijkstra's Algorithm. |
| 🚧 Dynamic Route Optimization | ✅ Completed | Handle blocked roads and traffic delays through real-time route recalculation. |
| 🔐 JWT Authentication | ✅ Completed | Secure REST APIs using JSON Web Token authentication. |
| 👥 Role-Based Authorization | ✅ Completed | Protect endpoints using role-based access control (ADMIN, DISPATCHER, HOSPITAL). |
| 🔒 Password Security | ✅ Completed | Store user credentials securely using BCrypt password hashing. |
| 📄 RESTful APIs | ✅ Completed | Modular REST APIs following industry-standard design principles. |
| 🗃️ Database Integration | ✅ Completed | Persistent data storage using MySQL and Spring Data JPA. |
| ⚠️ Global Exception Handling | ✅ Completed | Centralized error handling with standardized API responses. |
| ✅ Request Validation | ✅ Completed | Input validation using Jakarta Bean Validation. |
| 📚 Comprehensive Documentation | ✅ Completed | Architecture, API guide, deployment guide, testing guide, and development notes. |
| 🎨 React Frontend | ⏳ Planned | Responsive user interface for administrators, dispatchers, and hospitals. |
| 🐳 Docker Deployment | ⏳ Planned | Containerized application deployment using Docker and Docker Compose. |
| ☁️ Cloud Deployment | ⏳ Planned | Deploy the application to a cloud platform with production-ready configuration. |

---

## Current Development Status

| Module | Progress |
|---------|----------|
| Backend Development | ✅ 100% |
| Authentication & Security | ✅ 100% (MVP) |
| Smart Routing Engine | ✅ 100% |
| Documentation | ✅ 100% |
| Frontend Development | ⏳ Planned |
| DevOps & Deployment | ⏳ Planned |

---
# Why This Project?

✅ Full-Stack Software Engineering Project

✅ Layered Architecture

✅ JWT Authentication

✅ Role-Based Authorization

✅ Graph Data Structure

✅ Dijkstra's Algorithm

✅ Dynamic Route Optimization

✅ RESTful API Design

✅ Comprehensive Documentation

✅ Production-Oriented Architecture

---

# System Architecture

SERRIP follows a **Three-Tier Layered Architecture** to ensure modularity, scalability, maintainability, and clear separation of concerns.

```text
                    +---------------------------+
                    |      React Frontend       |
                    |   (Presentation Layer)    |
                    +-------------+-------------+
                                  |
                         REST APIs (HTTP/HTTPS)
                                  |
                    +-------------v-------------+
                    |    Spring Boot Backend    |
                    |   (Application Layer)     |
                    +-------------+-------------+
                                  |
             +--------------------+--------------------+
             |                                         |
      Business Services                      Spring Security
             |                          JWT Authentication & RBAC
             |                                         |
       Repository Layer                     Authentication Filter
             |
      Spring Data JPA
             |
      +------v------+
      |   MySQL     |
      |  Database   |
      +-------------+
```

---

# Technology Stack

| Category | Technology |
|----------|------------|
| Language | Java 25 |
| Backend Framework | Spring Boot 3.x |
| Frontend | React + Vite *(Planned)* |
| Database | MySQL |
| ORM | Spring Data JPA / Hibernate |
| Authentication | JWT + Spring Security |
| Build Tool | Maven |
| API Testing | Postman |
| Version Control | Git & GitHub |
| Deployment | Docker *(Planned)* |

---

# Project Structure

```text
serrip-smart-emergency-response-system/

├── backend/
│   ├── src/
│   ├── pom.xml
│   └── mvnw
│
├── frontend/                 # Planned
│
├── docs/
│   ├── api/
│   ├── architecture/
│   ├── deployment/
│   └── screenshots/
│
├── notes/
│
├── README.md
├── LICENSE
├── CHANGELOG.md
├── PROJECT_MASTER_PLAN.md
├── TASK_BOARD.md
├── MILESTONE_TRACKER.md
├── DAILY_PROGRESS.md
├── LEARNING_NOTES.md
└── INTERVIEW_PREPARATION.md
```

---

# Backend Modules

| Module | Description |
|---------|-------------|
| Emergency Management | Create and manage emergency requests |
| Hospital Management | Hospital CRUD operations and resource management |
| Ambulance Management | Ambulance registration, availability, and status tracking |
| Dispatch Engine | Manual and automatic ambulance dispatch |
| Smart Routing | Graph-based shortest path and traffic-aware routing |
| Authentication | JWT authentication, login, registration, logout |
| Authorization | Role-based endpoint protection |
| Global Exception Handling | Consistent API error responses |
| Validation | Request validation using Jakarta Validation |

---

# Frontend Modules *(Planned)*

The React frontend will include the following modules:

- Authentication
- Dashboard
- Emergency Request Management
- Hospital Management
- Ambulance Management
- Dispatch Console
- Route Visualization
- Profile Management
- Admin Panel

---

# Database Design

The backend currently uses the following core entities:

| Entity | Purpose |
|---------|---------|
| User | Authentication and authorization |
| EmergencyRequest | Stores emergency requests |
| Hospital | Hospital information |
| Ambulance | Ambulance information and availability |
| DispatchRecord | Dispatch history |
| RoadGraph | Graph representation for routing |
| GraphNode | Road network node |
| GraphEdge | Road network connection |
| BlacklistedToken | Stores invalidated JWT tokens |

A detailed schema is available in:

```text
docs/architecture/DATABASE_SCHEMA.md
```
# Authentication Flow

SERRIP secures all protected REST APIs using **Spring Security** and **JWT (JSON Web Token)** based authentication.

Passwords are securely encrypted using **BCrypt**, and authenticated users receive a JWT that must be included in subsequent API requests.

---

## Authentication Workflow

```text
                User Registration
                        │
                        ▼
             Password Encryption
                 (BCrypt Encoder)
                        │
                        ▼
                 Store User in DB
                        │
                        ▼
                   User Login
                        │
                        ▼
        Authentication Manager Validates Credentials
                        │
                        ▼
              JWT Token Generation
                        │
                        ▼
             Client Stores JWT Token
                        │
                        ▼
      Authorization: Bearer <JWT_TOKEN>
                        │
                        ▼
          JwtAuthenticationFilter
                        │
                        ▼
           Token Validation & Authentication
                        │
                        ▼
          Access Protected REST APIs
```

---

## Security Components

| Component | Purpose |
|-----------|---------|
| Spring Security | Secures application endpoints |
| JWT | Stateless authentication mechanism |
| BCrypt Password Encoder | Secure password hashing |
| AuthenticationManager | Validates user credentials |
| JwtAuthenticationFilter | Extracts and validates JWT from every request |
| JwtService | Generates and validates JWT tokens |
| CustomUserDetailsService | Loads authenticated user details |
| JwtAuthenticationEntryPoint | Handles unauthorized access (401) |
| JwtAccessDeniedHandler | Handles forbidden requests (403) |

---

## Authentication Features

- ✅ User Registration
- ✅ Secure Password Encryption
- ✅ User Login
- ✅ JWT Token Generation
- ✅ Stateless Authentication
- ✅ Protected REST APIs
- ✅ Role-Based Endpoint Protection
- ✅ Custom Unauthorized Response
- ✅ Custom Access Denied Response
- ✅ Logout with Token Blacklisting

---

## Supported User Roles

| Role | Responsibilities |
|------|------------------|
| ADMIN | Full system access and resource management |
| DISPATCHER | Emergency handling and ambulance dispatch |
| HOSPITAL | Hospital-specific operations and resource updates |

---

## Authentication Endpoints

| Method | Endpoint | Description |
|--------|----------|-------------|
| POST | `/api/auth/register` | Register a new user |
| POST | `/api/auth/login` | Authenticate user and generate JWT |
| POST | `/api/auth/logout` | Invalidate JWT using token blacklist |

---

## Security Highlights

- Stateless authentication using JWT
- BCrypt password hashing
- Role-based authorization
- Secure API access
- Token validation on every request
- Standardized authentication error handling
- Logout support with token invalidation

# Smart Routing Engine

One of the core capabilities of SERRIP is its **Intelligent Routing Engine**, which calculates the fastest available route for emergency vehicles using graph-based pathfinding.

Unlike traditional CRUD applications, this module integrates **Graph Data Structures**, **Dijkstra's Shortest Path Algorithm**, and **dynamic route optimization** to simulate real-world emergency routing scenarios.

---

## Routing Workflow

```text
Emergency Request
        │
        ▼
Source & Destination
        │
        ▼
Road Network Graph
        │
        ▼
Apply Road Conditions
(Blocked Roads / Traffic Delay)
        │
        ▼
Run Dijkstra's Algorithm
        │
        ▼
Shortest Available Route
        │
        ▼
Dispatch Ambulance
```

---

## Core Components

| Component | Purpose |
|-----------|---------|
| RoadGraph | Represents the complete road network |
| GraphNode | Represents an intersection or location |
| GraphEdge | Represents a road connecting two locations |
| RouteService | Handles routing operations |
| RouteController | Exposes routing REST APIs |
| RouteResult | Stores calculated route information |

---

## Algorithm Used

### Dijkstra's Shortest Path Algorithm

The routing engine uses **Dijkstra's Algorithm** with a **Priority Queue (Min Heap)** to compute the shortest path efficiently.

### Time Complexity

| Implementation | Complexity |
|---------------|------------|
| Traditional Dijkstra | **O(V²)** |
| Priority Queue Implementation | **O((V + E) log V)** |

Using a **Priority Queue** significantly improves performance for larger road networks.

---

## Routing Features

- ✅ Graph-Based Road Network
- ✅ Adjacency List Representation
- ✅ Priority Queue Optimization
- ✅ Shortest Path Calculation
- ✅ Route Reconstruction
- ✅ Dynamic Road Blocking
- ✅ Road Unblocking
- ✅ Traffic Delay Simulation
- ✅ Traffic Delay Removal
- ✅ Automatic Route Recalculation
- ✅ Route Optimization

---

## Dynamic Routing

The routing engine can adapt to changing road conditions.

### Supported Scenarios

- Block a road segment
- Unblock a road segment
- Add traffic delay
- Remove traffic delay
- Recalculate the optimal route

This enables the system to simulate real-world emergency response situations where road conditions change dynamically.

---

## Routing APIs

| Method | Endpoint | Description |
|--------|----------|-------------|
| GET | `/api/routes/shortest` | Calculate shortest route |
| POST | `/api/routes/block-road` | Block a road |
| POST | `/api/routes/unblock-road` | Remove road blockage |
| POST | `/api/routes/add-traffic` | Add traffic delay |
| POST | `/api/routes/clear-traffic` | Remove traffic delay |

---

## Engineering Highlights

- Graph Data Structure
- Adjacency List Representation
- Dijkstra's Algorithm
- Priority Queue (Min Heap)
- Dynamic Route Optimization
- Clean Modular Design
- REST API Integration

---

## Future Enhancements

The routing engine has been designed for future scalability.

Planned improvements include:

- Google Maps API Integration
- OpenStreetMap Integration
- Live Traffic Data
- GPS-Based Ambulance Tracking
- Real-Time Route Optimization
- Multi-Ambulance Dispatch Optimization

# API Overview

SERRIP exposes RESTful APIs for emergency management, resource management, authentication, dispatch operations, and intelligent routing.

A complete API reference is available in:

```text
docs/api/API_DOCUMENTATION.md
```

---

## Authentication APIs

| Method | Endpoint | Description |
|--------|----------|-------------|
| POST | `/api/auth/register` | Register a new user |
| POST | `/api/auth/login` | Authenticate user and generate JWT |
| POST | `/api/auth/logout` | Logout and invalidate JWT |

---

## Emergency APIs

| Method | Endpoint | Description |
|--------|----------|-------------|
| POST | `/api/emergencies` | Create a new emergency request |
| GET | `/api/emergencies` | Retrieve all emergency requests |
| GET | `/api/emergencies/{id}` | Retrieve a specific emergency request |

---

## Hospital APIs

| Method | Endpoint | Description |
|--------|----------|-------------|
| POST | `/api/hospitals` | Register a hospital |
| GET | `/api/hospitals` | Retrieve all hospitals |
| GET | `/api/hospitals/{id}` | Retrieve hospital details |
| PUT | `/api/hospitals/{id}` | Update hospital information |
| DELETE | `/api/hospitals/{id}` | Remove a hospital |

---

## Ambulance APIs

| Method | Endpoint | Description |
|--------|----------|-------------|
| POST | `/api/ambulances` | Register an ambulance |
| GET | `/api/ambulances` | Retrieve all ambulances |
| GET | `/api/ambulances/{id}` | Retrieve ambulance details |
| PUT | `/api/ambulances/{id}` | Update ambulance information |
| DELETE | `/api/ambulances/{id}` | Remove an ambulance |

---

## Dispatch APIs

| Method | Endpoint | Description |
|--------|----------|-------------|
| POST | `/api/dispatch/manual` | Dispatch an ambulance manually |
| POST | `/api/dispatch/auto` | Automatically assign the nearest available ambulance |
| GET | `/api/dispatch/history` | Retrieve dispatch history |

---

## Smart Routing APIs

| Method | Endpoint | Description |
|--------|----------|-------------|
| GET | `/api/routes/shortest` | Calculate the shortest route |
| POST | `/api/routes/block-road` | Block a road segment |
| POST | `/api/routes/unblock-road` | Remove a road blockage |
| POST | `/api/routes/add-traffic` | Simulate traffic delay |
| POST | `/api/routes/clear-traffic` | Remove traffic delay |

---

## API Characteristics

- RESTful API Design
- JSON Request & Response Format
- JWT-Based Authentication
- Role-Based Authorization
- Standardized API Responses
- Centralized Exception Handling
- Input Validation using Jakarta Validation
- Stateless Communication

# Installation & Setup

## Prerequisites

Ensure the following software is installed before running the project:

| Software | Version |
|----------|---------|
| Java | JDK 25 or later |
| Maven | 3.9+ |
| MySQL | 8.0+ |
| Git | Latest |
| IntelliJ IDEA | Recommended |
| Postman | Latest |
| Node.js | 20+ *(Frontend)* |

---

## Clone Repository

```bash
git clone https://github.com/<your-username>/serrip-smart-emergency-response-system.git

cd serrip-smart-emergency-response-system
```

---

## Backend Setup

Navigate to the backend directory.

```bash
cd backend
```

Build the project.

```bash
./mvnw clean install
```

Run the application.

```bash
./mvnw spring-boot:run
```

---

## Database Setup

Create the database.

```sql
CREATE DATABASE serrip_db;
```

Configure database credentials inside:

```text
application.properties
```

---

## Access URLs

Backend

```
http://localhost:8081
```

Base API

```
http://localhost:8081/api
```

---

## Frontend Setup *(Upcoming)*

```bash
cd frontend

npm install

npm run dev
```

---

# Running the Project

## Step 1

Start MySQL.

---

## Step 2

Run the backend.

```bash
./mvnw spring-boot:run
```

---

## Step 3

Open Postman.

---

## Step 4

Register a user.

---

## Step 5

Login and obtain a JWT token.

---

## Step 6

Use the token to access protected APIs.

---

# Documentation

Comprehensive project documentation is available inside the repository.

| Document | Purpose |
|----------|---------|
| PROJECT_MASTER_PLAN.md | Overall project roadmap |
| TASK_BOARD.md | Development task tracking |
| MILESTONE_TRACKER.md | Project milestones |
| CHANGELOG.md | Version history |
| DAILY_PROGRESS.md | Daily development log |
| LEARNING_NOTES.md | Concepts learned during development |
| INTERVIEW_PREPARATION.md | Interview notes |
| PROJECT_QUESTIONS.md | Frequently asked project questions |
| API_DOCUMENTATION.md | Complete API reference |
| POSTMAN_TESTING_GUIDE.md | API testing guide |
| ARCHITECTURE.md | System architecture |
| PACKAGE_STRUCTURE.md | Project folder organization |
| DATABASE_SCHEMA.md | Database design |
| DEPLOYMENT_GUIDE.md | Deployment process |
| DOCKER.md | Docker setup |
| PROJECT_COMMANDS.md | Frequently used commands |

---
# Project Statistics

| Metric | Value |
|---------|------:|
| Backend Modules | 6 |
| REST APIs | 20+ |
| Database Tables | 9 |
| Authentication | JWT |
| Routing Algorithm | Dijkstra |
| Documentation Files | 15+ |
| Development Days | 16 |
| Architecture | Three-Tier Layered |
| Project Status | Backend Complete |

---

# Screenshots

| Module | Preview |
|----------|---------|
| Login | *(Coming Soon)* |
| Dashboard | *(Coming Soon)* |
| Emergency Management | *(Coming Soon)* |
| Ambulance Management | *(Coming Soon)* |
| Smart Routing | *(Coming Soon)* |
| Route Visualization | *(Coming Soon)* |

---

# Development Roadmap

## Phase 1 ✅

- Project Planning
- Spring Boot Setup
- MySQL Integration
- Backend Foundation

---

## Phase 2 ✅

- Emergency Module
- Hospital Module
- Ambulance Module

---

## Phase 3 ✅

- Dispatch Engine

---

## Phase 4 ✅

- Smart Routing
- Graph Implementation
- Dijkstra Algorithm
- Dynamic Routing

---

## Phase 5 ✅

- JWT Authentication
- Spring Security
- Role-Based Authorization

---

## Phase 6 🟡

- Project Documentation

---

## Phase 7 ⏳

- React Frontend

---

## Phase 8 ⏳

- Docker & Deployment

---

## Phase 9 ⏳

- Production Optimization

# Future Enhancements

The current backend provides a solid foundation for intelligent emergency response management. The following enhancements are planned for future releases.

---

## Frontend Development

- Responsive React Web Application
- Authentication Interface
- Admin Dashboard
- Dispatcher Dashboard
- Hospital Dashboard
- Emergency Request Management
- Ambulance Management
- Interactive Route Visualization

---

## Smart Routing Improvements

- Google Maps API Integration
- OpenStreetMap Integration
- GPS-Based Ambulance Tracking
- Live Traffic Data
- Dynamic ETA Prediction
- Multi-Route Optimization
- Multiple Ambulance Dispatch

---

## Security Enhancements

- Refresh Token Support
- Method-Level Authorization
- Password Reset
- Email Verification
- Two-Factor Authentication (2FA)
- Audit Logging
- Production Security Hardening

---

## DevOps & Deployment

- Docker Containerization
- Docker Compose
- GitHub Actions CI/CD
- Cloud Deployment
- Environment Configuration
- Centralized Logging
- Application Monitoring

---

## Scalability

- Microservices Architecture
- API Gateway
- Redis Caching
- Message Queue Integration
- Real-Time Notifications
- Performance Optimization

---

# Project Status

| Module | Status |
|---------|--------|
| Project Planning | ✅ Complete |
| Backend Development | ✅ Complete |
| Emergency Management | ✅ Complete |
| Hospital Management | ✅ Complete |
| Ambulance Management | ✅ Complete |
| Dispatch Engine | ✅ Complete |
| Smart Routing | ✅ Complete |
| Authentication & Security | ✅ Complete |
| Documentation | 🟡 In Progress |
| Frontend | ⏳ Planned |
| DevOps & Deployment | ⏳ Planned |

---

# Project Highlights

- Full-stack software engineering project
- Layered backend architecture
- Secure JWT authentication
- Graph-based routing engine
- Dijkstra's shortest path algorithm
- Dynamic traffic simulation
- RESTful API design
- Comprehensive project documentation
- Scalable and modular codebase

---

# Learning Outcomes

This project provided hands-on experience with:

## Backend Development

- Spring Boot
- Spring MVC
- Spring Data JPA
- REST API Development
- Exception Handling
- Request Validation

---

## Security

- Spring Security
- JWT Authentication
- Role-Based Authorization
- BCrypt Password Encryption
- Stateless Authentication

---

## Database

- MySQL
- Entity Relationships
- Repository Pattern
- Hibernate ORM

---

## Algorithms & Data Structures

- Graph Data Structure
- Adjacency List
- Dijkstra's Algorithm
- Priority Queue (Min Heap)
- Route Optimization

---

## Software Engineering

- Layered Architecture
- Clean Code Principles
- Modular Design
- Documentation
- Git & GitHub Workflow

---

# Contributing

Contributions, suggestions, and improvements are welcome.

If you would like to contribute:

1. Fork the repository
2. Create a feature branch
3. Commit your changes
4. Push the branch
5. Open a Pull Request

---

# Author

**Keshav Goyal**


GitHub: https://github.com/keshavgoyal1801

LinkedIn: https://linkedin.com/in/keshavgoyal1801

---

# License

This project is licensed under the MIT License.

See the **LICENSE** file for more information.

---

# Acknowledgements

Special thanks to:

- Spring Boot
- Spring Security
- MySQL
- Maven
- React (Upcoming)
- Open Source Community

for providing the technologies and tools that made this project possible.

---

## Repository Documentation

For detailed information, refer to the project documentation:

- 📖 Project Master Plan
- 🏗️ Architecture Guide
- 📦 Package Structure
- 🗄️ Database Schema
- 🌐 API Documentation
- 🧪 Postman Testing Guide
- 🐳 Docker Guide
- 🚀 Deployment Guide
- 📅 Daily Progress Log
- 📚 Learning Notes
- 🎯 Interview Preparation Notes

---

---

<div align="center">

Made with ❤️ using Java, Spring Boot and React.

⭐ If you found this project interesting, consider giving it a star.

</div>
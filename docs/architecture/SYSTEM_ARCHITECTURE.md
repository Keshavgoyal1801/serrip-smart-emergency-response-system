# System Architecture

This document describes the overall architecture of the SERRIP (Smart Emergency Response & Resource Intelligence Platform) backend.

---

# Architecture Overview

SERRIP follows a **Layered Architecture** based on Spring Boot, where each layer has a clearly defined responsibility.

```
                    Client
                       │
                       ▼
                REST Controllers
                       │
                       ▼
                 Service Layer
                       │
                       ▼
               Repository Layer
                       │
                       ▼
                   MySQL Database
```

---

# High-Level System Architecture

```
                        +----------------------+
                        |      Frontend        |
                        |   (React - Future)   |
                        +----------+-----------+
                                   |
                          HTTP / REST APIs
                                   |
                                   ▼
+------------------------------------------------------------+
|                 Spring Boot Backend (SERRIP)               |
|------------------------------------------------------------|
|                                                            |
|  Controllers                                                |
|      │                                                     |
|      ▼                                                     |
|  Services                                                   |
|      │                                                     |
|      ▼                                                     |
|  Repositories                                               |
|      │                                                     |
|      ▼                                                     |
|  MySQL Database                                             |
|                                                            |
|------------------------------------------------------------|
| Security                                                   |
| • Spring Security                                          |
| • JWT Authentication                                       |
| • Role-Based Authorization                                 |
|------------------------------------------------------------|
| Routing Engine                                             |
| • Graph Data Structure                                     |
| • Dijkstra Algorithm                                       |
| • Traffic Simulation                                       |
| • Dynamic Route Optimization                               |
+------------------------------------------------------------+
```

---

# Request Processing Flow

```
Client Request

      │

      ▼

Authentication Filter

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

MySQL Database

      │

      ▼

Repository

      │

      ▼

Service

      │

      ▼

Controller

      │

      ▼

JSON Response
```

---

# Authentication Flow

```
User Login

      │

      ▼

Authentication Manager

      │

      ▼

Username & Password Validation

      │

      ▼

JWT Token Generation

      │

      ▼

Client Stores JWT

      │

      ▼

JWT Sent with Every Request

      │

      ▼

JwtAuthenticationFilter

      │

      ▼

Protected API Access
```

---

# Emergency Dispatch Workflow

```
Emergency Request Created

          │

          ▼

Dispatcher Receives Request

          │

          ▼

Available Ambulances Retrieved

          │

          ▼

Nearest Ambulance Selected

          │

          ▼

Nearest Hospital Selected

          │

          ▼

Dispatch Record Created

          │

          ▼

Ambulance Status Updated

          │

          ▼

Response Returned
```

---

# Intelligent Routing Workflow

```
Source Location

        │

        ▼

Road Graph

        │

        ▼

Traffic Conditions

        │

        ▼

Blocked Roads

        │

        ▼

Dijkstra Algorithm

        │

        ▼

Shortest Available Route

        │

        ▼

Route Returned
```

---

# Security Architecture

```
Client

   │

JWT Token

   │

   ▼

JwtAuthenticationFilter

   │

Token Validation

   │

   ▼

Security Context

   │

Role Validation

   │

   ▼

Protected API
```

---

# Core Modules

## Authentication

- User Registration
- User Login
- JWT Authentication
- Password Encryption
- Logout
- Role-Based Authorization

---

## Emergency Management

- Create Emergency
- View Emergencies
- Emergency Status Management

---

## Hospital Management

- Add Hospital
- Update Hospital
- Delete Hospital
- View Hospitals

---

## Ambulance Management

- Add Ambulance
- Track Availability
- Update Status
- View Ambulances

---

## Dispatch Engine

- Manual Dispatch
- Automatic Dispatch
- Nearest Ambulance Selection
- Dispatch History

---

## Routing Intelligence

- Road Graph
- Dijkstra Algorithm
- Traffic Simulation
- Dynamic Route Recalculation
- Smart Route Optimization

---

# Technologies Used

| Layer | Technology |
|--------|------------|
| Backend | Spring Boot |
| Security | Spring Security + JWT |
| Database | MySQL |
| ORM | Spring Data JPA |
| Build Tool | Maven |
| API Testing | Postman |
| Algorithm | Dijkstra (Priority Queue) |

---

# Design Principles

The architecture follows these software engineering principles:

- Layered Architecture
- Separation of Concerns
- Dependency Injection
- Repository Pattern
- DTO Pattern
- Stateless Authentication
- RESTful API Design
- Modular Development

---

# Current System Status

| Module | Status |
|----------|--------|
| Backend Foundation | Complete |
| Authentication | Complete |
| JWT Security | Complete |
| Emergency Module | Complete |
| Hospital Module | Complete |
| Ambulance Module | Complete |
| Dispatch Engine | Complete |
| Routing Intelligence | Complete |
| Frontend | Planned |
| DevOps | Planned |

---

# Future Architecture

```
                    React Frontend
                          │
                          ▼
                     Spring Boot API
                          │
            ┌─────────────┴─────────────┐
            ▼                           ▼
      Authentication              Routing Engine
            │                           │
            └─────────────┬─────────────┘
                          ▼
                      MySQL Database
                          │
                          ▼
                    Docker Deployment
                          │
                          ▼
                      Cloud Platform
```

---

# Notes

- The backend follows a modular layered architecture.
- JWT is used for stateless authentication.
- Business logic is isolated from controllers.
- Database access is managed through Spring Data JPA repositories.
- The routing engine is built using a graph data structure with Dijkstra's shortest path algorithm.
- The architecture is designed to support future frontend integration and cloud deployment.
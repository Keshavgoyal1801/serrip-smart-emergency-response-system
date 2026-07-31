# Architecture

## Overview

SERRIP (**Smart Emergency Response & Resource Intelligence Platform**) is a full-stack web application designed to automate emergency response operations through intelligent ambulance dispatch, secure user authentication, and graph-based route optimization.

The system follows a **Three-Tier Layered Architecture**, ensuring modularity, scalability, maintainability, and clear separation of responsibilities.

---

# Architecture Overview

```text
                    +---------------------------+
                    |     React Frontend        |
                    |     (Presentation Layer)  |
                    +-------------+-------------+
                                  |
                          REST APIs (HTTP/HTTPS)
                                  |
                    +-------------v-------------+
                    |     Spring Boot API       |
                    |    (Application Layer)   |
                    +-------------+-------------+
                                  |
             +--------------------+--------------------+
             |                                         |
     Business Logic                          Spring Security
             |                          JWT Authentication & RBAC
             |                                         |
      Repository Layer                         Authentication Filter
             |
      Spring Data JPA
             |
             |
      +------v------+
      |   MySQL     |
      | (Data Layer)|
      +-------------+
```

---

# Technology Stack

## Frontend

- React
- Vite
- React Router
- Axios

## Backend

- Java 25
- Spring Boot
- Spring Security
- Spring Data JPA
- Maven

## Database

- MySQL

## Authentication

- JWT
- BCrypt Password Encryption
- Role-Based Access Control (RBAC)

---

# Layered Architecture

## 1. Presentation Layer

**Technology**

- React
- Axios
- React Router

**Responsibilities**

- User Interface
- Dashboard
- Authentication
- Form Validation
- API Communication
- Route Visualization

---

## 2. Application Layer

**Technology**

- Spring Boot

**Responsibilities**

- REST APIs
- Business Logic
- Request Validation
- Authentication
- Authorization
- Dispatch Engine
- Smart Routing

---

## 3. Data Layer

**Technology**

- MySQL
- Spring Data JPA
- Hibernate

**Responsibilities**

- Data Persistence
- Entity Management
- Database Transactions

---

# Backend Architecture

The backend follows a standard layered architecture.

```text
Client

↓

Controller

↓

Service

↓

Repository

↓

Database
```

Each layer has a single responsibility, making the application easy to maintain and extend.

---

# Core Backend Modules

## Emergency Management

- Emergency Requests
- Request Validation
- Status Management

---

## Hospital Management

- Hospital Records
- Availability Management
- CRUD Operations

---

## Ambulance Management

- Ambulance Records
- Availability Tracking
- Status Management

---

## Dispatch Engine

- Manual Dispatch
- Automatic Dispatch
- Nearest Ambulance Selection
- Dispatch History

---

## Smart Routing

- Graph Data Structure
- Dijkstra's Algorithm
- Dynamic Road Blocking
- Traffic Delay Simulation
- Route Optimization

---

## Security

- User Authentication
- JWT Authorization
- Password Encryption
- Role-Based Access Control
- Protected REST APIs

---

# Request Flow

```text
Client

↓

HTTP Request

↓

Controller

↓

Validation

↓

Service

↓

Repository

↓

MySQL

↓

Repository

↓

Service

↓

Controller

↓

JSON Response
```

---

# Authentication Flow

```text
User Login

↓

Authentication Manager

↓

Credentials Validation

↓

JWT Token Generation

↓

Client Stores JWT

↓

Authorization Header

↓

JWT Authentication Filter

↓

Protected API Access
```

---

# Smart Routing Flow

```text
Emergency Request

↓

Dispatch Engine

↓

Road Network Graph

↓

Dijkstra Algorithm

↓

Traffic Analysis

↓

Shortest Route

↓

Dispatch Result
```

---

# Design Principles

The project follows modern software engineering practices:

- Layered Architecture
- Separation of Concerns
- RESTful API Design
- Stateless Authentication
- Modular Development
- Reusable Components
- Clean Code Principles
- Feature-Based Development

---

# Current Architecture Status

| Component | Status |
|----------|--------|
| Backend | ✅ Complete |
| Database | ✅ Complete |
| Authentication | ✅ Complete |
| Smart Routing | ✅ Complete |
| Documentation | ✅ Complete |
| Frontend | ⏳ Planned |
| Deployment | ⏳ Planned |

---

# Future Enhancements

## Frontend

- React Dashboard
- Route Visualization
- Authentication Screens
- Resource Management

## DevOps

- Docker
- Docker Compose
- GitHub Actions
- Cloud Deployment
- Monitoring & Logging

## System Improvements

- Real-Time Ambulance Tracking
- Maps API Integration
- Live Traffic Integration
- Push Notifications
- Performance Optimization

---

# Architecture Summary

| Category | Technology |
|----------|------------|
| Architecture | Three-Tier Layered Architecture |
| Frontend | React (Planned) |
| Backend | Spring Boot |
| Database | MySQL |
| Authentication | JWT + Spring Security |
| Routing | Dijkstra's Algorithm |
| API Communication | REST APIs |
| Deployment | Docker & Cloud (Planned) |

---

**Current Phase:** Frontend Preparation

**Version:** 1.0

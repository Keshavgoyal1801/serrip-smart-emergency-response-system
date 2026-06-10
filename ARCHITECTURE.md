# SYSTEM ARCHITECTURE

# SERRIP
Smart Emergency Response & Resource Intelligence Platform

    ────────────────────────────────────────────────────────────

                    USER / CITIZEN
                           │
                           ▼
                Emergency Request API
                           │
                           ▼
                  Request Validation
                           │
                           ▼
                Emergency Request Service
                           │
                           ▼
                    MySQL Database

    ────────────────────────────────────────────────────────────

                 EMERGENCY DISPATCH FLOW

                    Emergency Request
                             │
                             ▼
                 Priority Evaluation Engine
                             │                         
                             ▼
                  Location Analysis Engine
                             │
                             ▼
                 Nearest Hospital Selection
                             │
                             ▼
                 Available Ambulance Search
                             │
                             ▼
                    Ambulance Assignment
                             │
                             ▼   
                      Response Tracking
                             │
                             ▼
                      Emergency Resolved

    ────────────────────────────────────────────────────────────

                   BACKEND ARCHITECTURE

                ┌─────────────────┐
                │   Controllers   │
                └────────┬────────┘
                         │
                         ▼
                ┌─────────────────┐
                │       DTO       │
                └────────┬────────┘
                         │
                         ▼
                ┌─────────────────┐
                │   Validation    │
                └────────┬────────┘
                         │
                         ▼
                ┌─────────────────┐
                │    Services     │
                └────────┬────────┘
                         │
                         ▼
                ┌─────────────────┐
                │ Repositories    │
                └────────┬────────┘
                         │
                         ▼
                ┌─────────────────┐
                │      MySQL      │
                └─────────────────┘

    ────────────────────────────────────────────────────────────

                     PROJECT MODULES

    Current
    │ 
    ├── Emergency Request Management
    │
    └── API Validation & Exception Handling

    Upcoming
    │
    ├── Hospital Management
    ├── Ambulance Management
    ├── Dispatch Engine
    ├── Priority Assignment Engine
    ├── Distance Calculation Module
    ├── Resource Tracking Module
    ├── Analytics Dashboard
    └── Admin Management

    ────────────────────────────────────────────────────────────

                     DATABASE DESIGN

    EmergencyRequest
    │
    ├── id
    ├── callerName
    ├── phone
    ├── latitude
    ├── longitude
    ├── emergencyType
    ├── priority
    ├── status
    └── createdAt

    Hospital
    │
    ├── id
    ├── hospitalName
    ├── address
    ├── latitude
    ├── longitude
    ├── availableBeds
    └── contactNumber

    Ambulance
    │
    ├── id
    ├── vehicleNumber
    ├── driverName
    ├── status
    ├── latitude
    ├── longitude
    └── hospitalId

    ────────────────────────────────────────────────────────────

                    TECHNOLOGY STACK

    Backend
    ├── Java 21
    ├── Spring Boot
    ├── Spring Data JPA
    ├── Hibernate
    └── Maven
    
    Database
    └── MySQL
    
    Testing
    └── Postman
    
    Version Control
    ├── Git
    └── GitHub
    
    IDE
    └── IntelliJ IDEA

    ────────────────────────────────────────────────────────────

                    FUTURE ENHANCEMENTS

    ├── Real-Time Ambulance Tracking
    ├── Google Maps Integration
    ├── Notification System
    ├── Role-Based Authentication
    ├── Admin Dashboard
    ├── Analytics & Reporting
    └── AI-Based Resource Allocation

# Database Schema

This document describes the database design used in the SERRIP (Smart Emergency Response & Resource Intelligence Platform) backend.

---

# Database Information

| Property | Value |
|----------|-------|
| Database | `serrip_db` |
| Database Engine | MySQL |
| ORM | Spring Data JPA (Hibernate) |
| Primary Key Strategy | AUTO_INCREMENT |
| Relationship Type | Relational Database |

---

# Entity Relationship Overview

```

User
│
├── Authentication
└── Authorization

EmergencyRequest
│
└── DispatchRecord
        │
        ├── Ambulance
        └── Hospital

```

---

# Tables

## 1. users

Stores application users for authentication and authorization.

| Column | Type | Description |
|---------|------|-------------|
| id | BIGINT | Primary Key |
| username | VARCHAR | Unique username |
| password | VARCHAR | Encrypted password |
| role | ENUM | ADMIN / DISPATCHER / HOSPITAL |

Primary Key

```
id
```

---

## 2. emergency_requests

Stores emergency requests created by dispatchers.

| Column | Type | Description |
|---------|------|-------------|
| id | BIGINT | Primary Key |
| patientName | VARCHAR | Patient name |
| location | VARCHAR | Emergency location |
| emergencyType | VARCHAR | Type of emergency |
| priority | VARCHAR | Emergency priority |
| status | VARCHAR | Current request status |

Primary Key

```
id
```

---

## 3. hospitals

Stores hospital information.

| Column | Type | Description |
|---------|------|-------------|
| id | BIGINT | Primary Key |
| name | VARCHAR | Hospital name |
| address | VARCHAR | Hospital address |
| contactNumber | VARCHAR | Contact number |
| latitude | DOUBLE | Latitude |
| longitude | DOUBLE | Longitude |

Primary Key

```
id
```

---

## 4. ambulances

Stores ambulance information.

| Column | Type | Description |
|---------|------|-------------|
| id | BIGINT | Primary Key |
| vehicleNumber | VARCHAR | Ambulance number |
| driverName | VARCHAR | Driver name |
| status | VARCHAR | Current availability |
| latitude | DOUBLE | Current latitude |
| longitude | DOUBLE | Current longitude |

Primary Key

```
id
```

---

## 5. dispatch_records

Stores dispatch history.

| Column | Type | Description |
|---------|------|-------------|
| id | BIGINT | Primary Key |
| emergencyRequestId | BIGINT | Emergency reference |
| ambulanceId | BIGINT | Assigned ambulance |
| hospitalId | BIGINT | Assigned hospital |
| dispatchTime | DATETIME | Dispatch timestamp |
| status | VARCHAR | Dispatch status |

Primary Key

```
id
```

Foreign Keys

```
emergencyRequestId → emergency_requests(id)

ambulanceId → ambulances(id)

hospitalId → hospitals(id)
```

---

# Table Relationships

```
EmergencyRequest (1)
        │
        │
        ▼
DispatchRecord (Many)

Ambulance (1)
        │
        ▼
DispatchRecord (Many)

Hospital (1)
        │
        ▼
DispatchRecord (Many)
```

---

# Database Design Principles

- Relational Database Design
- Normalized Schema
- Entity-Based Modeling
- Primary Key Identification
- Foreign Key Relationships
- Data Integrity
- Minimal Redundancy

---

# Indexing Strategy

Primary indexes are maintained on:

- users.id
- emergency_requests.id
- hospitals.id
- ambulances.id
- dispatch_records.id

Additional indexes can be added in future for:

- username
- ambulance status
- emergency status
- dispatch status

---

# Data Integrity

The database ensures:

- Unique user accounts
- Secure password storage
- Valid dispatch references
- Consistent entity relationships
- Reliable CRUD operations

---

# Future Improvements

- Audit Logs
- Soft Delete Support
- Location History
- Ambulance Tracking History
- Hospital Capacity Management
- Emergency Category Table
- Refresh Token Storage

---

# Current Database Status

| Module | Status |
|----------|--------|
| User Management | Complete |
| Emergency Requests | Complete |
| Hospital Management | Complete |
| Ambulance Management | Complete |
| Dispatch Records | Complete |
| Authentication Data | Complete |

---

# Notes

- All entities are managed using Spring Data JPA.
- Primary keys are generated automatically.
- Passwords are stored using BCrypt hashing.
- Dispatch records maintain historical assignment data.
- Database is fully compatible with MySQL 8.x.
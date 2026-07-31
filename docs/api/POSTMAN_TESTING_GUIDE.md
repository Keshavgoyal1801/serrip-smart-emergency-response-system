# Project Commands

This document contains the most frequently used commands for developing, testing, debugging, and maintaining the **SERRIP (Smart Emergency Response & Resource Intelligence Platform)** project.

---

# Project Structure

```text
serrip-smart-emergency-response-system/
│
├── backend/
├── frontend/
├── docs/
├── notes/
└── README.md
```

---

# Backend Commands

## Navigate to Backend

```bash
cd backend
```

---

## Run Spring Boot Application

Windows

```bash
mvnw.cmd spring-boot:run
```

Linux / macOS

```bash
./mvnw spring-boot:run
```

---

## Clean Project

```bash
./mvnw clean
```

---

## Compile Project

```bash
./mvnw compile
```

---

## Build Project

```bash
./mvnw clean install
```

---

## Package Application

```bash
./mvnw package
```

---

## Run Unit Tests

```bash
./mvnw test
```

---

## Skip Tests While Building

```bash
./mvnw clean install -DskipTests
```

---

## View Dependency Tree

```bash
./mvnw dependency:tree
```

---

# Database Commands

## Login to MySQL

```bash
mysql -u root -p
```

---

## Select Database

```sql
USE serrip_db;
```

---

## Show Tables

```sql
SHOW TABLES;
```

---

## Describe Table

```sql
DESC users;
```

---

## View Table Data

```sql
SELECT * FROM users;
```

---

## Reset Development Database

```sql
DELETE FROM dispatch_records;
DELETE FROM ambulances;
DELETE FROM hospitals;
DELETE FROM emergency_requests;
DELETE FROM users;

ALTER TABLE dispatch_records AUTO_INCREMENT = 1;
ALTER TABLE ambulances AUTO_INCREMENT = 1;
ALTER TABLE hospitals AUTO_INCREMENT = 1;
ALTER TABLE emergency_requests AUTO_INCREMENT = 1;
ALTER TABLE users AUTO_INCREMENT = 1;
```

---

# Application URLs

## Backend

```
http://localhost:8081
```

---

## Base API

```
http://localhost:8081/api
```

---

# Authentication APIs

## Register

```
POST /api/auth/register
```

---

## Login

```
POST /api/auth/login
```

---

## Logout

```
POST /api/auth/logout
```

---

# Emergency APIs

```
GET    /api/emergencies

GET    /api/emergencies/{id}

POST   /api/emergencies
```

---

# Hospital APIs

```
GET

POST

PUT

DELETE
```

```
/api/hospitals/**
```

---

# Ambulance APIs

```
GET

POST

PUT

DELETE
```

```
/api/ambulances/**
```

---

# Dispatch APIs

```
POST /api/dispatch/manual

POST /api/dispatch/auto

GET  /api/dispatch/history
```

---

# Routing APIs

```
GET  /api/routes/shortest

POST /api/routes/block-road

POST /api/routes/unblock-road

POST /api/routes/add-traffic

POST /api/routes/clear-traffic
```

---

# Git Commands

## Check Status

```bash
git status
```

---

## Add All Files

```bash
git add .
```

---

## Add Single File

```bash
git add <filename>
```

---

## Commit Changes

```bash
git commit -m "Meaningful commit message"
```

Example

```bash
git commit -m "Implement JWT authentication and role-based security"
```

---

## Push Changes

```bash
git push origin main
```

---

## Pull Latest Changes

```bash
git pull origin main
```

---

## View Commit History

```bash
git log --oneline
```

---

## View Branches

```bash
git branch
```

---

## Create Branch

```bash
git checkout -b feature/<feature-name>
```

---

## Switch Branch

```bash
git checkout main
```

---

# Postman Testing Workflow

## Step 1

Register User

↓

## Step 2

Login

↓

## Step 3

Copy JWT Token

↓

## Step 4

Add Header

```
Authorization: Bearer <JWT_TOKEN>
```

↓

## Step 5

Test Protected APIs

---

# Common HTTP Status Codes

| Code | Meaning |
|------|---------|
| 200 | Request Successful |
| 201 | Resource Created |
| 400 | Bad Request |
| 401 | Unauthorized |
| 403 | Forbidden |
| 404 | Resource Not Found |
| 500 | Internal Server Error |

---

# Common Troubleshooting

## 401 Unauthorized

Possible Causes

- Missing JWT
- Invalid Token
- Expired Token

---

## 403 Forbidden

Possible Causes

- Insufficient User Role
- Access Denied

---

## 404 Not Found

Possible Causes

- Incorrect API URL
- Resource Does Not Exist

---

## 500 Internal Server Error

Possible Causes

- Backend Exception
- Database Issue
- Configuration Error

---

# Windows Commands

## Check Running Port

```bash
netstat -ano | findstr :8081
```

---

## Kill Running Process

```bash
taskkill /PID <PID> /F
```

---

## Verify Java Installation

```bash
java -version
```

---

## Verify Maven Installation

```bash
mvn -version
```

---

# Development Workflow

```
Pull Latest Code

        │

        ▼

Start MySQL

        │

        ▼

Run Backend

        │

        ▼

Test APIs

        │

        ▼

Verify Database

        │

        ▼

Commit Changes

        │

        ▼

Push to GitHub

        │

        ▼

Update Documentation
```

---

# Recommended Commit Messages

Backend

```
Initialize Spring Security configuration

Implement JWT authentication

Add role-based authorization

Create emergency management APIs

Implement hospital management module

Develop ambulance management module

Implement dispatch engine

Optimize routing using Dijkstra algorithm

Improve exception handling

Refactor service layer
```

Documentation

```
Update project documentation

Add deployment guide

Update milestone tracker

Improve README

Document API endpoints

Update project commands
```

---

# Development Checklist

Before Every Commit

- Backend builds successfully
- All APIs tested
- Database verified
- JWT authentication working
- Documentation updated
- No unnecessary files committed

---

# Current Development Environment

| Component | Version |
|-----------|---------|
| Java | JDK 25 |
| Spring Boot | 3.x |
| Maven | 3.x |
| Database | MySQL 8.x |
| Authentication | Spring Security + JWT |
| API Testing | Postman |
| IDE | IntelliJ IDEA |
| Version Control | Git & GitHub |
| Server Port | 8081 |

---

# Future Commands (Planned)

Docker

```bash
docker compose up
```

---

Run Frontend

```bash
cd frontend

npm install

npm run dev
```

---

Production Build

```bash
npm run build
```

---

# Notes

- The backend currently runs on **port 8081**.
- Always verify APIs in Postman before committing changes.
- Use meaningful commit messages for every logical feature.
- Keep documentation synchronized with project development.
- Future frontend and Docker commands will be added as those milestones are completed.
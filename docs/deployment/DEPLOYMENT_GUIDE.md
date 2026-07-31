# Deployment Guide

This document describes how to build, configure, run, and deploy the SERRIP (Smart Emergency Response & Resource Intelligence Platform) backend application.

---

# Deployment Overview

Current Deployment Stage

- Local Development Environment ✅
- Production Deployment ⏳
- Docker Deployment ⏳
- Cloud Deployment ⏳
- CI/CD Pipeline ⏳

---

# Technology Stack

| Component | Technology |
|-----------|------------|
| Backend | Spring Boot |
| Database | MySQL |
| Authentication | JWT |
| Build Tool | Maven |
| API Testing | Postman |
| Version Control | Git & GitHub |

---

# System Requirements

## Software

- Java JDK 25+
- Maven 3.9+
- MySQL 8.x
- Git
- IntelliJ IDEA (Recommended)
- Postman

---

## Hardware (Minimum)

- Dual-Core Processor
- 8 GB RAM
- 2 GB Free Disk Space

Recommended

- Quad-Core Processor
- 16 GB RAM
- SSD Storage

---

# Clone Repository

```bash
git clone https://github.com/<your-username>/serrip-smart-emergency-response-system.git
```

Navigate into the project

```bash
cd serrip-smart-emergency-response-system
```

---

# Backend Setup

Navigate to backend

```bash
cd backend
```

Install dependencies

```bash
./mvnw clean install
```

Run application

Windows

```bash
mvnw.cmd spring-boot:run
```

Linux / macOS

```bash
./mvnw spring-boot:run
```

---

# Database Configuration

Start MySQL server.

Create database

```sql
CREATE DATABASE serrip_db;
```

Select database

```sql
USE serrip_db;
```

Update `application.properties`

```properties
spring.datasource.url=jdbc:mysql://localhost:3306/serrip_db

spring.datasource.username=root

spring.datasource.password=your_password
```

---

# Application Configuration

Default Port

```
8081
```

Base URL

```
http://localhost:8081
```

Base API

```
http://localhost:8081/api
```

---

# Build Application

Generate executable JAR

```bash
./mvnw clean package
```

Generated file

```
backend/target/*.jar
```

---

# Run JAR File

```bash
java -jar target/backend.jar
```

---

# API Verification

Verify the application is running.

Example

```
GET http://localhost:8081/api/auth/test
```

Expected Response

```
Authentication Module Working
```

---

# Post-Deployment Checklist

- Spring Boot starts successfully
- MySQL connection established
- Tables created successfully
- JWT authentication working
- Protected APIs accessible
- CRUD operations working
- Routing engine functioning
- Dispatch engine functioning

---

# Environment Variables (Recommended)

Instead of hardcoding sensitive information, use environment variables.

Example

```properties
DB_URL

DB_USERNAME

DB_PASSWORD

JWT_SECRET
```

---

# Security Recommendations

- Store JWT secret securely
- Use strong database credentials
- Enable HTTPS in production
- Disable debug logging
- Validate all API inputs
- Restrict database access
- Keep dependencies updated

---

# Deployment Workflow

```
Clone Repository

        │

        ▼

Configure Database

        │

        ▼

Update Configuration

        │

        ▼

Build Application

        │

        ▼

Run Spring Boot

        │

        ▼

Verify APIs

        │

        ▼

Application Ready
```

---

# Future Deployment Plan

## Docker

- Dockerfile
- Docker Compose
- Multi-stage Build

---

## Cloud Deployment

Potential Platforms

- AWS
- Azure
- Google Cloud
- Railway
- Render

---

## CI/CD

Planned Features

- GitHub Actions
- Automatic Build
- Automated Testing
- Continuous Deployment

---

# Troubleshooting

## Port Already in Use

Check running process

```bash
netstat -ano | findstr :8081
```

Terminate process

```bash
taskkill /PID <PID> /F
```

---

## Database Connection Failed

Verify

- MySQL service is running
- Database exists
- Username and password are correct
- JDBC URL is correct

---

## Maven Build Failed

Clean and rebuild

```bash
./mvnw clean install
```

---

## JWT Authentication Issues

Verify

- Token is valid
- Token is not expired
- Authorization header format

```
Bearer <JWT_TOKEN>
```

---

# Deployment Status

| Component | Status |
|-----------|--------|
| Backend | Complete |
| Database | Complete |
| JWT Authentication | Complete |
| Local Deployment | Complete |
| Docker | Planned |
| Cloud Deployment | Planned |
| CI/CD | Planned |

---

# Notes

- The application currently supports local deployment.
- Docker and cloud deployment will be implemented in future milestones.
- All APIs should be verified using Postman before production deployment.
- Configuration values should be externalized before deploying to production.
# PROJECT_COMMANDS.md

# SERRIP
Smart Emergency Response & Intelligent Routing Platform

---

# Purpose

This document contains all frequently used commands during development.

It serves as a quick reference for:

- Git
- Maven
- Spring Boot
- MySQL
- JWT Testing
- Windows
- Docker (Future)
- Production

---

# PROJECT STRUCTURE

Backend

```
backend/
```

Frontend

```
frontend/
```

Documentation

```
docs/
```

---

# GIT COMMANDS

## Check Status

```bash
git status
```

Shows modified files.

---

## Add All Changes

```bash
git add .
```

---

## Add Single File

```bash
git add filename
```

---

## Commit

```bash
git commit -m "Meaningful commit message"
```

Example

```bash
git commit -m "Implement JWT authentication filter"
```

---

## Push

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
git checkout -b feature/security
```

---

## Switch Branch

```bash
git checkout main
```

---

# MAVEN COMMANDS

## Clean Project

```bash
mvn clean
```

---

## Compile

```bash
mvn compile
```

---

## Run Tests

```bash
mvn test
```

---

## Package

```bash
mvn package
```

---

## Run Spring Boot

```bash
mvn spring-boot:run
```

---

## Using Maven Wrapper

Windows

```bash
mvnw.cmd spring-boot:run
```

Linux

```bash
./mvnw spring-boot:run
```

---

# SPRING BOOT

Default URL

```
http://localhost:8080
```

Stop Server

```
CTRL + C
```

---

# MYSQL COMMANDS

Open MySQL

```bash
mysql -u root -p
```

---

Show Databases

```sql
SHOW DATABASES;
```

---

Use Database

```sql
USE serrip_db;
```

---

Show Tables

```sql
SHOW TABLES;
```

---

Describe Table

```sql
DESC users;
```

---

View Data

```sql
SELECT * FROM users;
```

---

Delete Data

```sql
DELETE FROM users;
```

---

Reset Table

```sql
TRUNCATE TABLE users;
```

---

# JWT TESTING

## Register

```
POST

/api/auth/register
```

---

## Login

```
POST

/api/auth/login
```

---

Copy Token

```
eyJhbGc....
```

---

Use Token

Authorization

```
Bearer Token
```

Paste

```
JWT_TOKEN
```

---

# WINDOWS COMMANDS

Check Port

```bash
netstat -ano | findstr :8080
```

---

Check PID

```bash
tasklist | findstr PID
```

---

Kill Process

```bash
taskkill /PID PID_NUMBER /F
```

---

Check Java

```bash
java -version
```

---

Check Maven

```bash
mvn -version
```

---

# ORACLE LISTENER

Check Listener

```bash
tasklist | findstr TNSLSNR
```

Stop Listener

```bash
net stop OracleOraDB21Home1TNSListener
```

Start Listener

```bash
net start OracleOraDB21Home1TNSListener
```

---

# POSTMAN

Register

↓

Login

↓

Copy JWT

↓

Authorization

↓

Bearer Token

↓

Test APIs

---

# COMMON DEBUGGING

403

```
Role issue

OR

JWT Missing
```

---

401

```
Invalid JWT

OR

Expired JWT
```

---

404

```
Wrong URL
```

---

400

```
Validation Failed
```

---

500

```
Backend Exception
```

---

# DOCKER (Future)

Build Image

```bash
docker build -t serrip .
```

---

Run Container

```bash
docker run -p 8080:8080 serrip
```

---

View Containers

```bash
docker ps
```

---

Stop Container

```bash
docker stop CONTAINER_ID
```

---

# PROJECT STARTUP

Step 1

```
Start MySQL
```

↓

Step 2

```
Open Backend
```

↓

Step 3

```bash
mvn spring-boot:run
```

↓

Step 4

```
Open Postman
```

↓

Step 5

```
Login

Copy JWT

Test APIs
```

---

# PROJECT SHUTDOWN

Stop Backend

```
CTRL + C
```

Stop MySQL

(Optional)

Close IntelliJ

Commit

```bash
git add .

git commit -m "Meaningful message"

git push origin main
```

---

# PROJECT DEVELOPMENT FLOW

Plan

↓

Code

↓

Run

↓

Test

↓

Debug

↓

Commit

↓

Push

↓

Update Documentation

↓

Repeat

---

# COMMIT MESSAGE GUIDELINES

Good Examples

```
Initialize Spring Security configuration

Implement JWT authentication service

Add user registration endpoint

Protect APIs using JWT authentication

Implement role-based access control

Add hospital CRUD APIs

Implement Dijkstra shortest path algorithm

Optimize routing with priority queue

Update project documentation
```

Avoid

```
update

changes

fix

done

testing

new code
```

---

# IMPORTANT NOTES

Always

✔ Commit after completing one logical feature.

✔ Push at the end of each working session.

✔ Test every API before committing.

✔ Update documentation after completing a milestone.

✔ Keep SQL and Postman guides synchronized with the project.

---

End of File
# Docker Guide

This document describes the Docker deployment plan for the SERRIP (Smart Emergency Response & Resource Intelligence Platform).

> **Current Status:** Docker support is planned and will be implemented in a future milestone. This document serves as the deployment blueprint.

---

# Objectives

- Containerize the backend application
- Containerize the frontend application
- Run MySQL in a Docker container
- Simplify local development setup
- Enable cloud-ready deployment

---

# Planned Docker Architecture

```
                +----------------------+
                |   React Frontend     |
                |     (Container)      |
                +----------+-----------+
                           |
                           ▼
                +----------------------+
                | Spring Boot Backend  |
                |     (Container)      |
                +----------+-----------+
                           |
                           ▼
                +----------------------+
                |      MySQL 8.x       |
                |     (Container)      |
                +----------------------+
```

---

# Planned Project Structure

```
serrip-smart-emergency-response-system/

├── backend/
│   ├── Dockerfile
│   └── ...
│
├── frontend/
│   ├── Dockerfile
│   └── ...
│
├── docker-compose.yml
│
└── docs/
```

---

# Planned Docker Images

| Service | Image |
|----------|-------|
| Backend | OpenJDK 25 |
| Frontend | Node.js + Nginx |
| Database | MySQL 8 |

---

# Backend Dockerfile (Planned)

```dockerfile
FROM eclipse-temurin:25-jdk

WORKDIR /app

COPY target/backend.jar app.jar

EXPOSE 8081

ENTRYPOINT ["java","-jar","app.jar"]
```

---

# Frontend Dockerfile (Planned)

```dockerfile
FROM node:20

WORKDIR /app

COPY . .

RUN npm install

RUN npm run build

EXPOSE 3000

CMD ["npm","start"]
```

---

# Docker Compose (Planned)

The project will use Docker Compose to start all services with a single command.

Services:

- Backend
- Frontend
- MySQL

Future command:

```bash
docker compose up
```

---

# Planned Environment Variables

Backend

```text
SPRING_DATASOURCE_URL

SPRING_DATASOURCE_USERNAME

SPRING_DATASOURCE_PASSWORD

JWT_SECRET
```

Database

```text
MYSQL_DATABASE

MYSQL_USER

MYSQL_PASSWORD

MYSQL_ROOT_PASSWORD
```

Frontend

```text
VITE_API_BASE_URL
```

---

# Planned Docker Volumes

Persistent storage will be used for:

- MySQL database
- Application logs

---

# Planned Docker Network

All containers will communicate through a dedicated Docker network.

```
Frontend

     │

Backend

     │

MySQL
```

---

# Expected Ports

| Service | Port |
|----------|------|
| Frontend | 3000 |
| Backend | 8081 |
| MySQL | 3306 |

---

# Planned Development Workflow

```
Clone Repository

        │

        ▼

Build Backend

        │

        ▼

Build Frontend

        │

        ▼

Run Docker Compose

        │

        ▼

All Services Started
```

---

# Future Docker Commands

Build Backend Image

```bash
docker build -t serrip-backend ./backend
```

Build Frontend Image

```bash
docker build -t serrip-frontend ./frontend
```

Build All Containers

```bash
docker compose build
```

Start Containers

```bash
docker compose up
```

Run in Background

```bash
docker compose up -d
```

Stop Containers

```bash
docker compose down
```

View Running Containers

```bash
docker ps
```

View Logs

```bash
docker compose logs
```

Remove Unused Images

```bash
docker image prune
```

---

# Benefits of Docker

- Consistent development environment
- Easy project setup
- Simplified dependency management
- Platform-independent deployment
- Scalable architecture
- Cloud deployment ready

---

# Future Improvements

- Multi-stage Docker builds
- Nginx reverse proxy
- Docker secrets
- Health checks
- Automated backups
- Production configuration
- Kubernetes deployment

---

# Docker Roadmap

| Feature | Status |
|----------|--------|
| Backend Dockerfile | Planned |
| Frontend Dockerfile | Planned |
| Docker Compose | Planned |
| Environment Variables | Planned |
| Persistent Volumes | Planned |
| Multi-Container Deployment | Planned |
| Production Optimization | Planned |

---

# Notes

- Docker is not yet implemented in the current version of the project.
- Docker support will be added during the DevOps & Deployment milestone.
- The current application is designed to be Docker-ready with minimal configuration changes.
- Future deployment will allow the complete application stack to run using a single `docker compose up` command.
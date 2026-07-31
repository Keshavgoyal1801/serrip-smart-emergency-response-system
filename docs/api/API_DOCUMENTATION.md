# API Documentation

This document provides an overview of all REST APIs available in the SERRIP backend.

---

# Base URL

```
http://localhost:8081
```

Base API

```
http://localhost:8081/api
```

---

# Authentication

Protected APIs require a JWT token.

Header

```
Authorization: Bearer <JWT_TOKEN>
```

---

# Authentication APIs

## Register User

**POST**

```
/api/auth/register
```

### Request Body

```json
{
  "username": "admin",
  "password": "password123",
  "role": "ADMIN"
}
```

### Success Response

```json
{
  "message": "User Registered Successfully"
}
```

---

## Login

**POST**

```
/api/auth/login
```

### Request Body

```json
{
  "username": "admin",
  "password": "password123"
}
```

### Success Response

```json
{
  "token": "JWT_TOKEN"
}
```

---

## Logout

**POST**

```
/api/auth/logout
```

Requires JWT Authentication.

---

# Emergency APIs

Base Endpoint

```
/api/emergencies
```

| Method | Endpoint | Description |
|---------|----------|-------------|
| GET | `/api/emergencies` | Get all emergency requests |
| GET | `/api/emergencies/{id}` | Get emergency by ID |
| POST | `/api/emergencies` | Create new emergency |

---

# Hospital APIs

Base Endpoint

```
/api/hospitals
```

| Method | Endpoint | Description |
|---------|----------|-------------|
| GET | `/api/hospitals` | Get all hospitals |
| GET | `/api/hospitals/{id}` | Get hospital by ID |
| POST | `/api/hospitals` | Add hospital |
| PUT | `/api/hospitals/{id}` | Update hospital |
| DELETE | `/api/hospitals/{id}` | Delete hospital |

---

# Ambulance APIs

Base Endpoint

```
/api/ambulances
```

| Method | Endpoint | Description |
|---------|----------|-------------|
| GET | `/api/ambulances` | Get all ambulances |
| GET | `/api/ambulances/{id}` | Get ambulance by ID |
| POST | `/api/ambulances` | Add ambulance |
| PUT | `/api/ambulances/{id}` | Update ambulance |
| DELETE | `/api/ambulances/{id}` | Delete ambulance |

---

# Dispatch APIs

Base Endpoint

```
/api/dispatch
```

| Method | Endpoint | Description |
|---------|----------|-------------|
| POST | `/manual` | Manual ambulance dispatch |
| POST | `/auto` | Automatic ambulance dispatch |
| GET | `/history` | View dispatch history |

---

# Routing APIs

Base Endpoint

```
/api/routes
```

| Method | Endpoint | Description |
|---------|----------|-------------|
| GET | `/shortest` | Calculate shortest route |
| POST | `/block-road` | Block a road |
| POST | `/unblock-road` | Unblock a road |
| POST | `/add-traffic` | Add traffic delay |
| POST | `/clear-traffic` | Remove traffic delay |

---

# HTTP Status Codes

| Code | Meaning |
|------|---------|
| 200 | Success |
| 201 | Resource Created |
| 400 | Validation Failed |
| 401 | Unauthorized |
| 403 | Forbidden |
| 404 | Resource Not Found |
| 500 | Internal Server Error |

---

# Authentication Flow

```
Register User
      │
      ▼
    Login
      │
      ▼
Receive JWT Token
      │
      ▼
Add Authorization Header
      │
      ▼
Access Protected APIs
```

---

# User Roles

| Role | Access |
|------|--------|
| ADMIN | Full System Access |
| DISPATCHER | Emergency & Dispatch Operations |
| HOSPITAL | Hospital-specific Operations |

---

# API Testing

All APIs are tested using:

- Postman
- JWT Authentication
- MySQL Verification
- Validation Testing
- Error Handling Testing

---

# Notes

- All request and response bodies use JSON format.
- Protected APIs require a valid JWT token.
- Input validation is performed using DTOs.
- Standardized API responses are returned for successful and failed requests.
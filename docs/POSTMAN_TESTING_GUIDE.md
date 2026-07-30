# POSTMAN TESTING GUIDE

# SERRIP
Smart Emergency Response & Intelligent Routing Platform

---

# Purpose

This document contains every API used throughout the project.

It serves as:

- API documentation
- Testing checklist
- Debugging guide
- JWT Authentication reference
- Final demonstration guide

---

# Base URL

http://localhost:8080

---

# Testing Flow

Always follow this order.

```
1. Register User
        ↓
2. Login User
        ↓
3. Copy JWT Token
        ↓
4. Test Protected APIs
        ↓
5. Verify Database
```

---

# AUTHENTICATION MODULE

---

## Register User

### Endpoint

POST

```
http://localhost:8080/api/auth/register
```

### Request

```json
{
    "username":"admin",
    "password":"123456",
    "role":"ADMIN"
}
```

### Expected Response

```
200 OK
```

```
User Registered Successfully
```

---

## Login User

### Endpoint

POST

```
http://localhost:8080/api/auth/login
```

### Request

```json
{
    "username":"admin",
    "password":"123456"
}
```

### Expected Response

```json
{
    "token":"JWT_TOKEN"
}
```

Copy the token.

---

# USING JWT TOKEN

Open

Authorization

Choose

```
Bearer Token
```

Paste

```
JWT_TOKEN
```

Every protected API must contain this token.

---

# ROLE TESTING

Create three users.

---

## ADMIN

```json
{
    "username":"admin",
    "password":"123456",
    "role":"ADMIN"
}
```

---

## DISPATCHER

```json
{
    "username":"dispatcher",
    "password":"123456",
    "role":"DISPATCHER"
}
```

---

## HOSPITAL

```json
{
    "username":"hospital",
    "password":"123456",
    "role":"HOSPITAL"
}
```

---

# EMERGENCY MODULE

---

## Create Emergency

POST

```
/api/emergencies
```

Body

```json
{
  "callerName":"Keshav",
  "phone":"9876543210",
  "latitude":30.7333,
  "longitude":76.7794,
  "emergencyType":"ACCIDENT"
}
```

Expected

```
201 Created
```

---

## Get All Emergencies

GET

```
/api/emergencies
```

Expected

```
200 OK
```

---

## Get Emergency By ID

GET

```
/api/emergencies/1
```

Expected

```
200 OK
```

---

# HOSPITAL MODULE

---

## Add Hospital

POST

```
/api/hospitals
```

---

## Get Hospitals

GET

```
/api/hospitals
```

---

## Update Hospital

PUT

```
/api/hospitals/{id}
```

---

## Delete Hospital

DELETE

```
/api/hospitals/{id}
```

---

# AMBULANCE MODULE

---

## Add Ambulance

POST

```
/api/ambulances
```

---

## Get Ambulances

GET

```
/api/ambulances
```

---

## Update Ambulance

PUT

```
/api/ambulances/{id}
```

---

## Delete Ambulance

DELETE

```
/api/ambulances/{id}
```

---

# DISPATCH MODULE

---

## Manual Dispatch

POST

```
/api/dispatch/manual
```

---

## Auto Dispatch

POST

```
/api/dispatch/auto
```

---

## Dispatch History

GET

```
/api/dispatch
```

---

# ROUTING MODULE

---

## Get Shortest Route

GET

```
/api/routes/shortest
```

---

## Block Road

POST

```
/api/routes/block
```

---

## Unblock Road

POST

```
/api/routes/unblock
```

---

## Add Traffic Delay

POST

```
/api/routes/traffic
```

---

## Clear Traffic Delay

POST

```
/api/routes/traffic/clear
```

---

# SECURITY TESTING

---

## Without JWT

Expected

```
401 Unauthorized
```

---

## Invalid JWT

Expected

```
401 Unauthorized
```

---

## Expired JWT

Expected

```
401 Unauthorized
```

---

## ADMIN Access

Can access

```
Hospitals

Ambulances

Dispatch

Emergency APIs
```

---

## DISPATCHER Access

Can access

```
Emergency APIs

Dispatch APIs
```

Cannot access

```
Hospital Management

Ambulance Management
```

Expected

```
403 Forbidden
```

---

## HOSPITAL Access

Can access

```
Hospital APIs
```

Cannot access

```
Dispatch

Emergency

Admin APIs
```

Expected

```
403 Forbidden
```

---

# POSTMAN COLLECTION STRUCTURE

Create folders.

```
Authentication

    Register

    Login

Emergency

    Create

    Get All

    Get By ID

Hospital

    Add

    Update

    Delete

    Get

Ambulance

    Add

    Update

    Delete

    Get

Dispatch

    Manual

    Auto

    History

Routing

    Shortest Path

    Block Road

    Unblock Road

    Traffic Delay

    Clear Delay
```

---

# FINAL TESTING CHECKLIST

Authentication

```
☐ Register User

☐ Login User

☐ Receive JWT
```

Emergency

```
☐ Create Emergency

☐ View Emergency

☐ Validation Works
```

Hospital

```
☐ CRUD Tested
```

Ambulance

```
☐ CRUD Tested
```

Dispatch

```
☐ Manual Dispatch

☐ Auto Dispatch
```

Routing

```
☐ Shortest Route

☐ Road Blocking

☐ Traffic Delay
```

Security

```
☐ JWT Validation

☐ Invalid Token

☐ Role Testing

☐ Unauthorized Requests
```

Database

```
☐ Verify Users

☐ Verify Emergencies

☐ Verify Dispatch Records
```

---

# Notes

Always

```
Register

↓

Login

↓

Copy JWT

↓

Use Bearer Token

↓

Test APIs

↓

Verify Database
```

---

End of File
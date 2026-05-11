# Subscription Billing System

A Spring Boot REST API project for managing users, subscription plans, subscriptions, and payments.

---

# Features

- User Registration & Login
- Manage Subscription Plans
- Create and Manage Subscriptions
- Payment Management
- REST APIs with CRUD Operations
- Layered Architecture
- Exception Handling
- DTO Implementation
- Security Configuration
- Postman API Testing

---

# Technologies Used

- Java 17
- Spring Boot
- Spring Data JPA
- Hibernate
- MySQL / H2 Database
- Maven
- Eclipse IDE
- Postman

---

# Project Structure

```text
src/main/java/com/billing/system
│
├── audit
├── config
├── controller
├── dto
├── entity
├── exception
├── repository
├── security
├── service
│   └── impl
├── util
└── SubscriptionBillingSystemApplication.java
```

---

# Modules

## User Module
- Register User
- Login User
- Get All Users
- Get User By ID
- Update User
- Delete User

---

## Plan Module
- Create Plan
- Get All Plans
- Get Plan By ID
- Update Plan
- Delete Plan

---

## Subscription Module
- Create Subscription
- Get All Subscriptions
- Get Subscription By ID
- Cancel Subscription

---

## Payment Module
- Create Payment
- Get All Payments

---

# API Endpoints

## User APIs

| Method | Endpoint |
|--------|----------|
| POST | `/api/users/register` |
| POST | `/api/users/login` |
| GET | `/api/users` |
| GET | `/api/users/{id}` |
| PUT | `/api/users/{id}` |
| DELETE | `/api/users/{id}` |

---

## Plan APIs

| Method | Endpoint |
|--------|----------|
| POST | `/api/plans` |
| GET | `/api/plans` |
| GET | `/api/plans/{id}` |
| PUT | `/api/plans/{id}` |
| DELETE | `/api/plans/{id}` |

---

## Subscription APIs

| Method | Endpoint |
|--------|----------|
| POST | `/api/subscriptions` |
| GET | `/api/subscriptions` |
| GET | `/api/subscriptions/{id}` |
| PUT | `/api/subscriptions/{id}/cancel` |

---

## Payment APIs

| Method | Endpoint |
|--------|----------|
| POST | `/api/payments` |
| GET | `/api/payments` |

---

# Database Configuration

## application.properties

```properties
spring.datasource.url=jdbc:mysql://localhost:3306/subscription_db
spring.datasource.username=root
spring.datasource.password=root

spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true

server.port=8080
```

---

# How to Run the Project

## Step 1: Clone Repository

```bash
git clone https://github.com/SWATHIPALLA123/subscription-billing-system.git
```

---

## Step 2: Open Project

Open the project in:
- Eclipse IDE
or
- IntelliJ IDEA

---

## Step 3: Configure Database

Update database credentials inside:

```text
src/main/resources/application.properties
```

---

## Step 4: Run Application

Run the main class:

```text
SubscriptionBillingSystemApplication.java
```

---

## Step 5: Test APIs

Use:
- Postman
or
- Swagger UI

---

# Sample Request JSON

## Register User

```json
{
  "name": "Swathi",
  "email": "swathi@gmail.com",
  "password": "1234"
}
```

---

## Create Plan

```json
{
  "planName": "Premium",
  "price": 999,
  "duration": 30
}
```

---

## Create Subscription

```json
{
  "userId": 1,
  "planId": 1,
  "status": "ACTIVE"
}
```

---

# Future Enhancements

- JWT Authentication
- Role-Based Authorization
- Email Notifications
- Payment Gateway Integration
- Docker Deployment
- Swagger Documentation

---

# Author

## Swathi Palla

GitHub:
https://github.com/SWATHIPALLA123

Repository:
https://github.com/SWATHIPALLA123/subscription-billing-system

---

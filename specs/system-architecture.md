# System Architecture Specification

## 1. Overview
- **System Name:** E-commerce backend
- **Architectural Style:** Layered Architecture

---

## 2. Tech Stack
- **Language:** Java 17
- **Framework:** Spring Boot 4.1.0
- **Database:** PostgreSQL
- **Build Tool:** Maven

---

## 3. Package Structure
```text
src/main/java/com/example/e_commerce
├── config/          # Data initialization, Bean configurations, Spring Security
├── controller/      # REST Endpoints
├── dto/             # Data Transfer Objects
├── entity/          # JPA Domain Entities
├── repository/      # Spring Data JPA repositories
├── service/         # Business logic implementations
```
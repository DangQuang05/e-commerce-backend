# AGENTS.md

> Instructions and operational guidelines for AI coding agents working on this codebase.

## Key Commands

- **Build project:** `mvn clean package`
- **Run project:** `mvn spring-boot:run`

## Package Structure

```text
src/main/java/com/example/e_commerce
├── config/          # Data initialization, Bean configurations
├── controller/      # REST Endpoints
├── dto/             # Data Transfer Objects
├── entity/          # JPA Domain Entities
├── repository/      # Spring Data JPA repositories
├── service/         # Business logic implementations
```
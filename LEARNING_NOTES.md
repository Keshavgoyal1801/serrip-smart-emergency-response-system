# 📅 Day 1 — Project Initialization & Environment Setup

## 🎯 Objective

- Set up the development environment.
- Initialize version control.
- Create the project repository.
- Establish the project structure.

---

## 🛠️ What I Built

- Initialized local Git repository.
- Created GitHub repository.
- Configured Git remote.
- Created initial project folder structure.
- Added project documentation files.

---

## 📚 What I Learned

- Git and GitHub workflow.
- Importance of version control.
- Repository structure for scalable projects.
- Basic Git commands:
    - `git init`
    - `git add`
    - `git commit`
    - `git push`

---

## 💡 Important Points

- Use meaningful commit messages.
- Commit small logical changes instead of large batches.
- Keep project documentation updated from Day 1.
- Version control is essential for collaboration and project history.

---

## 🎤 Interview Questions

### Basic

**Q1. What is Git?**
- A distributed version control system used to track source code changes.

**Q2. What is GitHub?**
- A cloud platform used to host and manage Git repositories.

---

### Intermediate

**Q3. Difference between Git and GitHub?**
- Git is a version control tool.
- GitHub is a repository hosting platform.

**Q4. What is a commit?**
- A snapshot of project changes saved in Git history.

---

### Project-Based

**Q5. Why did you use Git in this project?**
- To maintain version history, collaborate efficiently, and safely manage source code.

**Q6. What makes a good commit message?**
- A short, descriptive message explaining the purpose of the change.

---

## 🚀 Outcome

Successfully established the project foundation with Git, GitHub, and a structured development workflow, creating a solid base for future development.

# 📅 Day 2 — Spring Boot Project Setup & MySQL Integration

## 🎯 Objective

- Set up the Spring Boot backend application.
- Configure Maven dependencies.
- Connect the application with MySQL.
- Establish the project architecture.

---

## 🛠️ What I Built

### Spring Boot Setup
- Created Spring Boot project using Spring Initializr.
- Configured Maven build system.
- Added required dependencies:
  - Spring Web
  - Spring Data JPA
  - MySQL Driver
  - Validation

### Database Integration
- Connected Spring Boot with MySQL.
- Configured database properties in `application.properties`.
- Verified successful database connection.

### Project Structure
- Created standard package structure:
  - controller
  - service
  - repository
  - entity
  - dto
  - exception
  - response

---

## 📚 What I Learned

### Spring Boot
- Spring Boot simplifies application development through auto-configuration.
- Starter dependencies reduce manual configuration.
- Embedded Tomcat eliminates external server setup.

### Maven
- Maven manages project dependencies automatically.
- `pom.xml` acts as the project's build configuration file.

### Spring Data JPA
- JPA provides Object Relational Mapping (ORM).
- Hibernate is the default JPA implementation in Spring Boot.

### MySQL Integration
- Spring Boot connects to MySQL using datasource properties.
- JPA automatically manages database operations.

---

## 💡 Important Points

- Always organize the project using layered architecture.
- Keep database credentials inside configuration files.
- Maven automatically downloads required libraries.
- Spring Boot starts an embedded server by default.

---

## 🎤 Interview Questions

### Basic

**Q1. What is Spring Boot?**
- Spring Boot is a Java framework that simplifies Spring application development using auto-configuration and starter dependencies.

**Q2. What is Maven?**
- Maven is a build automation and dependency management tool for Java projects.

---

### Intermediate

**Q3. Why do we use Spring Data JPA?**
- It reduces boilerplate code by providing built-in CRUD operations and repository support.

**Q4. What is ORM?**
- Object Relational Mapping (ORM) maps Java objects to database tables.

---

### Project-Based

**Q5. Why did you choose Spring Boot for SERRIP?**
- It enables rapid backend development with REST APIs, dependency injection, JPA integration, and production-ready features.

**Q6. Why did you use MySQL?**
- MySQL is reliable, open-source, easy to integrate with Spring Boot, and suitable for relational data management.

---

## 🚀 Outcome

Successfully established the backend foundation by integrating Spring Boot with MySQL, configuring Maven dependencies, and creating a scalable project structure for future development.

# 📅 Day 2 — Spring Boot Project Setup & MySQL Integration

## 🎯 Objective

- Set up the Spring Boot backend application.
- Configure Maven dependencies.
- Connect the application with MySQL.
- Establish the project architecture.

---

## 🛠️ What I Built

### Spring Boot Setup
- Created Spring Boot project using Spring Initializr.
- Configured Maven build system.
- Added required dependencies:
  - Spring Web
  - Spring Data JPA
  - MySQL Driver
  - Validation

### Database Integration
- Connected Spring Boot with MySQL.
- Configured database properties in `application.properties`.
- Verified successful database connection.

### Project Structure
- Created standard package structure:
  - controller
  - service
  - repository
  - entity
  - dto
  - exception
  - response

---

## 📚 What I Learned

### Spring Boot
- Spring Boot simplifies application development through auto-configuration.
- Starter dependencies reduce manual configuration.
- Embedded Tomcat eliminates external server setup.

### Maven
- Maven manages project dependencies automatically.
- `pom.xml` acts as the project's build configuration file.

### Spring Data JPA
- JPA provides Object Relational Mapping (ORM).
- Hibernate is the default JPA implementation in Spring Boot.

### MySQL Integration
- Spring Boot connects to MySQL using datasource properties.
- JPA automatically manages database operations.

---

## 💡 Important Points

- Always organize the project using layered architecture.
- Keep database credentials inside configuration files.
- Maven automatically downloads required libraries.
- Spring Boot starts an embedded server by default.

---

## 🎤 Interview Questions

### Basic

**Q1. What is Spring Boot?**
- Spring Boot is a Java framework that simplifies Spring application development using auto-configuration and starter dependencies.

**Q2. What is Maven?**
- Maven is a build automation and dependency management tool for Java projects.

---

### Intermediate

**Q3. Why do we use Spring Data JPA?**
- It reduces boilerplate code by providing built-in CRUD operations and repository support.

**Q4. What is ORM?**
- Object Relational Mapping (ORM) maps Java objects to database tables.

---

### Project-Based

**Q5. Why did you choose Spring Boot for SERRIP?**
- It enables rapid backend development with REST APIs, dependency injection, JPA integration, and production-ready features.

**Q6. Why did you use MySQL?**
- MySQL is reliable, open-source, easy to integrate with Spring Boot, and suitable for relational data management.

---

## 🚀 Outcome

Successfully established the backend foundation by integrating Spring Boot with MySQL, configuring Maven dependencies, and creating a scalable project structure for future development.

# 📅 Day 6 — Ambulance Management Module

## 🎯 Objective

- Develop the Ambulance Management module.
- Implement ambulance CRUD operations.
- Manage ambulance availability and status.

---

## 🛠️ What I Built

### Ambulance Module
- Created Ambulance entity.
- Implemented Repository layer.
- Implemented Service layer.
- Implemented Controller layer.
- Developed CRUD APIs.

### Ambulance Status
- Added ambulance availability.
- Managed operational status.
- Linked ambulances with hospitals.

---

## 📚 What I Learned

### Spring Boot
- CRUD implementation
- RESTful API design
- Layered architecture
- Repository operations

### Database
- Entity relationships
- Foreign key mapping
- Data persistence

---

## 💡 Important Points

- Separate ambulance data from emergency requests.
- Keep business logic inside the Service layer.
- Design entities for future scalability.
- Maintain consistent API structure.

---

## 🎤 Interview Questions

### Basic

**Q1. Why create a separate Ambulance entity?**
- To manage ambulance information independently.

**Q2. What is a Repository?**
- A Spring Data interface for database operations.

### Intermediate

**Q3. Why separate Hospital and Ambulance modules?**
- To improve modularity and maintainability.

**Q4. What is constructor injection?**
- Injecting dependencies through constructors for better immutability.

### Project-Based

**Q5. How is ambulance availability managed?**
- Using a status field that changes during dispatch operations.

**Q6. Why is modular design important?**
- It allows independent development, testing, and future expansion.

---

## 🚀 Outcome

Completed the Ambulance Management module with CRUD operations and status management, providing the foundation for emergency dispatch.

---

# 📅 Day 7 — Dispatch Engine

## 🎯 Objective

- Build the dispatch engine.
- Assign ambulances to emergency requests.
- Maintain dispatch records.

---

## 🛠️ What I Built

### Dispatch Module
- Created DispatchRecord entity.
- Implemented Repository layer.
- Implemented Service layer.
- Developed Dispatch APIs.

### Dispatch Logic
- Manual ambulance assignment.
- Ambulance status updates.
- Dispatch history management.

---

## 📚 What I Learned

### Spring Boot
- Service-to-Service communication
- Business logic implementation
- Entity relationships

### Design Concepts
- Separation of concerns
- Real-world workflow modeling

---

## 💡 Important Points

- Update ambulance status immediately after dispatch.
- Record every dispatch for future tracking.
- Keep dispatch logic inside the Service layer.
- Maintain transactional consistency.

---

## 🎤 Interview Questions

### Basic

**Q1. What is a dispatch record?**
- A record storing ambulance assignment details for an emergency.

**Q2. Why maintain dispatch history?**
- For tracking, auditing, and reporting.

### Intermediate

**Q3. Why shouldn't dispatch logic be inside the controller?**
- Controllers should only process HTTP requests; business logic belongs in the Service layer.

**Q4. Why update ambulance status after dispatch?**
- To prevent assigning the same ambulance multiple times.

### Project-Based

**Q5. Explain your dispatch workflow.**
- Emergency Request → Find Ambulance → Create Dispatch Record → Update Ambulance Status.

**Q6. What improvements can be added later?**
- Automatic dispatch, priority handling, ETA estimation, and route optimization.

---

## 🚀 Outcome

Developed the core Dispatch Engine capable of assigning ambulances, updating their status, and maintaining dispatch history.

---

# 📅 Day 8 — Smart Ambulance Selection

## 🎯 Objective

- Automate ambulance selection.
- Assign the nearest available ambulance.
- Introduce intelligent dispatch logic.

---

## 🛠️ What I Built

### Smart Dispatch
- Automatic ambulance assignment.
- Nearest ambulance selection.
- Distance calculation logic.
- Availability filtering.

### API Enhancements
- Auto Dispatch API.
- Dispatch optimization workflow.

---

## 📚 What I Learned

### Algorithms
- Distance-based resource selection.
- Search optimization.
- Greedy decision-making.

### System Design
- Resource allocation.
- Real-time decision making.
- Service abstraction.

---

## 💡 Important Points

- Always filter unavailable ambulances first.
- Minimize response time by selecting the nearest resource.
- Keep selection logic reusable.
- Prepare the system for graph-based routing.

---

## 🎤 Interview Questions

### Basic

**Q1. How do you select an ambulance?**
- By checking availability and calculating the shortest distance.

**Q2. Why automate ambulance assignment?**
- To reduce manual effort and improve response time.

### Intermediate

**Q3. Which algorithm is currently used for ambulance selection?**
- A distance comparison approach (later upgraded with Dijkstra's Algorithm).

**Q4. Why is automatic dispatch better than manual dispatch?**
- It is faster, more accurate, and reduces human error.

### Project-Based

**Q5. How will your dispatch engine improve in the future?**
- By integrating graph algorithms, live traffic data, and dynamic route optimization.

**Q6. Why is this considered an intelligent feature?**
- Because the system makes automated decisions based on resource availability and distance.

---

## 🚀 Outcome

Implemented the first intelligent component of the system by automatically selecting the nearest available ambulance, significantly improving dispatch efficiency.

# 📅 Day 9 — Graph-Based Road Network

## 🎯 Objective

- Model the city road network using Graph Data Structures.
- Represent locations and roads for route planning.
- Prepare the foundation for shortest path algorithms.

---

## 🛠️ What I Built

### Graph Models
- Created `GraphNode` model.
- Created `GraphEdge` model.
- Implemented `RoadGraph`.
- Used Adjacency List representation.

### Routing Foundation
- Added road connections.
- Stored road distances.
- Built graph initialization logic.

---

## 📚 What I Learned

### Data Structures
- Graph
- Adjacency List
- Weighted Graph
- Directed vs Undirected Graph

### Design Concepts
- Graph Modeling
- Network Representation
- Route Planning

---

## 💡 Important Points

- Adjacency List is memory efficient.
- Weighted graphs store road distances.
- Graph modeling is widely used in GPS systems.
- Good graph design improves algorithm performance.

---

## 🎤 Interview Questions

### Basic

**Q1. Why use Graphs in this project?**
- To represent locations and roads for route calculation.

**Q2. What is an Adjacency List?**
- A graph representation where each node stores its connected neighbors.

### Intermediate

**Q3. Why choose Adjacency List over Adjacency Matrix?**
- Better memory usage and faster traversal for sparse graphs.

**Q4. What is a Weighted Graph?**
- A graph where every edge has an associated cost or distance.

### Project-Based

**Q5. How is your city represented?**
- As a weighted graph where hospitals and intersections are nodes, and roads are edges.

**Q6. Why is Graph modeling important in emergency systems?**
- It enables efficient route computation and optimization.

---

## 🚀 Outcome

Designed a scalable graph-based road network that serves as the foundation for intelligent routing.

---

# 📅 Day 10 — Dijkstra's Shortest Path Algorithm

## 🎯 Objective

- Implement the shortest path algorithm.
- Optimize ambulance routing.
- Improve routing efficiency.

---

## 🛠️ What I Built

### Routing Engine
- Implemented Dijkstra's Algorithm.
- Used Java Priority Queue (Min Heap).
- Added distance tracking.
- Added previous node tracking.
- Implemented path reconstruction.

### Route APIs
- Shortest Route API.
- RouteResult model.

---

## 📚 What I Learned

### Algorithms
- Dijkstra's Algorithm
- Greedy Algorithm
- Min Heap
- Priority Queue

### Complexity
- Time Complexity: **O(E log V)**
- Space Complexity: **O(V)**

---

## 💡 Important Points

- Dijkstra works only for non-negative edge weights.
- Priority Queue significantly improves performance.
- Previous node array is required for path reconstruction.
- Always initialize source distance as zero.

---

## 🎤 Interview Questions

### Basic

**Q1. Why use Dijkstra's Algorithm?**
- To find the shortest path in a weighted graph.

**Q2. Why use Priority Queue?**
- It efficiently selects the next minimum-distance node.

### Intermediate

**Q3. Time Complexity of your implementation?**
- **O(E log V)**

**Q4. Why not BFS?**
- BFS only works for unweighted graphs.

### Project-Based

**Q5. How does your routing engine work?**
- The graph is traversed using Dijkstra's Algorithm to compute the shortest route.

**Q6. Why is your implementation better than a basic implementation?**
- It uses a Min Heap, improving performance from **O(V²)** to **O(E log V)**.

---

## 🚀 Outcome

Successfully implemented an optimized shortest path engine capable of finding the fastest ambulance routes.

---

# 📅 Day 11 — Dynamic Traffic & Road Blockage Management

## 🎯 Objective

- Simulate real-world traffic conditions.
- Handle blocked roads dynamically.
- Recalculate routes automatically.

---

## 🛠️ What I Built

### Dynamic Routing
- Road Blocking API.
- Road Unblocking API.
- Traffic Delay API.
- Traffic Delay Removal API.

### Route Updates
- Dynamic route recalculation.
- Traffic-aware routing.
- Road status management.

---

## 📚 What I Learned

### Concepts
- Dynamic Graph Updates
- Route Recalculation
- Traffic Simulation

### System Design
- Real-time routing
- Intelligent navigation

---

## 💡 Important Points

- Road conditions change frequently.
- Dynamic updates improve routing accuracy.
- Route recalculation minimizes response time.
- Separate traffic logic from routing logic.

---

## 🎤 Interview Questions

### Basic

**Q1. Why simulate traffic?**
- To make route planning more realistic.

**Q2. What happens when a road is blocked?**
- The routing engine recalculates an alternative path.

### Intermediate

**Q3. How does dynamic routing work?**
- The graph is updated before executing Dijkstra's Algorithm.

**Q4. Why separate traffic updates from graph creation?**
- To allow real-time modifications without rebuilding the graph.

### Project-Based

**Q5. How does your system handle emergencies during traffic?**
- It recalculates the shortest available route using updated graph data.

**Q6. Why is dynamic routing important?**
- Static routes may become invalid due to accidents or road closures.

---

## 🚀 Outcome

Enhanced the routing engine with real-time road updates, enabling intelligent route recalculation.

---

# 📅 Day 12 — Smart Route Optimization & API Testing

## 🎯 Objective

- Complete the routing module.
- Expose routing APIs.
- Verify the complete routing workflow.

---

## 🛠️ What I Built

### Routing APIs
- Route Controller.
- Graph Controller.
- RouteResult response model.
- Route testing endpoints.

### Testing
- Complete Postman test suite.
- Verified shortest path calculation.
- Tested traffic-aware routing.
- Tested road blockage scenarios.

---

## 📚 What I Learned

### API Design
- REST API testing
- Request-response validation
- Route response modeling

### Backend Concepts
- End-to-end testing
- API verification
- Debugging complex workflows

---

## 💡 Important Points

- Test every edge case.
- Verify shortest path after graph updates.
- Maintain consistent API responses.
- Good testing increases system reliability.

---

## 🎤 Interview Questions

### Basic

**Q1. Why use Postman?**
- To test REST APIs independently of the frontend.

**Q2. What is API testing?**
- Verifying API functionality, correctness, and responses.

### Intermediate

**Q3. How did you verify Dijkstra's Algorithm?**
- By testing multiple graph scenarios and comparing expected routes.

**Q4. Why create RouteResult instead of returning raw data?**
- To provide structured, reusable API responses.

### Project-Based

**Q5. What is the biggest technical achievement in your project?**
- Developing an optimized graph-based routing engine using Dijkstra's Algorithm with dynamic traffic updates.

**Q6. Which DSA concepts are used in your project?**
- Graphs, Priority Queue (Min Heap), Greedy Algorithm, Adjacency List, Shortest Path.

---

## 🚀 Outcome

Completed the intelligent routing engine with optimized shortest path computation, dynamic traffic handling, and thoroughly tested REST APIs.

# 📅 Day 13 — Spring Security Foundation

## 🎯 Objective

- Secure the backend using Spring Security.
- Configure authentication and authorization.
- Protect application endpoints.

---

## 🛠️ What I Built

### Security Configuration
- Added Spring Security dependency.
- Configured `SecurityConfig`.
- Configured BCrypt Password Encoder.
- Configured Authentication Manager.
- Enabled Stateless Session Management.

### User Management
- Created User Entity.
- Created Role Enum.
- Created User Repository.
- Implemented CustomUserDetailsService.

---

## 📚 What I Learned

### Spring Security
- Authentication vs Authorization
- Security Filter Chain
- Password Encoding
- UserDetailsService
- Stateless Authentication

---

## 💡 Important Points

- Passwords should never be stored in plain text.
- BCrypt is the recommended password encoder.
- Stateless APIs are ideal for REST applications.
- Security configuration should follow the principle of least privilege.

---

## 🎤 Interview Questions

### Basic

**Q1. What is Spring Security?**
- A framework that provides authentication and authorization for Java applications.

**Q2. Why use BCrypt?**
- It securely hashes passwords using salting and adaptive hashing.

### Intermediate

**Q3. Authentication vs Authorization?**
- Authentication verifies identity; Authorization determines permissions.

**Q4. Why Stateless Sessions?**
- They improve scalability and are ideal for JWT-based authentication.

### Project-Based

**Q5. How is security configured in your project?**
- Using SecurityFilterChain, BCrypt, AuthenticationManager, and role-based endpoint protection.

**Q6. Why did you choose Spring Security?**
- It provides production-ready authentication, authorization, and secure API protection.

---

## 🚀 Outcome

Established a secure backend foundation with Spring Security, user management, and role-based access configuration.

---

# 📅 Day 14 — User Authentication

## 🎯 Objective

- Implement user registration and login.
- Store encrypted passwords.
- Generate authentication tokens.

---

## 🛠️ What I Built

### Authentication Module
- Register API.
- Login API.
- RegisterRequest DTO.
- LoginRequest DTO.
- LoginResponse DTO.
- AuthenticationService.

### User Management
- Password encryption.
- Duplicate username validation.
- User persistence.

---

## 📚 What I Learned

### Authentication
- User Registration
- Login Flow
- AuthenticationManager
- Password Encryption

### Spring Boot
- DTO Pattern
- Service Layer Authentication

---

## 💡 Important Points

- Always validate user credentials.
- Never expose passwords in responses.
- Encrypt passwords before storing them.
- Separate authentication logic from controllers.

---

## 🎤 Interview Questions

### Basic

**Q1. Why encrypt passwords?**
- To protect user credentials in case of database compromise.

**Q2. What is AuthenticationManager?**
- A Spring Security component responsible for authenticating users.

### Intermediate

**Q3. Why validate duplicate usernames?**
- To maintain unique user identities.

**Q4. Why use DTOs for authentication?**
- To separate API requests from database entities.

### Project-Based

**Q5. Describe your login workflow.**
- User submits credentials → AuthenticationManager verifies → JWT is generated.

**Q6. How are passwords stored?**
- Using BCrypt hashing.

---

## 🚀 Outcome

Completed secure user registration and login with encrypted password storage and authentication support.

---

# 📅 Day 15 — JWT Authentication & Role-Based Security

## 🎯 Objective

- Secure APIs using JWT.
- Implement role-based authorization.
- Protect application endpoints.

---

## 🛠️ What I Built

### JWT Module
- JwtService.
- JWT Generation.
- JWT Validation.
- Username Extraction.
- Token Expiration Validation.

### Security
- JwtAuthenticationFilter.
- SecurityContext Authentication.
- Protected API Configuration.
- Method-Level Security.
- Role-Based Authorization.

### Testing
- Registered multiple users.
- Verified ADMIN, DISPATCHER, and HOSPITAL access.
- Tested protected endpoints using Postman.

---

## 📚 What I Learned

### Security
- JWT Architecture
- Bearer Authentication
- SecurityContextHolder
- OncePerRequestFilter
- @PreAuthorize

### Authorization
- Role-Based Access Control (RBAC)
- Method Security
- Endpoint Security

---

## 💡 Important Points

- JWT is sent in the Authorization header.
- APIs remain stateless.
- Roles should determine endpoint accessibility.
- Protect sensitive APIs using method-level security.

---

## 🎤 Interview Questions

### Basic

**Q1. What is JWT?**
- A JSON Web Token used for secure stateless authentication.

**Q2. What is Bearer Token Authentication?**
- Sending the JWT inside the Authorization header.

### Intermediate

**Q3. Why use OncePerRequestFilter?**
- To authenticate every request exactly once.

**Q4. Why use @PreAuthorize?**
- To enforce authorization at the method level.

### Project-Based

**Q5. How does JWT authentication work in your project?**
- Login generates a JWT, which is validated on every protected request using JwtAuthenticationFilter.

**Q6. How did you implement RBAC?**
- Using Spring Security roles and @PreAuthorize annotations.

---

## 🚀 Outcome

Successfully implemented JWT-based authentication and role-based authorization, securing all critical backend APIs.

---

# 📅 Day 16 — Production-Ready Security & Final Testing

## 🎯 Objective

- Improve backend security.
- Handle unauthorized access gracefully.
- Finalize authentication workflow.

---

## 🛠️ What I Built

### Security Enhancements
- JwtAuthenticationEntryPoint.
- JwtAccessDeniedHandler.
- Logout API.
- Token Blacklisting.
- BlacklistedToken Entity.
- BlacklistedToken Repository.

### Final Testing
- Tested registration.
- Tested login.
- Tested logout.
- Verified token invalidation.
- Verified protected APIs.
- Tested role-based authorization.
- Completed complete Postman test suite.

---

## 📚 What I Learned

### Security
- AuthenticationEntryPoint
- AccessDeniedHandler
- Token Revocation
- Logout Workflow

### Production Practices
- Secure error responses
- Token invalidation
- API security testing

---

## 💡 Important Points

- Logout should invalidate JWTs.
- Unauthorized and Forbidden responses should be handled separately.
- Centralized security handling improves maintainability.
- Thorough API testing ensures production readiness.

---

## 🎤 Interview Questions

### Basic

**Q1. Difference between 401 and 403?**
- 401: Authentication required.
- 403: Authenticated but lacks permission.

**Q2. Why blacklist tokens?**
- To invalidate JWTs after logout.

### Intermediate

**Q3. What is AuthenticationEntryPoint?**
- Handles unauthorized access (401).

**Q4. What is AccessDeniedHandler?**
- Handles forbidden access (403).

### Project-Based

**Q5. How does logout work in your project?**
- The JWT is stored in a blacklist, preventing further use.

**Q6. How did you verify backend security?**
- By testing authentication, authorization, logout, invalid tokens, and role-based access using Postman.

---

## 🚀 Outcome

Completed a production-ready backend security system with JWT authentication, role-based authorization, logout support, token blacklisting, centralized security handling, and comprehensive API testing.
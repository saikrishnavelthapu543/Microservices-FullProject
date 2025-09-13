Microservices Full Project

This is a full microservice-based setup using Spring Boot. It includes multiple services like API Gateway, Eureka server, Config server, and domain modules (Employee and Employee Address) to demonstrate service discovery, centralized configuration, routing, and modular communication.

📂 Repository Structure
employee/ — Employee domain service
employeeaddress/ — Employee Address domain service
employeeApiGateway/ — API Gateway for routing requests
employeeEureka/ — Eureka server for service discovery
employeeconfig-server/ — Config server for centralized configurations
pom.xml — Parent Maven file managing modules

🚀 Features
Centralized configuration via Config Server
Service discovery using Eureka
API routing through Gateway
Domain-based microservices for Employee and Address data
Modular architecture for independent deployment and scaling

🛠️ Tech Stack & Dependencies
Java + Spring Boot
Spring Cloud components (Eureka, Gateway, Config Server)
Maven for build & dependency management
.properties or YAML configuration files

⚙️ How to Run
Clone the repository:
git clone https://github.com/saikrishnavelthapu543/Microservices-FullProject.git
Build all modules with Maven:
mvn clean install
Start services in this order:
Config Server
Eureka Server
Employee & Employee Address services
API Gateway
Use Gateway endpoints to communicate with underlying domain services.

🔍 Usage Examples
Access employee details via API Gateway (e.g. GET /employee/{id})
Add or update employee address through Address service (via API Gateway)
View services registered in Eureka dashboard
Fetch configuration values from Config Server

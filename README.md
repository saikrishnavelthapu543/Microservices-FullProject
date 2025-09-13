# Microservices Full Project

A full microservices ecosystem composed of multiple Spring Boot services, including API Gateway, Eureka Discovery, Config Server, and domain services like Employee & Employee Address. This setup demonstrates microservice communication, centralized configuration, service discovery, and API routing.

---

## 📂 Repository Structure

- `employee` — The Employee domain service, which handles employee data.  
- `employeeaddress` — The Employee Address domain service, handling address-related data for employees.  
- `employeeApiGateway` — API Gateway service, routing incoming requests to appropriate microservices.  
- `employeeEureka` — Eureka Server for service discovery and registry.  
- `employeeconfig-server` — Configuration Server to provide centralized configuration for all microservices.  
- `pom.xml` — Parent/project-level configuration (aggregates modules).

---

## 🚀 Features

- Centralized Configuration using a Config Server  
- Service Discovery with Eureka  
- API Routing via API Gateway  
- Domain Services for Employee and Employee Address  
- Modular structure allowing independent development and deployment of services  

---

## 🛠️ Tech Stack & Dependencies

- Java (Spring Boot for each microservice)  
- Spring Cloud Ecosystem: Eureka, Gateway, Config Server  
- Maven for building, dependency management, and module setup  
- Properties / YAML configuration files managed via Config Server  

---

## ⚙️ How to Run

1. Clone the repository:  
   ```bash
   git clone https://github.com/saikrishnavelthapu543/Microservices-FullProject.git
Navigate into each service and build using Maven (or from the root if using a multi-module setup):
mvn clean install
Start services in this order (or via scripts if made):
Config Server
Eureka Server
Domain Services (Employee & Employee Address)
API Gateway
Configure environment/application properties (if needed) in application.properties or via the Config Server.
Use API Gateway URLs to access services (routes defined by Gateway) and test endpoints.

🔍 Example Usage

Call endpoints via API Gateway (e.g. GET /employee/{id}, POST /employeeaddress)
Add / update / delete data through Employee or Employee Address service
See service discovery dashboard (Eureka) to confirm services are up
View config server responses to verify centralized configuration

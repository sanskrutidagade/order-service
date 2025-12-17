📦 Order Service – Spring Boot Microservice

📌 Overview

The Order Service is a Spring Boot microservice responsible for creating and retrieving orders.

It communicates with the Product Service via REST APIs to fetch product details during order creation.

  ⚠️ Note:
    Product Service must be running before starting Order Service.
    
🔗 Dependency on Product Service
Order Service depends on Product Service to:
 - Fetch product price
 - Validate product existence
 - Calculate total order amount

Product Service Repository:
👉 https://github.com/sanskrutidagade/product-service

Expected Product Service URL:
http://localhost:8080

🚀 Features
 > Create an order for a product
 > Fetch order details by Order ID
 > Calculate total amount dynamically
 > REST-based inter-service communication
 > Uses JPA with H2 in-memory database

🔗 API Endpoints
🧾 Order APIs (Port: 8081)

| Method | Endpoint                                    | Description             |
| ------ | ------------------------------------------- | ----------------------- |
| POST   | `/api/orders?productId={id}&quantity={qty}` | Create a new order      |
| GET    | `/api/orders/{orderId}`                     | Get order details by ID |

🧪 API Testing – Postman
A Postman collection is included to test all Order Service endpoints.
📂 Path:                                                                                                                                                          
collection/product-order-service_collection.postman_collection.json
This collection covers:
Order creation
Order retrieval
End-to-end flow with Product Service

🛠️ Tech Stack
-Java    
-Spring Boot
-Spring Data JPA
-RESTful APIs
-H2 Database
-Maven
-Postman

▶️ How to Run the Application
1️⃣ Start Product Service (Required)
git clone https://github.com/sanskrutidagade/product-service.git
cd product-service
mvn spring-boot:run

Runs on:
http://localhost:8080

2️⃣ Start Order Service
git clone https://github.com/sanskrutidagade/order-service.git
cd order-service
mvn spring-boot:run

Runs on:
http://localhost:8081

🎯 Learning Outcomes
> Understood microservice dependencies
> Implemented REST-based service-to-service communication
> Designed clean, independent microservices
> Gained hands-on experience with API testing using Postman

🚧 Future Enhancements
# Replace RestTemplate with Feign Client
# Add centralized exception handling
# Add Swagger / OpenAPI documentation
# Containerize services using Docker
# Service discovery using Eureka

👩‍💻 Author
Sanskruti Dagade
Java Backend Developer | Spring Boot | Microservices
🔗 GitHub: https://github.com/sanskrutidagade




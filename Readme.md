# Student API - Spring Boot

A simple RESTful API built with **Spring Boot**, designed to manage basic student data.  
This project was created as part of my Erasmus Internship application and demonstrates foundational backend development skills, including REST architecture, request handling, and in-memory data processing.

---

## 🚀 Features

- **GET /students**  
  Returns a list of all students currently stored in memory.

- **POST /students/add**  
  Adds a new student to the system.  
  Accepts a JSON body like:
  ```json
  {
    "name": "Alper",
    "age": 21
  }
Lightweight and easy to extend

Uses Spring Boot's built-in Tomcat server

No database required (in-memory list)



📂 Project Structure
css

src/
 └─ main/
     ├─ java/
     │   └─ com.alper.studentapi/
     │       ├─ controller/
     │       │   └─ StudentController.java
     │       ├─ model/
     │       │   └─ Student.java
     │       └─ StudentApiApplication.java
     └─ resources/
         └─ application.properties
pom.xml
📌 Technologies Used
Java 17+

Spring Boot 3

Maven

REST API

HTTP JSON communication

▶️ How to Run
Install Java 17 or above

Install Maven

Run the application:

bash

mvn spring-boot:run
or run StudentApiApplication directly from your IDE.

The API will be available at:

arduino

http://localhost:8080
🧪 API Testing Examples
GET all students
bash

GET http://localhost:8080/students
POST add a student
bash

POST http://localhost:8080/students/add
Content-Type: application/json
Body:

json

{
  "name": "Alper",
  "age": 21
}
📄 License
This project is open-source and free to use for educational or demonstration purposes.

Future Improvements

Move from in-memory to PostgreSQL / MySQL
Add validation (age > 0, name not empty, etc.)
Add Service layer + DTOs
Add Swagger/OpenAPI documentation
Add exception handling & custom error responses
Add unit tests (JUnit + Mockito)
Containerize with Docker
Implement JWT authentication



👤 Author
Alper B.
Computer Engineering Student
Atlas University
GitHub: https://github.com/alperbs

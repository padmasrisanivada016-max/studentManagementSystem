Student Management System

A full-stack Student Management System built using Java, JDBC, Spring Boot, Spring Data JPA, MySQL, HTML, CSS, and JavaScript.

🚀 Project Overview

This project demonstrates the development of a Student Management System in three stages:

1. Java + JDBC + MySQL
2. Spring Boot REST API + MySQL
3. HTML/CSS/JavaScript Frontend + Spring Boot REST API + MySQL

The final version allows users to add, view, update, and delete student records through a web browser.

🛠️ Technologies Used

- Java
- JDBC
- Spring Boot
- Spring Data JPA
- REST API
- MySQL
- HTML5
- CSS3
- JavaScript
- Fetch API
- Maven
- IntelliJ IDEA
- MySQL Workbench

✨ Features

- Add new students
- View all students
- Update student course
- Delete students
- Store student data in MySQL
- RESTful API for CRUD operations
- Web-based frontend
- Frontend and backend integration using Fetch API

🏗️ Project Architecture

Web Browser
     ↓
HTML + CSS + JavaScript
     ↓
Fetch API
     ↓
Spring Boot REST API
     ↓
Spring Data JPA
     ↓
MySQL Database

📂 Project Structure

StudentManagementSystem
│
├── src
│   └── main
│       └── java
│           └── org.example
│               ├── DBConnection.java
│               ├── Main.java
│               ├── Student.java
│               └── StudentDAO.java
│
├── student-api
│   └── student-api
│       └── src
│           ├── main
│           │   ├── java
│           │   │   └── com.example.student_api
│           │   │       ├── Student.java
│           │   │       ├── StudentRepository.java
│           │   │       ├── StudentController.java
│           │   │       └── StudentApiApplication.java
│           │   │
│           │   └── resources
│           │
│           └── test
│
├── StudentWeb
│   └── index.html
│
├── database.sql
├── pom.xml
└── README.md

🔗 REST API Endpoints

Method| Endpoint| Description
GET| "/api/students"| Get all students
POST| "/api/students"| Add a new student
PUT| "/api/students/{id}"| Update a student
DELETE| "/api/students/{id}"| Delete a student

🗄️ Database

The project uses MySQL with a database named:

student_db

Main table:

students

The table stores:

- ID
- Name
- Email
- Course

▶️ How to Run

1. Set up MySQL

Create the database and table using the SQL file:

database.sql

2. Run the Spring Boot Application

Open the "student-api" project in IntelliJ IDEA and run:

StudentApiApplication.java

The REST API runs on:

http://localhost:8081

3. Open the Frontend

Open:

StudentWeb/index.html

in a web browser.

The frontend communicates with the Spring Boot REST API using JavaScript Fetch API.

🔄 Application Flow

User
 ↓
StudentWeb/index.html
 ↓
JavaScript Fetch API
 ↓
Spring Boot Controller
 ↓
Student Repository
 ↓
MySQL

📌 Learning Outcomes

Through this project, I practiced:

- Core Java and JDBC
- Object-Oriented Programming
- Database connectivity
- SQL and MySQL
- Spring Boot
- Spring Data JPA
- REST API development
- CRUD operations
- HTML and CSS
- JavaScript
- Fetch API
- Frontend-backend integration
- Git and GitHub

👩‍💻 Author

Padma Sri Sanivada

B.Tech – Electronics and Communication Engineering
2026 Graduate

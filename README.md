# Employee Management System

A Java-based Employee Management System that performs CRUD operations on employee records using JDBC and MySQL. The project demonstrates object-oriented programming, database connectivity, exception handling, and CI/CD automation using Jenkins and GitHub Webhooks.

## 🚀 Technologies Used

* Java
* JDBC
* MySQL
* SQL
* OOP
* Git
* GitHub
* Jenkins
* GitHub Webhooks
* Declarative Jenkins Pipeline

## ✨ Features

* Add employee records
* View employee records
* Update employee details
* Delete employee records
* Retrieve employee information from MySQL
* Handle database operations using JDBC
* Exception handling for application and database operations
* Automated CI/CD pipeline using Jenkins

## 🏗️ Project Architecture

```text
Java Application
      ↓
    JDBC
      ↓
    MySQL
```

For CI/CD:

```text
Developer Push
      ↓
    GitHub
      ↓
GitHub Webhook
      ↓
   Jenkins
      ↓
Declarative Pipeline
      ↓
Build & Test
```

## 📁 Project Structure

```text
EmployManagementSystem/
│
├── src/
│   └── ...
│
├── Jenkinsfile
├── README.md
└── ...
```

## ⚙️ Database Setup

Create a MySQL database for the application.

Example:

```sql
CREATE DATABASE employee_management;
```

Create the required employee table according to the application schema.

Update the JDBC connection details in the Java application:

```text
URL      = jdbc:mysql://localhost:3306/employee_management
USERNAME = your_username
PASSWORD = your_password
```

> Do not commit database passwords or other sensitive credentials to GitHub.

## ▶️ How to Run

### 1. Clone the repository

```bash
git clone https://github.com/Sahithi82/EmployManagementSystem.git
cd EmployManagementSystem
```

### 2. Configure MySQL

Make sure MySQL is running and the required database and tables are created.

### 3. Configure JDBC

Update the MySQL connection details in the application.

### 4. Compile and Run

Compile the Java source files and run the main application class.

## 🔄 CI/CD Pipeline

The project uses Jenkins for CI/CD automation.

The pipeline is configured using a **Declarative Jenkinsfile**.

A GitHub Webhook triggers the Jenkins pipeline whenever changes are pushed to the repository.

```text
GitHub Push
     ↓
Webhook Trigger
     ↓
Jenkins Pipeline
     ↓
Build
     ↓
Test
```

This demonstrates practical experience with Git-based development and continuous integration.

## 🎯 Learning Outcomes

Through this project, I gained practical experience in:

* Core Java programming
* Object-Oriented Programming
* JDBC database connectivity
* MySQL and SQL operations
* CRUD application development
* Exception handling
* Git and GitHub
* Jenkins CI/CD
* GitHub Webhooks
* Declarative Jenkins Pipelines

## 👩‍💻 Author

**Sahithi Morampudi**

GitHub: https://github.com/Sahithi82

LinkedIn: https://linkedin.com/in/sahithi-morampudi08

Portfolio: https://sahithi-portfolio-websitee.vercel.app

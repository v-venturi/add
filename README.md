# cadastro de alunos 

## About the APP/API

A  simple API to manage Students, Schools and Classes. It is built with Java, Spring Boot, MySQL and Thymeleaf.

## Features

This API provides HTTP endpoint's and tools for the following:

Students:
* Create an student: `POST/http://localhost:8080/aluno'
* List all students: `GET/http://localhost:8080/aluno'
* List a student by id: `GET/http://localhost:8080/aluno/{id}'
* Update a student: `PUT/http://localhost:8080/aluno/{id}'
* Delete a student: `DELETE/http://localhost:8080/aluno/{id}'

Schools:
* Create an School: `POST/http://localhost:8080/escola'
* List all Schools: `GET/http://localhost:8080/escola'
* List a School by id: `GET/http://localhost:8080/escola/{id}'
* Update a School: `PUT/http://localhost:8080/escola/{id}'
* Delete a School: `DELETE/http://localhost:8080/escola/{id}'

Classes:
* Create a class: `POST/http://localhost:8080/turma'
* List all classes: `GET/http://localhost:8080/turma'
* List a class by id: `GET/http://localhost:8080/turma/{id}'
* Update a class: `PUT/http://localhost:8080/turma/{id}'
* Delete a class: `DELETE/http://localhost:8080/turma/{id}'

Front end with Thymeleaf
 -> http://localhost:8080/
* List all students
* Create a student
  (Mandatory create a Class Room and School before create a student - SQL scripts available in the path)

### Technologies used

This project was developed with:

* **Java 17 LTS - 2021-09-14**
* **Spring Boot 2.6.2**
* **Spring DATA-JPA 2.6.2**
* **Spring Fox 3.0.0**
* **Maven**
* **MySQL 8.0.28**
* **Lombok**
* **Thymeleaf**

### Execution
-bash/

git clone https://github.com/v-venturi/add.git
- You need to have **MySQL** installed on your machine to run the API.
- You don't need to create the database, **Hibernate** create its following the Java Classes and relationships.

* **Just remember to change the database password in src/main/resources/application.yml**

### Documentation

* **Swagger** http://localhost:8080/swagger-ui/index.html


A complete Library Management System built with Spring Boot 3, JPA, H2/MySQL, Swagger UI, and clean layered architecture.
This project manages Books, Borrowers, Borrow Records, and Fine Calculation with real-world constraints.

Book Management
=================
Add new books

Update book metadata

Soft delete books (only if no active borrows)

Pagination, sorting, filtering by:

category

availability

 Borrower Management
=======================
Register a borrower

Borrow history endpoint

Overdue borrowers listing

Borrowing Lifecycle
=========================
Borrow a book with validations:

book must have copies available

borrower must not exceed limit (2 for BASIC, 5 for PREMIUM)

Return a book

Automatically calculate fine if returned late

Track active borrow records

Technical Features
=======================
Swagger/OpenAPI UI

Global Exception Handler (clean error messages)

DTO validations

Postman Collection (included in repo)

Fully layered architecture

Ready for MySQL migration

Tech Stack
======================
Layer	Technology
Backend	Spring Boot 3
Database	H2 (default) / MySQL (optional)
Build Tool	Maven
API Docs	Swagger / OpenAPI
Validation	Jakarta Validation
ORM	JPA / Hibernate

To Run the Project
=====================================
git clone https://github.com/mastanammanandyala/LibraryAPI.git
cd Library-full-project

# Bookstore API

This is a Spring Boot REST API project with JWT-based authentication.

## Features
- User signup/login with JWT
- CRUD operations for books
- Search/filter by title, author, category, rating
- H2 in-memory DB for testing

## How to Run
1. Import project in IntelliJ/VS Code
2. Run `BookstoreApplication.java`
3. Use Postman to test `/auth/signup`, `/auth/login`, `/books` endpoints

## Auth Example
1. Signup via `POST /auth/signup`
2. Login via `POST /auth/login` → get JWT token
3. Add token to Authorization header as `Bearer <token>`

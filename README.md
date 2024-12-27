# Login Project

## Overview
The Login Project is a Spring Boot microservice that provides user authentication functionalities. It includes three main APIs: register, login, and logout. The application interacts with a SQL Server database to manage user data.

## Features
- **Register**: Adds a new user with a username, password, and a session flag to the database.
- **Login**: Authenticates users by checking their credentials and updates the session flag.
- **Logout**: Logs out the user by resetting the session flag.

## Project Structure
```
login-project
├── src
│   ├── main
│   │   ├── java
│   │   │   └── com
│   │   │       └── example
│   │   │           └── loginproject
│   │   │               ├── LoginProjectApplication.java
│   │   │               ├── controller
│   │   │               │   └── UserController.java
│   │   │               ├── service
│   │   │               │   └── UserService.java
│   │   │               ├── repository
│   │   │               │   └── UserRepository.java
│   │   │               └── model
│   │   │                   └── User.java
│   │   └── resources
│   │       ├── application.properties
│   │       ├── static
│   │       └── templates
│   └── test
│       └── java
│           └── com
│               └── example
│                   └── loginproject
│                       └── LoginProjectApplicationTests.java
├── mvnw
├── mvnw.cmd
└── pom.xml
```

## Setup Instructions
1. Clone the repository:
   ```
   git clone <repository-url>
   cd login-project
   ```

2. Configure the database connection in `src/main/resources/application.properties`.

3. Build the project using Maven:
   ```
   ./mvnw clean install
   ```

4. Run the application:
   ```
   ./mvnw spring-boot:run
   ```

## Usage
- **Register User**: Send a POST request to `/api/register` with username and password.
- **Login User**: Send a POST request to `/api/login` with username and password.
- **Logout User**: Send a POST request to `/api/logout` with username.

## Testing
Unit tests are included in the `src/test/java/com/example/loginproject/LoginProjectApplicationTests.java` file to ensure the application functions as expected.

## License
This project is licensed under the MIT License.
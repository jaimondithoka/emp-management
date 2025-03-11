This project is a simple Employee Management API built using Spring Boot and secured with JWT authentication. The API allows users to manage employee records while ensuring that only authorized users can access or modify the data.

Setting Up the Project
To run this project, you need to first clone the repository and start the application. After that, you will be able to interact with the API using an authentication token.

Clone the Project
First, download the project from GitHub by cloning the repository.
Navigate to the Project Folder
Open a terminal and move into the project directory.
Run the Application
Use the command mvn spring-boot:run to start the project.
Access the API
Once the application is running, it will be available at http://localhost:8080.
Getting a JWT Token
Before accessing any secured API endpoints, you need to log in and obtain a JWT token.

To log in, send a POST request to http://localhost:8080/api/auth/login.
The request body should contain a valid username and password in JSON format.
Example:

json
Copy
Edit
{
   "username": "admin",
   "password": "password" // it is encrypteed and stored in h2  by external  online Bcryptconverter
}
If the login is successful, the response will contain a JWT token.
This token is required to access secured endpoints.
Accessing Employee Data
Once you have the JWT token, you can use it to make requests to retrieve employee data.

To get a list of all employees, send a GET request to http://localhost:8080/api/employees.
In the request headers, include the token like this:
makefile
Copy
Edit
Authorization: Bearer <your-jwt-token>
If the token is valid, the API will return a list of employees in JSON format.
Example Response:

json
Copy
Edit
[
   {
      "id": 1,
      "name": "jayakumar",
      "email": "jaya.mon@example.com",
      "position": "Software Engineer"
   },
   {
      "id": 2,
      "name": "kalyanvarma",
      "email": "kalyan.varma@example.com",
      "position": "Project Manager"
   }
]
Other API Endpoints
In addition to fetching employee data, the API provides other functionalities:

To get details of a specific employee, use GET /api/employees/{id}.
To add a new employee, send a POST request to /api/employees (Admin access required).
To update employee details, send a PUT request to /api/employees/{id} (Admin access required).
To delete an employee, send a DELETE request to /api/employees/{id} (Admin access required).
Troubleshooting
If you encounter errors while using the API:

403 Forbidden: This means you are not authorized. Ensure you include the JWT token in the request header.
401 Unauthorized: Your login details might be incorrect, or the token may have expired. Try logging in again.
404 Not Found: The endpoint or employee record you are trying to access does not exist.
Final Notes
This project uses an in-memory H2 database, so all data will be lost when you restart the application. If you want to use a permanent database, update the configuration in application.properties.


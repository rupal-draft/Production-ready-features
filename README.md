
# Currency Converter Project

## Overview
This Currency Converter Project allows users to convert amounts from one currency to another using real-time exchange rates. The application is built with Spring Boot and utilizes various production-ready features to ensure robustness and maintainability. 

## Features
- **Currency Conversion**: Convert amounts from one currency to another using the FreeCurrencyConverter API.
- **RestClient**: Utilizes RestClient for making external API calls to fetch exchange rates.
- **Logging**: Integrated with Log4J for logging application activities.
- **Actuator**: Monitor and manage the application via Spring Boot Actuator endpoints.
- **API Documentation**: Automatically generated API documentation using Swagger and OpenAPI.
- **Development Tools**: Enabled automatic rebuild on code changes using Spring DevTools.

## Getting Started

### Prerequisites
- Java 17 or higher
- Maven
- An IDE (e.g., IntelliJ IDEA, Eclipse)

### Installation
1. Clone the repository:
   ```bash
   git clone https://github.com/rupal-draft/Production-ready-features.git
   ```
2. Navigate to the project directory:
   ```bash
   cd currency-converter
   ```
3. Build the project:
   ```bash
   mvn clean install
   ```
4. Run the application:
   ```bash
   mvn spring-boot:run
   ```

### Accessing the Application
- The application runs on `http://localhost:8080`.

### Actuator Endpoints
To check the health of the application and view available actuator endpoints, visit:
- [Actuator](http://localhost:8080/actuator)

### API Documentation
For API documentation and to explore available endpoints, visit:
- [Swagger UI](http://localhost:8080/swagger-ui/index.html)

## Usage
To convert currencies, you can use the following endpoint:
```
GET /convertCurrency?fromCurrency={from}&toCurrency={to}&units={amount}
```
### Example
To convert 500 INR to USD:
```
http://localhost:8080/convertCurrency?fromCurrency=INR&toCurrency=USD&units=500
```

## Logging
Logs are generated using Log4J, allowing you to monitor application behavior and troubleshoot issues effectively.

## Conclusion
This project demonstrates the application of production-ready features in a Spring Boot application, focusing on reliability and maintainability. It serves as a practical example of how to implement a currency converter with various essential functionalities.

## License
This project is licensed under the MIT License - see the LICENSE file for details.

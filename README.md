# Calculadora

## Endpoints
```
POST localhost:8080/v1/operation?num1=1&num2=2
```

Valid operations:
* add
* subtract
* multiply
* divide

Example:
```
POST localhost:8080/v1/add?num1=1&num2=2
```

## Usage
```
java -jar calculadora-pruebatecnica.jar
```

## Generate Jar
```
mvn package
```
This will generate a jar in the target folder

## Screenshots
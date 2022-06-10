# Calculadora

## Screenshots
![Screen Shot 2022-06-10 at 17 19 14](https://user-images.githubusercontent.com/84069271/173097775-a4acb8b6-7e03-4202-b253-f5680e093965.png)

![Screen Shot 2022-06-10 at 17 19 21](https://user-images.githubusercontent.com/84069271/173097799-782ee3ce-6802-4059-88c8-0a03fe3c320c.png)

![Screen Shot 2022-06-10 at 17 19 35](https://user-images.githubusercontent.com/84069271/173097813-3cb28f90-9011-4641-98d6-8abf8e8464ac.png)

![Screen Shot 2022-06-10 at 17 19 42](https://user-images.githubusercontent.com/84069271/173097825-68206990-1aff-4e6d-80b0-8e80cbaa3bef.png)

![Screen Shot 2022-06-10 at 17 19 52](https://user-images.githubusercontent.com/84069271/173097836-39755848-9ea6-455a-9c28-f63f51f36f85.png)

![Screen Shot 2022-06-10 at 17 20 00](https://user-images.githubusercontent.com/84069271/173097850-b44660db-9768-4d48-a72b-7ee666edb15b.png)


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

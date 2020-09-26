# Simple Message API

It includes
1. Requirements
   -  Java 8
   - Eclipse or STS
    - Maven
    -   MySql 8
2. How to run
    -   Import the project as existing maven project.
    -   perform the maven build
    ```mvn clean package```
    -   if you are using STS please run this applcation as spring boot project 
    -   if you are using Eclipse run the main class.
3. Data base 
    -   Create a schema test in your MySql db. When you run the application it will create the table in MySql database.
4. Running the application
    ```java -jar target/messageapi-0.0.1-SNAPSHOT.jar```
5. Use Postman or Soap Ui to perform the post operation 
6. Message and delivery times are mandatory 
7. Must provide the delivery time in 24 hour format for example: 23:15 
 
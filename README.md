# Simple Message API

It includes
1. Message Controller class -> In this class saveMessageRequest method is used to handle the request.
2. Message Service class -> In this class saveMessageRequest method is use to do business logic of save
3. Message Repository -> This is an Interface which is extended the JPA Repository and it helps to the database operations
4. Message Entity (Model Class) -> This class represent the entity of message table.
5. Application Properties -> In this file the Port number 9292 is used to run this application and Dabase Source information available and Application context is used to set the initial path of the application after localhost:9292. 
6. Message Util -> This class is used to send the messages. In this class A Scheduler calls the service class and fetch the data and compare the time and it matches it will deliver.
# coroutines-reactive

This is a small application with Controllers, Use Cases and DB to illustrate how to use full Reactive programming with 
Kotlin coroutines, R2DBC and WebFlux.

It uses postgres as the underlying database and its configurations is set in the `application.properties` file. Please, 
change database name, user and password directly in that file.

The application applies a migration to the database in order to create a Person table and populates it with some data 
so that some rows can be delivery to  application, and we can see the flux working perfectly.

After run the application, you can use curl (`curl localhost:8080/people`) to see each package of data arriving.

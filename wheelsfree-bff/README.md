This project was created with [Spring Initializr](https://start.spring.io/).

Depends on a PostGres database, with schema changes managed by Hibernate.
This application serves as a backend API for the WheelsFree frontend.

## Available Scripts

In the project directory, you can run:

### `./gradlew createDB`

Creates the database. Note that this will drop the database and recreate it if a 'wheelsfree' 
PostGres database already exists.

### `./gradlew bootRun`

Starts the application on port 8080. 

Data will be initialized using the `DataInitializer` event listener upon application start. Please note that this is NOT a normal pattern and is for demo purposes only.

### `./gradlew test`

Runs unit tests.
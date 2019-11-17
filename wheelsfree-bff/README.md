This project was created with [Spring Initializr](https://start.spring.io/).

Depends on a PostGres database, managed by MyBatis.
This application serves as a backend API for the WheelsFree frontend.

## Available Scripts

In the project directory, you can run:

### `./gradlew initDb`

Creates the database and runs all migrations. Note that this will drop the database and recreate it if a 'wheelsfree' 
PostGres database already exists.

### `./gradlew bootRun`

Starts the application on port 8080. 

### `./gradlew test`

Runs unit tests.
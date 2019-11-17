## WheelsFree dojo application

WheelsFree is a drone e-commerce site built using a React frontend and Spring Boot backend. 
This application relies on a Postgres database. Postgres must be running in order to run this application.

To initialize the database (only needs to be run 1 time only), in the wheelsfree-bff directory: `./gradlew initDb`

To start backend, in the wheelsfree-bff directory: `./gradlew bootRun`

To start frontend, in the wheelsfree directory: `npm start`

Extensions:
- Currently, when a user selects 'Reserve' on an item, they are redirected to a blank page. Implement an endpoint in the BFF so that the application can retrieve item details for the item selected. Then, display these details to the user. 
- Add form elements for collecting user information on item details page. User information to be collected: name and email address.
- Add persistent 'order' functionality: add a submit button on the item details page, that calls an endpoint in the BFF that takes in the user's name and email and item ID. This endpoint should persist all details in some sort of order object. Think: how might we want to model these orders in the backend so we could eventually support multi-item orders? 
- Don't forget to decrement quantity for an ordered item, and display a success page to the user when they've successfully reserved an item!

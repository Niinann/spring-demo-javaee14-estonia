### MVC pattern
- Model (data + operations on data)
- View (views presented to user)
- Controller (handling incoming requests and provides views for clients/users)

### Application architecture with MVC
- View
- Controller
- Model (Service + Repository)

### Application architecture with MVC - second view
- View
- Controller (shouuld have reference to Service), handling incoming requests and provides views for clients/user
- Service (should have reference to Repository), processed data
- Repository, stores and provides access to data (eg.database)

### HTTP
Request consists of:
  - url
  - headers
  - params
  - body
Response consists of:
  - status codes
  - body
  - cookies
  - headers
Status codes:
  - 1xx - confirmed - processing in progress 
  - 2xx - generally success
  - 3xx - redirects
  - 4xx - client fault
  - 5xx - server fault

### REST API
- for exchanging data in universal format - JSON/XML
- for sharing resources
- CRUD Create Read Update Delete
- Rerervation - it is a resource
- resources should be plural nouns and organized in hierarchical way
- first and second proposal
  - /reservations - for reading all reservations - with GET http method
  - /reservations/add - for creating of reservation - with PST Http method
  - /deletereservations vs /reservations/delete - for deleting reservation - with DELETE Http method
  - /updatereservation vs reservatons/update- for updating with PUT Http method
  https://localhost:8080/api/reservations/add
- third proposal - REST principles for good naming of resources
- /reservations GET for reading all resources (R from CRUD) 
    -  status code 200
- /reservations/{id} - GET - for reading for one resource (R from CRUD)
   - status code 200 with response body is ok
   - status coded 404 with no response body (or error object)
- /reservations - POST - for creating (C from CRUD)
- /reservations/{id} (/reservations/13445554) - DELETE FOR dELETION (D from CRUD)
- /reservations/{id} (/reservations/13445554) - PUT FOR Update(full) (U from CRUD)
- /reservations/{id} (/reservations/13445554) - PATCH FOR Update (partial) (U from CRUD)
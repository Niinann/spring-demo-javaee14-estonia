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
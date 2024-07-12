# Users
| **Action**             | **Endpoint**   | **Method** | **Request Body**                                                                                          |
|--------------------|------------|--------|-------------------------------------------------------------------------------------------------------|
| Returns all users | `/users` | GET | `{"id": 1001,"first_name": "Alice","last_name": "Johnson","email": "alice@example.com","password": "password123"},{"id": 1002,"first_name": "Bob","last_name": "Miller","email": "bob@example.com","password": "password456"}` |
| Returns user by ID | `/users/{id}` | GET | `{"id": 1001,"first_name": "Alice","last_name": "Johnson","email": "alice@example.com","password": "password123"}` |
| Returns user by Email | `/users/email/{email}` | GET | `{"id": 1001,"first_name": "Alice","last_name": "Johnson","email": "alice@example.com","password": "password123"}` |
| Create a new user | `/users` | POST | `{"first_name": "Charlie","last_name": "Brown","email": "charlie@example.com","password": "password789"}` |
| Update a user by ID | `/users/{id}` | PUT | `{"id": 1001,"first_name": "Alice","last_name": "Smith","email": "alice@example.com","password": "password123"}` |
| Delete a user by ID | `/users/{id}` | DELETE | N/A |

# Cities
| **Action**             | **Endpoint**   | **Method** | **Request Body**                                                                                          |
|--------------------|------------|--------|-------------------------------------------------------------------------------------------------------|
| Returns all Cities | `/cities/` | GET    | `{"id":1,"full_name":"Zurich","abbreviation":"ZRH"},{"id":2,"full_name":"Geneva","abbreviation":"GVA"}` |
| Returns city by ID | `/cities/{id}` | GET | `{"id":1,"full_name":"Zurich","abbreviation":"ZRH"}` |
| Returns city by Name | `/cities/name/{name}` | GET | `{"id":1,"full_name":"Zurich","abbreviation":"ZRH"}` |
| Create a new city | `/cities/` | POST | `{"full_name":"Bern","abbreviation":"BRN"}` |
| Update a city by ID | `/cities/{id}` | PUT | `{"id":1,"full_name":"Zurich","abbreviation":"ZRH"}` |
| Delete a city by ID | `/cities/{id}` | DELETE | N/A |

# Employees
| **Action**             | **Endpoint**   | **Method** | **Request Body**                                                                                          |
|--------------------|------------|--------|-------------------------------------------------------------------------------------------------------|
| Returns all Employees | `/employees/` | GET    | `{"id":101,"name":"John Smith","job_title":"Pilot"},{"id":102,"name":"Mary Johnson","job_title":"Flight Attendant"},{"id":103,"name":"Robert Brown","job_title":"Ground Crew"}` |
| Returns employee by ID | `/employees/{id}` | GET | `{"id":101,"name":"John Smith","job_title":"Pilot"}` |
| Returns employee by Name | `/employees/name/{name}` | GET | `{"id":101,"name":"John Smith","job_title":"Pilot"}` |
| Create a new employee | `/employees/` | POST | `{"name":"Charlie Brown","job_title":"Air Traffic Controller"}` |
| Update an employee by ID | `/employees/{id}` | PUT | `{"id":101,"name":"John Smith","job_title":"Captain"}` |
| Delete an employee by ID | `/employees/{id}` | DELETE | N/A |

# Planes
| **Action**             | **Endpoint**   | **Method** | **Request Body**                                                                                          |
|--------------------|------------|--------|-------------------------------------------------------------------------------------------------------|
| Returns all Planes | `/planes/` | GET    | `{"id":301,"capacity":150,"IDFSCity":1},{"id":302,"capacity":200,"IDFSCity":2},{"id":303,"capacity":180,"IDFSCity":3}` |
| Returns plane by ID | `/planes/{id}` | GET | `{"id":301,"capacity":150,"IDFSCity":1}` |
| Create a new plane | `/planes/` | POST | `{"capacity":220,"IDFSCity":4}` |
| Update a plane by ID | `/planes/{id}` | PUT | `{"id":301,"capacity":160,"IDFSCity":1}` |
| Delete a plane by ID | `/planes/{id}` | DELETE | N/A |

# Flights
| **Action**             | **Endpoint**   | **Method** | **Request Body**                                                                                          |
|--------------------|------------|--------|-------------------------------------------------------------------------------------------------------|
| Returns all Flights | `/flights/` | GET    | `{"id":201,"number":12345,"flight_name":"EF123","city_From":1,"city_To":2,"flight_Date":"2024-06-28 10:00:00","IDFSPlane":301},{"id":202,"number":67890,"flight_name":"EF678","city_From":2,"city_To":1,"flight_Date":"2024-06-29 14:30:00","IDFSPlane":302}` |
| Returns flight by ID | `/flights/{id}` | GET | `{"id":201,"number":12345,"flight_name":"EF123","city_From":1,"city_To":2,"flight_Date":"2024-06-28 10:00:00","IDFSPlane":301}` |
| Create a new flight | `/flights/` | POST | `{"number":11111,"flight_name":"EF111","city_From":3,"city_To":4,"flight_Date":"2024-07-03 12:00:00","IDFSPlane":303}` |
| Update a flight by ID | `/flights/{id}` | PUT | `{"id":201,"number":12345,"flight_name":"EF123","city_From":1,"city_To":2,"flight_Date":"2024-06-28 11:00:00","IDFSPlane":301}` |
| Delete a flight by ID | `/flights/{id}` | DELETE | N/A |

# User Flights
| **Action**             | **Endpoint**   | **Method** | **Request Body**                                                                                          |
|--------------------|------------|--------|-------------------------------------------------------------------------------------------------------|
| Returns all User Flights | `/user_flights/` | GET    | `{"id":5001,"IDUser":1001,"IDFlight":201},{"id":5002,"IDUser":1002,"IDFlight":202},{"id":5003,"IDUser":1003,"IDFlight":201}` |
| Returns user flight by ID | `/user_flights/{id}` | GET | `{"id":5001,"IDUser":1001,"IDFlight":201}` |
| Create a new user flight | `/user_flights/` | POST | `{"IDUser":1003,"IDFlight":202}` |
| Update a user flight by ID | `/user_flights/{id}` | PUT | `{"id":5001,"IDUser":1001,"IDFlight":202}` |
| Delete a user flight by ID | `/user_flights/{id}` | DELETE | N/A |

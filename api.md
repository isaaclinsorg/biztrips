| Action | Endpoint | Method | Request Body |
|--------|----------|--------|--------------|
| Returns all users | `/users` | GET | `{"id": 1001,"first_name": "Alice","last_name": "Johnson","email": "alice@example.com","password": "password123"},{"id": 1002,"first_name": "Bob","last_name": "Miller","email": "bob@example.com","password": "password456"}` |
| Returns user by ID | `/users/{id}` | GET | `{"id": 1001,"first_name": "Alice","last_name": "Johnson","email": "alice@example.com","password": "password123"}` |
| Returns user by Email | `/users/email/{email}` | GET | `{"id": 1001,"first_name": "Alice","last_name": "Johnson","email": "alice@example.com","password": "password123"}` |
| Returns user by First Name | `/users/first_name/{first_name}` | GET | `{"id": 1001,"first_name": "Alice","last_name": "Johnson","email": "alice@example.com","password": "password123"}` |
| Returns user by Last Name | `/users/last_name/{last_name}` | GET | `{"id": 1001,"first_name": "Alice","last_name": "Johnson","email": "alice@example.com","password": "password123"}` |
| Returns user by Password | `/users/password/{password}` | GET | `{"id": 1001,"first_name": "Alice","last_name": "Johnson","email": "alice@example.com","password": "password123"}` |
| Row 2 | Row 2 |
| Row 3 | Row 3 |
| Row 4 | Row 4 |
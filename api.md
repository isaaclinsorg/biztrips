| Action | Endpoint | Method | Request Body |
|--------|----------|--------|--------------|
| Returns all users | `/users` | GET | `{"id": 1001,"first_name": "Alice","last_name": "Johnson","email": "alice@example.com","password": "password123"},{"id": 1002,"first_name": "Bob","last_name": "Miller","email": "bob@example.com","password": "password456"}` |
| Returns user by ID | `/users/{id}` | GET | `{"id": 1001,"first_name": "Alice","last_name": "Johnson","email": "alice@example.com","password": "password123"}` |
| Returns user by Email | `/users/email/{email}` | GET | `{"id": 1001,"first_name": "Alice","last_name": "Johnson","email": "alice@example.com","password": "password123"}` |
| Create a new user | `/users` | POST | `{"first_name": "Charlie","last_name": "Brown","email": "charlie@example.com","password": "password789"}` |
| Update a user by ID | `/users/{id}` | PUT | `{"id": 1001,"first_name": "Alice","last_name": "Smith","email": "alice@example.com","password": "password123"}` |
| Delete a user by ID | `/users/{id}` | DELETE | N/A |

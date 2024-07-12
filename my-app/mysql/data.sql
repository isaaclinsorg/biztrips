- Insert data into the 'city' table
INSERT INTO city (id, full_name, abbreviation) VALUES
  (1, 'Zurich', 'ZRH'),
  (2, 'Geneva', 'GVA'),
  (3, 'Munich', 'MUC');

-- Insert data into the 'employee' table
INSERT INTO employee (id, name, job_title) VALUES
  (101, 'John Smith', 'Pilot'),
  (102, 'Mary Johnson', 'Flight Attendant'),
  (103, 'Robert Brown', 'Ground Crew');

-- Insert data into the 'plane' table
INSERT INTO plane (id, capacity, IDFSCity) VALUES
  (301, 150, 1),
  (302, 200, 2),
  (303, 180, 3);

-- Insert data into the 'user' table
INSERT INTO user (id, first_name, last_name) VALUES
  (1001, 'Alice', 'Johnson'),
  (1002, 'Bob', 'Miller'),
  (1003, 'Carol', 'Lee');

-- Insert data into the 'flight' table
INSERT INTO flight (id, number, flight_name, city_From, city_To, flight_Date, IDFSPlane) VALUES
  (201, 12345, 'EF123', 1, 2, '2024-06-28 10:00:00', 301),
  (202, 67890, 'EF678', 2, 1, '2024-06-29 14:30:00', 302);

-- Insert data into the 'user_flight' table
INSERT INTO user_flight (id, IDUser, IDFlight) VALUES
  (5001, 1001, 201),
  (5002, 1002, 202),
  (5003, 1003, 201);

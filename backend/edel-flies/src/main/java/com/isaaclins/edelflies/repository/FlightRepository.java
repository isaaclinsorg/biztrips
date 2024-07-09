package com.isaaclins.edelflies.repository;

import com.isaaclins.edelflies.entity.Flight;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.Query;

import java.sql.Date;
import java.util.List;


@Repository
public interface FlightRepository extends JpaRepository<Flight, Integer> {

    @Query(value = "SELECT * FROM flight WHERE id = ?1", nativeQuery = true)
    Flight findFlightById(int id);

    @Query(value = "SELECT * FROM flight WHERE city_From = ?1", nativeQuery = true)
    List<Flight> findFlightsByCityFrom(int cityFrom);

    @Query(value = "SELECT * FROM flight WHERE city_To = ?1", nativeQuery = true)
    List<Flight> findFlightsByCityTo(int cityTo);

    @Query(value = "SELECT * FROM flight WHERE flight_Date >= ?1 AND flight_Date <= ?2", nativeQuery = true)
    List<Flight> findFlightsByDateRange(Date startDate, Date endDate);

    @Query(value = "SELECT * FROM flight WHERE IDFSPlane = ?1", nativeQuery = true)
    List<Flight> findFlightsByPlaneId(int planeId);
}


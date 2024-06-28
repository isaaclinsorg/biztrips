package com.isaaclins.edelflies.repository;

import com.isaaclins.edelflies.entity.Flight;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.Query;


@Repository
public interface FlightRepository extends JpaRepository <Flight, Integer> {

    @Query(value = "select * from flight where id = ?1", nativeQuery = true)
    Flight findFlightById(int id);

}

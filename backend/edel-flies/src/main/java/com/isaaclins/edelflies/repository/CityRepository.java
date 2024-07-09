package com.isaaclins.edelflies.repository;

import com.isaaclins.edelflies.entity.City;
import com.isaaclins.edelflies.entity.Flight;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface CityRepository extends JpaRepository<City, Integer> {

    @Query(value = "select * from city where id = ?1", nativeQuery = true)
    City findCityById(int id);

    @Query(value = "select * from city where full_name = ?1 and abbreviation = ?2", nativeQuery = true)
    List<City> findByFullNameAndAbbreviation(String fullName, String abbreviation);

    @Query(value = "select * from city where full_name = ?1", nativeQuery = true)
    List<City> findByFullName(String fullName);

    @Query(value = "select * from city where abbreviation = ?1", nativeQuery = true)
    List<City> findByAbbreviation(String abbreviation);
}

package com.isaaclins.edelflies.repository;

import com.isaaclins.edelflies.entity.Plane;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.Query;


@Repository
public interface PlaneRepository extends JpaRepository<Plane, Integer> {

    @Query(value = "SELECT * FROM plane WHERE id = ?1", nativeQuery = true)
    Plane findPlaneById(int id);

    @Query(value = "SELECT * FROM plane", nativeQuery = true)
    List<Plane> findAllPlanes();

    @Query(value = "SELECT * FROM plane WHERE capacity >= ?1", nativeQuery = true)
    List<Plane> findPlanesWithCapacityGreaterThanEqual(int capacity);

    @Query(value = "SELECT * FROM plane WHERE IDFSCity = ?1", nativeQuery = true)
    List<Plane> findPlanesByCityId(int cityId);
}


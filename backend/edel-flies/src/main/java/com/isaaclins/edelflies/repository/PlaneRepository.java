package com.isaaclins.edelflies.repository;

import com.isaaclins.edelflies.entity.Plane;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.Query;


@Repository
public interface PlaneRepository extends JpaRepository <Plane, Integer> {

    @Query(value = "select * from plane where id = ?1", nativeQuery = true)
    Plane findPlaneById(int id);

}

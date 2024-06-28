package com.isaaclins.edelflies.repository;

import com.isaaclins.edelflies.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.Query;


@Repository
public interface UserRepository extends JpaRepository <User, Integer> {

    @Query(value = "select * from user where id = ?1", nativeQuery = true)
    User findUserById(int id);

}

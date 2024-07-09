package com.isaaclins.edelflies.repository;
import com.isaaclins.edelflies.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.Query;
import java.util.List;



@Repository
public interface UserRepository extends JpaRepository<User, Integer> {

    @Query(value = "SELECT * FROM user WHERE id = ?1", nativeQuery = true)
    User findUserById(int id);

    @Query(value = "SELECT * FROM user WHERE profession = ?1", nativeQuery = true)
    List<User> findByProfession(String profession);

    @Query(value = "SELECT * FROM user WHERE name = ?1", nativeQuery = true)
    List<User> findByName(String name);

    void deleteById(int id);
}

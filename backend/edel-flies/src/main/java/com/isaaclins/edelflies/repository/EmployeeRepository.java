package com.isaaclins.edelflies.repository;



import com.isaaclins.edelflies.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import java.util.List;


public interface EmployeeRepository extends JpaRepository<Employee, Integer> {

    @Query(value = "SELECT * FROM employee WHERE id = ?1", nativeQuery = true)
    Employee findEmployeeById(int id);

    @Query(value = "SELECT * FROM employee", nativeQuery = true)
    List<Employee> getAll();

    @Query(value = "SELECT * FROM employee WHERE job_title = ?1", nativeQuery = true)
    List<Employee> findByJobTitle(String jobTitle);

    @Query(value = "SELECT * FROM employee WHERE name LIKE %?1%", nativeQuery = true)
    List<Employee> findByNameContaining(String name);
}
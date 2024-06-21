package ch.clip.trips.repo;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface EmployeeRepository extends CrudRepository<Employee, Long> {
	List<Employee> findByName(String name);
	List<Employee> findByJobTitle(String jobTitle);


}

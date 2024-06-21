package ch.clip.trips.repo;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface FlightRepository extends CrudRepository<Flight, Long> {
	List<Flight> findByNumber(Long number);
	List<Flight> findByCityFrom(String cityFrom);
	List<Flight> findByCityTo(String cityTo);
}

package ch.clip.trips.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface BusinessTripRepository extends JpaRepository<BusinessTrip, Long> {
	List<BusinessTrip> findByTitle(String title);
}

package ch.clip.trips.repo;

import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface MeetingRepository extends CrudRepository<Meeting, Long> {
	List<Meeting> findByTitle(String title);
}

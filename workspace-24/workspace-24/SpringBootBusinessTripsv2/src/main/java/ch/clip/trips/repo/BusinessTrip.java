package ch.clip.trips.repo;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import lombok.Data;

import jakarta.persistence.*;
import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.List;

@Data
@Entity
public class BusinessTrip implements Serializable {

	private static final long serialVersionUID = 67027563808382509L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String title;
	private String description;
	private LocalDateTime startTrip;
	private LocalDateTime endTrip;

	@OneToMany(mappedBy = "businessTrip")
	@JsonManagedReference
	private List<Meeting> meetings;

	@ManyToMany(mappedBy = "trips")
	@JsonBackReference
	private List<Employee> employees;

	public BusinessTrip() {
		super();

	}

	public BusinessTrip(Long id, String title, String description, LocalDateTime startTrip, LocalDateTime endTrip) {
		this();
		this.id = id;
		this.title = title;
		this.description = description;
		this.startTrip = startTrip;
		this.endTrip = endTrip;
	}

	public BusinessTrip(Long id, String title, String description, LocalDateTime startTrip, LocalDateTime endTrip, List<Employee> employees) {
		this();
		this.id = id;
		this.title = title;
		this.description = description;
		this.startTrip = startTrip;
		this.endTrip = endTrip;
		this.employees = employees;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public List<Meeting> getMeetings() {
		return meetings;
	}

	public void setMeetings(List<Meeting> meetings) {
		this.meetings = meetings;
	}

	public List<Employee> getEmployees() {
		return employees;
	}

	public void setEmployees(List<Employee> employees) {
		this.employees = employees;
	}

	public LocalDateTime getStartTrip() {
		return startTrip;
	}

	public void setStartTrip(LocalDateTime startTrip) {
		this.startTrip = startTrip;
	}

	public LocalDateTime getEndTrip() {
		return endTrip;
	}

	public void setEndTrip(LocalDateTime endTrip) {
		this.endTrip = endTrip;
	}

	@Override
	public String toString() {
		return "BusinessTrip [id=" + id + ", title=" + title + ", description=" + description + ", startTrip="
				+ startTrip + ", endTrip=" + endTrip + ", meetings=" + meetings + ", employees=" + employees + "]";
	}



}

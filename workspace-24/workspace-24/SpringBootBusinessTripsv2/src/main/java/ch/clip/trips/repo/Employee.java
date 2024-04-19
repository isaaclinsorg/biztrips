package ch.clip.trips.repo;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import lombok.Data;

import jakarta.persistence.*;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@Data
@Entity
public class Employee implements Serializable {

	private static final long serialVersionUID = 6705527563808382509L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String name;
	private String jobTitle;

	@OneToMany(mappedBy = "employee")
	@JsonManagedReference
	private List<Flight> flights;


	@ManyToMany
	@JoinTable(name = "trip_employee",
	joinColumns = @JoinColumn(name = "employee_id_fs"),
	inverseJoinColumns = @JoinColumn(name = "trip_id_fs"))
	@JsonManagedReference
	private List<BusinessTrip> trips;

	public Employee() {
		super();
		flights = new ArrayList<Flight>();

	}

	public Employee(Long id, String name, String jobTitle) {
		this();
		this.id = id;
		this.name = name;
		this.jobTitle = jobTitle;

	}

	public Employee(Long id, String name, String jobTitle, List<Flight> flights) {
		this();
		this.id = id;
		this.name = name;
		this.jobTitle = jobTitle;
		this.flights = flights;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getJobTitle() {
		return jobTitle;
	}

	public void setJobTitle(String jobTitle) {
		this.jobTitle = jobTitle;
	}

	public List<Flight> getFlights() {
		return flights;
	}

	public void setFlights(List<Flight> flights) {
		this.flights = flights;
	}



	public List<BusinessTrip> getTrips() {
		return trips;
	}

	public void setTrips(List<BusinessTrip> trips) {
		this.trips = trips;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", jobTitle=" + jobTitle + ", flights=" + flights + "]";
	}

}

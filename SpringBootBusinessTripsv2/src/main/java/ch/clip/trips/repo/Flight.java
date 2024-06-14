package ch.clip.trips.repo;

import com.fasterxml.jackson.annotation.JsonBackReference;
import lombok.Data;

import jakarta.persistence.*;
import java.io.Serializable;
import java.time.LocalDateTime;

@Data
@Entity
public class Flight implements Serializable {

	private static final long serialVersionUID = 6705527563808382509L;
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	private Long number;
	private String cityFrom;
	private String cityTo;
	private LocalDateTime flightDate;



	@ManyToOne
	@JoinColumn(name="employee_idfs")
	@JsonBackReference
	private Employee employee;


	public Flight() {
		super();
	}

	public Flight(Long id, Long number, String from, String to, LocalDateTime flightDate) {
		this();
		this.id = id;
		this.number = number;
		this.cityFrom = from;
		this.cityTo = to;
		this.flightDate = flightDate;


	}


	public Flight(Long id, Long number, String from, String to, LocalDateTime flightDate, Employee employee) {
		this();
		this.id = id;
		this.number = number;
		this.cityFrom = from;
		this.cityTo = to;
		this.flightDate = flightDate;

		this.employee = employee;
	}


	public Long getId() {
		return id;
	}


	public void setId(Long id) {
		this.id = id;
	}


	public Long getNumber() {
		return number;
	}


	public void setNumber(Long number) {
		this.number = number;
	}


	public String getFrom() {
		return cityFrom;
	}


	public void setFrom(String from) {
		this.cityFrom = from;
	}


	public String getTo() {
		return cityTo;
	}


	public void setTo(String to) {
		this.cityTo = to;
	}


	public Employee getEmployee() {
		return employee;
	}


	public void setEmployee(Employee employee) {
		this.employee = employee;
	}




	public String getCityFrom() {
		return cityFrom;
	}

	public void setCityFrom(String cityFrom) {
		this.cityFrom = cityFrom;
	}

	public String getCityTo() {
		return cityTo;
	}

	public void setCityTo(String cityTo) {
		this.cityTo = cityTo;
	}

	public LocalDateTime getFlightDate() {
		return flightDate;
	}

	public void setFlightDate(LocalDateTime flightDate) {
		this.flightDate = flightDate;
	}

	@Override
	public String toString() {
		return "Flight [id=" + id + ", number=" + number + ", cityFrom=" + cityFrom + ", cityTo=" + cityTo
				+ ", flightDate=" + flightDate + ", employee=" + employee + "]";
	}



}

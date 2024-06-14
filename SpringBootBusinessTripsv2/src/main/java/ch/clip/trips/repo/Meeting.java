package ch.clip.trips.repo;

import com.fasterxml.jackson.annotation.JsonBackReference;
import lombok.Data;

import jakarta.persistence.*;
import java.io.Serializable;

@Data
@Entity
public class Meeting implements Serializable {

	private static final long serialVersionUID = 6705527563808382509L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String title;
	private String description;

	@ManyToOne
	@JoinColumn(name = "business_trip_idfs")
	@JsonBackReference
	private BusinessTrip businessTrip;

	public Meeting(Long id, String title, String description, BusinessTrip businessTrip) {
		super();
		this.id = id;
		this.title = title;
		this.description = description;
		this.businessTrip = businessTrip;
	}

	public Meeting() {
		super();

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

	public BusinessTrip getBusinessTrip() {
		return businessTrip;
	}

	public void setBusinessTrip(BusinessTrip businessTrip) {
		this.businessTrip = businessTrip;
	}

	@Override
	public String toString() {
		return "Meeting [id=" + id + ", title=" + title + ", description=" + description + "]";
	}

}

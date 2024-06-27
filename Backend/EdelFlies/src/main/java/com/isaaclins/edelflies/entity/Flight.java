package com.isaaclins.edelflies.entity;

import lombok.*;
import jakarta.persistence.*;

import java.io.Serializable;
import java.time.LocalDateTime;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Data
@Entity
@Table(name = "flight")
public class Flight {

	@Id
	@NonNull
	@Column(name = "id")
	private int id;

	@NonNull
	@Column(name = "number")
	private Long number;

	@NonNull
	@Column(name = "flight_name")
	private String flight_Name;

	@NonNull
	@Column(name = "city_From")
	private String city_From;

	@NonNull
	@Column(name = "city_To")
	private String city_To;

	@NonNull
	@Column(name = "flight_Date")
	private LocalDateTime flight_Date;

	@NonNull
	@Column(name = "IDFSPlane")
	private int IDFSPlane;
}

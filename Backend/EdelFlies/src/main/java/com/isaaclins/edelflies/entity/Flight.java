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
public class Flight {

	@Id
	@NonNull
	private int id;

	@NonNull
	private Long number;
	private String cityFrom;
	private String cityTo;
	private LocalDateTime flightDate;
	private int PlaneIDFS;




}

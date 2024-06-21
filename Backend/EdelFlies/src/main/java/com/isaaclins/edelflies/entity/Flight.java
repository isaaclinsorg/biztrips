package com.isaaclins.edelflies.entity;

import com.fasterxml.jackson.annotation.JsonBackReference;
import lombok.Data;

import jakarta.persistence.*;
import java.io.Serializable;
import java.time.LocalDateTime;

@Data
@Entity
public class Flight implements Serializable {

	@Id
	private int id;
	private Long number;
	private String cityFrom;
	private String cityTo;
	private LocalDateTime flightDate;




}

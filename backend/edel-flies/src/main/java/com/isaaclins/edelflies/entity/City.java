package com.isaaclins.edelflies.entity;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Data
@Entity
@Table(name = "city")
public class City {
    @Id
    @Column(name = "id")
    private int id;

    @NonNull
    @Column(name = "full_name")
    private String full_name;

    @NonNull
    @Column(name = "abbreviation")
    private String abbreviation;

}

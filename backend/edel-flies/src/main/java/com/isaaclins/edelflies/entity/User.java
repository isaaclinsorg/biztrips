package com.isaaclins.edelflies.entity;

import jakarta.persistence.*;
import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity
@Table(name = "user")
public class User {

    @Id
    @NonNull
    @Column(name = "id")
    private int id;

    @NonNull
    @Column(name = "first_name")
    private String first_name;

    @NonNull
    @Column(name = "last_name")
    private String last_name;

    @Column(name = "IDFSFlights")
    private int IDFSFlights;



}


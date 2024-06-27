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
@Table(name = "plane")
public class Plane {

    @Id
    @NonNull
    @Column(name = "id")
    private int id;

    @NonNull
    @Column(name = "capacity")
    private int capacity;

    @NonNull
    @Column(name = "IDFSLocation")
    private int IDFSlocation;
}

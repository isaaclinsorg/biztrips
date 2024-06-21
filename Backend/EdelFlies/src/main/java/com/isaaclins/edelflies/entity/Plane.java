package com.isaaclins.edelflies.entity;


import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Data
@Entity
public class Plane {

    @Id
    private int id;

    @NonNull
    private int capacity;

}

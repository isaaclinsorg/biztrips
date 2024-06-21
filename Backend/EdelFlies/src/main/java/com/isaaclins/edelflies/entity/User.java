package com.isaaclins.edelflies.entity;

import jakarta.persistence.*;
import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity
public class User {

    @Id
    @NonNull
    private int id;

    @NonNull
    private String firstName;

    @NonNull
    private String lastName;

    @NonNull
    private String flightIDFS;



}

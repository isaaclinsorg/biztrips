package com.isaaclins.edelflies.entity;

import jakarta.persistence.*;
import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity
public class Employee  {

    @Id
    @NonNull
    private int id;

    @NonNull
    private String name;

    @NonNull
    private String jobTitle;



}

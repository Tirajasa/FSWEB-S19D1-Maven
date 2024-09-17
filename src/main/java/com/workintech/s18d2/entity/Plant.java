package com.workintech.s18d2.entity;


import jakarta.persistence.*;

import jakarta.validation.constraints.DecimalMin;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.Data;
import lombok.NoArgsConstructor;


@MappedSuperclass
@NoArgsConstructor
@Data
public class Plant {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private long id;

    @Column(name="name")
    @NotNull(message = "name cant be null")
    @Size(min = 3,max = 45,message = "name size must be between 3 to 45")
    private String name;

    @DecimalMin("10")
    @Column
    private Double price;

}

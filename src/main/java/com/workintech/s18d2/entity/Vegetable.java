package com.workintech.s18d2.entity;


import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.stereotype.Repository;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Table(name="vegetable",schema="fsweb")
public class Vegetable extends Plant {

    @Column(name = "is_grown_on_tree")
    @NotNull
    private boolean isGrownOnTree;
}

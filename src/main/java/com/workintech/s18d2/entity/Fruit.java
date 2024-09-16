package com.workintech.s18d2.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import lombok.*;
import org.springframework.stereotype.Repository;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Repository
@Table(name="manav",schema="fsweb")
public class Fruit extends Plant {

   @Column(name = "fruit_type")
   @Enumerated(EnumType.STRING)
   @NotNull
   private FruitType fruitType;
}

package com.workintech.s18d2.dao;

import com.workintech.s18d2.entity.Fruit;
import com.workintech.s18d2.entity.Vegetable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@Repository

public interface VegetableRepository extends JpaRepository<Vegetable,Long> {
@Query(value = "select v.name,v.id,v.price,v.is_grown_on_tree from vegetable v order by v.price desc",nativeQuery = true)
    List<Vegetable> getVegetablesByOrderDesc();

@Query(value = "select v.name,v.id,v.price,v.is_grown_on_tree from vegetable v order by v.price asc",nativeQuery = true)
    List<Vegetable> getVegetablesByOrderAsc();

@Query(value= "select f from Fruit f where f.name like %:name%")
    List<Vegetable> searchByName(String name);

//
//    Vegetable get();
//    Vegetable save();
//    Vegetable update();
//    Vegetable remove();
}

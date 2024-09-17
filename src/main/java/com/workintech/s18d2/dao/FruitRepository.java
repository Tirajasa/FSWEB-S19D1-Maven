package com.workintech.s18d2.dao;

import com.workintech.s18d2.entity.Fruit;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;


public interface FruitRepository extends JpaRepository<Fruit,Long> {
    @Query(value="Select f.id,f.name,f.price,f.fruit_type from where fsweb.fruit f order by f.price desc",nativeQuery = true)
    List<Fruit> getByPriceDesc();

    @Query(value="Select f.id,f.name,f.price,f.fruit_type from where fsweb.fruit f order by f.price asc",nativeQuery = true)
    List<Fruit> getByPriceAsc();

    @Query("select f from Fruit f where f.name LIKE %:name%")
    List<Fruit> searchByName(String name);


}

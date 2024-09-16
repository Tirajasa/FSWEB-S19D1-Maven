package com.workintech.s18d2.dao;

import com.workintech.s18d2.entity.Fruit;
import jakarta.persistence.EntityManager;
import jakarta.persistence.TypedQuery;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
@Slf4j
public class FruitRepositoryImpl implements FruitRepository {

    private final EntityManager entityManager;

    @Autowired
    public FruitRepositoryImpl(EntityManager entityManager) {
        this.entityManager=entityManager;
    }
    @Override
    public List<Fruit> get() {
      TypedQuery<Fruit> fruits=entityManager.createQuery("Select f from Fruit f",Fruit.class);
        return fruits.getResultList();
    }

    @Override
    public Fruit save(Integer id) {
       TypedQuery<Fruit> saved=entityManager.createQuery("")
        return ;
    }

    @Override
    public Fruit update() {
        return null;
    }

    @Override
    public Fruit remove() {
        return null;
    }
}

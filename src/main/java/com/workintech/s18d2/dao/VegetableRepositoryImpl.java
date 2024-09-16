package com.workintech.s18d2.dao;

import com.workintech.s18d2.entity.Vegetable;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class VegetableRepositoryImpl implements  VegetableRepository{

    @Autowired
    public VegetableRepositoryImpl() {
    }

    @Override
    public List<Vegetable> getVegetablesByOrderAsc() {
        return List.of();
    }
}

package com.workintech.s18d2.services;

import com.workintech.s18d2.entity.Fruit;
import com.workintech.s18d2.entity.Vegetable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface VegetableService {
    List<Vegetable> getPriceDesc();
    List<Vegetable> getPriceAsc();
    Vegetable getById(long id);
    Vegetable save (Vegetable vegetable);
    Vegetable delete(long id);
    Vegetable update(long id);
    List<Vegetable> searchByName(String name);
}

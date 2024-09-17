package com.workintech.s18d2.services;

import com.workintech.s18d2.entity.Fruit;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public interface FruitService {
    List<Fruit> getByPriceDesc();
    List<Fruit> getByPriceAsc();
    Fruit getById(long id);
    Fruit save (Fruit fruit);
    Fruit delete(long id);
    //Fruit update(long id);
    List<Fruit> searchByName(String name);
}

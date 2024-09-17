package com.workintech.s18d2.services;

import com.workintech.s18d2.dao.FruitRepository;
import com.workintech.s18d2.entity.Fruit;
import lombok.AllArgsConstructor;

import org.springframework.http.HttpStatus;
import com.workintech.s18d2.exceptions.PlantException;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class FruitServiceImpl implements FruitService{
    private final FruitRepository fruitRepository;

    @Override
    public List<Fruit> searchByName(String name) {
        return fruitRepository.searchByName(name);
    }


    @Override
    public Fruit delete(long id) {
        Fruit fruit=getById(id);
        fruitRepository.delete(fruit);
        return fruit;
    }

//    @Override
//    public Fruit update(long id) {
//        Fruit fruit=getById(id);
//       return fruitRepository.update(fruit);
//    }

    @Override
    public Fruit save(Fruit fruit) {
        return fruitRepository.save(fruit);
    }

    @Override
    public Fruit getById(long id) {
        return fruitRepository.findById(id).orElseThrow(()->new PlantException("plant with given id does not exist "+id, HttpStatus.NOT_FOUND));
    }

    @Override
    public List<Fruit> getByPriceAsc() {
        return fruitRepository.getByPriceAsc();
    }

    @Override
    public List<Fruit> getByPriceDesc() {
        return fruitRepository.getByPriceDesc();
    }
}

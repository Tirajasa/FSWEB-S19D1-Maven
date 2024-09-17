package com.workintech.s18d2.controller;

import com.workintech.s18d2.dto.FruitDto;
import com.workintech.s18d2.entity.Fruit;
import com.workintech.s18d2.services.FruitService;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Getter;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@AllArgsConstructor
@RestController
@RequestMapping("/fruit")
public class FruitController {
    private final FruitService fruitService;


    @GetMapping
    public List<Fruit> get(){
        return fruitService.getByPriceAsc();
    }
    @GetMapping("/desc")
    public List<Fruit> getByDesc(){
        return fruitService.getByPriceDesc();
    }
    @GetMapping("/{id}")
    public FruitDto get(@Positive(message = "id 0 dan kucuk olamaz.") @PathVariable("id") Long id){
        return new FruitDto("get by id succeed",fruitService.getById(id));
    }

    @GetMapping("/name/{name}")
    public List<Fruit> getByName(@Size(min = 2, max = 45,message = "name size must be between 2 to 45") @PathVariable("name") String name){
        return fruitService.searchByName(name);
    }

    @PostMapping
    public Fruit save(@Validated @RequestBody Fruit fruit){
        return fruitService.save(fruit);
    }
    @DeleteMapping
    public Fruit delete(@NotNull @Positive @PathVariable Long id){
      return fruitService.delete(id);
    }

}

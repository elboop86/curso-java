package com.example.service;

import com.example.entitis.Food;

import java.util.List;
import java.util.Optional;

public interface FoodService {

    //CRUD

    List<Food> findAll();
    Optional<Food> findById(Long id);
    List<Food> findAllByCategory(String category);

    List<Food> findAllByColor(String color);

    List<Food> findAllByCategoryAndColor(String category, String color);

    Food save(Food food);


     void delateById(Long id);

    void deleteById(Long id);

    // LÓGICA DE NEGOCIO
}

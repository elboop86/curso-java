package com.example.repositories;

import com.example.entitis.Food;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface FoodRepository extends JpaRepository<Food, Long> {
    List<Food> findAllByCategory(String category);
    List<Food> findAllByDescription(String description);
    List<Food> findAllByColor(String color);

    List<Food> findByName(String name);


    List<Food> findAllByCategoryAndColor(String category, String color);
}

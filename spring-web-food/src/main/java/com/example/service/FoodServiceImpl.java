package com.example.service;

import com.example.entitis.Food;
import com.example.repositories.FoodRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
@AllArgsConstructor
@Service
public class FoodServiceImpl implements FoodService{

    private final FoodRepository foodRepository;
    @Override
    public List<Food> findAll() {
        return null;
    }
}

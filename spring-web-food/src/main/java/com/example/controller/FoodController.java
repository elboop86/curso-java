package com.example.controller;

import com.example.service.FoodService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
@AllArgsConstructor
@Controller

public class FoodController {

    private FoodService foodService;
    // http://localhost:8080/foods
    @GetMapping("foods")
    public String findAll(Model model){
        model.addAttribute("foods", foodService.findAll());
        return "food-list";
    }
}

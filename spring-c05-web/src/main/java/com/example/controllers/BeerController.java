package com.example.controllers;

import com.example.entities.Beer;
import ch.qos.logback.core.model.Model;
import com.example.service.BeerService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@AllArgsConstructor
@Controller

public class BeerController {
            private final BeerService beerService;

            @GetMapping("/beers")  // http://localhost:8080/beers
            public String findAll(Model model) {
                List<Beer> beers = beerService.findAll();
                model.addAttribute("beers", beers);
                model.addAttribute("massage");
                return "beer-list";

            }
            @GetMapping("/beers/id")  // http://localhost:8080/beers/1
            public String  findById(Model model, @PathVariable Long id) {
                beerService.findAll(id)
                return "beer-detail";
            }

}

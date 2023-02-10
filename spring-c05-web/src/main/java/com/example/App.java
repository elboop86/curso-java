package com.example;

import com.example.Repository.BeerRepository;
import com.example.entities.Beer;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;


import java.util.List;

@SpringBootApplication
public class App {

    public static void main(String[] args) {
        ApplicationContext context = SpringApplication.run(App.class, args);
        BeerRepository beerRepo = context.getBean(BeerRepository.class);

        Beer beer1 = new Beer(null, "Judas", "yellow", 5.5, 3.5);
        Beer beer2 = new Beer(null, "San Miguel", "yellow", 5.5, 3.5);
        Beer beer3 = new Beer(null, "Volckdaam", "yellow", 5.5, 3.5);
        Beer beer4 = new Beer(null, "Coronita", "yellow", 5.5, 3.5);


        beerRepo.saveAll(List.of(beer1, beer2, beer3, beer4));

    }

}
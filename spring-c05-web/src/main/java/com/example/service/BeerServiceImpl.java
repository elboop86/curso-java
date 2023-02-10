package com.example.service;

import com.example.Repository.BeerRepository;
import com.example.entities.Beer;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;


    @Slf4j
    @AllArgsConstructor
    @Service
    public class BeerServiceImpl implements BeerService {

        private final BeerRepository beerRepository;

        @Override
        public List<Beer> findAll() {
            log.info("findAll");
            return beerRepository.findAll();
        }
    }


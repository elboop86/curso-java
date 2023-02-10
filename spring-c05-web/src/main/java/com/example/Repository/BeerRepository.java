package com.example.Repository;

import com.example.entities.Beer;
import org.springframework.data.jpa.repository.JpaRepository;



public interface BeerRepository extends JpaRepository<Beer, Long> {
}
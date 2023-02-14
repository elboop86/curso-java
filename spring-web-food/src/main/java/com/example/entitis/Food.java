package com.example.entitis;

import jakarta.persistence.*;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import lombok.*;
import org.hibernate.Hibernate;

import java.time.LocalDate;
import java.util.Objects;

@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
@Table(name = "foods")

public class Food {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Long id;
    private String name;
    private   String  category;
    private   String color;
    @Column(length = 500)   // Para que la description tenga mas caracteres
    private String description;
    private Double price;
    private Boolean available;
    private Integer quantity;
    private LocalDate expireDate;
}






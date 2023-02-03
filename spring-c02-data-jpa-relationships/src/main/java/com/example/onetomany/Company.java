package com.example.onetomany;

import jakarta.persistence.*;

@Entity
public class Company {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    @Column(unique = true)
    private String cif;


    public Company() {
    }

    public Company(String name, String cif) {
        this.name = name;
        this.cif = cif;
    }

    public Long getId() {
        return id;
    }

    public Company setId(Long id) {
        this.id = id;
        return this;
    }

    public String getName() {
        return name;
    }

    public Company setName(String name) {
        this.name = name;
        return this;
    }

    public String getCif() {
        return cif;
    }

    public Company setCif(String cif) {
        this.cif = cif;
        return this;
    }

    @Override
    public String toString() {
        return "Company{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", cif='" + cif + '\'' +
                '}';
    }
}

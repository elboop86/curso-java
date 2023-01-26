package com.example.classassociations2;

import java.util.ArrayList;
import java.util.List;

public class Book {

    private Long id;
    private String title;
    private Double price;

    // opción sin asociación con otra clase
    // private List<Double> ratings = new ArrayList<>();

    // opción con asociación a otra clase
    private List<Rating> ratings = new ArrayList<>();

    // TODO añadir Author

    public Book() {
    }

    public Book(Long id, String title, Double price, List<Rating> ratings) {
        this.id = id;
        this.title = title;
        this.price = price;
        this.ratings = ratings;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public List<Rating> getRatings() {
        return ratings;
    }

    public void setRatings(List<Rating> ratings) {
        this.ratings = ratings;
    }

    @Override
    public String toString() {
        return "Book{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", price=" + price +
                ", ratings=" + ratings +
                '}';
    }
}

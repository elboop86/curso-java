package com.example.classassociations2;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Book {

    private Long id;
    private String title;
    private Double price;

    // asociación de a muchos
    private List<Rating> ratings = new ArrayList<>();

    // asociación de a uno
    private Author author;

    // asociación de a uno
    private Editorial editorial;

    public Book() {
    }

    public Book(Long id, String title, Double price, Author author, Editorial editorial) {
        this.id = id;
        this.title = title;
        this.price = price;
//        this.ratings = ratings;
        this.author = author;
        this.editorial = editorial;
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

    public Author getAuthor() {
        return author;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }

    public Editorial getEditorial() {
        return editorial;
    }

    public void setEditorial(Editorial editorial) {
        this.editorial = editorial;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Book book)) return false;
        return Objects.equals(getId(), book.getId());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId());
    }

    @Override
    public String toString() {
        return "Book{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", price=" + price +
                '}';
    }
}

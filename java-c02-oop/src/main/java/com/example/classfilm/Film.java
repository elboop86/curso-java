package com.example.classfilm;

public class Film {

    // atributos
    String title;
    Integer duration;
    Double rating;
    String category;

    // constructores
    // se añade el constructor vacío siempre porque muchos frameworks lo necesitan
    public Film(){
    }

    public Film(String title, Integer duration, Double rating, String category) {
        this.title = title;
        this.duration = duration;
        this.rating = rating;
        this.category = category;
    }

    // métodos


    // toString
    // si no se pone toString entonces imprime la referencia en memoria:
    // com.example.classfilm.Film@4dd8dc3


    @Override
    public String toString() {
        return "Film{" +
                "title='" + title + '\'' +
                ", duration=" + duration +
                ", rating=" + rating +
                ", category='" + category + '\'' +
                '}';
    }
}

package com.example.classassociations2;

/*
Representa una puntuación y comentario de un usuario sobre un libro
 */
public class Rating {

    private Double score; // 1 - 5
    private String comment; // frase o párrafo

    public Rating() {
    }

    public Rating(Double score, String comment) {
        this.score = score;
        this.comment = comment;
    }

    public Double getScore() {
        return score;
    }

    public void setScore(Double score) {
        this.score = score;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    @Override
    public String toString() {
        return "Rating{" +
                "score=" + score +
                ", comment='" + comment + '\'' +
                '}';
    }
}

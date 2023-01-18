package com.example.classproduct;

public class Manufacturer {

    // atributos
    private String name;
    private String cif;
    private Integer year;

    // constructores

    public Manufacturer() {
    }

    public Manufacturer(String name, String cif, Integer year) {
        this.name = name;
        this.cif = cif;
        this.year = year;
    }

    // getter setter

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCif() {
        return cif;
    }

    public void setCif(String cif) {
        this.cif = cif;
    }

    public Integer getYear() {
        return year;
    }

    public void setYear(Integer year) {
        this.year = year;
    }


    // tostring

    @Override
    public String toString() {
        return "Manufacturer{" +
                "name='" + name + '\'' +
                ", cif='" + cif + '\'' +
                ", year=" + year +
                '}';
    }
}

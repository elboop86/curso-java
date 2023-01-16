package com.example.encapsulation.attributes;

public class Project {

    // atributos encapsulados, solo se pueden modificar
    // desde la propia clase Project
    private String title;
    private Integer numDevelopers;
    private Double cost;

    public Project() {
    }

    public Project(String title, Integer numDevelopers, Double cost) {
//        this.title = title;
//        this.numDevelopers = numDevelopers;
//        this.cost = cost;

        this.setTitle(title);
        this.setNumDevelopers(numDevelopers);
        this.setCost(cost);
    }

    // MÉTODOS GETTER devuelven atributo
    public String getTitle(){
        return this.title;
    }
    public Integer getNumDevelopers(){
        return this.numDevelopers;
    }
    // Método get que devuelva el coste
    public Double getCost(){
        return this.cost;
    }

    // MÉTODOS SETTER: void porque solo cambian, no devuelven
    public void setTitle(String title){

        this.title = title;
    }
    public void setNumDevelopers(Integer numDevelopers){
        if(numDevelopers > 0)
            this.numDevelopers = numDevelopers;
    }
    public void setCost(Double cost){
        if(cost > 0)
            this.cost = cost;
    }


    // TOSTRING


    @Override
    public String toString() {
        return "Project{" +
                "title='" + title + '\'' +
                ", numDevelopers=" + numDevelopers +
                ", cost=" + cost +
                '}';
    }
}

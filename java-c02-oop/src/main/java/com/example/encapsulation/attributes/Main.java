package com.example.encapsulation.attributes;


/*
Modificadores de visibilidad:

public: indica que un atributo o método es accesible desde otras clases
private: indica que un atributo o método es accesible desde la propia clase pero no desde fuera

*/
public class Main {

    public static void main(String[] args) {

        Project project1 = new Project("project1", 5, 100000d);


        // los atributos encapsulados (private) no se pueden
        // modificar directamente
        // project1.title = "99999988888";
        project1.setTitle("99999988888");
        // project1.numDevelopers = -5;

        // MÉTODOS GETTER: acceder a atributos
        // System.out.println(project1.title);
        System.out.println(project1.getTitle());
        System.out.println(project1.getNumDevelopers());
        System.out.println(project1.getCost());


        // MÉTODOS SETTER: modificar atributos
        // project1.title = "prj2";
        System.out.println("Título ANTES del set: " + project1.getTitle());
        project1.setTitle("project1 actualizado");
        System.out.println("Título DESPUÉS del set: " + project1.getTitle());

        project1.setNumDevelopers(4);
        project1.setCost(40000d);


        // Agregar dos nuevos developers al equipo:
        Integer newNumDevelopers = project1.getNumDevelopers() + 2;
        project1.setNumDevelopers(newNumDevelopers);


    }
}

package com.example.lists.stringexample;

import java.util.ArrayList;
import java.util.List;

/*
 Listas dinámicas
 Admiten duplicados
 */
public class Main {

    public static void main(String[] args) {

        String[] nifs = {"435345G", "324234T"};
        System.out.println(nifs.length);


        // Si no se especifica el tipo de dato entonces vale cualquier dato:
//        ArrayList things = new ArrayList<>();
//        things.add("Hola");
//        things.add(50.0);


        // 1. Crear ArrayList
        ArrayList<String> names = new ArrayList<>();
        ArrayList<Double> numbers = new ArrayList<>();
        ArrayList<Boolean> activeUsers = new ArrayList<>();
        // no se admiten tipos primitivos:
        // ArrayList<double> numbers = new ArrayList<>();


        // 2. Añadir elementos: se pueden agregar nuevos elementos en cualquier momento
        // String
        names.add("Name1");
        names.add("Name2");
        names.add("Name3");
        // Double
        numbers.add(1000.9d);
        numbers.add(1050.2d);
        numbers.add(5000.2d);

        // Añadir en una posición exacta especificando el índice
        names.add(0, "Nuevo nombre");


        // 3. Obtener un elemento: se extrae basándonos en el índice, que empieza en 0
        String name1 = names.get(0);
        String name2 = names.get(1);


        // 4. Borrar un elemento
        names.remove(0);
        names.remove(1);

        // 5. Cambiar un elemento de la lista
        names.set(0, "Nombre cambiado");


        // 6. Obtener tamaño del arraylist
        System.out.println(names.size());

        // 7. Comprobar si un ArrayList está vacío
        System.out.println(names.isEmpty());

        // 8. Vaciar el ArrayList
        // names.clear();

        // 9. Comprobar si un ArrayList está vacío
        System.out.println(names.isEmpty());

        // 10. Iterar sobre el ArrayList
        for (String name : names) {
            System.out.println(name);
        }

        // 11. Comprobar si una lista contiene un elemento
        if(names.contains("Name3"))
            System.out.println("Contiene Name3!!!!");


        // Imprimir el contenido
        System.out.println(names);

    }
}

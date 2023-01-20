package com.example.sets.stringexample;

import com.example.lists.companyexample.Car;

import java.util.HashSet;

/*
Los CONJUNTOS a diferencia de las LISTAS:

- No admiten duplicados
- No conservan el orden (Las listas conservan el mismo orden en el que se agregó los elementos)
 */
public class Main {

    public static void main(String[] args) {


        HashSet<String> names = new HashSet<>();
        names.add("name1");
        names.add("name2");
        names.add("name3");
        names.add("name3"); // duplicado
        names.add("name4");
        names.add("name5");
        names.add("name6");
        names.add("name7");

        System.out.println(names); // no aparece el duplicado


    }
}

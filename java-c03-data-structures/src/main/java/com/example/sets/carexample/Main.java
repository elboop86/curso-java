package com.example.sets.carexample;

import java.util.HashSet;

/*
Al implementar los métodos equals() y hashcode() en la clase Car
se puede distinguir si dos objetos son en realidad el mismo Car en base al modelo

De esta forma evitamos duplicados de Car en la estructura de datos HashSet
 */
public class Main {

    public static void main(String[] args) {


        Car car1 = new Car("model1", 10000.0);
        Car car2 = new Car("model2", 15000.0);
        Car car2Duplicated = new Car("model2", 15000.0); // duplicado
        Car car3 = new Car("model3", 20000.0);

        HashSet<Car> cars = new HashSet<>();
//        ArrayList<Car> cars = new ArrayList<>();
        cars.add(car1);
        cars.add(car2);
        cars.add(car2); // duplicado, no lanza excepcion
        cars.add(car2Duplicated); // duplicado
        cars.add(car3);

        System.out.println(cars); // no aparecen los duplicados


    }
}

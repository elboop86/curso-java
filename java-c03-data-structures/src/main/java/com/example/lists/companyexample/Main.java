package com.example.lists.companyexample;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*
Una Company tiene una lista de Employee
Un Employee tiene una lista de Car

A partir de una Company extraer los Car asociados
 */
public class Main {

    public static void main(String[] args) {

        Car car1 = new Car("model1", CarType.SEDAN, 10000.0);
        Car car2 = new Car("model2", CarType.SUV, 15000.0);
        Car car3 = new Car("model3", CarType.SPORT, 30000.0);
        Car car4 = new Car("model4", CarType.COUPE, 45000.0);
        Car car5 = new Car("model5", CarType.COUPE, 45000.0);
        Car car6 = new Car("model6", CarType.COUPE, 45000.0);
        Car car7 = new Car("model7", CarType.COUPE, 45000.0);
        Car car8 = new Car("model8", CarType.COUPE, 45000.0);

//         ArrayList<Car> cars = new ArrayList<>(List.of(car1, car2, car3, car4));
        ArrayList<Car> carsEmp1 = new ArrayList<>();
        carsEmp1.add(car1);
        carsEmp1.add(car2);

        ArrayList<Car> carsEmp2 = new ArrayList<>();
        carsEmp2.add(car2);
        carsEmp2.add(car3);
        carsEmp2.add(car4);

        ArrayList<Car> carsEmp3 = new ArrayList<>();
        carsEmp3.add(car5);
        carsEmp3.add(car6);

        ArrayList<Car> carsEmp4 = new ArrayList<>();
        carsEmp4.add(car7);
        carsEmp4.add(car8);

        Employee emp1 = new Employee("emp1", "7777744G", carsEmp1);
        Employee emp2 = new Employee("emp1", "7777744G", carsEmp2);
        Employee emp3 = new Employee("emp3", "7777744G", carsEmp3);
        Employee emp4 = new Employee("emp4", "7777744G", carsEmp4);

        Company comp1 = new Company("comp1", "1212B", new ArrayList<>(List.of(emp1, emp2)));
        Company comp2 = new Company("comp2", "1212B", new ArrayList<>(List.of(emp3, emp4)));

        ArrayList<Company> companies = new ArrayList<>(List.of(comp1, comp2));

        // extraer los coches a partir de las companies

        // Para evitar duplicados es mejor utilizar HashSet e implementar los métodos equals() y hashcode()  en Car
        ArrayList<Car> allCars = new ArrayList<>();

        for (Company company : companies) {
            for (Employee employee : company.getEmployees()) {
                allCars.addAll(employee.getCars());
            }
        }

        for (Car car : allCars) {
            System.out.println(car);
        }

        // Jose Ignacio:
        for (Company company : companies) {
            for (Employee employee : company.getEmployees()) {
                for (Car car : employee.getCars()) {
                    System.out.println(car.toString());
                }
            }
        }


    }
}

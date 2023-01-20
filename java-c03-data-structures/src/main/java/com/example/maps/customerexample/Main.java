package com.example.maps.customerexample;

import java.util.HashMap;

public class Main {

    public static void main(String[] args) {

        Customer cust1 = new Customer("cust1@email.com", 20);
        Customer cust2 = new Customer("cust2@email.com", 26);
        Customer cust3 = new Customer("cust3@email.com", 25);
        Customer cust4 = new Customer("cust4@email.com", 29);


        // clave es un valor único: por ejemplo dni o email
        // valor puede ser cualquier cosa, normalmente objetos de una clase por ejemplo Customer
        HashMap<String, Customer> customers = null;

        // otra forma de crear el mapa
        // var customers2 = new HashMap<String, Customer>();

        // Antes de hacer nada asegurarse de que está inicializado distinto que nulo
        if(customers == null)
            customers = new HashMap<>();

        // Añadir datos al mapa
        customers.put(cust1.getEmail(), cust1);
        customers.put("cust2@email.com", new Customer("cust2@email.com", 40));

        // Actualizar un dato en el mapa
        customers.get("cust2@email.com").setAge(45);

        System.out.println(customers);



    }



}

package com.example.lists.productexample;


import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        ArrayList<String> names = new ArrayList<>();

        ArrayList<Product> products = new ArrayList<>();
        // var products2 = new ArrayList<Product>();

        Product product1 = new Product("prod1", 9.99, 1, "red", 5);
        Product product2 = new Product("prod2", 19.99, 2, "green", 5);
        Product product3 = new Product("prod3", 29.99, 3, "red", 5);


        // CRUD: Create, Retrieve/Read, Update, Delete/Remove

        // 1. Create
        products.add(product1);
        products.add(product2);
        products.add(product3);
        products.add(product3); // mismo producto que el anterior, por tanto los cambio de uno afectan al otro
        System.out.println(products);


        // 2. Read
        for (Product product : products) {
            System.out.println(product);
        }
        System.out.println(products.get(2));

        // 3. Update
        products.get(0).setName("Nombre cambiado");

        // 4. Delete
        boolean isRemoved = products.remove(product1);
        System.out.println("El product1 fue borrado: " + isRemoved);

        isRemoved = products.remove(product1);
        System.out.println("El product1 fue borrado: " + isRemoved);
    }
}

package com.example.control.repetitive;

public class ForBreak {

    public static void main(String[] args) {

        String[] names = {"person1", "person2", "person3", "person4", "person5"};

        /*
        Comprobar si person3 está presente en el array
         */

        boolean isPresent = false;

        for (int i = 0; i < names.length; i++) {
            if (names[i].equalsIgnoreCase("person3")){
                isPresent = true;
                break; // sale del bucle
            }

        }

        if(isPresent)
            System.out.println("Person3 SÍ está en listado.");
    }
}

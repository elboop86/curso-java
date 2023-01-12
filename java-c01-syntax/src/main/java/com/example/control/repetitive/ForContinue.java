package com.example.control.repetitive;

public class ForContinue {

    public static void main(String[] args) {

        /*
        Saludar a todas las personas menos a person3
         */
        String[] names = {"person1", "person2", "person3", "person4", "person5"}; // length 5

//        for (int i = 0; i < names.length; i++) {
//            if (names[i].equalsIgnoreCase("person3"))
//                continue; // salta a la siguiente iteración
//            System.out.println("Welcome " + names[i]);
//        }

        // ! invierte el valor de un boolean
//        for (int i = 0; i < names.length; i++) {
//            if (!names[i].equalsIgnoreCase("person3"))
//                System.out.println("Welcome " + names[i]);
//        }

        /*
        Saludar a todas las personas menos las que empiezan por A
         */
        for (int i = 0; i < names.length; i++) {
            if (names[i].startsWith("p"))
                continue;
            System.out.println("Welcome " + names[i]);
        }


    }
}

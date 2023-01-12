package com.example.control.repetitive;

public class DoWhile {

    public static void main(String[] args) {


        String[] names = {"person1", "person2", "person3", "person4", "person5"}; // length 5
        boolean found = true;
        int cont = 0;

        /*
        do while se ejecuta siempre al menos una vez
         */
        do {
            if(names[cont].equalsIgnoreCase("person3"))
                found = true;

            cont++;

        } while (!found);
    }
}

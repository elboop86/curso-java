package com.example.control.repetitive;

public class ForArray {

    public static void main(String[] args) {
        String text = "Hola mundo";
        int textLength = text.length();

        //                   0           1         2           3          4
        String[] names = {"person1", "person2", "person3", "person4", "person5"}; // length 5

        // desde el principio hasta el final
        for (int i = 0; i < names.length; i++) {
            System.out.println(names[i]);
        }

        // desde el final hasta el principio
//        for (int i = names.length - 1; i >= 0; i--){
//            System.out.println(names[i]);
//        }


    }
}

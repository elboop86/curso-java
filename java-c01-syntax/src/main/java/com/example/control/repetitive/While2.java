package com.example.control.repetitive;

public class While2 {

    public static void main(String[] args) {

        String[] names = {"person1", "person2", "person3", "person4", "person5"}; // length 5

        boolean found = true;
        int i = 0;

        while (!found) {

            if(names[i].equalsIgnoreCase("person3"))
                found = true;

            i++;
        }
    }
}

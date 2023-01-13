package com.example.staticmodifier;

//import static com.example.staticmodifier.Constants.MIN_AGE;
import static com.example.staticmodifier.Constants.*;

public class MainWithImport {

    public static void main(String[] args) {

        int personAge = 22;

        if (personAge >= MIN_AGE){
            System.out.println("Has superado la primera fase del proceso de contratación");
        }

        double totalPrice = 4.99 + 4.99 * IVA;
    }
}

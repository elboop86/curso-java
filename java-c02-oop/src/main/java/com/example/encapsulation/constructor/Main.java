package com.example.encapsulation.constructor;

public class Main {

    public static void main(String[] args) {

        // como es static no es necesario crear objeto
        System.out.println(MessageConstants.getMessage());
        System.out.println(MessageConstants.EN_WELCOME);


        /*
        ENCAPSULACIÓN DE CONSTRUCTOR
        si el constructor es private no se puede crear objeto

        El objetivo es que nadie instancie la clase, simplemente la use de forma directa
         */
        // MessageConstants obj = new MessageConstants();




    }
}

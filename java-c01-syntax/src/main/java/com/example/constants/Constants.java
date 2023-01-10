package com.example.constants;

public class Constants {

    // variables constantes: no cambian de valor. Por defecto las ponemos en mayúsculas.
    static final double IVA = 0.21d;
    static final String DEFAULT_USERNAME = "anonymous";
    static final double IRPF = 0.15d;

    public static void main(String[] args) {

        String name = "Mike";
        double iva = 0.21;
        iva = 0.25;

        double irpf = IRPF;

        double asusPrice = 1200.0d;
        double asusPriceIVA = asusPrice + asusPrice * IVA;

        String name2 = "user1 " + DEFAULT_USERNAME;
    }
}

package com.example.trycatchfinally;

import java.util.Scanner;

/*
finally se utiliza para cerrar recursos independientemente de si
se ha ejecutado bien el try o se ha ejecutado el catch

Ejemplos:
- Cerrar conexión a base de datos
- Cerrar scanner
- Cerrar flujos de datos a archivos
- Cerrar conexiones socket
 */
public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        long option;
        try {
            option = scanner.nextLong();
        } catch (Exception e){
            e.printStackTrace();
        } finally {
            // se utiliza finally para cerrar recursos
            scanner.close();
        }
    }
}

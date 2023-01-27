package com.example.trycatch;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main2 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);


        // try múltiples catch para cada tipo de excepción
        try {
            // excepcion 1
            long option = scanner.nextLong();

            // excepcion 2
//            long operation = option / 0L;
            long operation = option / 1L;

            // excepcion 3
            int[] array = new int[2];
            array[5] = 5;

        } catch(InputMismatchException e) {
            e.printStackTrace();

        } catch (ArithmeticException e) {
            e.printStackTrace();

        } catch (ArrayIndexOutOfBoundsException e) {
            e.printStackTrace();
        }


        // Exception para asegurarse de capturar la excepción sea cual sea

        System.out.println("fin");
    }
}

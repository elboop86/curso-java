package com.example;

import java.time.LocalDate;
import java.time.Month;
import java.time.format.DateTimeParseException;
import java.util.Scanner;

/*
LocalDate
Representa fechas sin tiempo, es decir, sin horas ni minutos ni segundos
 */
public class LocalDateDemo {

    public static void main(String[] args) {

        // CUIDADO: evitar crear así:
        // LocalDate date1 = new LocalDate();
        // LocalDate date1 = new LocalDate.of(2023, 1, 1);

        // Forma correcta
        LocalDate date1 = LocalDate.of(2023, 1, 1);
        LocalDate date2 = LocalDate.of(2023, Month.JANUARY, 13);
        LocalDate date3 = LocalDate.now();

        // Formato: YYYY-MM-dd
        // 2023-01-26
        System.out.println(date1);
        System.out.println(date3);

        // Extraer información
        System.out.println(date1.getYear());
        System.out.println(date1.getMonthValue());
        System.out.println(date1.getDayOfMonth());
        System.out.println(date1.getDayOfWeek());
        System.out.println(date1.getDayOfYear());


        // Operación
        System.out.println(date1.plusDays(7)); // devuelve la fecha modificada
        System.out.println(date1.plusWeeks(2));
        System.out.println(date1.plusMonths(3));
        System.out.println(date1.plusYears(1));
        System.out.println(date1); // la original se mantiene sin modificar

        System.out.println(date1.minusDays(7)); // devuelve la fecha modificada
        System.out.println(date1.minusWeeks(2));
        System.out.println(date1.minusMonths(3));
        System.out.println(date1.minusYears(1));
        System.out.println(date1); // la original se mantiene sin modificar

        // Comprobar si una fecha está antes de otra fecha
        boolean result1 = date1.isBefore(date2);
        // Comprobar si una fecha está después de otra fecha
        boolean result2 = date1.isAfter(date2);

        // Pasar de String a LocalDate
        // Formato: YYYY-MM-dd
        LocalDate date4 = LocalDate.parse("2023-05-21");
        System.out.println(date4);

        // Excepciones:

        try {

            LocalDate date5 = LocalDate.parse("2023-50-21"); // Está mal el mes
            System.out.println(date5);

        } catch (DateTimeParseException e) {
            e.printStackTrace();

        } catch (Exception e) {
            System.out.println("Ha ocurrido un error desconocido");
            e.printStackTrace();
        }





        // Leer la fecha de consola
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce una fecha (YYYY-MM-dd):");
        try {
            String userDate = scanner.next(); // lee la fecha de consola
            LocalDate date5 = LocalDate.parse(userDate);
            System.out.println(date5);

        } catch (DateTimeParseException e) {
            e.printStackTrace();

        } catch (Exception e) {
            System.out.println("Ha ocurrido un error desconocido");
            e.printStackTrace();
        }

        System.out.println("fin");
    }
}

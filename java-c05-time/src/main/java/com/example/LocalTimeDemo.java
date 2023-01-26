package com.example;


import java.time.LocalTime;

/*
LocalTime refleja Horas, minutos, segundos

Ejemplos:
hora de entrada
hora de salida
horario de inicio de un partido
horario de fin de un partido
 */
public class LocalTimeDemo {

    public static void main(String[] args) {


        LocalTime time1 = LocalTime.of(15, 30, 0);
        LocalTime time2 = LocalTime.of(16, 30);
        LocalTime time3 = LocalTime.now();

        // Extraer información
        System.out.println(time1.getHour());
        System.out.println(time1.getMinute());
        System.out.println(time1.getSecond());
        System.out.println(time1.getNano());

        // Operaciones
        System.out.println(time1.plusHours(2));
        System.out.println(time1.plusMinutes(5));
        System.out.println(time1.plusSeconds(30));
        System.out.println(time1.plusNanos(30));

        System.out.println(time1.minusHours(2));
        System.out.println(time1.minusMinutes(5));
        System.out.println(time1.minusSeconds(30));
        System.out.println(time1.minusNanos(30));

        // Comprobar si un tiempo está antes de otra fecha
        boolean result1 = time1.isBefore(time2);
        // Comprobar si un tiempo está después de otra fecha
        boolean result2 = time1.isAfter(time2);

        // Pasar de texto a Tiempo (HH:mm:ss)
        LocalTime time4 = LocalTime.parse("21:34:00");
        LocalTime time5 = LocalTime.parse("10:27");


    }
}

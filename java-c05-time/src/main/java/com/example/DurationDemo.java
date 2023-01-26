package com.example;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalTime;

/*
Duration permite extraer el tiempo transcurrido entre dos tiempos
 */
public class DurationDemo {

    public static void main(String[] args) {

        LocalTime init = LocalTime.of(9, 0);
        LocalTime end = LocalTime.of(14, 0);

        Duration duration = Duration.between(init, end);

        // Ampliamos la clase 30 minutos
        duration = duration.plus(Duration.ofMinutes(30));
        System.out.println(duration);

        // Horas transcurridas
        System.out.println(duration.toHours());

        // Minutos restantes
        System.out.println(duration.toMinutesPart());
    }
}

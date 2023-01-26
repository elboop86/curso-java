package com.example;

import java.time.LocalDate;
import java.time.Period;

/*
Period permite extraer la cantidad de años/meses/días transcurridos entre dos fechas
 */
public class PeriodDemo {

    public static void main(String[] args) {
        LocalDate birthDate = LocalDate.of(1991, 5, 12);
        LocalDate today = LocalDate.now();

        Period period = Period.between(birthDate, today);

        System.out.println("El customer tiene edad: " + period.getYears() + " años");
        System.out.println("El customer tiene edad: " + period.getMonths() + " meses");

    }
}

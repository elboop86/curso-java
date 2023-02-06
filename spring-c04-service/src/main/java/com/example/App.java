package com.example;

import com.example.entities.Employee;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.time.LocalDate;

@SpringBootApplication
public class App {

    public static void main(String[] args) {
        SpringApplication.run(App.class, args);

        // Constructor con todos los parámetros @AllArgsConstructor
        Employee employee1 = new Employee(null, "777444333G", 4000.0, 0.0, LocalDate.of(2020,1,1), true);

        // Constructor sin parámetros @NoArgsConstructor
        Employee employee2 = new Employee();

        // Patrón builder @Builder
        Employee employee3 = Employee.builder().nif("6666R")
                .salary(3000.0)
                .bonus(0.0)
                .build(); // obligatorio introducir método build() al final para construir el objeto




    }

}

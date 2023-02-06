package com.example;

import com.example.entities.Employee;
import com.example.repositories.EmployeeRepository;
import com.example.services.EmployeeService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import java.time.LocalDate;
import java.util.List;

@SpringBootApplication
public class App {

    static ApplicationContext context;

    public static void main(String[] args) {
        context = SpringApplication.run(App.class, args);

        createDemoData();

        EmployeeService employeeService = context.getBean(EmployeeService.class);
        employeeService.raiseSalary(2L, 100.0);

    }




    private static void createDemoData() {
        EmployeeRepository employeeRepo = context.getBean(EmployeeRepository.class);

        // Constructor con todos los parámetros @AllArgsConstructor
        Employee emp1 = new Employee(null, "777444333G", 1000.0, 0.0, LocalDate.of(2020,1,1), true);

        // Constructor sin parámetros @NoArgsConstructor
        Employee emp2 = new Employee();
        emp2.setNif("666444333T");
        emp2.setSalary(1000.0);
        emp2.setBonus(0.0);
        emp2.setRegisterDate(LocalDate.of(2020,1,1));
        emp2.setActive(true);

        // Patrón builder @Builder
        Employee emp3 = Employee.builder().nif("6666R")
                .salary(1000.0)
                .bonus(0.0)
                .build(); // obligatorio introducir método build() al final para construir el objeto

        employeeRepo.saveAll(List.of(emp1, emp2, emp3));
    }

}

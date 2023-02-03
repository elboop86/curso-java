package com.example;

import com.example.entities.Address;
import com.example.entities.User;
import com.example.entities.UserType;
import com.example.repositories.UserRepository;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.List;

/*
https://docs.spring.io/spring-data/jpa/docs/current/reference/html/#jpa.query-methods.query-creation
 */
@SpringBootApplication
public class App {

    public static void main(String[] args) {
        ApplicationContext context = SpringApplication.run(App.class, args);
        UserRepository userRepo = context.getBean(UserRepository.class);

        User user1 = new User();
        user1.setName("Javier")
                .setEmail("javier1@email.com")
                .setUserType(UserType.ENTERPRISE)
                .setAddress(new Address("calle 1", "3345", "Madrid"))
                .setEntryHour(LocalTime.of(10, 0))
                .setSalary(1000.0)
                .setBirthDate(LocalDate.of(2000, 1, 1))
                .setActive(true);
        User user2 = new User();
        user2.setName("Javier")
                .setEmail("javier2@email.com")
                .setUserType(UserType.BASIC)
                .setAddress(new Address("calle 2", "3345", "Madrid"))
                .setEntryHour(LocalTime.of(10, 20))
                .setSalary(1500.0)
                .setBirthDate(LocalDate.of(2000, 1, 1))
                .setActive(true);
        User user3 = new User();
        user3.setName("Miguel")
                .setEmail("miguel@email.com")
                .setUserType(UserType.PREMIUM)
                .setAddress(new Address("calle 3", "3345", "Madrid"))
                .setEntryHour(LocalTime.of(10, 0))
                .setSalary(1700.0)
                .setBirthDate(LocalDate.of(2000, 1, 1))
                .setActive(true);
        userRepo.saveAll(List.of(user1, user2, user3));

        // CONSULTAS DE DATOS
        System.out.println("================== FIND ALL ==================");
        List<User> users = userRepo.findAll();
        for (User user : users)
            System.out.println(user);


        System.out.println("================== FIND ALL BY NAME: JAVIER ==================");
        List<User> javieres = userRepo.findAllByName("Javier");
        for (User user : javieres)
            System.out.println(user);


        System.out.println("================== FIND ALL BY NAME: MIGUEL ==================");
        List<User> migueles = userRepo.findAllByName("Miguel");
        for (User user : migueles)
            System.out.println(user);


        System.out.println("================== FIND ALL BY USERTYPE: BASIC ==================");
        List<User> basics = userRepo.findAllByUserType(UserType.BASIC);
        for (User user : basics)
            System.out.println(user);


        System.out.println("================== FIND ALL BY EMAIL: javier2@email.com ==================");
        User userJavier2 = userRepo.findByEmail("javier2@email.com");
        System.out.println(userJavier2);


        System.out.println("================== FIND ALL BY ENTRY HOUR: 10:00 ==================");
        List<User> usersEntry10h = userRepo.findAllByEntryHour(LocalTime.of(10, 0));
        for (User user : usersEntry10h)
            System.out.println(user);



        System.out.println("================== findBySalaryGreaterThanEqual: 1500 ==================");
        List<User> users1500 = userRepo.findBySalaryGreaterThanEqual(1500.0);
        for (User user : users1500)
            System.out.println(user);


        System.out.println("================== findBySalaryBetween: 1400.0, 1600.0 ==================");
        List<User> userSalaryBetween = userRepo.findBySalaryBetween(1400.0, 1600.0);
        for (User user : userSalaryBetween)
            System.out.println(user);


        System.out.println("fin");
    }

}

package com.example.repositories;

import com.example.entities.User;
import com.example.entities.UserType;
import org.springframework.data.jpa.repository.JpaRepository;

import java.time.LocalTime;
import java.util.List;

public interface UserRepository extends JpaRepository<User, Long> {
    List<User> findAllByName(String name);

    List<User> findAllByUserType(UserType type);

    User findByEmail(String email);

    List<User> findAllByEntryHour(LocalTime entryHour);

    List<User> findBySalaryGreaterThanEqual(Double salary);

    List<User> findBySalaryBetween(Double salaryStart, Double salaryEnd);


}

package com.example;

import com.example.onetoone.*;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import java.time.LocalTime;

@SpringBootApplication
public class App {

	static ApplicationContext context;

	public static void main(String[] args) {
		context = SpringApplication.run(App.class, args);
		oneToOne();
	}

	private static void oneToOne() {
		var userRepo = context.getBean(UserRepository.class);
		var addressRepo = context.getBean(AddressRepository.class);

		var address1 = new Address(null, "calle falsa 123", "33019", "Madrid");
		var address2 = new Address(null, "calle falsa 123", "33019", "Madrid");
		addressRepo.save(address1);
		addressRepo.save(address2);

		var user1 = new User(null, "user1", "user1@email.com", UserType.BASIC, LocalTime.of(10, 30), address1);
		var user2 = new User(null, "user2", "user2@email.com", UserType.PREMIUM, LocalTime.of(11, 30), address2);
		userRepo.save(user1);
		userRepo.save(user2);

	}

}

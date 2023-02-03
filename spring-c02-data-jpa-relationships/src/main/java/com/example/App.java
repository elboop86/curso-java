package com.example;

import com.example.manytoone.Person;
import com.example.manytoone.PersonRepository;
import com.example.manytoone.Smartphone;
import com.example.manytoone.SmartphoneRepository;
import com.example.onetomany.Company;
import com.example.onetomany.CompanyRepository;
import com.example.onetomany.CreditCard;
import com.example.onetomany.CreditCardRepository;
import com.example.onetoone.*;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.List;

@SpringBootApplication
public class App {

	static ApplicationContext context;

	public static void main(String[] args) {
		context = SpringApplication.run(App.class, args);
		oneToOne();
		manyToOne();
		oneToMany();
	}

	/**
	 * One To Many
	 * One company to Many Credit cards
	 * Una empresa tiene múltiples tarjetas de crédito. Pero una tarjeta pertenece a una única empresa
	 */
	private static void oneToMany() {

		CompanyRepository companyRepo = context.getBean(CompanyRepository.class);
		CreditCardRepository creditCardRepo = context.getBean(CreditCardRepository.class);

		CreditCard card1 = new CreditCard("SANTANDER", LocalDate.of(2024,1,1), "321");
		CreditCard card2 = new CreditCard("OPEN BANK", LocalDate.of(2024,1,1), "321");
		CreditCard card3 = new CreditCard("BBVA", LocalDate.of(2024,1,1), "321");
		CreditCard card4 = new CreditCard("CAIXABANK", LocalDate.of(2024,1,1), "321");
		creditCardRepo.saveAll(List.of(card1, card2, card3, card4));

		Company company1 = new Company("company1", "1231233F");
		company1.getCards().add(card1);
		company1.getCards().add(card2);

		Company company2 = new Company("company2", "B32432543");
		company2.getCards().addAll(List.of(card3, card4));

		companyRepo.saveAll(List.of(company1, company2));
	}

	/**
	 * Many To One
	 * Many smartphones to One person
	 */
	private static void manyToOne() {
		var personRepo = context.getBean(PersonRepository.class);
		var smartphoneRepo = context.getBean(SmartphoneRepository.class);

		var person1 = new Person("person1", "111A", 1999.9);
		personRepo.save(person1);

		var phone1 = new Smartphone("66666666", "Satanic mobiles", 6, person1);

		var phone2 = new Smartphone();
		phone2.setBrand("OnePlus");
		phone2.setNumber("555444777");
		phone2.setRam(8);
		phone2.setPerson(person1);

		var phone3 = new Smartphone();
		phone3.setBrand("Apple").setNumber("555666777").setRam(4).setPerson(person1);

		smartphoneRepo.saveAll(List.of(phone1, phone2, phone3));

	}

	/**
	 * One To One
	 * Un usuario tiene una dirección
	 * Una dirección pertenece a un único usuario
	 */
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

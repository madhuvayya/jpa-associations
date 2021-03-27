package com.hm.jpaassociations.onetomany;

import java.util.HashSet;
import java.util.Set;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class OneToManyTest {
	
	@Autowired
	private CustomerRepository repo;

	@Test
	void testCreateCustomer() {
		Customer customer = new Customer();
		customer.setName("John");
		
		Set<PhoneNumber> numbers = new HashSet<>();
		
		PhoneNumber number1 = new PhoneNumber();
		number1.setNumber("1234567890");
		number1.setCustomer(customer);
		numbers.add(number1);
		
		PhoneNumber number2 = new PhoneNumber();
		number2.setNumber("9876543210");
		number2.setCustomer(customer);
		numbers.add(number2);
		
		customer.setNumbers(numbers);
		repo.save(customer);
	}
	
}

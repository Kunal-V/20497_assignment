package com.sonata.Assum;

import static org.junit.Assert.*;
import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.Test;



public class AssertionDemo {

	Person person = new Person("kunal", "rao");
	Calculator c1 = new Calculator();
	
	@Test
	void groupedAssertions() {
		
		assertAll("person",
				() -> assertEquals("kunal", person.getFirstName()),
				() -> assertEquals("rao", person.getLastName()) );
	}
	
	@Test
	void dependentAssertions() {
		
		assertAll("properties",
		() -> {
			String firstName = person.getFirstName();
			assertNotNull(firstName);
		
		assertAll("first name" ,
			() -> assertTrue(firstName.startsWith("k")),
			() -> assertTrue(firstName.endsWith("r")) );
		
		},
	() -> {
		
		String lastName = person.getLastName();
		assertNotNull(lastName);
	
		assertAll("last name" ,
				() -> assertTrue(lastName.startsWith("l")),
				() -> assertTrue(lastName.endsWith("o")) );
	
	}
	);

	}
	
	@Test
	public void exceptionTesting() {
		Exception exception = assertThrows(ArithmeticException.class, () ->
		c1.div(1, 0));
		assertEquals(" divide by zero" , exception.getMessage());
	}
	

}

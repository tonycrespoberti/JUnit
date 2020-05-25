package com.project.test;

import org.junit.Assert;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


//In JUnit 5 it is not necesary to declare class and method public. It is a security feature to avoid generate a new instance of them
class PersonaTest {

	private Persona persona;
	
	//This JUnit default method called setUp() is executed before each method test.
	@BeforeEach
	void setUp() throws Exception {
		
		persona = new Persona("Tony", "Crespo", 54);
	}

	@Test
	void testGetNombre() throws Exception {
		//Given (First Condition Previous the Test)

		//When (Execute the current test method)

		//Then (Verify if Conditions has been passed)
		Assert.assertTrue(persona.getNombre().equalsIgnoreCase("tony"));
	}

}

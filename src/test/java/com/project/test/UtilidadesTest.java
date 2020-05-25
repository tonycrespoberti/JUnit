package com.project.test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

import org.junit.Assert;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


//JUnit does not need to inherit from any class.
//Must have at least one method with @Test annotation to test. If not, the compliler will launch an error.
//The main idea is make unitary test, one for method.

//All classes and method in JUNit 5 can omit public definition cause it brings a security level to avoid generate new instance of them
class UtilidadesTest {

	private static Utilidades utils;
	
	//Is executed once at the begining, before every method will be tested.
	//Must be static void
	@BeforeAll //Take care for JUnit 5 @BeforeClass not working
	static void testUpBeforeClass() throws Exception {
		utils = new Utilidades();
	}
	
	//Is executed at the begining of every method
	@BeforeEach //Take care for JUnit 5 @Before not working
	void testSetup() {
	}
	
	//Is executed at the end of every method
	@AfterEach 
	void testTearDown() {
		
	}
	
	//Is executed once at the end, when every method has beend tested. 
	//Must be static void
	@AfterAll
	static void testDownAfterClass() throws Exception {
		
	}
	
	@Test
	//All JUnit method must be void. They don`t return anything.
	void testConcatenar() {
		
		//Step:
		//1. New class instance
		//This has been instanced into the BeforeClass Method
		//Condition initial
		String expected = "HelloWorld";
		
		//2. execute the method to be tested
		String concatenar = utils.concatenar("Hello", "World");
		
		//3. Validate the test via Assert
		Assert.assertEquals("Las cadenas son diferentes", expected, concatenar);
	}
		
	@Test
	//Fail is when expected value is not the same to actual value
	void testConcatenarFail() {
		String expected = "Hello World";
		String concatenar = utils.concatenar("Hello ", "World");
	
		
		Assert.assertEquals(expected, concatenar);
		
	}
	
	@Test
	//Error is when the method does not finished its execution by error who stop the process
	//For instance if some of value is a null
	void testConcatenarError() {
		String expected = "Hello World";
		//String concatenar = utils.concatenar("null", "World");
		
		//Assert.assertEquals(expected, concatenar);
		
	}
	
	@Test
	void testGetArrayStrings() throws Exception{
		//Given
		String [] expected = {"uno", "dos", "tres"};
		
		//When
		String[] result = utils.getArrayStrings("uno", "dos", "tres");
	
		//Then
		
		//comparing arrays
		assertArrayEquals(expected, result);
		assertEquals(3, result.length);
		
		assertEquals(expected[0], result[0]);
		assertNotEquals(expected[2], result[1]);
		
		assertThat(expected[0], is(result[0]));
		
	}
}

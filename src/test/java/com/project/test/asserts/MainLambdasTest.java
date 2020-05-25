package com.project.test.asserts;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertThat;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

public class MainLambdasTest {
	
	private static List<Integer> elementsList;

	@BeforeAll
	static void prepareListOfElements() throws Exception {
		
		elementsList = Arrays.asList(1, 3, 6, 9, 11, 22, 89, 120);
		
	}
	
	@Test
	void proveerTest() {
		
		//Given (Initial condition)
		List<Integer> expectedList = Arrays.asList(6, 22, 120);
		
		System.out.println("Variables have been initialized: " + elementsList);
		System.out.println("Elementos pares de la lista: " + expectedList);
		
		//When (Executing the metrhod)
		List<Integer> actualList = elementsList.stream().filter(x -> x % 2 == 0).collect(Collectors.toList());
		
		System.out.println("Elementos obtenido del lambda: " + actualList);
		
		//Then (Expected result)
		assertThat(actualList, is(expectedList));
	}
}
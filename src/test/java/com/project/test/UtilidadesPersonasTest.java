package com.project.test;


import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class UtilidadesPersonasTest {
	
	private UtilidadesPersonas utils;
	
	@BeforeEach
	void setUp() throws Exception {
		
		utils = new UtilidadesPersonas();
	}

	@Test
	public void testGetBaldomero() throws Exception {
		//Given
		

		//When
		Persona p1 = utils.getBaldomero();
		
		//Then
		assertEquals("Baldomero", p1.getNombre());
		assertEquals("Hernández", p1.getApellido());
	}

	@Test
	public void testPersonasDiferentes() throws Exception {
		//Given

		//When
		Persona p1 = utils.getBaldomero();
		Persona p2 = utils.getCoromoto();

		//Then
		assertNotEquals(p1, p2);
	}

}

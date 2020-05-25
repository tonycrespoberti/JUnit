package com.project.test.asserts;

import com.project.test.Persona;

public class MainBasicsExamples {

	public static void main(String[] args) {
		Persona p1 = new Persona("Baldomero", "Gallardo", 54);
		Persona p2 = new Persona("Coromoto", "Alvarez", 45);
		
		
		if (p1.equals(p2)) {
			
			System.out.println("p1 equals p2 son iguales");
		
		}else {
		
			System.out.println("p1 equals p2 NO SON iguales");
		}
		
		if (p1 == p2) {
			
			System.out.println("p1 == p2");
		
		}else {
			
			System.out.println("p1 == p2 no es posible con ese operador de comparación de primiivos");
			
		}
		
		p2 = new Persona("Baldomero", "Gallardo", 54);
		
		
		if (p1.equals(p2)) {
			//This is possible cuase equals and hashcode method are overrides
			System.out.println("p1 equals p2 son iguales");
		
		}else {
		
			System.out.println("p1 equals p2 NO SON iguales");
		}

	}

}

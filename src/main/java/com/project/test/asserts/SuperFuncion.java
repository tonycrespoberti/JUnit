package com.project.test.asserts;

import java.util.ArrayList;
import java.util.List;

import com.project.test.asserts.interfaces.OperadorUnario;
import com.project.test.asserts.interfaces.Potencia;
import com.project.test.asserts.interfaces.Predicate;
import com.project.test.asserts.interfaces.Supplier;

public class SuperFuncion {
	
	
	//Provee una lista de numeros aleatorios
	public static List<Integer> proveer(int size, Supplier supplier){

		List<Integer> listaIncial = new ArrayList<>();
		
		for (int i = 0; i <= size; i++) {
			
			listaIncial.add(supplier.obtener());
		}
		
		System.out.println("Lista inicial generada: " + listaIncial);
		return listaIncial;
	}
	

	//Filtra los pares y devuelve una nueva lista para el flujo
	public static List<Integer> filtrar(List<Integer> listaNumeros, Predicate predicado) {
		
		List<Integer> listaPares = new ArrayList<>();
		
		for (Integer elementos : listaNumeros) {
			
			if (predicado.evaluar(elementos)) {
				
				listaPares.add( elementos);
			}
		}
		System.out.println("Los nros pares: " + listaPares);
		
		return listaPares;
	}
	
	//Eleva al Cuadrado
	public static List<Integer> transformar(Integer exponente, List<Integer> listaNumeros, Potencia potencia) {
		
		List<Integer> listaPotencia = new ArrayList<>();
		
		for (Integer elemento : listaNumeros) {
			
			listaPotencia.add(potencia.elevar(elemento, exponente));
		}
		
		System.out.println("Elevados a la Potencia: " + exponente + " "+ listaPotencia);
		return listaPotencia;
	}

	//Suma los cuadrados 
	public static Integer reducir(List<Integer> listaNumeros, OperadorUnario operadorUnario) {
		
		Integer resultado = 0;
		
		for (Integer elemento : listaNumeros) {
			
			resultado += operadorUnario.calcular(elemento);
		}
		
		System.out.println("La sema de los cuadrados: " + resultado);
		return resultado;
	}
	
	//Muestra resultado final del flujo
	public static void mostrar(Integer valor1) {
		
		System.out.println("El resultado final es: " + valor1);
	}
	
}

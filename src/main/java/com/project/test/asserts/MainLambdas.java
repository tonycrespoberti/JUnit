package com.project.test.asserts;

import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

import com.project.test.Persona;
import com.project.test.asserts.interfaces.OperadorUnario;
import com.project.test.asserts.interfaces.Potencia;
import com.project.test.asserts.interfaces.Predicate;
import com.project.test.asserts.interfaces.Supplier;

public class MainLambdas {

	public static void main(String[] args) {
		
		//1. Proveer (Supplier) una lista numeros inicial y aleatorios
		//2. Filtrar los pares (Precicate)
		//3. Elevar al cuadrado el resultado
		//4. Preguntar si es par
		//5. Mostrar
		
		//Ver fichero Interfaz_Funcional.txt del proyecto para conceptos básicos de interfaces funcionales
		int size = 15;
		int exponente = 3; //al cuadrado
		
		//1. Provee lista nueva random inicial y con los pares de la misma
		List<Integer> listaInicial = SuperFuncion.proveer(size, new Supplier() {
			
			Random random = new Random();
			
			@Override
			public Integer obtener() {

				return random.nextInt(15);
			}
		}).stream().filter( x -> x % 2 == 0 ).collect(Collectors.toList());
		
/*		
 		//This method has been absorbed for the previous lambda 
		//2. Filtra los pares
		List<Integer> listaFiltrada = SuperFuncion.filtrar(listaInicial, new Predicate() {
			
			@Override
			public boolean evaluar(Integer valor1) {

				return (valor1 % 2 == 0);
			}
		});
*/		
		
		
		//3. Transforma elevando al cuadrado
		List<Integer> listaALaPotencia = SuperFuncion.transformar(exponente, listaInicial, new Potencia() {

			@Override
			public Integer elevar(Integer base, Integer exponente) {
				
				return (int) Math.pow(base, exponente);
			}
		}); 
		
		//4. Consume sumando todos los numeros de la lista
		Integer resultado = SuperFuncion.reducir(listaALaPotencia, new OperadorUnario() {
			
			@Override
			public Integer calcular(Integer valor1) {

				return valor1;
			}
		});
		
		//5. Mostrar
		SuperFuncion.mostrar(resultado);
		
	}
	

}

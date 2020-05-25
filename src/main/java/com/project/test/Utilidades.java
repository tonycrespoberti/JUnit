package com.project.test;

public class Utilidades {
	
	public String concatenar(String uno, String dos) {
		
		return uno.concat(dos);
	}
	
	/**
	 * Concatena y devuelve dos String pasados por parámetro
	 * @param uno -> primer String a concatenar
	 * @param dos -> segundo String a concatenar
	 * @return uno + dos
	 */

	public String concatenar2(String uno, String dos) {
		
		if (uno != null && dos != null) {
			
			return uno.concat(" ").concat(dos);
		}
		
		return null;
	}
	
	
	/**
	 * Ejemplo "a", "b", "c" -> String [] array = {!a", "b", "c"}
	 * array[0] = "a"
	 * array[1] = "b1"
	 * array[2] = "c"
	 * @param strings
	 * @return String[strings.lenght]
	 */

	public String[] getArrayStrings(String ... strings ) { //varargs param
		
		String[] array = new String[strings.length];
		
		for(int i = 0; i < strings.length; i++) {
			array[i] = strings[i];
		}
		
		return array;
	}

}

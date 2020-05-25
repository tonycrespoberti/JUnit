package com.project.test;

public class UtilidadesPersonas {

	private Persona baldomero;
	
	private Persona coromoto;

	public UtilidadesPersonas() {

		baldomero = new Persona("Baldomero", "Hernández", 33);
		coromoto = new Persona("Coromoto", "Alvarez", 23);
	}

	public Persona getBaldomero() {
		return baldomero;
	}

	public void setBaldomero(Persona baldomero) {
		this.baldomero = baldomero;
	}

	public Persona getCoromoto() {
		return coromoto;
	}

	public void setCoromoto(Persona coromoto) {
		this.coromoto = coromoto;
	}
	
	/** AssertArrayEquals */
	public Persona[] getArrayPersonas(){
		
		Persona[] personas = {baldomero, coromoto};
		
		return personas;
	}
	
}

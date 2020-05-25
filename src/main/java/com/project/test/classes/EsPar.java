package com.project.test.classes;

import com.project.test.asserts.interfaces.Predicate;

public class EsPar implements Predicate{

	@Override
	public boolean evaluar(Integer valor1) {

		return (valor1 % 2 == 0);
	}

}

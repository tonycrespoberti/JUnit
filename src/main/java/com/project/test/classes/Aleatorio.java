package com.project.test.classes;

import java.util.Random;

import com.project.test.asserts.interfaces.Supplier;

public class Aleatorio implements Supplier {

	Random random = new Random();
	
	@Override
	public Integer obtener() {

		return random.nextInt(15);
	}


}

package com.qian.factory2;


public class ConcreteFactoryA extends Factory {

	@Override
	public Product createProduct() {
		
		return new ConcreteProductA();
	}

	

}

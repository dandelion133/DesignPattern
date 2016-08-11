package com.qian.factory2;


public class ConcreteFactoryB extends Factory {

	@Override
	public Product createProduct() {
		
		return new ConcreteProductB();
	}

}

package com.qian.factory2;

public class Client {
	public static void main(String[] args) {
		Factory factory = new ConcreteFactoryA();
		Product product = factory.createProduct();
		product.method();
		
		
		factory = new ConcreteFactoryB();
		product = factory.createProduct();
		product.method();
		
		
	}
}

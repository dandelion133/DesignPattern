package com.qian.factory1;

public class Client {
	public static void main(String[] args) {
		Factory factory = new ConcreteFactory();
		Product product = factory.createProduct(ConcreteProductA.class);
		product.method();
		
		product = factory.createProduct(ConcreteProductB.class);
		product.method();
	}
}

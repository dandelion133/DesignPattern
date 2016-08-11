package com.qian.factory;

public class Factory {
	private  Product product;
	public  Product createProduct(String name) {
		
		
		switch (name) {
		case "A":
			product = new ConcreteProductA();
			break;
		case "B":
			product = new ConcreteProductB();
			break;
		default:
			break;
		}
		return product;
		
		
	}
}

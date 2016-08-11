package com.qian.factory;

public class Client {
	public static void main(String[] args) {
		
		Factory factory = new Factory();
		
		Product product = factory.createProduct("A");
		product.method();
		product = factory.createProduct("B");
		product.method();
	}
}

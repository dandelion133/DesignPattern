package com.qian.factory3;

public class Client {
	public static void main(String[] args) {
		AbstractFactory factory = new ConcreteFactory1();
		factory.createProductA().method();
		factory.createProductB().method();
		System.out.println("-------------");
		factory = new ConcreteFactory2();
		factory.createProductA().method();
		factory.createProductB().method();
	}
}

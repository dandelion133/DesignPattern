package com.qian.bridge.coffee;

public class MiddleCoffee extends Coffee {

	public MiddleCoffee(CoffeeAddttives addttives) {
		super(addttives);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void makeCoffee() {
		System.out.println("�б���" + addttives.addSomething() + "����");

	}

}

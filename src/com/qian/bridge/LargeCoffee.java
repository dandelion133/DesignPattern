package com.qian.bridge;

public class LargeCoffee extends Coffee {

	public LargeCoffee(CoffeeAddttives addttives) {
		super(addttives);
	}

	@Override
	public void makeCoffee() {
		System.out.println("С����" + addttives.addSomething() + "����");

	}

}

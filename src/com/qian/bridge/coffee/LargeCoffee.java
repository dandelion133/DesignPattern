package com.qian.bridge.coffee;

public class LargeCoffee extends Coffee {

	public LargeCoffee(CoffeeAddttives addttives) {
		super(addttives);
	}

	@Override
	public void makeCoffee() {
		System.out.println("С����" + addttives.addSomething() + "����");

	}

}

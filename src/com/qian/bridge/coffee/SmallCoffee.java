package com.qian.bridge.coffee;

public class SmallCoffee extends Coffee {

	public SmallCoffee(CoffeeAddttives addttives) {
		super(addttives);
	}

	@Override
	public void makeCoffee() {
		System.out.println("´ó±­µÄ" + addttives.addSomething() + "¿§·È");

	}

}

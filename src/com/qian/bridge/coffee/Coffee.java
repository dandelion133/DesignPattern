package com.qian.bridge.coffee;

public abstract class Coffee {
	protected  CoffeeAddttives addttives;

	public Coffee(CoffeeAddttives addttives) {
		super();
		this.addttives = addttives;
	}
	
	public abstract void makeCoffee();
}

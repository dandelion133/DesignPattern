package com.qian.bridge;

public abstract class Coffee {
	protected  CoffeeAddttives addttives;

	public Coffee(CoffeeAddttives addttives) {
		super();
		this.addttives = addttives;
	}
	
	public abstract void makeCoffee();
}

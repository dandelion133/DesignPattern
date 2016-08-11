package com.qian.factory3;


public class ConcreteFactory1 extends AbstractFactory {
	//生产A1产品
	@Override
	public AbstractProductA createProductA() {
		
		return new ConcreteProductA1();
	}
	//生产B1产品
	@Override
	public AbstractProductB createProductB() {
		
		return new ConcreteProductB1();
	}
}

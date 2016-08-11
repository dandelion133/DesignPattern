package com.qian.factory3;


public class ConcreteFactory1 extends AbstractFactory {
	//����A1��Ʒ
	@Override
	public AbstractProductA createProductA() {
		
		return new ConcreteProductA1();
	}
	//����B1��Ʒ
	@Override
	public AbstractProductB createProductB() {
		
		return new ConcreteProductB1();
	}
}

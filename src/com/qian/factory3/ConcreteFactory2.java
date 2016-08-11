package com.qian.factory3;


public class ConcreteFactory2 extends AbstractFactory {
	//����A2��Ʒ
	@Override
	public AbstractProductA createProductA() {
		
		return  new ConcreteProductA2();
	}
	//����B2��Ʒ
	@Override
	public AbstractProductB createProductB() {
		
		return  new ConcreteProductB2();
	}



}

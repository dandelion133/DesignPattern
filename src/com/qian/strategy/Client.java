package com.qian.strategy;

public class Client {
	public static void main(String[] args) {
		//ͨ�����췽������״̬A
		Context context = new Context(new ConcreteStrategyA());
		context.algorithm();
		//����״̬B
		context.setState(new ConcreteStrategyB());
		context.algorithm();
		
		
	}
}

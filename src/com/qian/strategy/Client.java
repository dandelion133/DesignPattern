package com.qian.strategy;

public class Client {
	public static void main(String[] args) {
		//通过构造方法传入状态A
		Context context = new Context(new ConcreteStrategyA());
		context.algorithm();
		//设置状态B
		context.setState(new ConcreteStrategyB());
		context.algorithm();
		
		
	}
}

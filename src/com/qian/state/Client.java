package com.qian.state;

public class Client {
	public static void main(String[] args) {
		//ͨ�����췽������״̬A
		Context context = new Context(new ConcreteStateA());
		context.doSomething();
		//����״̬B
		context.setState(new ConcreteStateB());
		context.doSomething();
		
		
	}
}

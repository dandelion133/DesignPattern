package com.qian.bridge;

public abstract class Abstraction {
	//声明一个私有成员变量引用    实现部分的对象
	private Implementor implementor;
	//通过构造方法引用   实现部分的对象
	public Abstraction(Implementor implementor) {
		super();
		this.implementor = implementor;
	}
	
	
	public void oprationImpl() {
		implementor.oprationImpl();
	}
	
}

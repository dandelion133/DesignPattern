package com.qian.bridge;

public abstract class Abstraction {
	//����һ��˽�г�Ա��������    ʵ�ֲ��ֵĶ���
	private Implementor implementor;
	//ͨ�����췽������   ʵ�ֲ��ֵĶ���
	public Abstraction(Implementor implementor) {
		super();
		this.implementor = implementor;
	}
	
	
	public void oprationImpl() {
		implementor.oprationImpl();
	}
	
}

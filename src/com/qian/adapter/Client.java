package com.qian.adapter;

public class Client {
	public static void main(String[] args) {
		// ʹ����ͨ������
		Target concreteTarget = new ConcreteTarget();
		concreteTarget.request();

		// ʹ�����⹦���࣬��������
		Target adapter = new Adapter(new Adaptee());
		adapter.request();
	}
}

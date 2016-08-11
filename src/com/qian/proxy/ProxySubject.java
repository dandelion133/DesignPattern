package com.qian.proxy;

public class ProxySubject extends Subject {
	//������ʵ���������
	private RealSubject realSubject;
	
	public ProxySubject(RealSubject realSubject) {
		this.realSubject = realSubject;
	}
	@Override
	public void request() {
		//ͨ����ʵ�������õĶ��������ʵ�����е��߼�����
		realSubject.request();
	}

}

package com.qian.proxy;

public class Client {
	public static void main(String[] args) {
		//����һ����ʵ����
		RealSubject realSubject = new RealSubject();
		//ͨ����ʵ���������һ���������
		ProxySubject proxySubject = new ProxySubject(realSubject);
		//���ô������ط���
		proxySubject.request();
	}
}

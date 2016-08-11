package com.qian.proxy;

public class Client {
	public static void main(String[] args) {
		//构造一个真实主题
		RealSubject realSubject = new RealSubject();
		//通过真实主题对象构造一个代理对象
		ProxySubject proxySubject = new ProxySubject(realSubject);
		//调用代理的相关方法
		proxySubject.request();
	}
}

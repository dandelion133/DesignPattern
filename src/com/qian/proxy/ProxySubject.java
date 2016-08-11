package com.qian.proxy;

public class ProxySubject extends Subject {
	//持有真实主题的引用
	private RealSubject realSubject;
	
	public ProxySubject(RealSubject realSubject) {
		this.realSubject = realSubject;
	}
	@Override
	public void request() {
		//通过真实主题引用的对象调用真实主题中的逻辑方法
		realSubject.request();
	}

}

package com.qian.proxy;

public class RealSubject extends Subject{

	@Override
	public void request() {
		System.out.println("real subject");
	}

}

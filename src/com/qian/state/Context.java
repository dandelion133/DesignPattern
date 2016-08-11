package com.qian.state;

public class Context {
	//ά��һ��State��ʵ��
	private State state;
	//���췽���������״̬
	public Context(State state) {
		this.state = state;
	}
	//����״̬
	public void setState(State state) {
		this.state = state;
	}
	//������Ϊ
	public void doSomething() {
		state.doSonmething();
	}
	
}

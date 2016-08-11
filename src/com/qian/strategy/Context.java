package com.qian.strategy;

public class Context {
	//ά��һ��State��ʵ��
	private Strategy strategy;
	//���췽���������״̬
	public Context(Strategy state) {
		this.strategy = state;
	}
	//����״̬
	public void setState(Strategy state) {
		this.strategy = state;
	}
	//������Ϊ
	public void algorithm() {
		strategy.algorithm();
	}
	
}

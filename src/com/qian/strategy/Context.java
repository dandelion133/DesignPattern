package com.qian.strategy;

public class Context {
	//维护一个State的实例
	private Strategy strategy;
	//构造方法传入具体状态
	public Context(Strategy state) {
		this.strategy = state;
	}
	//设置状态
	public void setState(Strategy state) {
		this.strategy = state;
	}
	//具体行为
	public void algorithm() {
		strategy.algorithm();
	}
	
}

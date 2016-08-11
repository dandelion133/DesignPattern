package com.qian.state;

public class Context {
	//维护一个State的实例
	private State state;
	//构造方法传入具体状态
	public Context(State state) {
		this.state = state;
	}
	//设置状态
	public void setState(State state) {
		this.state = state;
	}
	//具体行为
	public void doSomething() {
		state.doSonmething();
	}
	
}

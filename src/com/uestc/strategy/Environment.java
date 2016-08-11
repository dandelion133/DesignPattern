package com.uestc.strategy;

public class Environment {
	private StrategyCalculation strategy;// 持有策略对象

	// 定义构造方法
	public Environment(StrategyCalculation strategy) {
		this.strategy = strategy;
	}

	public StrategyCalculation getStrategy() {
		return strategy;
	}

	// /防止再一次构造一个对象，浪费空间
	public void setStrategy(StrategyCalculation strategy) {
		this.strategy = strategy;
	}

	public int calculate(int x, int y) {
		return strategy.calc(x, y);
	}

}

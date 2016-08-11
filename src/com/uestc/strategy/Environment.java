package com.uestc.strategy;

public class Environment {
	private StrategyCalculation strategy;// ���в��Զ���

	// ���幹�췽��
	public Environment(StrategyCalculation strategy) {
		this.strategy = strategy;
	}

	public StrategyCalculation getStrategy() {
		return strategy;
	}

	// /��ֹ��һ�ι���һ�������˷ѿռ�
	public void setStrategy(StrategyCalculation strategy) {
		this.strategy = strategy;
	}

	public int calculate(int x, int y) {
		return strategy.calc(x, y);
	}

}

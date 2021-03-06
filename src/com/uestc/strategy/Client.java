package com.uestc.strategy;

public class Client {
	public static void main(String[] args) {
		AddStrategy add = new AddStrategy();
		Environment envirnoment = new Environment(add);
		int m = 9;
		int n = 2;

		int x = envirnoment.calculate(m, n);
		System.out.println(m + "与" + n + "相加的结果为：" + x);

		SubStrategy sub = new SubStrategy();
		envirnoment.setStrategy(sub);
		System.out.println(m + "与" + n + "相减的结果为："
				+ envirnoment.calculate(m, n));

		MultiplyStrategy multiply = new MultiplyStrategy();
		envirnoment.setStrategy(multiply);
		System.out.println(m + "与" + n + "相加的结果为："
				+ envirnoment.calculate(m, n));

		DevideStrategy devide = new DevideStrategy();
		envirnoment.setStrategy(devide);
		System.out.println(m + "与" + n + "相加的结果为："
				+ envirnoment.calculate(m, n));

	}
}

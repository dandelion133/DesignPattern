package com.qian.bridge.coffee;

public class Client {
	public static void main(String[] args) {
		//׼��ԭζ
		Ordinary ordinary = new Ordinary();
		
		//׼����
		Sugar sugar = new Sugar();
		//ԭζ��
		LargeCoffee largeCoffee = new LargeCoffee(ordinary);
		largeCoffee.makeCoffee();
		//���Ǵ�
		largeCoffee = new LargeCoffee(sugar);
		largeCoffee.makeCoffee();
		
		//ԭζС��
		SmallCoffee smallCoffee = new SmallCoffee(ordinary);
		smallCoffee.makeCoffee();
		//����С��
		smallCoffee = new SmallCoffee(sugar);
		smallCoffee.makeCoffee();
		
		
		//ԭζС��
		MiddleCoffee middleCoffee = new MiddleCoffee(ordinary);
		middleCoffee.makeCoffee();
		//����С��
		middleCoffee = new MiddleCoffee(sugar);
		middleCoffee.makeCoffee();
		
		
	}
}

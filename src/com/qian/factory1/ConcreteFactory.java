package com.qian.factory1;


public class ConcreteFactory extends Factory {

	@Override
	public <T extends Product> T createProduct(Class<T> clz) {
		// TODO Auto-generated method stub
		
		Product p = null;
		try {
			p = (Product)Class.forName(clz.getName()).newInstance();
		} catch (Exception e) {
			
			e.printStackTrace();
		}
		
		return (T) p;
	}

}

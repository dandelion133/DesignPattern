package com.qian.callback;

public class Client {
	public static void main(String[] args) {
		Button button = new Button();
		button.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick() {
				// TODO Auto-generated method stub
				System.out.println("�ұ�������");
			}
		});
		button.click();
	}
}

package com.qian.observable;
/**
 * ��վ�Ķ��� ��Ϊ�۲���
 */
import java.util.Observable;
import java.util.Observer;

public class Reader implements Observer{
	public String name;
	public Reader(String name) {
		this.name = name;
	}
	@Override
	public void update(Observable o, Object arg) {
		// TODO Auto-generated method stub
		System.out.println("Hi, " + name + ",��վ�����������ݣ� " + arg);
	}
}

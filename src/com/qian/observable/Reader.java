package com.qian.observable;
/**
 * 网站阅读者 作为观察者
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
		System.out.println("Hi, " + name + ",网站更新啦，内容： " + arg);
	}
}

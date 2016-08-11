package com.qian.observable;

public class Client {
	public static void main(String[] args) {
		//被观察者
		Website website = new Website();
		//观察者
		Reader zhangsan = new Reader("张三");
		Reader lisi = new Reader("李四");
		Reader wangwu = new Reader("王五");
		
		//将观察者注册到可观察者的观察列表中
		
		website.addObserver(zhangsan);
		website.addObserver(lisi);
		website.addObserver(wangwu);
		
		//发布消息
		website.postNews("新的一期网站周报发布啦！！！！，地址为www.uestc.edu.cn");
		
		
		
	}
}

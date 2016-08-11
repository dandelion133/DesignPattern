package com.uestc.dynamicProxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

public class Client {
	public static void main(String[] args) {
		//被代理类
		RealSubject realSubject = new RealSubject();
		//动态代理类  也就是InvocationHandler
		DynamicProxy dynamicProxy = new DynamicProxy(realSubject);
		//获取ClassLoader
		ClassLoader loader = realSubject.getClass().getClassLoader();

		// 下面的代码一次性生成代理
		 /*  
         * loader : 被代理类的类加载器  
         * interfaces ：被代理类已实现的所有接口，而这些是动态代理类要实现的接口列表  
         * handler ： 用被代理类的实例创建动态代理类的实例，用于真正调用处理程序  
         * return ：返回实现了被代理类所实现的所有接口的Object对象，即动态代理，需要强制转型  
         */ 
		Subject subject = (Subject) Proxy.newProxyInstance(loader, //the class loader to define the proxy class
														  new Class[]{Subject.class},// the list of interfaces for the proxy class to implement
														  dynamicProxy// the invocation handler to dispatch method invocations to
														  );
		

		subject.request();
		// subject 为一个借口的代理实例

		System.out.println(subject.getClass());

	}

}
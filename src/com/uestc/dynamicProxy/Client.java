package com.uestc.dynamicProxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

public class Client {
	public static void main(String[] args) {
		//��������
		RealSubject realSubject = new RealSubject();
		//��̬������  Ҳ����InvocationHandler
		DynamicProxy dynamicProxy = new DynamicProxy(realSubject);
		//��ȡClassLoader
		ClassLoader loader = realSubject.getClass().getClassLoader();

		// ����Ĵ���һ�������ɴ���
		 /*  
         * loader : ����������������  
         * interfaces ������������ʵ�ֵ����нӿڣ�����Щ�Ƕ�̬������Ҫʵ�ֵĽӿ��б�  
         * handler �� �ñ��������ʵ��������̬�������ʵ���������������ô������  
         * return ������ʵ���˱���������ʵ�ֵ����нӿڵ�Object���󣬼���̬������Ҫǿ��ת��  
         */ 
		Subject subject = (Subject) Proxy.newProxyInstance(loader, //the class loader to define the proxy class
														  new Class[]{Subject.class},// the list of interfaces for the proxy class to implement
														  dynamicProxy// the invocation handler to dispatch method invocations to
														  );
		

		subject.request();
		// subject Ϊһ����ڵĴ���ʵ��

		System.out.println(subject.getClass());

	}

}
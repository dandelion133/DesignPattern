package com.qian.observable;

public class Client {
	public static void main(String[] args) {
		//���۲���
		Website website = new Website();
		//�۲���
		Reader zhangsan = new Reader("����");
		Reader lisi = new Reader("����");
		Reader wangwu = new Reader("����");
		
		//���۲���ע�ᵽ�ɹ۲��ߵĹ۲��б���
		
		website.addObserver(zhangsan);
		website.addObserver(lisi);
		website.addObserver(wangwu);
		
		//������Ϣ
		website.postNews("�µ�һ����վ�ܱ�������������������ַΪwww.uestc.edu.cn");
		
		
		
	}
}

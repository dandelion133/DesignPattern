package com.qian.adapter;

/*public class Adapter extends Adaptee implements Target{

	@Override
	public void request() {
		// TODO Auto-generated method stub
		super.specificRequest();  
	}

}*/
public class Adapter implements Target{
	// ֱ�ӹ�����������  
    private Adaptee adaptee;  
      
    // ����ͨ�����캯�����������Ҫ����ı����������  
    public Adapter (Adaptee adaptee) {  
        this.adaptee = adaptee;  
    }  
	@Override
	public void request() {
		// TODO Auto-generated method stub
		adaptee.specificRequest();
	}
	
}

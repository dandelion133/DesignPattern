package com.qian.observable;

public class test {

}
/*
public class Observable {
	
	//标志位
	private boolean changed = false;
	//存放观察者的集合
	private Vector<Observer> obs;

	public Observable() {
		obs = new Vector<>();
	}
	//向集合添加观察者
	public synchronized void addObserver(Observer o) {
		if (o == null)
			throw new NullPointerException();
		if (!obs.contains(o)) {
			obs.addElement(o);
		}
	}
	//删除观察者
	public synchronized void deleteObserver(Observer o) {
		obs.removeElement(o);
	}
	//通知所有观察者
	public void notifyObservers() {
		notifyObservers(null);
	}
	//通知所有观察者 并且带参数
	public void notifyObservers(Object arg) {

		Object[] arrLocal;

		synchronized (this) {

			if (!changed)
				return;
			arrLocal = obs.toArray();
			clearChanged();
		}
		//遍历集合  一个一个通知
		for (int i = arrLocal.length - 1; i >= 0; i--)
			((Observer) arrLocal[i]).update(this, arg);
	}
	//删除所有观察者
	public synchronized void deleteObservers() {
		obs.removeAllElements();
	}
	//设置标志位为true
	protected synchronized void setChanged() {
		changed = true;
	}
	//清楚标志位
	protected synchronized void clearChanged() {
		changed = false;
	}
	//返回标志位
	public synchronized boolean hasChanged() {
		return changed;
	}
	//返回所有观察者的数目
	public synchronized int countObservers() {
		return obs.size();
	}
}
*/
package com.qian.observable;

public class test {

}
/*
public class Observable {
	
	//��־λ
	private boolean changed = false;
	//��Ź۲��ߵļ���
	private Vector<Observer> obs;

	public Observable() {
		obs = new Vector<>();
	}
	//�򼯺���ӹ۲���
	public synchronized void addObserver(Observer o) {
		if (o == null)
			throw new NullPointerException();
		if (!obs.contains(o)) {
			obs.addElement(o);
		}
	}
	//ɾ���۲���
	public synchronized void deleteObserver(Observer o) {
		obs.removeElement(o);
	}
	//֪ͨ���й۲���
	public void notifyObservers() {
		notifyObservers(null);
	}
	//֪ͨ���й۲��� ���Ҵ�����
	public void notifyObservers(Object arg) {

		Object[] arrLocal;

		synchronized (this) {

			if (!changed)
				return;
			arrLocal = obs.toArray();
			clearChanged();
		}
		//��������  һ��һ��֪ͨ
		for (int i = arrLocal.length - 1; i >= 0; i--)
			((Observer) arrLocal[i]).update(this, arg);
	}
	//ɾ�����й۲���
	public synchronized void deleteObservers() {
		obs.removeAllElements();
	}
	//���ñ�־λΪtrue
	protected synchronized void setChanged() {
		changed = true;
	}
	//�����־λ
	protected synchronized void clearChanged() {
		changed = false;
	}
	//���ر�־λ
	public synchronized boolean hasChanged() {
		return changed;
	}
	//�������й۲��ߵ���Ŀ
	public synchronized int countObservers() {
		return obs.size();
	}
}
*/
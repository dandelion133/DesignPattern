package com.qian.observable;
/**
 * Website��վ������Ϊ���۲���
 * @author QHF
 *
 */
import java.util.Observable;
public class Website extends Observable{
	
	public void postNews(String content) {
		setChanged();
		notifyObservers(content);
	}
}

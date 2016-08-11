package com.qian.observable;
/**
 * Website网站用来作为被观察者
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

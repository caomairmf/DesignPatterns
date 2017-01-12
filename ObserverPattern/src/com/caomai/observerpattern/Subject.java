package com.caomai.observerpattern;
import java.util.ArrayList;
import java.util.List;

public class Subject {

	private List<Observer> observers = new ArrayList<Observer>();
	private int state;
	
	public void notifyAllObservers() {
		observers.forEach(observer -> observer.update()); 
//		for (Observer observer : observers) {
//			observer.update();
//		}
	}
	public void attach(Observer observer) {
		observers.add(observer);
	}
	public int getState() {
		return state;
	}
	public void setState(int state) {
		this.state = state;
		notifyAllObservers();
		
	}
	
	
}

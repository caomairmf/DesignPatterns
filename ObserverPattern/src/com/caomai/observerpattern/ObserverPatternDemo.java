package com.caomai.observerpattern;
/*
 *   Observer pattern
 *   
 *      Define a one-to-many dependency between objects so that when one
 *      object changes state, all its dependents are notified and updated
 *      automatically.
 */
public class ObserverPatternDemo {

	public static void main(String[] args) {
		Subject subject = new Subject();

		new HexaObserver(subject);
		new OctalObserver(subject);
		new BinaryObserver(subject);

		System.out.println("First state change: 15");	
		subject.setState(15);
		System.out.println("Second state change: 10");	
		subject.setState(10);
	}


}

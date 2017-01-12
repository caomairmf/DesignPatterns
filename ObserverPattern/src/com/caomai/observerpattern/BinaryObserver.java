package com.caomai.observerpattern;
import java.util.logging.Level;

public class BinaryObserver extends Observer {

	public BinaryObserver(Subject subject) {
		this.subject = subject;
		this.subject.attach(this);
	}

	@Override
	public void update() {
		logger.log(Level.INFO, "Binary String: " 
				 + Integer.toBinaryString( subject.getState()));
//		 System.out.println( "Binary String: " 
//				 + Integer.toBinaryString( subject.getState() ) );

	}

}

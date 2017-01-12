package com.caomai.observerpattern;
import java.util.logging.Level;

public class OctalObserver extends Observer {

	public OctalObserver(Subject subject) {
		  this.subject = subject;
	      this.subject.attach(this);
	}

	@Override
	public void update() {
		logger.log(Level.INFO, "Octal String: " 
				 + Integer.toString( subject.getState()));
//		System.out.println("Octal String: " 
//				+ Integer.toOctalString(subject.getState()));
	}

}

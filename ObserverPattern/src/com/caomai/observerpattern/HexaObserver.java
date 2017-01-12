package com.caomai.observerpattern;
import java.util.logging.Level;

public class HexaObserver extends Observer {

	public HexaObserver(Subject subject) {
		this.subject = subject;
		this.subject.attach(this);
	}

	@Override
	public void update() {
		logger.log(Level.INFO, "Hex String: " 
				 + Integer.toHexString( subject.getState()));
//		System.out.println( "Hex String: " 
	//			+ Integer.toHexString( subject.getState() ).toUpperCase() ); 
	}

}

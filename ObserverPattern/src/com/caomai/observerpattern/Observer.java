package com.caomai.observerpattern;
import java.util.logging.Logger;

public abstract class Observer {
	protected static final Logger logger = 
			Logger.getLogger( Class.class.getName());
	
	protected Subject subject;
	public abstract void update();
}

package com.caomai.singletonpattern;
import java.io.Serializable;

@SuppressWarnings("serial")
public class SingletonTemplate implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -5028015105575382384L;
	
	private static SingletonTemplate singleInstance = null;
	
	// Marking default constructor private 
	// to avoid direct instantiation.
	private SingletonTemplate() {}

	// Get instance for class
	public static synchronized SingletonTemplate getInstance() {
		if(null == singleInstance) {
			singleInstance = new SingletonTemplate();
		}
		return singleInstance;
	}
	
	// Don't allow cloning
	@Override
	public Object clone() throws CloneNotSupportedException {
	      throw new CloneNotSupportedException();
	}
	
	// Need serialization protection.
}

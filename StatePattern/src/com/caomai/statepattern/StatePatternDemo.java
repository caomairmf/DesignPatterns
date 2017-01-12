package com.caomai.statepattern;

/*
 *  State
 *  
 *  	Allow an objet to alter its behaviour when its internal state changes.
 */
		
import java.util.logging.Logger;

public class StatePatternDemo {
	private static final Logger logger = 
			Logger.getLogger( Class.class.getName());
	
	public static void main(String[] args) {

		Context context = new Context();
		
		StartState startState = new StartState();
		startState.doAction(context);
		
		System.out.println(context.getState().toString());
		
		StopState stopState = new StopState();
		stopState.doAction(context);
		
		System.out.println(context.getState().toString());
	}

}

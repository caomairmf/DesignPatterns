package com.caomai.statepattern;
import java.util.logging.Level;
import java.util.logging.Logger;

public class StopState implements State 
{
	private static final Logger logger = 
			Logger.getLogger( Class.class.getName() );
	
	@Override
	public void doAction(Context context) {
		
		//System.out.println("Player is in stop state");
		
		context.setState(this);
		logger.log(Level.INFO, "Player is in stop state");
	}

	public String toString() {
		return "Stop State";
	}
}

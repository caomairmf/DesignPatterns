package com.caomai.decoratorpattern;
import java.util.logging.Level;
import java.util.logging.Logger;

public class DecoratorPatternDemo {

	private static final Logger logger = 
			Logger.getLogger( Class.class.getName() );
	
	public static void main(String[] args) {

		Shape circle = new Circle();
		Shape redCircle = new RedShapeDecorator(new Circle());
		Shape redRectangle = new RedShapeDecorator(new Rectangle());

		logger.log(Level.INFO, "Drawing circle with normal border.");
		//System.out.println("Circle with normal border");
		circle.draw();

		logger.log(Level.INFO, "Drawing circle with red border.");
		//System.out.println("\nCircle of red border");
		redCircle.draw();

		logger.log(Level.INFO, "Drawing rectangle with red border.");
		//System.out.println("\nRectangle of red border");
		redRectangle.draw();

	}

}

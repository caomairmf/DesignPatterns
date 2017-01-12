package com.caomai.templatemethodpattern;
/*
 *  Template
 *  
 *     Define the skeleton of an algorithm in an operation, deferring
 *     some steps to subclasses
 */
public class TemplatePatternDemo {

	public static void main(String[] args) {

		Game game = new Cricket();
		game.play();
		System.out.println();
		game = new Football();
		game.play();
	}

}

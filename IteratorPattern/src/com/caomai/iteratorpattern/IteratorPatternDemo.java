package com.caomai.iteratorpattern;
/*
 *   Iterator Pattern
 *   
 *     Provide a way to access the elements of an aggregate object
 *     sequentially without exposing its underlying representation.
 */
public class IteratorPatternDemo {

	public static void main(String [] args) {
		NameRepository nameRepository = new NameRepository();
		
		for (Iterator iter = nameRepository.getIterator(); iter.hasNext();) {
			String name = (String)iter.next();
			System.out.println("Name: " + name);
		}
	}
}

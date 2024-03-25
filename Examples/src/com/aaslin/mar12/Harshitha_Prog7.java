/*Nested Interface: Define an interface Shape with a nested interface Drawable. 
 * The Drawable interface should have a method draw() that takes no parameters and returns void. 
 * Implement the Shape interface with classes Circle and Rectangle.
 * Implement the Drawable interface within these classes to provide specific implementations for the draw() method. 
 * Write a program to demonstrate the use of these interfaces and classes by creating objects of Circle and Rectangle and 
 * invoking their draw() methods.
 */
package com.aaslin.mar12;

interface Shape {
	interface Drawable {
		void draw();
	}
}

class Circle implements Shape.Drawable {
	@Override
	public void draw() {
		System.out.println("Draw a Circle");
	}
}

class Rectangle implements Shape.Drawable {
	@Override
	public void draw() {
		System.out.println("Draw a Rectangle");
	}
}

public class Harshitha_Prog7 {
	public static void main(String[] args) {
		Rectangle rectangle = new Rectangle();
		Circle circle = new Circle();
		rectangle.draw();
		circle.draw();
	}
}

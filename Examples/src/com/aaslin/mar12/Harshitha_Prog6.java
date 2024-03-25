/*Nested Inner Class: Design a program with an outer class having a method that returns an object of a nested inner class.
 *  Demonstrate the creation of objects of both the outer and inner classes and access the methods of the inner class.
 */
package com.aaslin.mar12;

public class Harshitha_Prog6 {

	class Inner {
		void print() {
			System.out.println("I am inside inner class");
		}
	}

	Inner getInnerClass() {
		return new Inner();
	}

	void print() {
		System.out.println("I am inside outer class");
	}

	public static void main(String[] args) {
		Harshitha_Prog6 object = new Harshitha_Prog6();
		object.print();
		Inner inner = object.getInnerClass();
		inner.print();
	}
}

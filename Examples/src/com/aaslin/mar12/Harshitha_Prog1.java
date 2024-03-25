/*Simple Inner Class: Write a Java program that demonstrates the use of a simple inner class. 
 * Define an outer class containing a method that creates an instance of the inner class and invokes its method. 
 */
package com.aaslin.mar12;

public class Harshitha_Prog1 {
	class Inner {
		void show() {
			System.out.println("inner class");
		}
	}

	public static void main(String[] args) {
		Harshitha_Prog1 outer = new Harshitha_Prog1();
		Harshitha_Prog1.Inner inner = outer.new Inner();
		inner.show();
	}
}

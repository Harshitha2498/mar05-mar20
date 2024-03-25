/*Access Modifiers: Create an outer class and an inner class with different access modifiers (public, private, protected, default). 
 * Demonstrate how these access modifiers affect the visibility and accessibility of the inner-class members. 
 * Create a document to give error messages received for all the access modifier
 */
package com.aaslin.mar12;

class Outer {
	void show() {
		class Inner {
			void message() {
				StringBuilder str = new StringBuilder();
				str.append("print a message by using String builder in inner class");
				System.out.println(str.toString());
			}
		}
		Inner inner = new Inner();
		inner.message();
	}
}

class Harshitha_Prog2 extends Outer {

	public static void main(String[] args) {
		Outer outer = new Outer();
		outer.show();
	}
}

/*Local Inner Class: Create a program with a method in an outer class that defines a local inner class. 
 * The inner class should have a method that returns the cube of a given number.
 */
package com.aaslin.mar12;

import java.util.Scanner;

public class Harshitha_Prog4 {
	int outerMethod(int value) {
		class Inner {
			public int cube(int value) {
				return value * value * value;
			}
		}
		Inner inner = new Inner();
		return inner.cube(value);
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("enter a Value");
		int value = scanner.nextInt();
		Harshitha_Prog4 object = new Harshitha_Prog4();
		System.out.print("cube of " + value + " : " + object.outerMethod(value));
		scanner.close();
	}
}

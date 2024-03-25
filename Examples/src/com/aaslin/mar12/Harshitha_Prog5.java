/*Static Inner Class: Implement a Java program with an outer class and a static inner class. 
 * The inner class should have a static method to calculate the factorial of a number using recursion.
 */
package com.aaslin.mar12;

import java.util.Scanner;

public class Harshitha_Prog5 {
	static class Inner {
		static int factorial(int value) {
			if (value == 0 || value == 1) {
				return 1;
			} else
				return value * factorial(value - 1);
		}
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("enter a value");
		int value = scanner.nextInt();
		System.out.println(Harshitha_Prog5.Inner.factorial(value));
		scanner.close();
	}
}

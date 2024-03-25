/*Anonymous Inner Class:  Write a Java program that demonstrates the use of an anonymous inner class for performing a simple math operation.
 *  Create a method in your main class that accepts two numbers and an operation (addition, subtraction, multiplication, or division).
 *   Use an anonymous inner class to perform the specified operation and display the result.*/
package com.aaslin.mar12;

import java.util.Scanner;

interface Outer1 {
	void addition(int a, int b);

	void subtraction(int a, int b);

	void multiplication(int a, int b);

	void division(int a, int b);
}

public abstract class Harshitha_Prog3 implements Outer1 {
	public static void main(String[] args) {
		StringBuilder str = new StringBuilder();
		str.append("enter two inputs");
		System.out.println(str.toString());
		Scanner scanner = new Scanner(System.in);
		int value1 = scanner.nextInt();
		int value2 = scanner.nextInt();
		Outer1 outer = new Outer1() {
			@Override
			public void addition(int value1, int value2) {
				System.out.println("Addition of two values");
				System.out.println(value1 + value2);
			}

			@Override
			public void subtraction(int value1, int value2) {
				System.out.println("subtraction of two values");
				System.out.println(value1 - value2);
			}

			@Override
			public void multiplication(int value1, int value2) {
				System.out.println("multiplication of two values");
				System.out.println(value1 * value2);
			}

			@Override
			public void division(int value1, int value2) {
				System.out.println("division of two values");
				System.out.println(value1 / value2);
			}
		};
		outer.addition(value1, value2);
		outer.subtraction(value1, value2);
		outer.multiplication(value1, value2);
		outer.division(value1, value2);
		scanner.close();
	}
}

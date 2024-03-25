package mar11;

import java.util.Scanner;

class CustomException1 extends Exception {
	CustomException1() {
		super("Custom Exception message");
	}
}

class CustomException extends Exception {
	CustomException(String message) {
		super(message);
	}
}

public class Harshitha_CustomException {
	static void vote(int age) throws CustomException, CustomException1 {
		if (age < 18) {
			throw new CustomException("age is not valid");
		} else if (age < 21) {
			throw new CustomException1();
		} else
			System.out.println("valid to voter Id");

	}

	public static void main(String[] args) {
		System.out.println("enter age");
		Scanner scanner = new Scanner(System.in);
		int age = scanner.nextInt();
		try {
			vote(age);
		} catch (CustomException | CustomException1 ce) {
			System.out.println("exception:" + ce.getMessage());
		}
		scanner.close();

	}
}

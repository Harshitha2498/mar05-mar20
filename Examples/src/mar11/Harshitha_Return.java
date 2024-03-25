package mar11;

import java.util.Scanner;

public class Harshitha_Return {
	static String print(int n) {
		try {
			int a = 100 / n;
			return "value is successfully divisible";
		} catch (ArithmeticException e) {
			return "value not be zero";
		}
	}

	@SuppressWarnings("finally")
	static String show(String b) {
		try {
			String value = b;
			System.out.println(value);
			return "String is accepted";
		} catch (NullPointerException np) {
			return "value should not be null";
		} finally {
			return "done with return values";
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		System.out.println(print(a));
		String b = sc.next();
		System.out.println(show(b));
		sc.close();
	}
}

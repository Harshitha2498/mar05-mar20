package mar11;

import java.util.Scanner;

public class Harshitha_AE {
	public static void main(String[] args) {
		System.out.println("enter two values");
		Scanner scanner = new Scanner(System.in);
		int a = scanner.nextInt();
		int b = scanner.nextInt();
		try {
			System.out.println(a / b);
		} catch (ArithmeticException ae) {
			if (b == 0) {
				b = 1;
				System.out.println(a / b);
			}
		}
		scanner.close();
	}
}

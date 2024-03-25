package mar09;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Harshitha_Prog6 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		try {
			int a = sc.nextInt();
			int b = sc.nextInt();
			try {
				System.out.println(a / b);
			} catch (InputMismatchException e) {
				System.out.println("java.util.InputMismatchException");
			}
		} catch (Exception e) {
			System.out.println(e);
		}
		sc.close();
	}
}

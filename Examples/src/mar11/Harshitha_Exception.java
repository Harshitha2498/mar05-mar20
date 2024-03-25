package mar11;

import java.util.Scanner;

class MyCustomException extends Exception {

}
public class Harshitha_Exception {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		boolean bool = false;
		while (!bool) {
			try {
				String str = sc.next();
				int a = Integer.parseInt(str);
				if (a < 0)
					throw new MyCustomException();
				int n=100/a;
				bool = true;
			} catch (NumberFormatException n) {
				System.out.println("please enter a number");
			} catch (ArithmeticException e) {
				System.out.println("please enter a non zero value");
			} catch (MyCustomException e) {
				System.out.println("please enter a positive value");
			}
		}
		sc.close();
	}
}

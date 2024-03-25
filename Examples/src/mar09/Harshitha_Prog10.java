package mar09;

import java.util.Scanner;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;

public class Harshitha_Prog10 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		String[] str = new String[a];
		for (int i = 0; i < a; i++) {
			str[i] = sc.next();
		}
		for (int i = 0; i < a; i++) {
			try {
				Pattern.compile(str[i]);
				System.out.println("Valid");
			} catch (PatternSyntaxException p) {
				System.out.println("Invalid");
			}
		}
		sc.close();
	}
}

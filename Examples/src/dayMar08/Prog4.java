package dayMar08;

import java.util.Scanner;

public class Prog4 {
	public static void main(String[] args) {
		String str,c="";
		System.out.println("enter a String");
		Scanner sc=new Scanner(System.in);
		str=sc.next();
		for(int i=str.length()-1;i>=0;i--) {
			c+=str.charAt(i);		
		}
		if(str.equals(c)) {
			System.out.println("String is a palindrome");
		}
		else {
			System.out.println("String is not a palindrome");
		}
		sc.close();
	}
}

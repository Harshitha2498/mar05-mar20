package dayMar08;
/*
 * @author Harshitha.D
 * Check Whether a Given Number is Prime or Not
 */
import java.util.Scanner;

public class Prog1 {
	public static void main(String[] args) {
		System.out.println("enter a number");
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int b,flag=0;
		b=a/2;
		if(a==0||a==1) {
			System.out.println(a+" is not a Prime number");
		}
		else {
			for(int i=2;i<=b;i++) {
				if(a%i==0) {
					System.out.println(a+" is not a Prime number");
					flag=1;
					break;
				}
			}
		}
		if(flag==0) {
			System.out.println(a+" is a prime number");
		}
		sc.close();
	}
}

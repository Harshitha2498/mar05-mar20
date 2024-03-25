package dayMar08;

import java.util.Scanner;

public class Prog6 {
	public static int fibonacci(int c){
		if(c==0) {
			return 0;
		}
		else if(c==1||c==2) {
			return 1;
		}
		return fibonacci(c-1)+fibonacci(c-2);
	}
	public static void main(String[] args) {
		int n;
		System.out.println("enter n  number");
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		for(int i=0;i<n;i++) {
			System.out.println(fibonacci(i)+" ");
		}
		sc.close();
	}


}

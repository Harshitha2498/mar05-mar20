package mar09;

import java.util.Scanner;
class Calculator{
	public int power(int n,int p)throws Exception {
		if(n==0&&p==0) {
			throw new Exception("n and p should not be zero.");
		}
		else if(n<0||p<0) {
			throw new Exception(" n or p should not be negative.");
		}
		return (int) Math.pow(n, p);
	}
}
public class Harshitha_Prog7 extends Calculator{
	public static void main(String[] args) throws Exception {
		Scanner sc=new Scanner(System.in);
		Harshitha_Prog7 a=new Harshitha_Prog7();
		while(sc.hasNext()) {
			int n=sc.nextInt();
			int p=sc.nextInt();
			try {
				System.out.println(a.power(n,p));
			}
			catch(Exception e) {
				System.out.println(e);
			}
		}
		sc.close();
	}
}

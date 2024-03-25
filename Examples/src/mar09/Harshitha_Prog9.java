package mar09;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Prime {
	public void primeNumber(int[] n) {
		String out = "";
		for (int i = 0; i < n.length; i++) {
			out += isprime(n[i]);
			if (i > 0 && out != "") {
				System.out.println(out);
			}
		}
	}

	static String isprime(int n) {
		int flag = 0;
		if (n > 1) {
			for (int i = 2; i <= n / 2; i++) {
				if (n % i == 0) {
					flag = 1;
					break;
				}
			}
			if (flag == 0) {
				return n + " ";
			}
		}
		return "";
	}

}

public class Harshitha_Prog9 {
	public static void main(String[] args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int[] a = new int[5];
		Prime obj = new Prime();
		for (int i = 0; i < 5; i++) {
			try {
				a[i] = Integer.parseInt(br.readLine());
			} catch (NumberFormatException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		obj.primeNumber(a);

	}
}
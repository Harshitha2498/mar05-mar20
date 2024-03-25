package dayMar08;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Prog7 {
	public static void main(String[] args) throws Exception{
		InputStreamReader in=new InputStreamReader(System.in);
		BufferedReader br=new BufferedReader(in);
		System.out.println("enter a String");
		String str=br.readLine();
		
		for (char ch = 'A'; ch <= 'Z'; ch++ ) {
			for(int i=0;i<str.length();i++) {
				if(ch==str.charAt(i)) {
					System.out.print(ch+" ");
					break;
				}
			}
		}	
	}
}

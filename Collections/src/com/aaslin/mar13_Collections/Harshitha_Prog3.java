/*3. a) Write a Java program to reverse elements in a array list
*/
package com.aaslin.mar13_Collections;

import java.util.ArrayList;

public class Harshitha_Prog3 {
	public static void main(String[] args) {
		ArrayList<String> list_name=new ArrayList<String>();
		list_name.add("harshi");
		list_name.add("ashi");
		list_name.add("ishi");
		list_name.add("varma");
		list_name.add("prachi");
		list_name.add("ayyan");
		System.out.println(list_name);
		for(int i=list_name.size()-1;i>=0;i--) {
			System.out.print(list_name.get(i)+" ");
		}
	}
}

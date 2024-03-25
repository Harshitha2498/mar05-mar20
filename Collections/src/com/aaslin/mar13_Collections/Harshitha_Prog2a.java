/*2. a) Write a Java program to insert an element into the array list at the first position*/
package com.aaslin.mar13_Collections;

import java.util.ArrayList;

public class Harshitha_Prog2a {
	public static void main(String[] args) {
		ArrayList<String> arrayList=new ArrayList<String>();
		arrayList.add("India");
		arrayList.add("China");
		arrayList.add("Russia");
		arrayList.add("Singapore");
		arrayList.add("Mexico");
		System.out.println("\n"+arrayList);
		//insert an element 
		arrayList.set(1,"Japan");
		System.out.println("\n"+arrayList);
	}
}

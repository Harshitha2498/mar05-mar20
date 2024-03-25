/*1. Write a Java program to create a new array list, add some elements (string) and print out the collection*/
package com.aaslin.mar13_Collections;

import java.util.ArrayList;

public class Harshitha_prog1 {
	public static void main(String[] args) {
		ArrayList<String> arrayList=new ArrayList<String>();
		arrayList.add("India");
		arrayList.add("China");
		arrayList.add("Russia");
		arrayList.add("Singapore");
		arrayList.add("Mexico");
		arrayList.add("Pakistan");
		for(String i:arrayList) {
			System.out.print(i+" ");
		}
		System.out.println("\n"+arrayList);
	}
}

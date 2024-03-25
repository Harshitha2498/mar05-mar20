/*4. Write a Java program how to Convert a ArrayList to HashSet*/
package com.aaslin.mar13_Collections;

import java.util.ArrayList;
import java.util.HashSet;

public class Harshitha_Prog4 {
	public static void main(String[] args) {
		ArrayList<Integer> list=new ArrayList<Integer>();
		list.add(1001);
		list.add(10);
		list.add(301);
		System.out.println(list);
		HashSet<Integer> hashSet=new HashSet<Integer>(list);
		for(int value:hashSet) {
			System.out.print(value+ "  ");
		}
	}
}

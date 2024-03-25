/*5. Write a Java program to test if a map contains a mapping for the specified value*/
package com.aaslin.mar13_Collections;

import java.util.HashMap;
import java.util.Map;

public class Harshitha_Prog5 {
	public static void main(String[] args) {
		Map<Integer,String> map=new HashMap<Integer,String>();
		map.put(1,"A");
		map.put(2,"C");
		map.put(3,"D");
		if(map.containsValue("D")) {
			System.out.println("The map contains the value D");
		}
		else
			System.out.println("Does'nt found the value D");
	}
}

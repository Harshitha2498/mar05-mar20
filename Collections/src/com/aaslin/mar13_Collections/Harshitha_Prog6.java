/*6. Write a Java program to get keys from a HashMap collection*/
package com.aaslin.mar13_Collections;

import java.util.HashMap;

public class Harshitha_Prog6 {
	public static void main(String[] args) {
		HashMap<Integer,String> hashMap=new HashMap<Integer,String>();
		hashMap.put(1,"harshi");
		hashMap.put(2,"jack");
		hashMap.put(3,"hash");
		hashMap.put(4,"jenny");
		System.out.println("keys :"+hashMap.keySet());
	}
}

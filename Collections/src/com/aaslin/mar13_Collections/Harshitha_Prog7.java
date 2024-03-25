/*7. Write a Java program to check whether a HashMap contains a specified Key or not*/
package com.aaslin.mar13_Collections;

import java.util.HashMap;

public class Harshitha_Prog7 {
	public static void main(String[] args) {
		HashMap<Integer, String> hashMap = new HashMap<Integer, String>();
		hashMap.put(1, "harshi");
		hashMap.put(2, "jack");
		hashMap.put(3, "hash");
		hashMap.put(4, "jenny");
		if (hashMap.containsKey(5)) {
			System.out.println("Hashmap contains a specified key");
		} else {
			System.out.println("key not found");
		}
	}
}

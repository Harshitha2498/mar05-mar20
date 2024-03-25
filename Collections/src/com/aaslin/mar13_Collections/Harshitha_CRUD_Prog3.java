package com.aaslin.mar13_Collections;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class Harshitha_CRUD_Prog3 {
	public static void main(String[] args) {
		Set<String> linkedHashSet = new LinkedHashSet<String>();
		linkedHashSet.add("A");
		linkedHashSet.add("D");
		linkedHashSet.add("C");
		linkedHashSet.add("B");
		// printing the linked hashset value.
		System.out.println("hashset values" + linkedHashSet);
		// return true if the set contains the element or false.
		System.out.println(linkedHashSet.contains("F"));
		// remove items from linked hashset.
		linkedHashSet.remove("A");
		System.out.println("after deletion values : " + linkedHashSet);
		Iterator<String> it = linkedHashSet.iterator();
		while (it.hasNext()) {
			System.out.print(it.next() + " ");
		}
	}
}

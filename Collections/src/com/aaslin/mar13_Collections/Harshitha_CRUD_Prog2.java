package com.aaslin.mar13_Collections;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

//Sets....................HashSet
public class Harshitha_CRUD_Prog2 {
	public static void main(String[] args) {
		Set<Integer> hashSet = new HashSet<Integer>();
		hashSet.add(1);
		hashSet.add(102);
		hashSet.add(10);
		hashSet.add(103);
		// printing the hashset value.
		System.out.println("hashset values" + hashSet);
		hashSet.add(103);
		System.out.println("After assigning a duplicate value: " + hashSet);
		// return true if the set contains the element or false.
		System.out.println("hashset has 105 value: "+hashSet.contains(105));
		// remove items from hashset.
		hashSet.remove(102);
		System.out.println("after deletion values : " + hashSet);
		Iterator<Integer> it = hashSet.iterator();
		while (it.hasNext()) {
			System.out.print(it.next()+" ");
		}
	}
}

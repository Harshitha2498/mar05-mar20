/*Write a Java program that reads a text file named "input.txt" and reverses the order of characters in each line. 
 * Write the modified text to another file named "reversed.txt". Ensure that your program handles file IO exceptions and empty lines gracefully.
 */
package com.aaslin.FileOperations;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Harshitha_Prog3 {
	public static void main(String[] args) {
		try {
			BufferedReader file1 = new BufferedReader(new FileReader("D:\\Newfolder\\fileoperation\\input.txt"));
			FileWriter file2 = new FileWriter("D:\\Newfolder\\fileoperation\\reversed.txt");
			List<Integer> list = new ArrayList<>();
			int str;
			while ((str=file1.read())!=-1) {
				list.add(str);
			}
			Collections.reverse(list);
			for (int i : list) {
				file2.write((char) (i));
			}
			file1.close();
			file2.close();
			System.out.println("file successfully reversed");
		} catch (FileNotFoundException fileNotFoundException) {
			fileNotFoundException.printStackTrace();
		} catch (IOException ioException) {
			ioException.printStackTrace();
		}

	}
}

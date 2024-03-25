/*Write a Java program that reads a text file named "input.txt" and counts the frequency of each word in the file.

 *  Then, write these word frequencies along with the corresponding words to another text file named "word_frequencies.txt", 
 *  sorted in descending order of frequency. Ensure that your program handles file IO exceptions appropriately.*/
package com.aaslin.FileOperations;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Harshitha_Prog1 {
	public static void main(String[] args) {
		try {
			File input = new File("D:\\Newfolder\\fileoperation\\input.txt");
			Scanner scanner = new Scanner(input);
			HashMap<String, Integer> counts = new HashMap<String, Integer>();
			while (scanner.hasNext()) {
				String word = scanner.next();
				if (!counts.containsKey(word))
					counts.put(word, 1);
				else
					counts.put(word, counts.get(word) + 1);
			}
			List<Map.Entry<String, Integer>> listdata = counts.entrySet().stream()
					.sorted(Collections.reverseOrder(Map.Entry.comparingByValue())).collect(Collectors.toList());
			BufferedWriter word_frequencies = new BufferedWriter(
					new FileWriter("D:\\Newfolder\\fileoperation\\word_frequencies.txt"));
			for (Map.Entry<String, Integer> entry : listdata) {
				System.out.println((entry.getKey() + ":" + entry.getValue()));
				word_frequencies.write(entry.getKey() + ":" + entry.getValue());
				word_frequencies.newLine();
			}
			word_frequencies.close();
			System.out.println(counts);
			scanner.close();
		} catch (IOException ioException) {
			ioException.printStackTrace();
		}

	}
}

/*Create a Java program that concatenates the contents of two text files, "file1.txt" and "file2.txt", into a new file named "concatenated.txt".
 *  Make sure to handle file not found exceptions and any other relevant IO exceptions.*/
package com.aaslin.FileOperations;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Harshitha_Prog2 {
	public static void main(String[] args) {
		try (FileInputStream files1 = new FileInputStream("D:\\Newfolder\\fileoperation\\files1.txt")) {
			FileInputStream files2 = new FileInputStream("D:\\Newfolder\\fileoperation\\files2.txt");
			FileOutputStream files3 = new FileOutputStream(new File("D:\\Newfolder\\fileoperation\\files3.txt"));
			int i;
			while ((i = files1.read()) != -1) {
				files3.write(i);
			}
			while ((i = files2.read()) != -1) {
				files3.write(i);
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}

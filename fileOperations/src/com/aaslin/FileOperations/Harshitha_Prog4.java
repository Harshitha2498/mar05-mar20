/*4. Implement a simple encryption and decryption program in Java. Prompt the user to enter a message, then encrypt the message using 
 * a simple substitution cipher, and write the encrypted message to a text file named "encrypted.txt". Provide a decryption program that reads 
 * the encrypted message from "encrypted.txt", decrypts it, and prints the original message to the console. Make sure to handle IO exceptions and 
 * invalid input gracefully.*/
package com.aaslin.FileOperations;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;

public class Harshitha_Prog4 {
	public static void main(String[] args) {
		try (FileWriter f = new FileWriter("D:\\Newfolder\\fileoperation\\encrypted.txt")) {
			BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
			int i = bufferedReader.read();
			while (bufferedReader.ready()) {
				int j = i;
				f.write((char) j + 1);
				i = bufferedReader.read();
			}
//	      		f.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		try (FileReader fi = new FileReader("D:\\Newfolder\\fileoperation\\encrypted.txt")) {
			try (FileWriter fos = new FileWriter("D:\\Newfolder\\fileoperation\\decrypted.txt")) {
				int str = fi.read();
				while (fi.ready()) {
					fos.write((char) str - 1);
					str = fi.read();
				}
				System.out.println("success");
//			fos.close();
//			fi.close();
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}

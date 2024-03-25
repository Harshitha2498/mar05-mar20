/*5) WAP to print dynamic email body using string builder. Subscriber, Topic should be method inputs and String 

Create 4-8 Subscribers, 4-5 Topics predefined.

Input:
 
Subscriber: Varma
Topic: Java

Output:

Dear Varma,

Java is a high-level, class-based, object-oriented programming language that designed to have as few implementation dependencies as possible. 
It is a general-purpose programming language intended to let application developers "write once, run anywhere" (WORA), meaning that compiled Java 
code can run on all platforms that support Java without the need for recompilation.

Thanks and Regards
Mailer*/
package com.aaslin.orm_mar14;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Harshitha_Prog5 {
	public static void main(String[] args) {
		String sub;
		String top;
		List<String> subscribers = new ArrayList<>();
		subscribers.add("varma");
		subscribers.add("kushi");
		subscribers.add("harshi");
		subscribers.add("hash");
		List<String> topics = new ArrayList<>();
		topics.add("java");
		topics.add("python");
		topics.add("sql");
		topics.add("c");
		Scanner scanner = new Scanner(System.in);
		System.out.print("Subscriber: ");
		sub = scanner.next();
		if (subscribers.contains(sub)) {
			System.out.print("Topic: ");
			top = scanner.next();
			System.out.println("\nDear " + sub + ",\n");
			StringBuilder java = new StringBuilder();
			StringBuilder python = new StringBuilder();
			StringBuilder sql = new StringBuilder();
			StringBuilder c = new StringBuilder();
			switch (top) {
			case "java":
				java.append(
						"Java is a high-level, class-based, object-oriented programming language that designed to have as few implementation dependencies as possible.");
				java.append(
						"It is a general-purpose programming language intended to let application developers \"write once, run anywhere\" (WORA), ");
				java.append(
						"meaning that compiled Java code can run on all platforms that support Java without the need for recompilation.");
				System.out.println(java);
				break;
			case "python":
				python.append(
						"python is a popular progamming languagePython is dynamically typed and garbage-collected. ");
				python.append(
						"It supports multiple programming paradigms, including structured (particularly procedural), object-oriented and functional programming.");
				System.out.println(python);
				break;
			case "sql":
				sql.append(
						"SQL is used to communicate with a database. According to ANSI (American National Standards Institute), ");
				sql.append(
						"it is the standard language for relational database management systems. SQL statements are used to perform tasks such as ");
				sql.append("update data on a database, or retrieve data from a database.");
			case "c":
				c.append(
						"C is a general-purpose, procedural, high-level programming language used in the development of computer software ");
				c.append("and applications, system programming, games, and more.");
			default:
				System.out.println("invalid topics");
			}
		} else {
			System.out.println("invalid subscriber");
		}

		scanner.close();
		System.out.println("\nThanks and Regards\nMailer");
	}
}

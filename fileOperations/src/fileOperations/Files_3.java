package fileOperations;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Files_3 {
	public static void main(String[] args) {
		try(BufferedReader br=new BufferedReader(new InputStreamReader(System.in))){
			System.out.println("jhawdh");
			System.out.println(br.readLine());
		}
		catch(IOException ie) {
			ie.printStackTrace();
		}
	}
}

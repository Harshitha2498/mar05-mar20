package fileOperations;

import java.io.IOException;
import java.io.OutputStreamWriter;

public class Files_4 {
	public static void main(String[] args){
//		OutputStream o=System.out;
//		o.write(9);
		try(OutputStreamWriter osw=new OutputStreamWriter(System.out)){
			osw.write("hagjdh");
		}
		catch(IOException ie) {
			ie.printStackTrace();
		}
	}
}

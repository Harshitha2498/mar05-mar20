import java.io.FileOutputStream;

public class Resources {
	public static void main(String[] args) {
		try(FileOutputStream fs=new FileOutputStream("resource.txt")){
			String txt="hello!";
			byte arr[]=txt.getBytes();
			fs.write(arr);
		}
		catch(Exception e) {
			System.out.println(e);
		}
	}
}

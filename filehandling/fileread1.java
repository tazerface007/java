import java.io.*;

class FileRead1{
	public static void main(String[] args) {
		try{

		Reader r = new FileReader("hello.txt");
		} catch(FileNotFoundException e) {
			System.out.println(e);
		}


	}
}

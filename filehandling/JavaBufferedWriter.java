import java.io.*;

class FileReaderWithOutputStream {
	public static void main(String [] args) {
		try(BufferedOutputStream bof = new BufferedOutputStream(new FileOutputStream("file.txt"))) {
			String content = "Content Initialized, setting up the environment";
			byte[] stream = content.getBytes();
			bof.write(stream);
		}
		catch(Exception e) {
			System.out.println("File not found");
			e.printStackTrace();
		}
	}
}

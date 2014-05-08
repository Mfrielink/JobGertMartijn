import java.io.*;
public class MainClass {


	public static void main(String[] args) {

		System.out.println("Test");
		System.out.println("test 2");

		try {
			RandomAccessFile raf = new RandomAccessFile("hello.txt", "rw");
			raf.writeBytes("Hello, world!\n");
			raf.close();
		} 
		catch (IOException e) {
			e.printStackTrace();
		}
	}
}

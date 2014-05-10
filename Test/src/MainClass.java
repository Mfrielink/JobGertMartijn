import java.io.File;

public class MainClass {

	public static void main(String[] args) {

		File folder = new File("C:/Users/Martijn/Documents/Files");
		File[] listOfFiles = folder.listFiles();

		for (int i = 0; i < listOfFiles.length; i++) {
			String filename = listOfFiles[i].getName();
			System.out.println(filename);

		}

	}

}

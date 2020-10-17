import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class FileDemo {
	public static void main(String[] args) {

		// Using the File utility
		// Provides info about files and directories, but does not read or write to
		// files
		// relative path
		fileUtility("src/FileDemo.java");
		// absolute path, traditional Windows path
		fileUtility("E:\\projects\\Java\\105\\InClassDemo\\Chapter12Files\\src\\FileDemo.java");
		// absolute path, but more portable
		fileUtility("E:/projects/Java/105/InClassDemo/Chapter12Files/src/FileDemo.java");
		// directory
		fileUtility("src");

		// File Write
		fileWrite("info.txt");
		fileRead("info.txt");
	}

	public static void fileUtility(String path) {
		System.out.println("given: " + path);
		File file = new File(path);
		System.out.println("Does it exist? " + file.exists());
		System.out.println("The file has " + file.length() + " bytes");
		System.out.println("Can it be read? " + file.canRead());
		System.out.println("Can it be written? " + file.canWrite());
		System.out.println("Is it a directory? " + file.isDirectory());
		System.out.println("Is it a file? " + file.isFile());
		System.out.println("Is it absolute? " + file.isAbsolute());
		System.out.println("Is it hidden? " + file.isHidden());
		System.out.println("Absolute path is " + file.getAbsolutePath());
		System.out.println("Last modified on " + new java.util.Date(file.lastModified()));
		System.out.println("==========================================");
	}

	public static void fileWrite(String path) {

		java.io.File file = new java.io.File(path);
		if (file.exists()) {
			System.out.println("File already exists");
		} else {

			try {
				// This throws a Java checked exception
				PrintWriter output = new PrintWriter(path);
				// Write formatted output to the file

				for (int i = 0; i < 4; i++) {
					output.print("John T Smith ");
					output.println(90 + i);
					output.print("Eric K Jones ");
					output.println(85 + i);
				}
				// Close the file
				output.close();
			} catch (FileNotFoundException e) {
				e.printStackTrace();
			}
		}
	}

	public static void fileRead(String path) {
		// Create a File instance
		// path += "bogus";
		File file = new File(path);
		System.out.println(path + " contents:");
		
		// Create a Scanner for the file
		try {
			Scanner input = new Scanner(file);
			// Read data from a file
			while (input.hasNext()) {
				String line = input.nextLine();
				System.out.println(line);
			}
			input.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}

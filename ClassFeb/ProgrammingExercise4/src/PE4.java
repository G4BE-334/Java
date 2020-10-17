import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;
// Create a program that will translate any input from the user
// to the Pig-Latin English language

public class PE4 {
	// Main
	public static void main(String[] args) {
		FileWrite("PE4Text.txt");
		FileRead("PE4Text.txt");
	}
	// Creation of a file to store the input
	public static void FileWrite(String path) {

		java.io.File file = new java.io.File(path);
		file.delete();
		try {
			PrintWriter output = new PrintWriter(path);
			Scanner PigLatin = new Scanner(System.in);
			System.out.println("Please enter a phrase: ");
			output.println(PigLatin.nextLine());
			output.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}
	// Read the file and translate the message
	public static void FileRead(String path) {
		File file = new File(path);
		System.out.println(path + " contents:");
		try {
			Scanner input = new Scanner(file);
			while (input.hasNext()) {
				String line = input.next();
				// I had to change the variable to a char, otherwise the if statement wouldn't
				// work properly
				char verify = line.toLowerCase().charAt(0);
				if (verify == 'a' || verify == 'e' || verify == 'i' || verify == 'o' || verify == 'u') {
					String Translation = line.toUpperCase() + "WAY";
					System.out.println(line + "\t" + "\t" + Translation);
				} else {
					int x = 0;
					String PigLatin = "";
					// It is necessary to consider "y" as a vowel here because of words that only
					// has y like: cry, try, by, my, etc.
					while (line.toLowerCase().charAt(x) != 'a' && line.toLowerCase().charAt(x) != 'e'
							&& line.toLowerCase().charAt(x) != 'i' && line.toLowerCase().charAt(x) != 'o'
							&& line.toLowerCase().charAt(x) != 'u' && line.toLowerCase().charAt(x) != 'y') {
						String Translation = line.substring((x + 1), line.length()).toUpperCase()
								+ line.substring(0, (x + 1)).toUpperCase();
						x++;
						PigLatin = Translation;
					}

					System.out.println(line + "\t" + "\t" + PigLatin + "AY");
				}

			}
			input.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
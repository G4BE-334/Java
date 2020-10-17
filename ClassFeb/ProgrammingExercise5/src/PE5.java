import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class PE5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FileWrite("PE5Text.txt");
		FileRead("PE5Text.txt");
		String[][] Array = create2DArray(6, 7);
		printArray(Array);
	}

	public static void FileWrite(String path) {
		java.io.File file = new java.io.File(path);
		file.delete();
		try {
			PrintWriter output = new PrintWriter(path);
			Scanner Phrase = new Scanner(System.in);
			System.out.println("Please enter a phrase: ");
			output.println(Phrase.nextLine());
			output.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}

	public static File FileRead(String path) {
		File file = new File(path);
		return file;
	}

	public static String[][] create2DArray(int row, int column) {
		String[][] create6x7Array = new String[row][column];
		try {
			Scanner input = new Scanner(FileRead("PE5Text.txt"));
			String words = input.next();
			int x = 0;
			for (int i = 0; i < create6x7Array.length; i++) {
				for (int j = 0; j < create6x7Array[i].length; j++) {
					int count = words.length();
					String letters = words.substring(x, x + 1);
					create6x7Array[i][j] = letters;
					x++;
					if (x == count) {
						x = 0;
						if (j == 6) {
							j = 0;
							i++;
							create6x7Array[i][j] = "*";
						} else {
							j++;
							create6x7Array[i][j] = "*";
						}
						if (input.hasNext()) {
							words = input.next(); // fix in case there are not enough words
						} else {
							while (i < create6x7Array.length) {
								if (j > create6x7Array.length) {
									j = 0;
								}
								while (j < create6x7Array[i].length) {
									letters = "*";
									create6x7Array[i][j] = letters;
									j++;
								}
								i++;
							}
							break;
						}
					}
				}
			}
			input.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		return create6x7Array;
	}

	public static void printArray(String[][] create6x7Array) {
		for (int i = 0; i < create6x7Array.length; i++) {
			for (int j = 0; j < create6x7Array[i].length; j++) {
				System.out.print(create6x7Array[i][j] + " ");

			}
			System.out.println();
		}
		for (int i = 0; i < (create6x7Array.length + 1); i++) {
			for (int j = 0; j < create6x7Array.length; j++) {
				if (create6x7Array[j][i] != "*") {
					System.out.print(create6x7Array[j][i]);
				} else {
					System.out.print(" ");
				}
			}

		}
	}
}

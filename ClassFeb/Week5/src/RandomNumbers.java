import java.util.Random;
import java.util.Scanner;

public class RandomNumbers {
	
		public static void main(String args[]) {
			// using Math.random
			mathRandom();
			mathRandomInts();
			rangeTests();
			// using the Random class
			generateRandom();
			generateRandomSeeded();

			leapYear();

		}

		public static void mathRandom() {
			// Math.random generates random doubles
			// [0..1)
			for (int i = 0; i < 10; i++) {
				System.out.println("Random doubles: " + Math.random());
			}
		}

		public static void mathRandomInts() {
			// [0..10)
			for (int i = 0; i < 10; i++) {
				System.out.println("Random ints: " + (int) (10 * Math.random()));
			}
		}

		public static void rangeTests() {
			for (int i = 0; i < 100; i++) {
				System.out.println("Range test ints: " + getRandomIntegerInRange(50, 60));
			}

		}

		// This method has some new techniques
		// parameters
		// a non-void return type
		public static int getRandomIntegerInRange(int min, int max) {
			// range [min, max]
			int x = (int) (Math.random() * ((max - min) + 1)) + min;
			return x;
		}

		public static void generateRandom() {
			Random random = new Random();

			for (int i = 0; i < 10; i++) {
				System.out.println(random.nextInt());
			}

			for (int i = 0; i < 10; i++) {
				System.out.println(random.nextInt(10));
			}

			for (int i = 0; i < 10; i++) {
				System.out.println(random.nextBoolean());
			}

			for (int i = 0; i < 10; i++) {
				System.out.println(random.nextDouble());
			}
		}

		public static void generateRandomSeeded() {
			Random random = new Random(100);
			for (int i = 0; i < 10; i++) {
				System.out.println(random.nextInt(10));
			}
			System.out.println("===========");
			
			random = new Random(100);
			for (int i = 0; i < 10; i++) {
				System.out.println(random.nextInt(10));
			}
			System.out.println("===========");

			random = new Random(100);
			for (int i = 0; i < 10; i++) {
				System.out.println(random.nextInt(10));
			}
			System.out.println("===========");
		}

		public static void leapYear() {
			Scanner input = new Scanner(System.in);
			System.out.print("Enter a year: ");
			int year = input.nextInt();

			// Check if the year is a leap year
			// A leap year is divisible by 4
			// but not by 100
			// Or is divisible by 400
			boolean isLeapYear = (year % 4 == 0 && year % 100 != 0) 
					|| (year % 400 == 0);
			// && stands for "and" and || stands for "or"
			// Display the result
			System.out.println(year + " is a leap year? " + isLeapYear);
		}
}

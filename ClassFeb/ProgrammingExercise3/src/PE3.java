import java.util.Scanner;
public class PE3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GuessingGame();
	
	}
	
	public static void GuessingGame() {
		int max = 10000;
		int min = 1;
		int RandomNumber = (int) (Math.random() * ((max - min) + 1)) + min;
		int a = 0;
		while (a != RandomNumber) {
			Scanner GuessNumber = new Scanner(System.in);
			System.out.println("Please guess a number: ");
			a = GuessNumber.nextInt();
			if (a < RandomNumber) {
				System.out.println("HIGHER");
				System.out.println("The new eligible range is: " + a + "--" + max);
				min = a;
			}
			else if (a > RandomNumber) {
				System.out.println("LOWER");
				System.out.println("The new eligible range is: " + min + "--" + a);
				max = a;
			}
			else {
				System.out.println("WINNER");
			}
			
		}
			
	}

}

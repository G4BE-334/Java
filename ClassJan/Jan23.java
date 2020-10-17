import java.util.Scanner;

public class Jan23 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Programming Exercise 2 
		 *Scanner input = new Scanner(System.in);
		
		System.out.println("Enter a 5-digit positive integer: ");
		int number = input.nextInt();
		int sumnumber = input.substring(2,4);
		System.out.println();
		*/
		int a = 30;
		if (a<20)
		{
			System.out.println("The number is less than 20");
		}
		else
		{
			System.out.println("The number is greater than 20");
		}
		char grade = 'B';
		double gpa = 3.77;
		switch(grade)
		{
		case 100:
		case 99:
		case 98:
		case 97:
		case 96:
		case 95:
		case 94:
		case 93:
		case 92:
		case 91:
		case 90:
			System.out.println("Excellent!");
			break;
		case 'B':
		case 'C':
			System.out.println("Well done");
			if (gpa>3.5)
			{
				System.out.println("But you have done better");
			}
			break;
		case 'D':
			System.out.println("You have passed");
			break;
		}
		//System.out.println(String.format("the grade is: %c", g));
		
		
		
	}

}

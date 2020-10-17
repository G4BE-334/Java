import java.util.Scanner;
public class ProgrammingExercise2 {

	public static void main(String[] args) {
		TheSumofDigits(); // I decided to create methods for each 
		CelsiusConverter();
		FahrenheitConverter();
		
	}
	
	public static void TheSumofDigits() {
		int a, b, sumdigits = 0;
		Scanner digit5 = new Scanner(System.in);
		System.out.println("Enter a 5-digit positive integer:");
		a = digit5.nextInt();
		int v = 0; // when I tried to use v, w, x, y, z, control = 0 it didn't work
		int w = 0; // I got a message saying that the variables were not initialized
		int x = 0; // I tried with less variables like x, y, z = 0 but it did not work as well
		int y = 0;
		int z = 0;
		int control = 0;
		String PlusSign = "+"; // only way that I found to use the + as an output
		while (a > 0)
		{
			b = a % 10;
			sumdigits = sumdigits + b;
			if (control == 0)
			{
				z = b;
			}
			else if (control == 1)
			{
				y = b;
			}
			else if (control == 2)
			{
				x = b;
			}
			else if (control == 3)
			{
				w = b;
			}
			else if (control == 4)
			{
				v = b;
			}
			a = a / 10;
			control++;
		
		}
		System.out.println("The sum of the digits is " +v+" "+PlusSign+" "+w+" "+PlusSign+" "+x+" "+PlusSign+" "+y+" "+PlusSign+" "+z+ " = "+ sumdigits);	
	// for some reason the %+d idea to use for the print out + did not work here
	}
	// Easy and basic, no issues
	public static void CelsiusConverter() { 
		double C = 0;
		Scanner F = new Scanner(System.in);
		System.out.println("Enter a Fahrenheit temperature:");
		double FF = F.nextInt();
		C = ((FF-32)*5)/9;
		System.out.println(FF + "F is equivalent to " + C + "C");	
	}
	// Easy and basic, no issues
	public static void FahrenheitConverter() {
		int F = 0;
		Scanner C = new Scanner(System.in);
		System.out.println("Enter a Celsius temperature:");
		int CC = C.nextInt();
		F = ((9*CC)/5)+32;
		System.out.println(CC + "C is equivalent to " + F + "F");
	}
}

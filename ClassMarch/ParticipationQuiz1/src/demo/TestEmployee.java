package demo;

import java.util.ArrayList;
import java.util.Collections;

public class TestEmployee {
	public static void main(String[] args) {
		// Methods called from main
		testEmployee();
		testEmployeeList();
		
	}
	public static void testEmployee() {
		// Creation of Employee Array
		Employee[] employees = new Employee[2];
		
		// Enabling the use of the Array space
		employees[0] = new Employee();
		employees[1] = new Employee();
		
		// Setting IDs and names for employees
		employees[0].setID(222);
		employees[0].setFirstName("Adriano");
		
		employees[1].setID(334);
		employees[1].setFirstName("Gabriel");
		System.out.println(employees[0] + " " + employees[1]);
		
	}
	private static void testEmployeeList() {
		// Creation of the ArrayList of chars
		ArrayList<Character> chars = new ArrayList<Character>();
		
		// Adding variety of chars to the list
		chars.add('z');
		chars.add('a');
		chars.add('c');
		chars.add('m');
		
		// Adding chars in specific positions
		chars.add(0, 'a');
		chars.add(0, 'b');
		System.out.println(chars);
		chars.add(5, 'n');
		System.out.println(chars);
		
		// Trying to add a char beyond the end of the ArrayList
		try {
			chars.add(8, 'y');
		// Since the ArrayList only has 7 chars
		// the desired position is beyond the bonds 
			
		} catch(IndexOutOfBoundsException e) {
			System.out.println("Error Caught:");
			e.printStackTrace();
		}
		
		// Removing chars based on position
		chars.remove(0);
		System.out.println(chars);
		
		// Removing chars based on index
		chars.remove(Character.valueOf('m'));
		System.out.println(chars);
		
		// Shuffleing the ArrayList
		Collections.shuffle(chars);
		System.out.println(chars);
		
		// Sorting the ArrayList
		Collections.sort(chars);
		System.out.println(chars);
	}
}

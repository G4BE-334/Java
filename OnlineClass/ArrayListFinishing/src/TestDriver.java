import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
public class TestDriver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		testArrayList();
		testArrayListStudent();
	}
	public static void testArrayList() {
		// Creation of a new ArrayList
		List<String> reviewList = new ArrayList<String>();
		// List is an interface
		// List <------------ IS-A <------------- ArrayList
		
		
		// Add some strings to the ArrayList
		reviewList.add("Circle");
		reviewList.add("Rectangle");
		reviewList.add("Triangle");
		reviewList.add("Square");
		reviewList.add("Pentagle");
		
		// Print the ArrayList
		System.out.println(reviewList);
		
		reviewList.add("Circle");
		System.out.println(reviewList);
		
		// Remove a string by its value
		reviewList.remove("Circle");
		System.out.println(reviewList);
		// .remove removes the first item found 
	}
	public static void testArrayListStudent() {
		// Create an ArrayList of students
		List<Student> students = new ArrayList<>();
		
		// Add some Students
		students.add(new Student(1, "Mike", "Zera"));
		students.add(new Student(2, "Lucas", "Gaucho"));
		students.add(new Student(3, "Porra", "James"));
		students.add(new Student(4, "Gabe", "YouFag"));
		students.add(new Student(5, "Faggot", "Retard"));

		System.out.println(students);
		
		// Removing students by index
		// .remove(3) will remove the student with index=3
		students.remove(3);
		System.out.println(students);
		
		// In order to remove a student by value it necessary
		// to create a new student with the same value 
		// and verify if there is a Student that the value isequal to
		// the one desired
		students.remove(new Student(5));
		System.out.println(students);
		
		// Use Collections to sort by last name
		// To do that it is necessary to set Comparable to 
		// the Student Class
		Collections.sort(students);
		System.out.println("Sorted by last name: \n" + students);
		
		// One way to reverse sort the ArrayList is to
		// First: .sort
		// Second: .reverse
		Collections.reverse(students);
		System.out.println("Reverse Sorted: \n" + students);
		
		// However, this can be done by third parties classes
		// Like ReverseSortLastName Class
		Collections.sort(students);
		System.out.println("One more time sorted by last name: \n" + students);
		Collections.sort(students, new ReverseSortLastName());
		System.out.println("Reverse Sorted by Last name \n" + students);
		
		// We can do the same to compare regarding different attributes
		// Like sort by first name with FirstNameSort Class
		Collections.sort(students, new FirstNameSort());
		System.out.println("Sorted by first name: \n" + students);
	}
}

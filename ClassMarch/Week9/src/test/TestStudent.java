package test;

import java.util.ArrayList;
import java.util.Collections;

public class TestStudent {

	public static void main(String[] args) {
		// Static methods and data
		// are available without object creation
		System.out.println("Student object count: ");
		System.out.println(Student.getCounter());

		// new allocates memory on the Heap for
		// the Student object.
		// returns a reference to the object.
		Student student = new Student();
		// reference, or shallow copy
		Student student2 = student;
		Student student3 = new Student();
		// Prints 'true' because the object references
		// are equal
		System.out.println(student == student2);
		// Prints 'false' because the object references
		// are not equal
		System.out.println(student == student3);

		//arrayTest();
		testArrayList();
		// A staic count is needed to count all objects created
		System.out.println("Student object count: ");
		System.out.println(Student.getCounter());
	}
	
	// This method:
	// callable from main
	// does not return a value
	// does not take parameters
	// tests students in a array
	// 3 required parts of a method
	// 1) return type
	// 2) name
	// 3) parameter list
	
	private static void arrayTest() {
		// data type + [] declares an array
		Student[] students = new Student[3];
		
		// This will cause a null exception
		// because the array is allocated but
		// not the student objects that
		// the array contains.
		try {
			System.out.println(students[0].getFirstName());
		} catch (NullPointerException e) {
			e.printStackTrace();
		}
		
		students[0] = new Student();
		students[1] = new Student();
		students[2] = new Student();
		
		// This tries to blow past the end of the array
		// catch the error and go on.
		try {
			students[3] = new Student();
		}
		catch (ArrayIndexOutOfBoundsException e) {
			e.printStackTrace();
		}		
	}
	
	private static void testArrayList() {
		ArrayList<Student> students = new ArrayList<Student>();
		// ArrayList can grow on demand, unlike basic arrays
		
		// An important limitation on Java ArrayList and collections
		// generally
		// You cannot have collections of primitives
		// ArrayList<int> integers = new ArrayList<int>(); *NOT ALLOWED*
		
		// instead you need to use a wrapper class
		// there is a wrapper class for each type of Java primitive
		ArrayList<Integer> integers = new ArrayList<Integer>();
		// The compiler generates boxing instructions
		// to box the primitive into the wrapper object
		integers.add(1);
		
		// This works because ArrayList implement toString
		// and the object it contains (Integer) also implements toString
		System.out.println(integers);
		
		// add always adds to the end
		// Unless you include an index as an insertion point
		integers.add(0, 400);
		System.out.println(integers);
		
		// Add to the middle
		integers.add(1, 300);
		System.out.println(integers);
		
		// It is not possible to create a gap between the index!!
		// The ArrayList is not a sparse collection
		// it does not tolerate gaps in the data
		try {
			integers.add(4, 10000);
			System.out.println(integers);
		} 
		catch (IndexOutOfBoundsException e){
			System.out.println("Error Caught:");
			e.printStackTrace();
		}
		
		// Remove at an index
		integers.remove(0);
		System.out.println(integers);
		
		// It is also possible to remove based on a value
		// In all cases, remove removes the first one found
		integers.remove(new Integer(1));
		System.out.println(integers);
		// Wrapper class constructors (e.g. new Integer())
		// are deprecated because they can cause too many
		// objects wrapping the same value to be created
		integers.add(1);
		// integers.remove(new Integer(1))
		// instead do:
		integers.remove(Integer.valueOf(1));
		System.out.println(integers);
		// valueOf pools Integer objects 
		// cutting down on duplicates
		
		//integers.removeAll...
		
		integers.add(334);
		integers.add(1);
		integers.add(90);
		integers.add(-24);
		System.out.println(integers);

		// .sort is a static method of the Collections class
		// Look into the Arrays helper class for similar methods
		// for basic arrays
		Collections.sort(integers);
		System.out.println(integers);
		
		Collections.shuffle(integers);
		System.out.println(integers);
		
		
		
	}
}

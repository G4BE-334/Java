package test;
// Related classes go in packages
// Packages live in subfolders
// Default visibility for a class is packages
// Package level classes are aware of each other

public class BasicsReview {
// Public classes reside in files of the same name
// class_name.java
	
	public static void main(String[] args) {
		Student student = new Student();
		testStudentArray();
	
	}
	// Method called testStudentArray
	// Returns nothing
	// Has no parameters
	// Callable from main: It needs to be "static" since main is static
	private static void testStudentArray() {
		// Static means no object reference
		
		// Declare an array of Student objects
		Student[] students = new Student[3];
		
		// Get first student and set a name
		//try {
			//students[0].setName("Mikezera");
		//} catch(NullPointerException e) {
			//System.out.println("Caught: ");
			//e.printStackTrace();
		//}
		// Allocate the actual student objects
		// That goes inside the array
		for (int i = 0; i < students.length; i++) {	
			students[i] = new Student();
			}
		
		// This will now work, since there is
		// created objects inside the array
		students[0].setName("Mikezera");
		students[1].setName("JamesYouFag");
		students[2].setName("PorraLucas");
		System.out.println(students);
	
	
	}
}
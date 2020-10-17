// classes in the same package can see each other
// related classes go in the same package
package test;

// Java compiler will automatically extend Object
// when the programmer doesn't do it.
public class Student extends Object {
	
	// A constructor is a special method that initializes
	// an object for first use.
	// A constructor has the same name as the class
	// It has no return type
	// The default constructor is the constructor that has
	// no parameters
	// If you do not write a default constructor, the compiler
	// provides it.
	
	// If you write any other type of constructor (non-default)
	// the compiler stops creating the default constructor
	
	public Student() {
		// super calls the base class constructor
		// if you do not write it, the compiler will do it
		//  for you.
		// it makes sure the base class is constructed before
		// any other code is executed.
		super();
		lastName = "";
		firstName = "";
		System.out.println("in Student constructor");
		counter++;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	
	public static int getCounter() {
		return counter;
	}


	private int id;
	private String lastName;
	private String firstName;
	private static int counter = 0;
}

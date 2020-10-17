// All this code was written by me Gabriel Teixeira Lima Aracena

package demo;
// Creating a package to save the class

public class Employee extends Object {
// Showing explicitly the inhenritance from Object

	private int ID;
	private String firstName;
	private String lastName;
	private static int count = 0; // Count the number of employees
								 // objects created
	
// Creation of data properties
	
// Creation of getters and setters	
	public int getID() {
		return ID;
	}

	public void setID(int iD) {
		ID = iD;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}
	
	public void setLastname(String lastName) {
		this.lastName = lastName;
	}
	private static int getCount() {
		return count;
	}
	public Employee(){
	// Explicit call to Object's constructor
		super(); // super needs to be called before anything else
		firstName = "";
		lastName = "";
		count++;
	}
	
	@Override
	public String toString() {
		return "Employee ID:" + ID + lastName + "," + firstName;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

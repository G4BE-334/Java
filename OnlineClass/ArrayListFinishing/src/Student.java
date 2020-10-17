import java.util.ArrayList;
public class Student implements Comparable<Student>{
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id;
		return result;
	}
	@Override
	// This is necessary to remove from id/name
	// The class will understand that it is necessary to 
	// remove the object with equal value
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		if (id != other.id)
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "Student" + " " + id  + " " + firstName + " " + lastName + "\n";
	}
	public Student(int id, String firstName, String lastName) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
	}
	public Student(int id) {
		super();
		this.id = id;
	}
	private int id;
	private String firstName;
	private String lastName;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
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
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	@Override
	public int compareTo(Student o) {
		// -1 means less than
		// 0 means equals to
		// 1 means greater than
		// For Example: return 0 = always equal
		
		// Compare the last name in alphabetical order 
		// Because String IS A Comparable (Implements ^^)
		return this.lastName.compareTo(o.lastName);
	
	}
	
}

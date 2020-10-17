class Student {
	
	public String getLastName() {
		return LastName;
	}
	public void setLastName(String lastName) {
		LastName = lastName;
	}
	public String getFirstName() {
		return FirstName;
	}
	public void setFirstName(String firstName) {
		FirstName = firstName;
	}
	public double getGPA() {
		return GPA;
	}
	public void setGPA(double gPA) {
		GPA = gPA;
	}
	public String getMajor() {
		return Major;
	}
	public void setMajor(String major) {
		Major = major;
	}
	
	
	@Override
	public String toString() {
		return LastName + " " + FirstName + "\t" + GPA + "\t" + Major;
	}


	private String LastName;
	private String FirstName;
	private double GPA;
	private String Major;
	
}

// Classes should be typically nouns, and methods should be verbs

public class Notes {

	public static void main(String[] args) {
		// to use an attribute from a class you need to allocate it
		Student s = new Student();
		s.setLastName("Snigga");
		s.setFirstName("Gorgonoid");
		s.setMajor("Nursing");
		s.setGPA(3.9);
		
		Student s2 = new Student();
		s2.setFirstName("Lucas");
		s2.setLastName("Severo");
		s2.setMajor("Business");
		s2.setGPA(4.0);

		System.out.println(s);
		System.out.println(s2);
	}

}

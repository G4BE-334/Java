class Person {
	
	
	public static String getLastName(Person _this) {
		return _this.lastName;
	}
	public static void setLastName(Person _this, String lastName) {
		_this.lastName = lastName;
	}
	public String getFirstName() {
		return this.firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	private String lastName;
	private String firstName;
	
	@Override
	public String toString() {
		return lastName + ", " + firstName;
	}
	
}


public class ParticipationAssignment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person p = new Person();
		p.setFirstName("Joe");
		p.setLastName(p, "Williams");
		Person pp = new Person();
		pp.setFirstName("Mary");
		pp.setLastName(pp, "Virgin");
	
	System.out.println(p + "\t" + pp);
	

	}

}

import java.util.Comparator;


public class FirstNameSort implements Comparator<Student>{

	@Override
	public int compare(Student o1, Student o2) {
		// It needs two Student objects because different from the 
		// Student class, it is not comparing to itself
		// but comparing two different objects 
		
		// Again:
		// -1 = < o; 0 == o; 1 = > o
		return o1.getFirstName().compareTo(o2.getFirstName());
		
	}

}

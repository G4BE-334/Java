import java.util.Comparator;


public class ReverseSortLastName implements Comparator<Student>{

	@Override
	public int compare(Student o1, Student o2) {
		// To reverse compare just inverse the sign
		return -o1.getLastName().compareTo(o2.getLastName());

		
	}

}

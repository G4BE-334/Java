
// LISTING 11.8 TestArrayList.java
import java.util.ArrayList;
import java.util.Collections;

class Circle {
	int radius;

	public Circle(int radius) {
		super();
		this.radius = radius;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + radius;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Circle other = (Circle) obj;
		if (radius != other.radius)
			return false;
		return true;
	}

	public double getArea() {
		return Math.PI * Math.pow(radius, 2);
	}
}

public class ArrayListTest {
	public static void main(String[] args) {
		// Create a list to store cities
		ArrayList<String> cityList = new ArrayList<>();

		// Add some cities in the list
		cityList.add("London");
		// cityList now contains [London]
		cityList.add("Denver");
		// cityList now contains [London, Denver]
		cityList.add("Paris");
		// cityList now contains [London, Denver, Paris]
		cityList.add("Miami");
		// cityList now contains [London, Denver, Paris, Miami]
		cityList.add("Seoul");
		// Contains [London, Denver, Paris, Miami, Seoul]
		cityList.add("Tokyo");
		// Contains [London, Denver, Paris, Miami, Seoul, Tokyo]

		System.out.println("List size? " + cityList.size());
		System.out.println("Is Miami in the list? " + cityList.contains("Miami"));
		System.out.println("The location of Denver in the list? " + cityList.indexOf("Denver"));
		System.out.println("Is the list empty? " + cityList.isEmpty()); // Print false

		// Insert a new city at index 2
		cityList.add(2, "Xian");
		// Contains [London, Denver, Xian, Paris, Miami, Seoul, Tokyo]

		// Remove a city from the list
		cityList.remove("Miami");
		// Contains [London, Denver, Xian, Paris, Seoul, Tokyo]

		// Remove a city at index 1
		cityList.remove(1);
		// Contains [London, Xian, Paris, Seoul, Tokyo]

		// Display the contents in the list
		System.out.println("City list:");
		System.out.println(cityList.toString());

		// Display the contents in the list in reverse order
		System.out.println("Reverse city list:");
		for (int i = cityList.size() - 1; i >= 0; i--)
			System.out.print(cityList.get(i) + " ");
		System.out.println();

		System.out.println("Shuffed cities: (Uno game?)");
		Collections.shuffle(cityList);
		System.out.println(cityList);
		
		System.out.println("Sorted cities:");
		Collections.sort(cityList);
		System.out.println(cityList);
		
		// Create a list to store two circles
		ArrayList<Circle> list = new ArrayList<>();

		// Add two circles
		list.add(new Circle(2));
		list.add(new Circle(3));

		// Display the area of the first circle in the list
		System.out.println("The area of the circle? " + 
				list.get(0).getArea());
		
		Circle circle = new Circle(2);
		System.out.println("Compare two circles:");
		System.out.println(list.get(0) == circle);
		System.out.println(list.get(0).equals(circle));
		System.out.println(circle.equals("test string"));
	}
}


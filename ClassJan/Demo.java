
public class Demo {
	public static void main(String[] args) {
		/* block comment 
		*
		* Primitive types:
		* 	
		* 	Numeric:
		* 		short, int, long, float, double
		* 	Characters:
		* 		byte, char
		* 	Boolean:
		* 		true, false
		*
		*/
		
		int i, k;
		i = 7;
		int virjao = 10;
		double d = 10.3;
		char c = 'd';
		boolean b = false;
		System.out.println(virjao);
		virjao = 0;
		System.out.println(virjao);
		
		/*
		 * Objects:
		 * 	String  
		 */
		
		String s = "Wsup";
		System.out.println(s);
		
		{
			int ii = 100;
			i = i + ii;
			System.out.println(i);
		}
		// System.out.println(ii); ERROR 
		//i = i * 10;
		i =  i/10;
		System.out.println(i);
		i = i + 1;
		i = i - 1;
		i = 0;
		i = i % 3;
		i = 1;
		i = i % 3;
		i = 2;
		i = i % 3;
		i = 3;
		i = i % 3;
		i = 4;
		i = i % 3;
		i = 5;
		i = i % 3;
		i = 6;
		i = i % 3;
		
		d = i;
		i = (int) d; // lost of data from turning a float/double into an int
		
		
	}
}
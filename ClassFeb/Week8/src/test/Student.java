package test;

// Inheritance
// The compiler adds extends Object if you do not
public class Student extends Object{

		// The Constructor job is to initialize the object
		// for the first use
		// If you do not create a constructor
		// the compiler will write one for you
	
		// The constructor is written like a normal method
		// Except:
		// 1) It does not have a return type
		// 2) It is named the same as the class
		public Student() {
			// Explicitly invoke the base classes constructor
			// If you do not do this, the compiler will do it for you
			//try {
				
			
			super(); // It needs to be the first thing you do
			// Setting the name to an empty string
			name = ""; 
		}
	
		// Data members are usually private
		// illustrates encapsulation
		
		
		private int id;
		public int getId() {
			return id;
		}
		public void setId(int id) {
			this.id = id;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		private String name;
		@Override
		public String toString() {
			return "Student [name=" + name + "]";
		}
		
}



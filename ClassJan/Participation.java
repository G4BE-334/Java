
public class Participation {
	 /*
    Based on:
    https://www.tutorialspoint.com/csharp/csharp_decision_making.htm
    */
   public static void main(String[] args)
   {
       System.out.println("Hello World!");
      
      
       ifDemo();
       ifElseDemo();
       ifElseIfDemo();
       nestIfDemo();
       switchDemo();
       nestedSwitch();
       ternaryOperator();
       
       whileLoop();
		forLoop();
		doWhileLoop();
		//on more loop type to come...
		
		preAndPostFixIncrement();
		augmentedAssignment();
		
		// now bugs
		// whileLoopWithaBug();
		// whileLoopWithaBug2();
	}
	
	public static void whileLoop() {
		int x = 1; 
		  
       // Exit when x becomes greater than 4 
       while (x <= 4) 
       { 
           System.out.println("Value of x:" + x); 
 
           // Increment the value of x for 
           // next iteration 
           x++; 
       } 
	}

	public static void forLoop() {		
		// for loop begins when x=2 
       // and runs till x <=4 
       for (int x = 2; x <= 4; x++) { 
           System.out.println("Value of x:" + x);
       }
       
       // x is out of scope here
	}
	
	public static void doWhileLoop() {
		int x = 21; 
       do
       { 
           // The line will be printed even 
           // if the condition is false 
           System.out.println("Value of x:" + x); 
           x++; 
       } 
       while (x < 20); 
	}
	
	public static void preAndPostFixIncrement() {

		int x = 100;

		// Incrementing by one is very common
		// These operators provide a shortcut for this pattern
		x = x + 1;
		x = 100;

		// Use then increment
		System.out.println("Value of x:" + x++);
		System.out.println("Value of x:" + x);

		x = 100;
		// Increment then use
		System.out.println("Value of x:" + ++x);
		System.out.println("Value of x:" + x);

		x = 100;
		// Use then decrement
		System.out.println("Value of x:" + x--);
		System.out.println("Value of x:" + x);

		x = 100;
		// Decrement then use
		System.out.println("Value of x:" + --x);
		System.out.println("Value of x:" + x);

	}

	public static void augmentedAssignment() {

		int x = 100;

		// More shortcuts for this pattern
		x = x + 1;
		// Also works for *, /, %, -
		x = 100;

		x += 100;

		x = 100;
		x = x * (10 + 3 * 8);
		x = 100;
		x *= (10 + 3 * 8);

		System.out.println("Value of x:" + x);
	}
	
	public static void whileLoopWithaBug() {
		int x = 1; 
		  
       // Exit when x becomes greater than 4 
       while (x <= 4) 
       { 
           System.out.println("Value of x:" + x); 
       // x++;
       } 
	}
	
	public static void whileLoopWithaBug2() {
		int x = 1; 
		  
       // Exit when x becomes greater than 4 
       while (x <= 4); 
       { 
           System.out.println("Value of x:" + x); 
 
           // Increment the value of x for 
           // next iteration 
           x++; 
       } 
	}

       

   static void ifDemo()
   {
       /* local variable definition */
       int a = 10;

       /* check the boolean condition using if statement */
       if (a < 20)
       {
           /* if condition is true then print the following */
           System.out.println("a is less than 20");
       }
       System.out.println(String.format("value of a is : %d", a));
   }

   static void ifElseDemo()
   {
       /* local variable definition */
       int a = 100;

       /* check the boolean condition */
       if (a < 20)
       {
           /* if condition is true then print the following */
           System.out.println("a is less than 20");
       }
       else
       {
           /* if condition is false then print the following */
           System.out.println("a is not less than 20");
       }
       System.out.println(String.format("value of a is : %d", a));
   }

   static void ifElseIfDemo()
   {
       /* local variable definition */
       int a = 100;

       /* check the boolean condition */
       if (a == 10)
       {
           /* if condition is true then print the following */
           System.out.println("Value of a is 10");
       }
       else if (a == 20)
       {
           /* if else if condition is true */
           System.out.println("Value of a is 20");
       }
       else if (a == 30)
       {
           /* if else if condition is true  */
           System.out.println("Value of a is 30");
       }
       else
       {
           /* if none of the conditions is true */
           System.out.println("None of the values is matching");
       }
       System.out.println(String.format("value of a is : %d", a));
   }

   static void nestIfDemo()
   {
       //* local variable definition */
       int a = 100;
       int b = 200;

       /* check the boolean condition */
       if (a == 100)
       {

           /* if condition is true then check the following */
           if (b == 200)
           {
               /* if condition is true then print the following */
               System.out.println("Value of a is 100 and b is 200");
           }
       }
       System.out.println(String.format("value of a is : %d", a));
       System.out.println(String.format("value of a is : %d", b));
   }
   static void switchDemo()
   {
       /*
           In Java, Switch statement is a multiway branch statement. 
           It provides an efficient way to transfer the execution 
           to different parts of a code based on the value of the 
           expression. The switch expression is of integer type 
           such as int, char, byte, or short, or of an enumeration 
           type, or of string type. The expression is checked for 
           different cases and the one match is executed.    

			
        */
       /* local variable definition */
       char grade = 'B';
       double gpa = 3.77;

       switch (grade)
       {
           case 'A':
               System.out.println("Excellent!");
               break;
           case 'B':
           case 'C':
               System.out.println("Well done");
               if (gpa > 3.5)
               {
                   System.out.println("But you have done better");
               }
               break;
           case 'D':
               System.out.println("You passed");
               break;
           case 'F':
               System.out.println("Better try again");
               break;
           default:
               System.out.println("Invalid grade");
               break;
       }
       System.out.println(String.format("the grade is : %c", grade));
   }
   static void nestedSwitch()
   {
       int a = 100;
       int b = 200;

       switch (a)
       {
           case 100:
               System.out.println("This is part of outer switch ");

               switch (b)
               {
                   case 200:
                       System.out.println("This is part of inner switch ");
                       break;
               }
               break;
       }
       System.out.println(String.format("value of a is : %d", a));
       System.out.println(String.format("value of a is : %d", b));
   }

   static void ternaryOperator()
   {
       // ?:
       // Test expression sets a result
       // test ? on true : on false
       int a = 10;
       String result = "";
       System.out.println();
       result = a == 10 ? "it is 10" : "it is not 10";
       System.out.println(result);

       result = a == 100 ? "it is 100" : "it is not 100";
       System.out.println(result);

       // Can be nested, gets hard to read
       result = a == 100 ? "it is 100" : a == 10 ? "it is 10" : "it is not 10";
       System.out.println(result);
   }

}



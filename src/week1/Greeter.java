package week1; // package is defined in files using the package keyword

public class Greeter {
	
	
	static float pi = 3.14f; // example of static instance variables
	// pi variable is default type
	
	// all code (logic) must go inside functions

	public static String printGreeting() { 
		return "Hello CS151";
	}
	
	// special function - main - entrypoint of the function
	public static void main(String[] args) {
		
		System.out.println("Value of pi = " + pi); // valid as belongs in the same class
		// output: Value of pi = 3.14
		
		// System.out.println(printGreeting()); // valid 
		
		System.out.println(args[0] + " " + args[1]); // basically running code as `java Greeter Hello CS151`
		// output: Hello CS151
	}
}

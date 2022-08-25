package week1;

public class Temp {
	public static void main(String[] args) {

		System.out.println(Greeter.pi); // valid as its part of same package
		// output - 3.14

		System.out.println(Greeter.printGreeting()); // valid as static
	}
}

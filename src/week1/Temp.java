package week1;

import week2.example1.Person;

public class Temp {
	public static void main(String[] args) {
//
//		System.out.println(Greeter.pi); // valid as its part of same package
//		// output - 3.14
//
//		System.out.println(Greeter.printGreeting()); // valid as static
//		
		// one way of creating object
		Person person1;
		person1 = new Person();
		
		// 2nd way
		Person person2 = new Person("Bob", 50, 70, "Mean", "Brown");
		
		System.out.println(person2);
		
	}
}

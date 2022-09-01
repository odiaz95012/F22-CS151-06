package week2.example1;

public class Person {

	// attributes
	String name;
	int age;
	int heightInInches;
	String attitude;
	String eyeColor;

	// methods
	// constructor
	// same name as class
	// doesnt have a return type
	public Person() {
		name = "Abhishek";
	}

	public String printInfo() {
		return "Hello, I am " + this.name;
	}

	public Person(String name, int age, int heightInInches, String attitude, String eyeColor) {

		this.name = name;
		this.age = age;
		this.heightInInches = heightInInches;
		this.attitude = attitude;
		this.eyeColor = eyeColor;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + ", heightInInches=" + heightInInches + ", attitude=" + attitude
				+ ", eyeColor=" + eyeColor + "]";
	}

	public String speak() {
		System.out.println("walking....");
		return "Hello";
	}

	public void walk() {
		System.out.println("walking....");
	}
}

package week3.challenge2;

public class Person {
	private String name;

	public Person(String n) {
		this.name = n;
		System.out.print("#1 ");
	}

	public static void main(String[] args) {
		Student s = new Student(); 
		// in what order will the statements get printed?
	}
}

class Student extends Person {
	public Student() {
		this("Student");
		System.out.print("#2 ");
	}

	public Student(String n) {
		super(n);
		System.out.print("#3 ");
	}

}

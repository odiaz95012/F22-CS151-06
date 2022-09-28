package week3.challenge1;

class Student extends Person {
	private int id;

	public int getID() {
		return id;
	}
}

class Faculty extends Person {
	private String id;

	public String getID() {
		return id;
	}
}

public class Person extends Object{
	private String name;

	public String getName() {
		return name;
	}

	public static void main(String[] args) {
		Student s = new Student();
		Person p = new Person();
		Person q = new Person();
		Faculty f = new Faculty();
		Object o = new Faculty();
		
		
//		which of the below lines will throw an error
//		String n = s.getName(); 
//		int m = p.getID();
//		f = q;
//		Faculty f = new Person();

//		o = s;
		
	}
}

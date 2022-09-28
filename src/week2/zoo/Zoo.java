package week2.zoo;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Zoo {
	String name;
	String location;
	int numberOfAnimals;
	int numberOfEmployees;
	// List<Animal> animals;
	Map<String, Animal> animals = new HashMap();
	List<Employee> employees;
	List<Visitor> visitors;

	public Zoo() {
		this.name = "CS151 Zoo";
		this.location = "San Jose";
		this.numberOfAnimals = 0;
		this.numberOfEmployees = 0;
//		this.animals = new ArrayList<>();
		this.employees = new ArrayList<>();
		this.visitors = new ArrayList<>();
	}
	
	
	
	
	
	
	
	
	
	
	public static void main(String[] args) {
		String s = "abc";
		String t = "def";
		String u = s + t; // not computationally efficient
		
		
		
		// reverse a string
		StringBuilder sb = new StringBuilder(s);
//		sb.append(s);
		sb.append(t);
		
		sb.toString();
	}
	// same for employee and visitor
}

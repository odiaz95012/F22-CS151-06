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

	public void addAnimal(Animal animal) {
		this.animals.put(animal.name, animal);
		this.numberOfAnimals++;
	}

	// same for employee and visitor
}

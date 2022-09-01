package week2.zoo;

enum type {
	AMPHIBIAN, ARTHROPODS, BIRD, FISH, MAMMAL, REPTILE 
}

public class Animal {
	type type;
	int uniqueId;
	String name;
	
	public void sleep() {
		System.out.println("sleeping...");
	}
	// more methods
}

package week2.zoo;

enum type {
	AMPHIBIAN, ARTHROPODS, BIRD, FISH, MAMMAL, REPTILE
}


public class Animal {
	private type type;
	private int uniqueId;
	private String name;

	public type getType() {
		return type;
	}

	public void setType(type type) {
		this.type = type;
	}

	public int getUniqueId() {
		return uniqueId;
	}

	public void setUniqueId(int uniqueId) {
		this.uniqueId = uniqueId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void sleep() {
		System.out.println("sleeping...");
	}
	
	public void doWork() {
		this.name = "foo"; // valid
		setName("foo"); // not required here
	}
	// more methods
}

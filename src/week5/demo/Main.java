package week5.demo;

interface Polygon {
	public static final double PI = 3.14;
	void getArea(int l, int b);
	
	default void newArea() {
		// do something if not overridden;
		System.out.println("coming from default");
	}
}

// implement the Polygon interface
class Rectangle implements Polygon {

	// implementation of abstract method
	public void getArea(int length, int breadth) {
		System.out.println("The area of the rectangle is " + (length * breadth));
	}
}

class Main {
	public static void main(String[] args) {
		Rectangle r1 = new Rectangle();
		r1.getArea(5, 6);
	}
}
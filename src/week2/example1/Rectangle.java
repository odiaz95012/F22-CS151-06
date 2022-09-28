package week2.example1;

public class Rectangle {
	private int x;
	private int y;
	private int area;

	public Rectangle(int x, int y) {
		this.x = x;
		this.y = y;
		calculateArea();
	}

	public void calculateArea() {
		this.area = this.x * this.y;
	}

}

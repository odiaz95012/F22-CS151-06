package hw1;
public class DiazVegaTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name = "Oscar Diaz Vega";
		String oscarsIntroduction = "Hello! My name is Oscar Diaz Vega. I am a third year computer science major."
				+ "Some of my favorite things to do are play golf, play video games, and lift weights.";
		int oscarsStudentID = 0610; // only the last 4 digits
		
		Student oscarDiazVega = new Student(name, oscarsIntroduction, oscarsStudentID);
		System.out.println(oscarDiazVega);
		
		
	}

}

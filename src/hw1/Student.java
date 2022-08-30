package hw1;

public class Student {
	private String name;
	private String introduction;
	private int studentId; // only last 4 digits

	public Student() {
	}

	public Student(String name, String introduction, int studentId) {
		this.name = name;
		this.introduction = introduction;
		this.studentId = studentId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getIntroduction() {
		return introduction;
	}

	public void setIntroduction(String introduction) {
		this.introduction = introduction;
	}

	public int getStudentId() {
		return studentId;
	}

	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}
}

package week3.challenge3;

public class Person {
    private String name;
 
    public Person( String n ) {
//        super();
        this.name = n;
    }
    public void setName( String n ) {
        this.name = n;
    }
    public static void main(String[] args) {
    	Student s = new Student();
    	//      "Student"
		//    	"" (the empty string)
		//    	null
		//    	This will cause a compile error
		//    	This will cause a run time error
	}
}

 class Student extends Person {
    public Student() {
    	super("Student");
        this.setName("Student"); 
    }
}
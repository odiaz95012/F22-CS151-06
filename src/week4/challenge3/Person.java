package week4.challenge3;

abstract class Person {
    public void method1() {
        System.out.print("Person 1 ");
    }
    public void method2() {
        System.out.print("Person 2 ");
    }
    
    public static void main(String[] args) {
    	Person u = new Undergrad();
    	u.method1();
	}
}

class Student extends Person {
    public void method1() {
        System.out.print("Student 1 ");
        super.method1();
        method2();
    }
    public void method2() {
        System.out.print("Student 2 ");
    }
}

class Undergrad extends Student {
    public void method2() {
        System.out.print("Undergrad 2 ");
    }
}
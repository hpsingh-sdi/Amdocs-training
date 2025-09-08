package amdocs_pkg;

public class Student {
	String name;
	int age;
	char section;
	char gender;
	int sub1;
	int sub2;
	int sub3;
	
	public Student(int sub3, int sub2, int sub1) {
		this.sub1 = sub1;
		this.sub2 = sub2;
		this.sub3 = sub3;
	}
	public Student(int sub3, int sub2) {
		this.sub1 = 0;
		this.sub2 = sub2;
		this.sub3 = sub3;
	}
	
	public void totalMarks() {
		System.out.println("Total marks: "+sub1+sub2+sub3);
	}
	
	public void display() {
		System.out.println("sub1:"+sub1);
		System.out.println("sub2:"+sub2);
		System.out.println("sub3:"+sub3);
	}
	
	
	public static void main(String []args) {
		Student s1 = new Student(10,20,30);
		Student s2 = new Student(10,20);
		Student s3 = new Student(20,30);
		Student s4 = new Student(30,40,50);
	}
}

import java.util.Scanner;

public class Student {

	private int rollno;
	private String name;
	private double marks;
	private String course;
	
	public Student(int rollno, String name, double marks, String course) {
		this.rollno=rollno;
		this.name = name;
		this.marks = marks;
		this.course = course;
	}

	public Student() {
		
	}

	public int getRollno() {
		return rollno;
	}
	
	public void setRollno(int rollno) {
		this.rollno = rollno;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getMarks() {
		return marks;
	}

	public void setMarks(double marks) {
		this.marks = marks;
	}

	public String getCourse() {
		return course;
	}

	public void setCourse(String course) {
		this.course = course;
	}
	
	public void accept(Scanner sc)
	{
		System.out.println("Enter roll no: ");
		rollno = sc.nextInt();
		System.out.println("Enter name: ");
		name = sc.next();
		System.out.println("Enter marks: ");
		marks = sc.nextDouble();
		System.out.println("Enter course: ");
		course = sc.next();
	}

	@Override
	public String toString() {
		return "Student [rollno=" + rollno + ", name=" + name + ", marks=" + marks + ", course=" + course + "]";
	}

	
}

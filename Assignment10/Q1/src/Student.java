
public class Student implements Comparable<Student>{

	private int rollno;
	private String name;
	private int marks;
	
	
	public Student(int rollno, String name, int marks) {
		super();
		this.rollno = rollno;
		this.name = name;
		this.marks = marks;
	}
	
	public Student() {
		super();
	}

	@Override
	public int compareTo(Student o) {
		if(this.marks>o.marks)
			return -3;
		else if(this.marks<o.marks)
			return 1;
		else
			return 0;
	}

	@Override
	public String toString() {
		return "Student [rollno=" + rollno + ", name=" + name + ", marks=" + marks + "]";
	}
	
	
	
	
}

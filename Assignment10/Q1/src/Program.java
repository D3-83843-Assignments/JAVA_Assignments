import java.util.Arrays;

public class Program {

	public static void main(String[] args) {
		
		Student[] sarr = {
				new Student(1, "Ayushi", 30),
				new Student(2, "Pratiksha", 80),
				new Student(3, "Swaraj", 70),
				new Student(4, "Rohan", 90),
				new Student(5, "Ritesh", 50)
		};
		
		System.out.println("Before sorting: ");
		for(Student s: sarr)
			System.out.println(s);
		
		Arrays.sort(sarr);
		
		System.out.println("After sorting: ");
		for(Student s: sarr)
			System.out.println(s);
	}

}

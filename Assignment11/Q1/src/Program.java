import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;
import java.util.concurrent.CopyOnWriteArrayList;

public class Program{

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		List<Student> sarr = new ArrayList<Student>();
		
		class StudentRollSort implements Comparator<Student>
		{
			@Override
			public int compare(Student o1, Student o2) {
				return o1.getRollno() - o2.getRollno();
			}
		}
		
		class StudentNameSort implements Comparator<Student>
		{
			@Override
			public int compare(Student o1, Student o2) {
				return o1.getName().compareTo(o2.getName());
			}
		}
		
		class StudentMarksSort implements Comparator<Student>
		{
			@Override
			public int compare(Student o1, Student o2) {
				return Double.compare(o1.getMarks(), o2.getMarks());
			}
		}
		
		class StudentCourseSort implements Comparator<Student>
		{
			@Override
			public int compare(Student o1, Student o2) {
				return o1.getCourse().compareTo(o2.getCourse());
			}
		}
		
		int choice = 0;
		do
		{
			System.out.println("1. Add student");
			System.out.println("2. Sort by roll no");
			System.out.println("3. Sort by name");
			System.out.println("4. Sort by marks");
			System.out.println("5. Sort by course");
			System.out.println("Enter choice: ");
			choice = sc.nextInt();
			
			switch(choice)
			{
			case 1:
				Student s = new Student();
				s.accept(sc);
				sarr.add(s);
				break;
				
			case 2:
				StudentRollSort rollSort = new StudentRollSort();
				Collections.sort(sarr, rollSort);
				for(Student student: sarr)
					System.out.println(student);
				break;
				
			case 3:
				StudentNameSort NameSort = new StudentNameSort();
				Collections.sort(sarr, NameSort);
				for(Student student: sarr)
					System.out.println(student);
				break;
				
			case 4:
				StudentMarksSort MarkSort = new StudentMarksSort();
				Collections.sort(sarr, MarkSort);
				for(Student student: sarr)
					System.out.println(student);
				break;

			case 5:
				StudentCourseSort CourseSort = new StudentCourseSort();
				Collections.sort(sarr, CourseSort);
				for(Student student: sarr)
					System.out.println(student);
				break;
				
			case 6:
				for(Student student: sarr)
					System.out.println(student);
				break;
				
			default:
				System.out.println("Invalid choice..");
				break;
			}
		}while(choice!=0);
		
	}

}

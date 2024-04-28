import java.util.Scanner;

public abstract class Employee {
	Scanner sc = new Scanner(System.in);

	private String firstName;
	private String lastName;
	private int SSN;
	
	public Employee()
	{	
	}
	
	public Employee(String firstName, String lastName) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.SSN=SSN;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	public int getSSN() {
		return SSN;
	}

	public void setSSN(int sSN) {
		SSN = sSN;
	}

	public void accept(Scanner sc)
	{
		System.out.println("Enter first name: ");
		firstName = sc.next();
		System.out.println("Enter last name: ");
		lastName = sc.next();
		System.out.println("Enter SSN: ");
		SSN = sc.nextInt();
	}
	
	public abstract void calculateSalary();

	@Override
	public String toString() {
		return "SSN = "+ SSN +"\n firstName = " + firstName + ",\n lastName=" + lastName;
	}	
}

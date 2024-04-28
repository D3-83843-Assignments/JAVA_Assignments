import java.util.Scanner;

public class SalariedEmployee extends Employee{
	
	private double weeklySalary;

	public SalariedEmployee(double weeklySalary) {
		super();
		this.weeklySalary = weeklySalary;
	}
	
	public SalariedEmployee() {
	}

	public double getWeeklySalary() {
		return weeklySalary;
	}

	public void setWeeklySalary(double weeklySalary) {
		this.weeklySalary = weeklySalary;
	}

	@Override
	public void accept(Scanner sc) {
		super.accept(sc);
		System.out.println("Enter weekly salary: ");
		weeklySalary = sc.nextDouble();
	}

	@Override
	public String toString() {
		return super.toString()+"\n weeklySalary = " + weeklySalary ;
	}

	@Override
	public void calculateSalary() {
		double Salary = weeklySalary * 4;
		System.out.println("\n Salary = "+Salary);	
	}
	
}

import java.util.Scanner;

public class HourlyEmployee extends Employee{

	private double wage;
	private int hrs;
	public HourlyEmployee(double wage, int hrs) {
		super();
		this.wage = wage;
		this.hrs = hrs;
	}
	
	public HourlyEmployee() {
		super();
	}

	public double getWage() {
		return wage;
	}

	public void setWage(double wage) {
		this.wage = wage;
	}

	public int getHrs() {
		return hrs;
	}

	public void setHrs(int hrs) {
		this.hrs = hrs;
	}

	@Override
	public void accept(Scanner sc) {
		// TODO Auto-generated method stub
		super.accept(sc);
		System.out.println("Enter wage: ");
		wage= sc.nextDouble();
		System.out.println("Enter hrs: ");
		hrs = sc.nextInt();
	}

	@Override
	public String toString() {
		return super.toString() +"\n wage = " + wage + ",\n hrs = " + hrs;
	}

	@Override
	public void calculateSalary() {
		double Salary = 0.0;
		if(hrs<40)
			Salary = wage * hrs;
		else
			Salary = wage * hrs * 1.5;
		System.out.println("\nSalary = "+Salary);
	}
	
}

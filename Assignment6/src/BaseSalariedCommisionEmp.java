import java.util.Scanner;

public class BaseSalariedCommisionEmp extends CommissionEmployee{
	
	private double base_salary;

	public BaseSalariedCommisionEmp(int grossSales, double commissionRate, double base_salary) {
		super(grossSales, commissionRate);
		this.base_salary = base_salary;
	}

	public BaseSalariedCommisionEmp() {
	}

	public double getBase_salary() {
		return base_salary;
	}

	public void setBase_salary(double base_salary) {
		this.base_salary = base_salary;
	}

	@Override
	public void accept(Scanner sc) {
		super.accept(sc);
		System.out.println("Enter base salary: ");
		base_salary = sc.nextDouble();
	}

	@Override
	public String toString() {
		return super.toString() + "\n base_salary = " + base_salary ;
	}

	@Override
	public void calculateSalary() {
		// TODO Auto-generated method stub
		super.calculateSalary();
		double Salary = base_salary + getCommissionRate()*getGrossSales();
		System.out.println("\n Final salary = "+Salary);
	}
}

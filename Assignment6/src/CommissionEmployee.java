import java.util.Scanner;

public class CommissionEmployee extends Employee{

	private int grossSales;
	private double commissionRate;
	
	public CommissionEmployee(int grossSales, double commissionRate) {
		super();
		this.grossSales = grossSales;
		this.commissionRate = commissionRate;
	}
	
	public CommissionEmployee() {
		super();
	}

	public int getGrossSales() {
		return grossSales;
	}

	public void setGrossSales(int grossSales) {
		this.grossSales = grossSales;
	}

	public double getCommissionRate() {
		return commissionRate;
	}

	public void setCommissionRate(double commissionRate) {
		this.commissionRate = commissionRate;
	}

	@Override
	public void accept(Scanner sc) {
		super.accept(sc);
		System.out.println("Enter gross Sales: ");
		grossSales = sc.nextInt();
		System.out.println("Enter commisiion rate: ");
		commissionRate = sc.nextDouble();
	}

	@Override
	public String toString() {
		return super.toString() + "\n grossSales = " + grossSales + ",\n commissionRate = " + commissionRate;
	}

	@Override
	public void calculateSalary() {
		double Salary = grossSales * commissionRate;
		System.out.println("\nCommission = "+Salary);		
	}
	
	
}

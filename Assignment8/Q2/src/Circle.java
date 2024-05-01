import java.util.Scanner;

public class Circle extends Point2D{
	
	private double diameter;

	public Circle(double diameter) {
		super();
		this.diameter = diameter;
	}

	public Circle() {
		super();
	}
	
	public double getDiameter() {
		return diameter;
	}

	public void setDiameter(double diameter) throws NegativeValue{
		if(diameter < 0)
			throw new NegativeValue("Diameter cannot be negative.");
		this.diameter = diameter;
	}

	@Override
	public void accept(Scanner sc) {
		// TODO Auto-generated method stub
		super.accept(sc);
	}

	@Override
	public String toString() {
		return "Circle [diameter=" + diameter + ", toString()=" + super.toString() + "]";
	}

	
	
}

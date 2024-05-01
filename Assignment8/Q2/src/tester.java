import java.util.Scanner;

public class tester {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Circle c = new Circle();
		c.accept(sc);
		
		System.out.println("Enter diameter: ");
		try {
			c.setDiameter(sc.nextDouble());
		} catch (NegativeValue e) {
			e.getStackTrace();
			System.out.println(e.getMessage());
		}

		System.out.println(c.toString());
	}

}

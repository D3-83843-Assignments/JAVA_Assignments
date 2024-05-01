import java.util.Scanner;

public class Point2D {

	private int x=100;
	private int y=100;
	
	public Point2D(){}
	
	public Point2D(int x, int y)
	{
		this.x=x;
		this.y=y;
	}
	
	public void accept(Scanner sc)
	{
		System.out.println("Enter X: ");
		x=sc.nextInt();
		System.out.println("Enter Y: ");
		y=sc.nextInt();
	}

	@Override
	public String toString() {
		return "Point2D [x=" + x + ", y=" + y + "]";
	}
	
}

package tester;
import java.util.Scanner;

import com.app.geometry.*;

public class TestPointArray1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("How many number of points? ");
		int n = sc.nextInt();
		
		Point2D[] points = new Point2D[n];
		
		for(int i=0;i<points.length;i++)
		{
			System.out.println("Enter x and y coordinates: ");
			points[i] = new Point2D(sc.nextInt(),sc.nextInt());
			points[i].getDetails();
		}
		int ch=0;
		
		do
		{
			System.out.println("1: Display details of a specific point.");
			System.out.println("2: Display x, y co-ordinates of all points.");
			System.out.println("3: Find distance.");
			System.out.println("4: Exit");
			System.out.println("Enter choice: ");
			ch=sc.nextInt();
			
			switch(ch)
			{
				case 1:
					System.out.println("Enter index of point: ");
					int index = sc.nextInt();
					if(index>=0 && index<=n)
					{
						for(int i=0;i<n;i++)
						{
							if(i==index)
							{
								points[i].getDetails();
							}
						}
					}
					else
					{
						System.out.println("Invalid index, plz retry!!");
					}
					break;
					
				case 2:
					System.out.println("Points: ");
					for(int i=0;i<points.length;i++)
					{
						System.out.println("Point["+i+"]:");
						points[i].getDetails();
					}
					break;
					
				case 3:
					System.out.println("Enter indices of points to find distance.");
					int index1 = sc.nextInt();
					int index2 = sc.nextInt();
					
					if(index1>n || index2>n)
					{
						System.out.println("Invalid indexes");
					}
					else
					{
						points[index1].calcDistance(points[index2].getX(), points[index2].getY());
					}
					break;
					
				case 4:
					System.out.println("Thank you..");
					break;
			}
		}
		while(ch!=4);
	}

}

import java.util.Scanner;

public class Average {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter two values: ");
		
		int i=0;
		double sum=0;
		while(i<2)
		{
			if(sc.hasNextDouble())
			{
				sum = sc.nextDouble();
				i++;
			}
			else if(sc.hasNext())
			{
				System.out.println("value not double..Enter double value.");
				break;
			}	
		}
		
		if(i==2)
		{
			double avg = sum/2;
			System.out.println("Average: "+avg);
		}
		
	}
}

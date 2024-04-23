import java.util.Scanner;

public class DrivingCost {

	public static void main(String[] args) {
		
		int totalMilesPerDay;
		int costPerGallon;
		int avgPerGallon;
		int parking;
		int tolls;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Total miles driven per day: ");
		totalMilesPerDay = sc.nextInt();
		System.out.println("Cost per gallon of gasoline: ");
		costPerGallon = sc.nextInt();
		System.out.println("Average miles per gallon: ");
		avgPerGallon = sc.nextInt();
		System.out.println("Parking fees per day: ");
		parking =  sc.nextInt();
		System.out.println("Tolls per day: ");
		tolls = sc.nextInt();
		
		int totalCost = tolls + parking + ((totalMilesPerDay/avgPerGallon)*costPerGallon);
		System.out.println("Total user's cost per day of driving to work is: rs."+ totalCost);
	}

}

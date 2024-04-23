import java.util.Scanner;

public class FoodMenu {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		
		System.out.println("....MENU....");
		System.out.println("1: Dosa - Rs.70");
		System.out.println("2: Samosa - Rs.15");
		System.out.println("3: Idli - Rs.35");
		System.out.println("4: Wada - Rs.20");
		System.out.println("5: Wadapav - Rs.15");
		System.out.println("6: tea - Rs.10");
		System.out.println("7: Generate bill");
		
		
		int ch;
		int total=0;
		int count=0;
		do
		{
			System.out.println("Enter your choices: ");
			ch = sc.nextInt();
			switch(ch)
			{
			case 1:
				total = total + 70;
				count=count+1;
				break;
			case 2:
				total = total + 15;
				count=count+1;
				break;
			case 3:
				total = total + 35;
				count=count+1;
				break;
			case 4:
				total = total + 20;
				count=count+1;
				break;
			case 5:
				total = total + 15;
				count=count+1;
				break;
			case 6:
				total = total + 10;
				count=count+1;
				break;
			case 7:
				break;
			default:
				System.out.println("Invalid choice.");
			}
		}
		while(ch!=7);
		
		System.out.println("Total Bill: Rs."+ total);
		System.out.println("No of items: "+ count);
	}

}

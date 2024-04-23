import java.util.Scanner;

public class Customer {
	Scanner sc = new Scanner(System.in);
	
	int accNo;
	int pendingBalance;
	int totalItems;
	int totalCreditApplied;
	int allowedCredit;
	
	public void userInput()
	{
		System.out.println("Enter acc number: ");
		accNo = sc.nextInt();
		System.out.println("Enter pending balance: ");
		pendingBalance = sc.nextInt();
		System.out.println("Enter total items charged for this month: ");
		totalItems = sc.nextInt();
		System.out.println("Enter total of all credits applied to this month: ");
		totalCreditApplied = sc.nextInt();
		System.out.println("Enter allowed credit: ");
		allowedCredit = sc.nextInt();
	}
	
	public void display()
	{
		System.out.println("\n\nAllowed credit: "+allowedCredit);
		System.out.println("Total items charged: "+totalItems);
		System.out.println("Total all credit applied in this month: "+ totalCreditApplied);
		System.out.println("Pending balance at the begining of the month: "+pendingBalance);
		int credit = pendingBalance+totalItems-totalCreditApplied;
		System.out.println("New balance for next month: "+ credit);
		
		if(credit >= allowedCredit)
		{
			System.out.println("Credit limit exceeded..");
		}
		
	}
}

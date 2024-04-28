import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Scanner sc =  new Scanner(System.in);
		int ch = 0;
		int index = 0;
		System.out.println("How many employee? ");
		int n = sc.nextInt();
		Employee[] empList= new Employee[n];
		
		do
		{
			System.out.println("1: Salaried employee.");
			System.out.println("2: Hourly employee.");
			System.out.println("3: Commission employee.");
			System.out.println("4: Base-salaried commission employee.");
			System.out.println("5: Employee details.");
			System.out.println("6: Exit");
			System.out.println("Enter type of employee: ");
			ch = sc.nextInt();
			
			switch(ch)
			{
			case 1:
				if(index<n)
				{
					empList[index] = new SalariedEmployee();
					empList[index].accept(sc);
					index++;
				}
				else
				{
					System.out.println("Array full..");
				}
				break;
				
			case 2:
				if(index<n)
				{
					empList[index] = new HourlyEmployee();
					empList[index].accept(sc);
					index++;
				}
				else
				{
					System.out.println("Array full..");
				}
				break;
			
			case 3:
				if(index<n)
				{
					empList[index] = new CommissionEmployee();
					empList[index].accept(sc);
					index++;
				}
				else
				{
					System.out.println("Array full..");
				}
				break;
				
			case 4:
				if(index<n)
				{
					empList[index] = new BaseSalariedCommisionEmp();
					empList[index].accept(sc);
					index++;
				}
				else
				{
					System.out.println("Array full..");
				}
				break;
				
			case 5:
				System.out.println("Employee details: ");
				for(Employee e: empList)
					if(e!=null)
					{
						System.out.println(e.toString());
						e.calculateSalary();
					}						
				break;
				
			case 6:
				System.out.println("Thank you...");
				break;
			}
		}
		while(ch!=6);
	}

}

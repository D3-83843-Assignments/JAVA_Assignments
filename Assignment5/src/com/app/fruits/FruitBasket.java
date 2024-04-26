package com.app.fruits;
import java.util.Scanner;

public class FruitBasket {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String name = null;
		double weight = 0.0;
		String color = null;
		
		System.out.println("Enter the number of fruits: ");
		int n = sc.nextInt();
		
		Fruit basket[]=new Fruit[n];
		
		int counter = 0;
		int ch=0;
		do
		{
			System.out.println("---------------");
			System.out.println("0: Exit");
			System.out.println("1: Add Mango");
			System.out.println("2: Add Orange");
			System.out.println("3: Add Apple");
			System.out.println("4: Display basket");
			System.out.println("5: Display basket details");
			System.out.println("6: Mark a fruit as stale");
			System.out.println("7: Display taste of stale fruits");
			System.out.println("8: Mark all fruits as stale");
			System.out.println("---------------");
			System.out.println("Select ur choice: ");
			ch = sc.nextInt();
			
			switch(ch)
			{
			case 0:
				System.out.println("Thank you..");
				break;
				
			case 1:
				if(counter<n) {
					basket[counter] = new Mango();
					basket[counter].accept(sc);
					counter++;
				}
				else
				{
					System.out.println("Basket full!!");
				}
				break;
				
			case 2: 
				if(counter < n)
				{
					basket[counter] = new Orange();
					basket[counter].accept(sc);
					counter++;
				}
				else
				{
					System.out.println("Basket full!!");
				}
				break;
				
			case 3:
				if(counter < n)
				{
					basket[counter] = new Apple();
					basket[counter].accept(sc);
					counter++;
				}
				else
				{
					System.out.println("Basket full!!");
				}
				break;
				
			case 4:
				System.out.println("Fruits: \n");
				for(Fruit f:basket)
					if(f!=null)
						System.out.println(f.getName());
				break;
				
			case 5:
				System.out.println("Basket list: ");
				for(Fruit f:basket)
					if(f!=null)
						System.out.println(f.toString());
				break;
				
			case 6:
				System.out.println("Enter index of fruit: ");
				int index = sc.nextInt();
				basket[index].setFresh(false);
				System.out.println("Marked the fruit "+ basket[index].getName() +" as stale.");
				break;
			
			case 7:
				System.out.println("All stale fruits taste: ");
				for(Fruit f:basket)
					if(f!=null)
						if(f.isFresh()==false)
							System.out.println(f.getName()+":"+f.taste());
				break;
				
			case 8:
				for(Fruit f:basket)
					if(f!=null && f.taste().equals("sour"))
						f.setFresh(false);
				System.out.println("Marked all sour fruits as stale.");
				break;
				
			default:
				System.out.println("Invalid choice..");
				
			}
		}while(ch!=0);
	}
}

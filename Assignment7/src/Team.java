

import java.util.Scanner;

public class Team {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int ch = 0;
		int index = 0;
		
		Player team[] = new Player[11];
		
		do
		{
			System.out.println("....MENU.....");
			System.out.println("0: Exit");
			System.out.println("1: Enter player");
			System.out.println("2: Display all players");
			System.out.println("3: Display total runs made by team");
			System.out.println("4: Display total wickets taken by team");
			System.out.println("5: Total matches played");
			System.out.println("6: Display player individually");
			System.out.println("Enter your choice: ");
			ch = sc.nextInt();
			
			switch(ch)
			{
			case 0:
				System.out.println("Thank you...");
				break;
				
			case 1:
				if(index<11)
				{
					team[index] = new Cricketer();
					team[index].accept(sc);
					index++;
				}
				else
				{
					System.out.println("Team full...");
				}
				break;
				
			case 2:
				System.out.println("Players:\n");
				for(Player p: team)
					if(p!=null)
					{
						System.out.println(p.toString());
						System.out.println("-------------");
					}
				break;
				
			case 3:
				int run = 0;
				for(Player p : team)
				{
					if(p instanceof Cricketer) 
					{
						Cricketer c = (Cricketer)p;
						run+= c.getRuns();
					}
				}
				System.out.println("Total runs by a team: "+run);
				break;
				
			case 4:
				int wickets = 0;
				for(Player p : team)
				{
					if(p instanceof Cricketer) 
					{
						Cricketer c = (Cricketer)p;
						wickets+= c.getWickets();
					}
				}
				System.out.println("Total wickets taken by the team: "+wickets);
				break;
				
			case 5:
				int matches = 0;
				for(Player p : team)
				{
					if(p instanceof Cricketer) 
					{
						Cricketer c = (Cricketer)p;
						matches+= c.getMatchesPlayed();
					}
				}
				System.out.println("Total matches played by team: "+matches);
				break;
				
			case 6:
				System.out.println("Players: \n");
				for(Player p: team)
				{
					if(p!=null) 
					{
						System.out.println("Name: "+p.getName());
						System.out.println("Matches: "+p.getMatchesPlayed());
						System.out.println(".......");
					}
				}
				break;
			}
		}while(ch!=0);
	}

}

import java.util.Scanner;

public class Cricketer extends Player implements Batter, Bowler{

	private int wickets;
	private int runs;
	
	public Cricketer(int id, String name, int age, int matchesPlayed, int wickets, int runs) {
		super(id, name, age, matchesPlayed);
		this.wickets = wickets;
		this.runs = runs;
	}

	public Cricketer() {
	}

	
	public void setWickets(int wickets) {
		this.wickets = wickets;
	}

	public void setRuns(int runs) {
		this.runs = runs;
	}

	@Override
	public int getWickets() {
		return wickets;
	}

	@Override
	public int getRuns() {
		// TODO Auto-generated method stub
		return runs;
	}

	@Override
	public void accept(Scanner sc) {
		super.accept(sc);
		System.out.println("Enter number of wickets: ");
		wickets = sc.nextInt();
		System.out.println("Enter number of runs: ");
		runs = sc.nextInt();
	}

	@Override
	public String toString() {
		return super.toString() +"\nwickets=" + wickets + ",\nruns=" + runs;
	}

	
}

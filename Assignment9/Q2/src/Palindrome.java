import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter string: ");
		StringBuffer sb = new StringBuffer(sc.next());
		
		StringBuffer sbrev = new StringBuffer(sb);
		sbrev.reverse();
		System.out.println("Reverse string: "+ sbrev);
		
		String str = sb.toString();
		String strrev = sbrev.toString();
		
		if(str.equals(strrev))
			System.out.println("String is palindrome");
		else
			System.out.println("String is not palindrome.");

	}

}

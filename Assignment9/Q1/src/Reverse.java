
import java.util.Scanner;

public class Reverse {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter string: ");
		StringBuffer str = new StringBuffer(sc.next());
		str.reverse();
		System.out.println(str);

	}
}

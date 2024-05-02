import java.util.Scanner;

public class StringLength {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int count = 0;
		
		String str = "The class String includes methods for examining individual characters of the sequence, \r\n"
				+ "for comparing strings, for searching strings, for extracting substrings, and for creating a copy of a string \r\n"
				+ "with all characters translated to uppercase or to lowercase. Case mapping is based on the Unicode \r\n"
				+ "Standard version specified by the Character class.";
//		System.out.println("Enter string: ");
//		str = sc.next();
		
		String arr[]= str.split(" ");
		for(String element : arr)
			count++;
		
		System.out.println("Number of words in string are: "+count);
	}

}

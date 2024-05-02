import java.util.Arrays;

public class Program {

	public static void main(String[] args) {

		Product[] parr = {
				new Product(101, "iphone", "mobile", 40000),
				new Product(102, "Dell", "laptop", 50000),
				new Product(103, "xiomi", "android", 20000),
				new Product(104, "lenovo", "laptop", 60000),
				new Product(105, "charger", "charger", 1000),
				new Product(106, "Pendrive", "electronic", 500),
				new Product(107, "HDisk", "pd", 800),
				new Product(108, "dell", "mouse", 500),
				new Product(109, "keyboard", "electronic", 3000)	
		};
		
		System.out.println("Before sort: ");
		for(Product p: parr)
			System.out.println(p);
		
		Arrays.sort(parr);
		
		System.out.println("After sort: ");
		for(Product p: parr)
			System.out.println(p);

	}

}

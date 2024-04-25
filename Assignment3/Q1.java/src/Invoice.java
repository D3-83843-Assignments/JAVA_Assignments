import java.util.Scanner;

public class Invoice {
	
	Scanner sc = new Scanner(System.in);
	
	String partNumber;
	String partDesc;
	int qty;
	double price;
	
	public Invoice()
	{
		this("NA","NA",0,0.0);
	}
	
	public Invoice(String partNumber, String partDesc, int qty, double price) {
		super();
		this.partNumber = partNumber;
		
		this.partDesc = partDesc;
		
		if(qty<0) {this.qty=0;}
		else {this.qty = qty;}
		
		if(price<0){this.price = 0.0;}
		else{this.price = price;}
	}

	public String getPartNumber() {
		return partNumber;
	}

	public void setPartNumber(String partNumber) {
		
		this.partNumber = partNumber;
	}

	public String getPartDesc() {
		return partDesc;
	}

	public void setPartDesc(String partDesc) {
		this.partDesc = partDesc;
	}

	public int getQty() {
		return qty;
	}

	public void setQty(int qty) {
		if(qty<0)
		{
			this.qty=0;
		}
		else
		{
			this.qty = qty;
		}
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		if(price<0)
		{
			this.price = 0.0;
		}
		else
		{
			this.price = price;
		}
	}
	
	public void AcceptData()
	{
		System.out.println("Enter part number: ");
		partNumber = sc.next();
		System.out.println("Enter part desc: ");
		partDesc = sc.next();
		System.out.println("Enter qty: ");
		qty = sc.nextInt();
		if(qty<0) {qty=0;}
		System.out.println("Enter price: ");
		price = sc.nextDouble();	
		if(price<0) {price =0;}
	}
	
	public void InvoiceAmt()
	{
		double Invoice = qty * price;
		System.out.println("Part number: "+partNumber);
		System.out.println("Part description: "+partDesc);
		System.out.println("Invoice Amount: "+Invoice);
	}
}
